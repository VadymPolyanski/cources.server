package com.softgroup.common.cache.test;

import com.softgroup.common.cache.entity.AuthorizationDetails;
import com.softgroup.common.cache.service.AuthorizationDetailsCacheService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.concurrent.ExecutionException;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


/**
 * Created by vadym_polyanski on 28.03.17.
 */
@RunWith(MockitoJUnitRunner.class)
public class CacheServiceTest {

    @InjectMocks
    private AuthorizationDetailsCacheService authorizationDetailsCacheService;

    private AuthorizationDetails authorizationDetails = new AuthorizationDetails(
            "rruuid", "", "", "", "", "");


    @Test
    public void testCache() throws ExecutionException {
            authorizationDetailsCacheService.put(authorizationDetails);

            assertThat(authorizationDetailsCacheService.getFromCache("rruuid"), is(authorizationDetails));
    }

    @Test(expected = NullPointerException.class)
    public void testCacheException() throws ExecutionException {
            authorizationDetailsCacheService.put(authorizationDetails);

        authorizationDetailsCacheService.getFromCache(null);
    }
}

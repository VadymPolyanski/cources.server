import com.softgroup.common.cache.entity.AuthorizationDetails;
import com.softgroup.common.cache.service.AuthorizationDetailsCacheService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
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

    private AuthorizationDetails authorizationDetails;

    @Before
    public void init(){
        authorizationDetails = Mockito.mock(AuthorizationDetails.class);

        when(authorizationDetails.getRegistrationRequestUuid()).thenReturn("rruuid");

    }


    @Test
    public void testCache(){
        try {
            authorizationDetailsCacheService.put(authorizationDetails);

            assertThat(authorizationDetailsCacheService.getFromCache("rruuid"), is(authorizationDetails));
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testNullable() {
        try {
            authorizationDetailsCacheService.put(null);
            assertThat(authorizationDetailsCacheService.getFromCache(null), nullValue());

        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}

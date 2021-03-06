package com.softgroup.common.dao.impl.service;

import com.softgroup.common.dao.api.entities.ProfileSettingsEntity;
import com.softgroup.common.dao.impl.repositories.ProfileSettingsRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Author: vadym
 * Date: 07.03.17
 * Time: 16:44
 */
@Component
public class ProfileSettingsService
        extends BaseService<ProfileSettingsEntity, ProfileSettingsRepository>{

    public ProfileSettingsEntity findByProfileId(String profileId) {
        return getRepository().findByProfileId(profileId);
    }
}

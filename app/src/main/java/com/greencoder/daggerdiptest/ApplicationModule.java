package com.greencoder.daggerdiptest;

import android.app.Application;

import com.greencoder.daggerdiptest.dao.DbMusicDao;
import com.greencoder.daggerdiptest.dao.IMusicDao;
import com.greencoder.daggerdiptest.service.IMusicService;
import com.greencoder.daggerdiptest.service.PlayMusicService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author aahmed on 5/23/16.
 */
@Module
public class ApplicationModule {

    private Application mApp;

    public ApplicationModule(Application app) {
        mApp = app;
    }

    @Provides
    @Singleton
    IMusicService provideIMusicService() {
        return new PlayMusicService(mApp);
    }

    @Provides
    @Singleton
    IMusicDao provideIMusicDao() {
        return new DbMusicDao(mApp);
    }
}

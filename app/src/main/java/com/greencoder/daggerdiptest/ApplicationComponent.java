package com.greencoder.daggerdiptest;

import com.greencoder.daggerdiptest.service.PlayMusicService;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author aahmed on 5/23/16.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity activity);
    void inject(PlayMusicService musicService);
}

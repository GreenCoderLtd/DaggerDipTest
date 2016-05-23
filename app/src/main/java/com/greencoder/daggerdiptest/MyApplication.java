package com.greencoder.daggerdiptest;

import android.app.Application;

/**
 * @author aahmed on 5/23/16.
 */
public class MyApplication extends Application {

    private ApplicationComponent mComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
    public ApplicationComponent getApplicationComponent() {
        return mComponent;
    }
}

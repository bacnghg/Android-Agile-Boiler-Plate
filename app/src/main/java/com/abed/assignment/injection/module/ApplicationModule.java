package com.abed.assignment.injection.module;

import android.app.Application;
import android.content.Context;

import com.abed.assignment.controller.ApiHelper;
import com.abed.assignment.controller.LocalStorageHelper;
import com.abed.assignment.injection.ApplicationContext;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Provide application-level dependencies.
 */
@Module
public class ApplicationModule {
    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }


    @Provides
    @Singleton
    LocalStorageHelper provideLocalStorageHelper() {
        return new LocalStorageHelper(mApplication);
    }

}

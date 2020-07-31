package com.example.homework6.task3.app;

import android.app.Application;

import com.example.homework6.task3.Green;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Green provideGreen(){
        return new Green();
    }
}

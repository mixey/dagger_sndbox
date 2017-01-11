package com.droid.dagger.classes;


import com.droid.dagger.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {AppModule.class, DataBaseModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
}

package com.example.skyscanner.dependency;


import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {AndroidSupportInjectionModule.class,NetworkModule.class,ActivityBuilderModule.class})
public interface AppComponent extends AndroidInjector<SkyScannerAppl> {
}

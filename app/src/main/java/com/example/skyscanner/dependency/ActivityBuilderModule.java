package com.example.skyscanner.dependency;

import com.example.skyscanner.MainActivity;
import com.example.skyscanner.SecondActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract MainActivity providesMainActivity();

    @ContributesAndroidInjector
    abstract SecondActivity providesSecondActivity();
}

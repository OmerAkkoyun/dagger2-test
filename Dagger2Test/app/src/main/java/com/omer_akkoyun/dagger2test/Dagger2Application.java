package com.omer_akkoyun.dagger2test;

import android.app.Application;

import com.omer_akkoyun.dagger2test.injectors.AppComponent;
import com.omer_akkoyun.dagger2test.injectors.AppModule;
import com.omer_akkoyun.dagger2test.injectors.DaggerAppComponent;

public class Dagger2Application extends Application {

    private AppComponent appComponent;

    public AppComponent getAppComponent(){
        return appComponent;
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();

    }








}

package com.omer_akkoyun.dagger2test.injectors;

import android.app.Application;
import android.content.Context;

import com.omer_akkoyun.dagger2test.Dagger2Application;
import com.omer_akkoyun.dagger2test.model.car.BMWCar;
import com.omer_akkoyun.dagger2test.model.car.MercedesCar;
import com.omer_akkoyun.dagger2test.model.engine.BenzinEngine;
import com.omer_akkoyun.dagger2test.model.engine.LPGEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule  {

    private Context context ;

    public AppModule(Application app) {
        this.context = app;
    }


    @Provides @Singleton
    Context provideApp(){
      return context;
    }

    @Provides @Singleton
    LPGEngine provideLPG(){
        return new LPGEngine(); //if you want change BENZİN , than change "new BenzinEngine"
    }
    @Provides @Singleton
    BenzinEngine provideBenzin(){
        return new BenzinEngine(); //if you want change BENZİN , than change "new BenzinEngine"
    }

    @Provides @Singleton
    BMWCar provideBMWCar(BenzinEngine engine){
        return new BMWCar(engine); //if you want change BENZİN , than change "new BenzinEngine"
    }

    @Provides @Singleton
    MercedesCar provideMercedesCar(LPGEngine engine){
        return new MercedesCar(engine);
    }


}

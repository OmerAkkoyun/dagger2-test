package com.omer_akkoyun.dagger2test.model.car;

import android.util.Log;


import com.omer_akkoyun.dagger2test.model.engine.BenzinEngine;

import org.eclipse.jdt.internal.codeassist.impl.Engine;

import javax.inject.Inject;

public class BMWCar  {

   BenzinEngine engine;
    @Inject
    public BMWCar(BenzinEngine engine){
        this.engine=engine;

    }


    public void start() {
        Log.v("DaggerExample","BMW Car is about to start.");
        engine.turnOn();
    }

    public void stop() {
        Log.v("DaggerExample","BMW Car is about to stop.");
        engine.turnOff();
    }
}

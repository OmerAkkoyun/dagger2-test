package com.omer_akkoyun.dagger2test.model.car;

import android.util.Log;

import com.omer_akkoyun.dagger2test.model.engine.LPGEngine;


import org.eclipse.jdt.internal.codeassist.impl.Engine;

import javax.inject.Inject;

public class MercedesCar {

    LPGEngine engine;

    @Inject
    public MercedesCar(LPGEngine engine) {
        this.engine = engine;
    }


    public void start() {
        Log.v("DaggerExample","MercedesCar  is about to start.");
        engine.turnOn();
    }

    public void stop() {
        Log.v("DaggerExample","MercedesCar  is about to stop.");
        engine.turnOff();
    }
}

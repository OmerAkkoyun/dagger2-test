package com.omer_akkoyun.dagger2test.model.engine;

import android.util.Log;

import javax.inject.Inject;


public class BenzinEngine  {

    @Inject
    public BenzinEngine(){

    }

    public void turnOn() {
        Log.d("Benzin MOtor durumu ","Çalıştırıldı");

    }

    public void turnOff() {
        Log.d("Benzin MOtor durumu ","Çalıştırıldı");

    }
}

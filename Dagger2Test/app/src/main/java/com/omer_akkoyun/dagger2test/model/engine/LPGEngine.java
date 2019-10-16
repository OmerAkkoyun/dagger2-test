package com.omer_akkoyun.dagger2test.model.engine;

import android.util.Log;

import javax.inject.Inject;


public class LPGEngine  {

    @Inject
    public LPGEngine() {

    }


    public void turnOn() {
        Log.d("LPG Motor durumu ","Çalıştırıldı");
    }


    public void turnOff() {
        Log.d("LPG Motor durumu ","Durduruldu");
    }
}

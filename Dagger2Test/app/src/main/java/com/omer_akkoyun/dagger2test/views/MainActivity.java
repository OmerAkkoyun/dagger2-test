package com.omer_akkoyun.dagger2test.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.omer_akkoyun.dagger2test.Dagger2Application;
import com.omer_akkoyun.dagger2test.R;
import com.omer_akkoyun.dagger2test.model.car.BMWCar;
import com.omer_akkoyun.dagger2test.model.engine.LPGEngine;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    BMWCar bmwCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dagger2Application  app = (Dagger2Application) getApplication();
        app.getAppComponent().inject(this);

bmwCar.start();

    }
}

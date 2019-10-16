package com.omer_akkoyun.dagger2test.injectors;

import com.omer_akkoyun.dagger2test.views.MainActivity;

import javax.inject.Singleton;
import dagger.Component;


@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(MainActivity activity); //its mean we will use in "Main Activity".
}

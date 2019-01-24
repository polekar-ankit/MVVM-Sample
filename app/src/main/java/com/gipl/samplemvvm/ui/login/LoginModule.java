package com.gipl.samplemvvm.ui.login;

import com.gipl.samplemvvm.data.DataManager;
import com.gipl.samplemvvm.utility.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Creted by User on 05-Jan-19
 */
@Module
public class LoginModule {
    @Provides
    LoginViewModel provideLoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider){
        return new LoginViewModel(dataManager,schedulerProvider);
    }
}

package com.gipl.samplemvvm.ui.userslist;

import com.gipl.samplemvvm.data.DataManager;
import com.gipl.samplemvvm.utility.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;

/**
 * Creted by User on 24-Jan-19
 */
@Module
public class UserListModule {
    @Provides
    UserListActivityModel provide(DataManager dataManager, SchedulerProvider schedulerProvider){
        return new UserListActivityModel(dataManager, schedulerProvider);
    }
}

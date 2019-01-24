package com.gipl.samplemvvm.ui.userslist;

import com.gipl.samplemvvm.data.DataManager;
import com.gipl.samplemvvm.ui.base.BaseViewModel;
import com.gipl.samplemvvm.utility.rx.SchedulerProvider;

/**
 * Creted by User on 24-Jan-19
 */
public class UserListActivityModel extends BaseViewModel {
    public UserListActivityModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);
    }
}

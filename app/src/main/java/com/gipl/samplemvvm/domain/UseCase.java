package com.gipl.samplemvvm.domain;


import com.gipl.samplemvvm.data.DataManager;

public class UseCase {
    protected DataManager dataManager;

    public UseCase(DataManager dataManager) {
        this.dataManager = dataManager;
    }
}

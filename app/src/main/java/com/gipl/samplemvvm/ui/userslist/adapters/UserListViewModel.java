package com.gipl.samplemvvm.ui.userslist.adapters;

import android.databinding.ObservableField;

import com.gipl.samplemvvm.ui.modles.User;

/**
 * Creted by User on 24-Jan-19
 */
public class UserListViewModel {
    public ObservableField<String> getUserName() {
        return userName;
    }

    public ObservableField<String> getPass() {
        return pass;
    }

    private ObservableField<String> userName = new ObservableField<>();
    private ObservableField<String> pass = new ObservableField<>();

    public UserListViewModel(User user) {
        userName.set(user.getName());
    }
}

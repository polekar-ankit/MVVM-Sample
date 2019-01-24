package com.gipl.samplemvvm.ui.userslist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;

import com.gipl.samplemvvm.BR;
import com.gipl.samplemvvm.R;
import com.gipl.samplemvvm.databinding.LayoutUserListActivityBinding;
import com.gipl.samplemvvm.ui.base.BaseActivity;
import com.gipl.samplemvvm.ui.modles.User;
import com.gipl.samplemvvm.ui.userslist.adapters.UserListAdapter;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * Creted by User on 24-Jan-19
 */
public class UserListActivity extends BaseActivity<LayoutUserListActivityBinding, UserListActivityModel> {
    @Inject
    UserListActivityModel userListActivityModel;

    @Override
    public int getBindingVariable() {
        return BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_user_list_activity;
    }

    @Override
    public String getScreenName() {
        return UserListActivity.class.getSimpleName();
    }

    @Override
    public UserListActivityModel getViewModel() {
        return userListActivityModel;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutUserListActivityBinding binding = getViewDataBinding();
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ABC", "1234"));
        users.add(new User("xcf", "1234"));
        users.add(new User("wer", "1234"));

        UserListAdapter userListAdapter = new UserListAdapter();
        userListAdapter.addItems(users);
        binding.rvUserlist.setLayoutManager(new LinearLayoutManager(this));
        binding.rvUserlist.setAdapter(userListAdapter);

    }
}
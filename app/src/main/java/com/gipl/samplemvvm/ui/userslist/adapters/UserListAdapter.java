package com.gipl.samplemvvm.ui.userslist.adapters;

import android.view.View;

import com.gipl.samplemvvm.R;
import com.gipl.samplemvvm.databinding.LayoutListItemBinding;
import com.gipl.samplemvvm.ui.base.BaseAdapter;
import com.gipl.samplemvvm.ui.base.BaseViewHolder;
import com.gipl.samplemvvm.ui.modles.User;

/**
 * Creted by User on 24-Jan-19
 */
public class UserListAdapter extends BaseAdapter<UserListAdapter.UserListHolder, User> {

    @Override
    public int getItemId() {
        return R.layout.layout_list_item;
    }

    @Override
    public UserListHolder getHolder(View view) {
        return new UserListHolder(view);
    }

    @Override
    public void onViewSet(UserListHolder userListHolder, int position, User user) {
        userListHolder.getBindVariable().setViewModel(new UserListViewModel(user));
        listener.onItemClick(user);
    }


    class UserListHolder extends BaseViewHolder<LayoutListItemBinding>{
         UserListHolder(View itemView) {
             super(itemView);
         }
     }
}

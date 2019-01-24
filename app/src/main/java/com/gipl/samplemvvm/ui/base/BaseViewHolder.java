package com.gipl.samplemvvm.ui.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public abstract class BaseViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    private T binding;

    public T getBindVariable() {
        return binding;
    }



    public BaseViewHolder(View itemView/*, V v*/) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }

   public void unbind() {
        if (binding != null) {
            binding.unbind();
        }
    }

    public void bind() {
        if (binding == null) {
            binding = DataBindingUtil.bind(itemView);
        }
    }

}

package com.gipl.samplemvvm.ui.base;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Creted by User on 24-Jan-19
 */
public abstract class BaseAdapter<P extends BaseViewHolder, A extends Object> extends RecyclerView.Adapter<P> {
    P holder;
    private ArrayList<A> arrayList;

    public abstract int getItemId();

    public abstract P getHolder(View view);

    public abstract void onViewSet(P p, int position,A a);

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    @Override
    public void onViewAttachedToWindow(@NonNull P holder) {
        super.onViewAttachedToWindow(holder);
        holder.bind();
    }

    @Override
    public void onViewDetachedFromWindow(@NonNull P holder) {
        super.onViewDetachedFromWindow(holder);
        holder.unbind();
    }

    @NonNull
    @Override
    public P onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(getItemId(),
                viewGroup, false);
        return getHolder(view);
    }

    public void addItems(ArrayList<A> list) {
        arrayList = list;
        notifyDataSetChanged();
    }

    public void addItem(A a) {
        arrayList.add(a);
        notifyItemChanged(arrayList.size());
    }

    public void clear(){
        arrayList.clear();
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull P p, int position) {
        A a = arrayList.get(position);
        onViewSet(p, position,a);
    }

}

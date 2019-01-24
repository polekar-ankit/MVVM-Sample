package com.gipl.samplemvvm.ui.base;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.databinding.ObservableBoolean;

import com.gipl.samplemvvm.data.DataManager;
import com.gipl.samplemvvm.ui.modles.Response;
import com.gipl.samplemvvm.utility.NetworkUtils;
import com.gipl.samplemvvm.utility.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;


public abstract class BaseViewModel extends ViewModel {

    private final DataManager mDataManager;

    private final ObservableBoolean mIsLoading = new ObservableBoolean(false);

    private final SchedulerProvider mSchedulerProvider;
    private final MutableLiveData<Response> mResponseMutableLiveData = new MutableLiveData<>();
    private CompositeDisposable mCompositeDisposable;


    public BaseViewModel(DataManager dataManager,
                         SchedulerProvider schedulerProvider) {
        this.mDataManager = dataManager;
        this.mSchedulerProvider = schedulerProvider;
        this.mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    protected void onCleared() {
        mCompositeDisposable.dispose();
        super.onCleared();
    }

    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }

    public ObservableBoolean isLoading() {
        return mIsLoading;
    }

    public void setIsLoading(boolean isLoading) {
        mIsLoading.set(isLoading);
    }


    public SchedulerProvider getSchedulerProvider() {
        return mSchedulerProvider;
    }

    public MutableLiveData<Response> getResponseMutableLiveData() {
        return mResponseMutableLiveData;
    }


    public boolean isNetworkConnected(Context context) {
        return NetworkUtils.isNetworkConnected(context);
    }

}

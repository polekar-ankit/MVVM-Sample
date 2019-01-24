package com.gipl.samplemvvm.ui.login;

import android.arch.lifecycle.MutableLiveData;
import android.databinding.Observable;
import android.databinding.ObservableField;

import com.gipl.samplemvvm.data.DataManager;
import com.gipl.samplemvvm.ui.base.BaseViewModel;
import com.gipl.samplemvvm.ui.modles.Response;
import com.gipl.samplemvvm.utility.rx.SchedulerProvider;

/**
 * Creted by User on 05-Jan-19
 */
public class LoginViewModel extends BaseViewModel {

    private ObservableField<String> nameOberver = new ObservableField<>("");
    private ObservableField<String> passObserver = new ObservableField<>("");


    private MutableLiveData<Boolean> loginSuccessRes = new MutableLiveData<>();


    public LoginViewModel(DataManager dataManager, SchedulerProvider schedulerProvider) {
        super(dataManager, schedulerProvider);

        nameOberver.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (nameOberver.get() == null || nameOberver.get().isEmpty()) {
                    Exception exception = new Exception("name Error");
                    getResponseMutableLiveData().setValue(Response.error(exception));

                }
            }
        });
    }

    public ObservableField<String> getNameOberver() {
        return nameOberver;
    }

    public ObservableField<String> getPassObserver() {
        return passObserver;
    }

    public void onLoginClick() {
        getResponseMutableLiveData().setValue(Response.loading());
//        if (userObserver.get() == null || userObserver.get().getName().isEmpty()) {
//            Exception exception = new Exception("name Error");
//            getResponseMutableLiveData().setValue(Response.error(exception));
//            return;
//        }
//        if (userObserver.get() == null || userObserver.get().getPass().isEmpty()) {
//            Exception exception = new Exception("Pass Error");
//            getResponseMutableLiveData().setValue(Response.error(exception));
//            return;
//        }
        getResponseMutableLiveData().setValue(Response.success("Login Success"));
    }

    public MutableLiveData<Boolean> getLoginSuccessRes() {
        return loginSuccessRes;
    }
}

package com.gipl.samplemvvm.ui.modles;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import static com.gipl.samplemvvm.ui.modles.Status.ERROR;
import static com.gipl.samplemvvm.ui.modles.Status.LOADING;
import static com.gipl.samplemvvm.ui.modles.Status.SUCCESS;


/**
 * Creted by User on 24-Sep-18
 */
public class Response {

    public final Status status;

    @Nullable
    public final Object data;

    @Nullable
    public final Throwable error;


    private Response(Status status, @Nullable Object data, @Nullable Throwable error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }

    public static Response loading() {
        return new Response(LOADING, null, null);
    }


    public static Response success(@NonNull Object data) {
        return new Response(SUCCESS, data, null);
    }

    public static Response error(@NonNull Throwable error) {
        return new Response(ERROR, null, error);
    }


}
package com.gipl.samplemvvm.exception;

import android.content.Context;
import android.text.TextUtils;

import com.gipl.samplemvvm.R;

import java.net.ConnectException;
import java.net.UnknownHostException;


/**
 * Factory used to create error messages from an Exception as a condition.
 */
public class ErrorMessageFactory {

    private ErrorMessageFactory() {
        //empty
    }

    public static String create(Context context, Exception exception) {
        String message = "";

        if (exception.getCause() instanceof InternetConnectionException || exception instanceof ConnectException) {
            message = context.getString(R.string.msg_no_internet_connectivity);
        } else if (exception.getCause() instanceof NotFoundException) {
            message = context.getString(R.string.exception_not_found);
        } else if (exception.getCause() instanceof CustomException) {
            message = exception.getMessage();
        } else if (exception.getCause() instanceof FileUploadException) {
            message = "File upload failed";
        } else if (exception.getCause() instanceof CreateInvitationLinkException) {
            message = context.getString(R.string.error_invitation_link_not_available_now);
        }

        if (exception.getCause() instanceof UnknownHostException) {
            message = context.getString(R.string.unkonw_host_exception);
        }

        if (TextUtils.isEmpty(message)) {
            message = context.getString(R.string.exception_message_generic);
        }

        return message;
    }
}
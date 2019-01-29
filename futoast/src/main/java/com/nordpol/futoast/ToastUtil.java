package com.nordpol.futoast;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {
    private static Toast toast = null;

    public static void showShortToast(Context context, String msg) {
        try {
            if (toast == null) {
                toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
            } else {
                toast.setText(msg);
                toast.setDuration(Toast.LENGTH_SHORT);
            }
            toast.show();
        }catch (Exception e){
            //android.view.ViewRootImpl$CalledFromWrongThreadException: Only the original thread that created a view hierarchy can touch its views.
        }
    }

    public static void showLongToast(Context context, String msg) {
        try {
            if (toast == null) {
                toast = Toast.makeText(context, msg, Toast.LENGTH_LONG);
            } else {
                toast.setText(msg);
                toast.setDuration(Toast.LENGTH_LONG);
            }
            toast.show();
        }catch (Exception e){
            //android.view.ViewRootImpl$CalledFromWrongThreadException: Only the original thread that created a view hierarchy can touch its views.
        }
    }

}

package com.example.shreesha.basecode.Ui.Common;

import android.content.Context;

public interface BaseContract {

    interface View {

        void showProgress(boolean status);

        Context getContext();

        void showPopupMessage(String title, String message);

        void showNoInternetDialog();
    }

    interface Presenter {

        void onCreate();

        void onResume();

        void onPause();

        void onDestroy();
    }
} 
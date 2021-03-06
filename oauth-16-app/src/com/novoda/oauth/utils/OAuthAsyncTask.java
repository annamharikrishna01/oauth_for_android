
package com.novoda.oauth.utils;

import android.os.AsyncTask;

public abstract class OAuthAsyncTask extends AsyncTask<OAuthCall, Void, String> {

    @SuppressWarnings("unused")
    private static final String TAG = "OAuth:";

    @Override
    protected String doInBackground(OAuthCall... params) {
        return params[0].call();
    }
}
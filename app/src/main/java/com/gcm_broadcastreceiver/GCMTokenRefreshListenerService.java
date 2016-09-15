package com.gcm_broadcastreceiver;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by Ramesh on 9/14/16.
 */
public class GCMTokenRefreshListenerService extends InstanceIDListenerService {

    /**
     * when token refresh,start service to get new token
     */
    @Override
    public void onTokenRefresh() {
        Intent intent = new Intent(this, GCMRegistrationIntentService.class);
        startService(intent);
    }
}

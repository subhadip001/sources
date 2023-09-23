package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

/* loaded from: classes2.dex */
public class ProviderInstaller {
    private final Application application;

    public ProviderInstaller(Application application) {
        this.application = application;
    }

    public void install() {
        try {
            com.google.android.gms.security.ProviderInstaller.installIfNeeded(this.application);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e2) {
            e2.printStackTrace();
        }
    }
}

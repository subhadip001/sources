package com.google.android.datatransport.cct.internal;

import f.h.b.a.h.e.a;

/* loaded from: classes.dex */
public abstract class ClientInfo {

    /* loaded from: classes.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        ClientType(int i2) {
            this.value = i2;
        }
    }

    public abstract a a();

    public abstract ClientType b();
}

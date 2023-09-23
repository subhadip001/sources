package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i2) {
        Parcel zaa = zaa();
        zaa.writeInt(i2);
        zac(7, zaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i2, boolean z) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iAccountAccessor);
        zaa.writeInt(i2);
        com.google.android.gms.internal.base.zac.zab(zaa, z);
        zac(9, zaa);
    }

    public final void zag(zai zaiVar, zae zaeVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zac(zaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(zaa, zaeVar);
        zac(12, zaa);
    }
}

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper zae(IObjectWrapper iObjectWrapper, zax zaxVar) {
        Parcel zaa = zaa();
        com.google.android.gms.internal.base.zac.zad(zaa, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(zaa, zaxVar);
        return a.V(zab(2, zaa));
    }
}

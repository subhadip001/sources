package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public interface ICancelToken extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    /* loaded from: classes.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        public static ICancelToken asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return queryLocalInterface instanceof ICancelToken ? (ICancelToken) queryLocalInterface : new zzw(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 2) {
                cancel();
                return true;
            }
            return false;
        }
    }

    void cancel();
}

package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public class zzbm implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzbm(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final Parcel zzb(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.zza.transact(i2, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e2) {
                obtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void zzc(int i2, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

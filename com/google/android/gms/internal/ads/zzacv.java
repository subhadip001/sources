package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzacv implements zzbk {
    public static final Parcelable.Creator<zzacv> CREATOR = new zzact();
    public final float zza;
    public final int zzb;

    public zzacv(float f2, int i2) {
        this.zza = f2;
        this.zzb = i2;
    }

    public /* synthetic */ zzacv(Parcel parcel, zzacu zzacuVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacv.class == obj.getClass()) {
            zzacv zzacvVar = (zzacv) obj;
            if (this.zza == zzacvVar.zza && this.zzb == zzacvVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        float f2 = this.zza;
        int i2 = this.zzb;
        return "smta: captureFrameRate=" + f2 + ", svcTemporalLayerCount=" + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }
}

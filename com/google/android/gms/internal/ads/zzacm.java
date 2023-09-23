package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzacm extends zzacc {
    public static final Parcelable.Creator<zzacm> CREATOR = new zzacl();
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzacm(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeg.zza
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.zza = r0
            java.lang.String r3 = r3.readString()
            r2.zzb = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacm.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacm.class == obj.getClass()) {
            zzacm zzacmVar = (zzacm) obj;
            if (this.zzf.equals(zzacmVar.zzf) && zzeg.zzS(this.zza, zzacmVar.zza) && zzeg.zzS(this.zzb, zzacmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int I = a.I(this.zzf, 527, 31);
        String str = this.zza;
        int hashCode = (I + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final String toString() {
        return a.q(this.zzf, ": url=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzacm(String str, String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}

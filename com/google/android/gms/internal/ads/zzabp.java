package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzabp extends zzacc {
    public static final Parcelable.Creator<zzabp> CREATOR = new zzabo();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzabp(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.android.gms.internal.ads.zzeg.zza
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.android.gms.internal.ads.zzeg.zzG(r3)
            byte[] r3 = (byte[]) r3
            r2.zza = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabp.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabp.class == obj.getClass()) {
            zzabp zzabpVar = (zzabp) obj;
            if (this.zzf.equals(zzabpVar.zzf) && Arrays.equals(this.zza, zzabpVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza) + a.I(this.zzf, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzabp(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}

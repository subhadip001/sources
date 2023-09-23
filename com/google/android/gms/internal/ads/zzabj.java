package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@Deprecated
/* loaded from: classes.dex */
public class zzabj implements zzbk {
    public static final Parcelable.Creator<zzabj> CREATOR = new zzabi();
    public final String zza;
    public final String zzb;

    public zzabj(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }

    public zzabj(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzabj zzabjVar = (zzabj) obj;
            if (this.zza.equals(zzabjVar.zza) && this.zzb.equals(zzabjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + a.I(this.zza, 527, 31);
    }

    public final String toString() {
        return a.r("VC: ", this.zza, "=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            zzbfVar.zzr(this.zzb);
        } else if (c == 1) {
            zzbfVar.zze(this.zzb);
        } else if (c == 2) {
            zzbfVar.zzd(this.zzb);
        } else if (c == 3) {
            zzbfVar.zzc(this.zzb);
        } else if (c != 4) {
        } else {
            zzbfVar.zzi(this.zzb);
        }
    }
}

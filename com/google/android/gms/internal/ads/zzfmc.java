package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes.dex */
public final class zzfmc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfmc> CREATOR = new zzfmd();
    @SafeParcelable.VersionField(id = 1)
    public final int zza;
    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzaly zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfmc(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i2;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzaly zzalyVar = this.zzb;
        if (zzalyVar != null || this.zzc == null) {
            if (zzalyVar == null || this.zzc != null) {
                if (zzalyVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzalyVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzau();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzaly zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzaly.zze(this.zzc, zzgka.zza());
                this.zzc = null;
            } catch (zzgla | NullPointerException e2) {
                throw new IllegalStateException(e2);
            }
        }
        zzb();
        return this.zzb;
    }
}

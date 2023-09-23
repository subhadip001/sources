package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class zzt extends zzw {
    public final /* synthetic */ zzu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzu zzuVar, zzx zzxVar, CharSequence charSequence) {
        super(zzxVar, charSequence);
        this.zza = zzuVar;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzc(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.common.zzw
    public final int zzd(int i2) {
        zzo zzoVar = this.zza.zza;
        CharSequence charSequence = ((zzw) this).zzb;
        int length = charSequence.length();
        zzs.zzb(i2, length, "index");
        while (i2 < length) {
            if (zzoVar.zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}

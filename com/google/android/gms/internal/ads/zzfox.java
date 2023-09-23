package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfox extends zzfpc {
    public final /* synthetic */ zzfoy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfox(zzfoy zzfoyVar, zzfpe zzfpeVar, CharSequence charSequence) {
        super(zzfpeVar, charSequence);
        this.zza = zzfoyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    public final int zzc(int i2) {
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    public final int zzd(int i2) {
        zzfof zzfofVar = this.zza.zza;
        CharSequence charSequence = ((zzfpc) this).zzb;
        int length = charSequence.length();
        zzfos.zzb(i2, length, "index");
        while (i2 < length) {
            if (zzfofVar.zzb(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}

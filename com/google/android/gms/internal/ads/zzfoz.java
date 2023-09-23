package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfoz extends zzfpc {
    public final /* synthetic */ zzfpa zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfoz(zzfpa zzfpaVar, zzfpe zzfpeVar, CharSequence charSequence) {
        super(zzfpeVar, charSequence);
        this.zza = zzfpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    public final int zzc(int i2) {
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfpc
    public final int zzd(int i2) {
        int i3 = i2 + 4000;
        if (i3 < ((zzfpc) this).zzb.length()) {
            return i3;
        }
        return -1;
    }
}

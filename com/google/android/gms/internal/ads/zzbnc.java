package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbnc extends zzbmd {
    public final /* synthetic */ zzbnf zza;

    public /* synthetic */ zzbnc(zzbnf zzbnfVar, zzbnb zzbnbVar) {
        this.zza = zzbnfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final void zze(zzblu zzbluVar, String str) {
        zzbnf zzbnfVar = this.zza;
        if (zzbnf.zza(zzbnfVar) == null) {
            return;
        }
        zzbnf.zza(zzbnfVar).onCustomClick(zzbnf.zzc(zzbnfVar, zzbluVar), str);
    }
}

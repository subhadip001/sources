package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfof implements zzfot {
    public static zzfof zzc(char c) {
        return new zzfoc(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfot
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}

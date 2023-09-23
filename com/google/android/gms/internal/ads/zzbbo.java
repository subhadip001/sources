package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbbo implements Comparator {
    public zzbbo(zzbbq zzbbqVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbu zzbbuVar = (zzbbu) obj;
        zzbbu zzbbuVar2 = (zzbbu) obj2;
        int i2 = zzbbuVar.zzc - zzbbuVar2.zzc;
        return i2 != 0 ? i2 : (int) (zzbbuVar.zza - zzbbuVar2.zza);
    }
}

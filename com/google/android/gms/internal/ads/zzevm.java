package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzevm implements zzgpu {
    public static zzete zza(Context context, zzcef zzcefVar, zzceg zzcegVar, Object obj, zzetw zzetwVar, zzeuz zzeuzVar, zzgpo zzgpoVar, zzgpo zzgpoVar2, zzgpo zzgpoVar3, zzgpo zzgpoVar4, zzgpo zzgpoVar5, zzgpo zzgpoVar6, zzgpo zzgpoVar7, zzgpo zzgpoVar8, zzgpo zzgpoVar9, Executor executor, zzfhq zzfhqVar, zzdwg zzdwgVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzeus) obj);
        hashSet.add(zzetwVar);
        hashSet.add(zzeuzVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeH)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeI)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeJ)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeK)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeO)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzeP)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcp)).booleanValue()) {
            hashSet.add((zzetb) zzgpoVar9.zzb());
        }
        return new zzete(context, executor, hashSet, zzfhqVar, zzdwgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}

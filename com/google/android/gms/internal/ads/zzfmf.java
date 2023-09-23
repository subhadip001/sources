package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfmf implements zzfkv {
    private final Object zza;
    private final zzfmg zzb;
    private final zzfmr zzc;
    private final zzfks zzd;

    public zzfmf(Object obj, zzfmg zzfmgVar, zzfmr zzfmrVar, zzfks zzfksVar) {
        this.zza = obj;
        this.zzb = zzfmgVar;
        this.zzc = zzfmrVar;
        this.zzd = zzfksVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzamk zza = zzaml.zza();
        zza.zzc(5);
        zza.zza(zzgjg.zzv(bArr));
        return Base64.encodeToString(((zzaml) zza.zzaj()).zzau(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            this.zzd.zzc(2007, System.currentTimeMillis() - currentTimeMillis, e2);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map zza;
        zza = this.zzc.zza();
        zza.put("f", "c");
        zza.put("ctx", context);
        zza.put("cs", str2);
        zza.put("aid", null);
        zza.put("view", view);
        zza.put("act", activity);
        return zzi(zzj(null, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map zzc;
        zzc = this.zzc.zzc();
        zzc.put("f", "v");
        zzc.put("ctx", context);
        zzc.put("aid", null);
        zzc.put("view", view);
        zzc.put("act", activity);
        return zzi(zzj(null, zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final synchronized String zzc(Context context, String str) {
        Map zzb;
        zzb = this.zzc.zzb();
        zzb.put("f", "q");
        zzb.put("ctx", context);
        zzb.put("aid", null);
        return zzi(zzj(null, zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfkv
    public final synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("t", new Throwable());
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap);
            this.zzd.zzd(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzfmp(2005, e2);
        }
    }

    public final synchronized int zze() {
        try {
        } catch (Exception e2) {
            throw new zzfmp(2006, e2);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfmg zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e2) {
            throw new zzfmp(2003, e2);
        }
    }

    public final synchronized boolean zzh() {
        try {
        } catch (Exception e2) {
            throw new zzfmp(2001, e2);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfmq {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfmr zzc;
    private final zzfks zzd;
    private final zzfkn zze;
    private zzfmf zzf;
    private final Object zzg = new Object();

    public zzfmq(Context context, zzfmr zzfmrVar, zzfks zzfksVar, zzfkn zzfknVar) {
        this.zzb = context;
        this.zzc = zzfmrVar;
        this.zzd = zzfksVar;
        this.zze = zzfknVar;
    }

    private final synchronized Class zzd(zzfmg zzfmgVar) {
        String zzk = zzfmgVar.zza().zzk();
        HashMap hashMap = zza;
        Class cls = (Class) hashMap.get(zzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (this.zze.zza(zzfmgVar.zzc())) {
                try {
                    File zzb = zzfmgVar.zzb();
                    if (!zzb.exists()) {
                        zzb.mkdirs();
                    }
                    Class loadClass = new DexClassLoader(zzfmgVar.zzc().getAbsolutePath(), zzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    hashMap.put(zzk, loadClass);
                    return loadClass;
                } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e2) {
                    throw new zzfmp(2008, e2);
                }
            }
            throw new zzfmp(2026, "VM did not pass signature verification");
        } catch (GeneralSecurityException e3) {
            throw new zzfmp(2026, e3);
        }
    }

    public final zzfkv zza() {
        zzfmf zzfmfVar;
        synchronized (this.zzg) {
            zzfmfVar = this.zzf;
        }
        return zzfmfVar;
    }

    public final zzfmg zzb() {
        synchronized (this.zzg) {
            zzfmf zzfmfVar = this.zzf;
            if (zzfmfVar != null) {
                return zzfmfVar.zzf();
            }
            return null;
        }
    }

    public final boolean zzc(zzfmg zzfmgVar) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfmf zzfmfVar = new zzfmf(zzd(zzfmgVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfmgVar.zze(), null, new Bundle(), 2), zzfmgVar, this.zzc, this.zzd);
                if (zzfmfVar.zzh()) {
                    int zze = zzfmfVar.zze();
                    if (zze == 0) {
                        synchronized (this.zzg) {
                            zzfmf zzfmfVar2 = this.zzf;
                            if (zzfmfVar2 != null) {
                                try {
                                    zzfmfVar2.zzg();
                                } catch (zzfmp e2) {
                                    this.zzd.zzc(e2.zza(), -1L, e2);
                                }
                            }
                            this.zzf = zzfmfVar;
                        }
                        this.zzd.zzd(3000, System.currentTimeMillis() - currentTimeMillis);
                        return true;
                    }
                    throw new zzfmp(4001, "ci: " + zze);
                }
                throw new zzfmp(4000, "init failed");
            } catch (Exception e3) {
                throw new zzfmp(2004, e3);
            }
        } catch (zzfmp e4) {
            this.zzd.zzc(e4.zza(), System.currentTimeMillis() - currentTimeMillis, e4);
            return false;
        } catch (Exception e5) {
            this.zzd.zzc(4010, System.currentTimeMillis() - currentTimeMillis, e5);
            return false;
        }
    }
}

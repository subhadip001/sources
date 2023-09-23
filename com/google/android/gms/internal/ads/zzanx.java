package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzanx {
    public volatile Boolean zzb;
    private final zzapc zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    public static volatile zzfmu zza = null;
    private static volatile Random zzd = null;

    public zzanx(zzapc zzapcVar) {
        this.zze = zzapcVar;
        zzapcVar.zzk().execute(new zzanw(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            return zze().nextInt();
        }
    }

    private static Random zze() {
        if (zzd == null) {
            synchronized (zzanx.class) {
                if (zzd == null) {
                    zzd = new Random();
                }
            }
        }
        return zzd;
    }

    public final void zzc(int i2, int i3, long j2, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaku zza2 = zzaky.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j2);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfmt zza3 = zza.zza(((zzaky) zza2.zzaj()).zzau());
            zza3.zza(i2);
            if (i3 != -1) {
                zza3.zzb(i3);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}

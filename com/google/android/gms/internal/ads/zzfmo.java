package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfmo {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzflv zze;
    private boolean zzf;

    public zzfmo(Context context, int i2, zzflv zzflvVar, boolean z) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i2 - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzflvVar;
        this.zzf = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzaqr zzaqrVar) {
        zzaqt zze = zzaqu.zze();
        zze.zze(zzaqrVar.zzd().zzk());
        zze.zza(zzaqrVar.zzd().zzj());
        zze.zzb(zzaqrVar.zzd().zza());
        zze.zzd(zzaqrVar.zzd().zzd());
        zze.zzc(zzaqrVar.zzd().zzc());
        return Hex.bytesToStringLowercase(((zzaqu) zze.zzaj()).zzaq().zzE());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i2, long j2) {
        zzflv zzflvVar = this.zze;
        if (zzflvVar != null) {
            zzflvVar.zza(i2, j2);
        }
    }

    private final void zzj(int i2, long j2, String str) {
        zzflv zzflvVar = this.zze;
        if (zzflvVar != null) {
            zzflvVar.zzb(i2, j2, str);
        }
    }

    private final zzaqu zzk(int i2) {
        String string;
        zzgka zzb;
        if (i2 == 1) {
            string = this.zzc.getString(zzh(), null);
        } else {
            string = this.zzc.getString(zzg(), null);
        }
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzgjg zzv = zzgjg.zzv(Hex.stringToBytes(string));
            if (this.zzf) {
                zzb = zzgka.zza();
            } else {
                zzb = zzgka.zzb();
            }
            return zzaqu.zzi(zzv, zzb);
        } catch (zzgla unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzaqr zzaqrVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            if (!zzfmi.zze(new File(zze(zzaqrVar.zzd().zzk()), "pcbc"), zzaqrVar.zze().zzE())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzf = zzf(zzaqrVar);
            SharedPreferences.Editor edit = this.zzc.edit();
            edit.putString(zzh(), zzf);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final boolean zzb(zzaqr zzaqrVar, zzfmn zzfmnVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaqu zzk = zzk(1);
            String zzk2 = zzaqrVar.zzd().zzk();
            if (zzk != null && zzk.zzk().equals(zzk2)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zzk2);
            if (zze.exists()) {
                zzj(4023, currentTimeMillis2, "d:" + (true != zze.isDirectory() ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1") + ",f:" + (true != zze.isFile() ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1"));
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                zzj(4024, currentTimeMillis2, "cw:".concat(true != zze.canWrite() ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zzk2);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfmi.zze(file, zzaqrVar.zzf().zzE())) {
                zzi(4016, currentTimeMillis);
                return false;
            } else if (!zzfmi.zze(file2, zzaqrVar.zze().zzE())) {
                zzi(4017, currentTimeMillis);
                return false;
            } else if (zzfmnVar != null && !zzfmnVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfmi.zzd(zze2);
                return false;
            } else {
                String zzf = zzf(zzaqrVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzc.getString(zzh(), null);
                SharedPreferences.Editor edit = this.zzc.edit();
                edit.putString(zzh(), zzf);
                if (string != null) {
                    edit.putString(zzg(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzaqu zzk3 = zzk(1);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zzk());
                }
                zzaqu zzk4 = zzk(2);
                if (zzk4 != null) {
                    hashSet.add(zzk4.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfmi.zzd(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final zzfmg zzc(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaqu zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zzk());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfmg(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            zzaqu zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zzk());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (!new File(zze, "pcbc").exists()) {
                zzi(4027, currentTimeMillis);
                return false;
            } else {
                zzi(5019, currentTimeMillis);
                return true;
            }
        }
    }
}

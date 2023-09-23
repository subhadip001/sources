package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzeh extends zzgl {
    private char zza;
    private long zzb;
    private String zzc;
    private final zzef zzd;
    private final zzef zze;
    private final zzef zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final zzef zzi;
    private final zzef zzj;
    private final zzef zzk;
    private final zzef zzl;

    public zzeh(zzfr zzfrVar) {
        super(zzfrVar);
        this.zza = (char) 0;
        this.zzb = -1L;
        this.zzd = new zzef(this, 6, false, false);
        this.zze = new zzef(this, 6, true, false);
        this.zzf = new zzef(this, 6, false, true);
        this.zzg = new zzef(this, 5, false, false);
        this.zzh = new zzef(this, 5, true, false);
        this.zzi = new zzef(this, 5, false, true);
        this.zzj = new zzef(this, 4, false, false);
        this.zzk = new zzef(this, 3, false, false);
        this.zzl = new zzef(this, 2, false, false);
    }

    public static Object zzn(String str) {
        if (str == null) {
            return null;
        }
        return new zzeg(str);
    }

    public static String zzo(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String zzp = zzp(z, obj);
        String zzp2 = zzp(z, obj2);
        String zzp3 = zzp(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(zzp)) {
            sb.append(str2);
            sb.append(zzp);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(zzp2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(zzp2);
        }
        if (!TextUtils.isEmpty(zzp3)) {
            sb.append(str3);
            sb.append(zzp3);
        }
        return sb.toString();
    }

    @VisibleForTesting
    public static String zzp(boolean z, Object obj) {
        String str;
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return obj.toString();
            }
            String str2 = obj.toString().charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            return str2 + round + "..." + str2 + round2;
        } else if (obj instanceof Boolean) {
            return obj.toString();
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String zzy = zzy(zzfr.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && zzy(className).equals(zzy)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb.toString();
            } else if (!(obj instanceof zzeg)) {
                return z ? "-" : obj.toString();
            } else {
                str = ((zzeg) obj).zza;
                return str;
            }
        }
    }

    private static String zzy(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public final zzef zzc() {
        return this.zzk;
    }

    public final zzef zzd() {
        return this.zzd;
    }

    public final zzef zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzgl
    public final boolean zzf() {
        return false;
    }

    public final zzef zzh() {
        return this.zze;
    }

    public final zzef zzi() {
        return this.zzj;
    }

    public final zzef zzj() {
        return this.zzl;
    }

    public final zzef zzk() {
        return this.zzg;
    }

    public final zzef zzl() {
        return this.zzi;
    }

    public final zzef zzm() {
        return this.zzh;
    }

    @VisibleForTesting
    public final String zzq() {
        String str;
        synchronized (this) {
            if (this.zzc == null) {
                if (this.zzt.zzy() != null) {
                    this.zzc = this.zzt.zzy();
                } else {
                    this.zzc = this.zzt.zzf().zzn();
                }
            }
            Preconditions.checkNotNull(this.zzc);
            str = this.zzc;
        }
        return str;
    }

    public final void zzt(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(zzq(), i2)) {
            Log.println(i2, zzq(), zzo(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        Preconditions.checkNotNull(str);
        zzfo zzo = this.zzt.zzo();
        if (zzo == null) {
            Log.println(6, zzq(), "Scheduler not set. Not logging error/warn");
        } else if (!zzo.zzx()) {
            Log.println(6, zzq(), "Scheduler not initialized. Not logging error/warn");
        } else {
            zzo.zzp(new zzee(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.a.b.a.a;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzazn {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    private static final Pattern zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i2 = 26;
        }
        zza = i2;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        StringBuilder F = a.F(str, ", ", str3, ", ", str2);
        F.append(", ");
        F.append(i2);
        zze = F.toString();
        zzf = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzg = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzh = Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    public static float zza(float f2, float f3, float f4) {
        return Math.max(0.1f, Math.min(f2, 8.0f));
    }

    public static int zzb(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static int zzc(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = binarySearch + 1;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int zzd(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int zze(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int zzf(int i2) {
        return i2 != 1 ? 13107200 : 3538944;
    }

    public static int zzg(String str) {
        int length = str.length();
        zzayy.zzc(length <= 4);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 << 8) | str.charAt(i3);
        }
        return i2;
    }

    public static int zzh(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    if (i2 != 32) {
                        return 0;
                    }
                    return CommonUtils.BYTES_IN_A_GIGABYTE;
                }
                return Integer.MIN_VALUE;
            }
            return 2;
        }
        return 3;
    }

    public static int zzi(int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 != 1073741824) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return i3;
                    }
                    throw new IllegalArgumentException();
                }
                return i3 + i3;
            }
            return i3 * 4;
        }
        return i3 * 3;
    }

    public static long zzj(long j2, long j3, long j4) {
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (i2 >= 0 || j3 % j4 != 0) {
            return (long) ((j3 / j4) * j2);
        }
        return (j3 / j4) * j2;
    }

    public static String zzk(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = objArr.length;
            if (i2 >= length) {
                return sb.toString();
            }
            sb.append(objArr[i2].getClass().getSimpleName());
            if (i2 < length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }

    public static ExecutorService zzl(String str) {
        return Executors.newSingleThreadExecutor(new zzazm("Loader:ExtractorMediaPeriod"));
    }

    public static void zzm(zzayi zzayiVar) {
        if (zzayiVar != null) {
            try {
                zzayiVar.zzd();
            } catch (IOException unused) {
            }
        }
    }

    public static void zzn(long[] jArr, long j2, long j3) {
        int i2 = 0;
        int i3 = (j3 > 1000000L ? 1 : (j3 == 1000000L ? 0 : -1));
        if (i3 >= 0 && j3 % 1000000 == 0) {
            long j4 = j3 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (i3 >= 0 || 1000000 % j3 != 0) {
            double d2 = 1000000.0d / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
        } else {
            long j5 = 1000000 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        }
    }

    public static boolean zzo(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static byte[] zzp(String str) {
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 + i2;
            bArr[i2] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4));
        }
        return bArr;
    }

    public static byte[] zzq(String str) {
        return str.getBytes(Charset.defaultCharset());
    }
}

package f.h.b.b.g2;

import android.app.UiModeManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.Chapter;
import com.google.logging.type.LogSeverity;
import java.util.Arrays;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* compiled from: Util.java */
/* loaded from: classes.dex */
public final class b0 {
    public static final int a;
    public static final String b;
    public static final String c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f4268d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f4269e;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f4270f;

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f4271g;

    /* renamed from: h  reason: collision with root package name */
    public static HashMap<String, String> f4272h;

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f4273i;

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4274j;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f4275k;

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f4276l;

    static {
        int i2;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i2 = 31;
        } else {
            i2 = "R".equals(str) ? 30 : Build.VERSION.SDK_INT;
        }
        a = i2;
        String str2 = Build.DEVICE;
        b = str2;
        String str3 = Build.MANUFACTURER;
        c = str3;
        String str4 = Build.MODEL;
        f4268d = str4;
        StringBuilder z = f.a.b.a.a.z(f.a.b.a.a.x(str3, f.a.b.a.a.x(str4, f.a.b.a.a.x(str2, 17))), str2, ", ", str4, ", ");
        z.append(str3);
        z.append(", ");
        z.append(i2);
        f4269e = z.toString();
        f4270f = new byte[0];
        f4271g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        f4273i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Chapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f4274j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f4275k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f4276l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, LogSeverity.INFO_VALUE, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static boolean A(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String B(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String I = I(str);
        int i2 = 0;
        String str2 = H(I, "-")[0];
        if (f4272h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f4273i.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i3 = 0;
            while (true) {
                String[] strArr = f4273i;
                if (i3 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i3], strArr[i3 + 1]);
                i3 += 2;
            }
            f4272h = hashMap;
        }
        String str4 = f4272h.get(str2);
        if (str4 != null) {
            String valueOf = String.valueOf(I.substring(str2.length()));
            I = valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4);
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return I;
        }
        while (true) {
            String[] strArr2 = f4274j;
            if (i2 >= strArr2.length) {
                return I;
            }
            if (I.startsWith(strArr2[i2])) {
                String valueOf2 = String.valueOf(strArr2[i2 + 1]);
                String valueOf3 = String.valueOf(I.substring(strArr2[i2].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i2 += 2;
        }
    }

    public static <T> T[] C(T[] tArr, int i2) {
        f.h.b.b.e2.j.c(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static boolean D(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static long E(long j2, long j3, long j4) {
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (i2 >= 0 || j3 % j4 != 0) {
            return (long) (j2 * (j3 / j4));
        }
        return (j3 / j4) * j2;
    }

    public static void F(long[] jArr, long j2, long j3) {
        int i2 = 0;
        int i3 = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i3 >= 0 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (i3 < 0 && j2 % j3 == 0) {
            long j5 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        } else {
            double d2 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
        }
    }

    public static String[] G(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] H(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String I(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static long J(int i2) {
        return i2 & 4294967295L;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int b(long[] jArr, long j2, boolean z, boolean z2) {
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

    public static int c(n nVar, long j2, boolean z, boolean z2) {
        int i2;
        int i3 = nVar.a - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            if (nVar.b(i5) < j2) {
                i4 = i5 + 1;
            } else {
                i3 = i5 - 1;
            }
        }
        if (z && (i2 = i3 + 1) < nVar.a && nVar.b(i2) == j2) {
            return i2;
        }
        if (z2 && i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static int d(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i2);
            i3 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int e(long[] jArr, long j2, boolean z, boolean z2) {
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
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int f(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static float g(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int h(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long i(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static Handler j() {
        Looper myLooper = Looper.myLooper();
        f.h.b.b.e2.j.i(myLooper);
        return new Handler(myLooper, null);
    }

    public static String k(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String l(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, f.h.c.a.c.c);
    }

    public static int m(int i2) {
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i3 = a;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static Looper n() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long o(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static int p(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 16:
                case 19:
                default:
                    return 6;
                case 18:
                    return 2;
                case 20:
                    return a >= 29 ? 9 : 0;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static int q(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    return i2 != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int r(int i2, int i3) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 268435456) {
                        if (i2 == 536870912) {
                            return i3 * 3;
                        }
                        if (i2 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i3 * 4;
            }
            return i3;
        }
        return i3 * 2;
    }

    public static int s(int i2) {
        if (i2 != 13) {
            switch (i2) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
        return 1;
    }

    public static String t(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String u(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            m.b("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e2);
            return null;
        }
    }

    public static byte[] v(String str) {
        return str.getBytes(f.h.c.a.c.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean w(f.h.b.b.g2.t r3, f.h.b.b.g2.t r4, java.util.zip.Inflater r5) {
        /*
            int r0 = r3.a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            byte[] r0 = r4.a
            int r0 = r0.length
            int r2 = r3.a()
            if (r0 >= r2) goto L1a
            int r0 = r3.a()
            int r0 = r0 * 2
            r4.b(r0)
        L1a:
            if (r5 != 0) goto L21
            java.util.zip.Inflater r5 = new java.util.zip.Inflater
            r5.<init>()
        L21:
            byte[] r0 = r3.a
            int r2 = r3.b
            int r3 = r3.a()
            r5.setInput(r0, r2, r3)
            r3 = 0
        L2d:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r2 - r3
            int r0 = r5.inflate(r0, r3, r2)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r3 = r3 + r0
            boolean r0 = r5.finished()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 == 0) goto L44
            r4.B(r3)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            r3 = 1
            r5.reset()
            return r3
        L44:
            boolean r0 = r5.needsDictionary()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 != 0) goto L5d
            boolean r0 = r5.needsInput()     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r0 == 0) goto L51
            goto L5d
        L51:
            byte[] r0 = r4.a     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r2 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            if (r3 != r2) goto L2d
            int r0 = r0.length     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            int r0 = r0 * 2
            r4.b(r0)     // Catch: java.lang.Throwable -> L61 java.util.zip.DataFormatException -> L66
            goto L2d
        L5d:
            r5.reset()
            return r1
        L61:
            r3 = move-exception
            r5.reset()
            throw r3
        L66:
            r5.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.g2.b0.w(f.h.b.b.g2.t, f.h.b.b.g2.t, java.util.zip.Inflater):boolean");
    }

    public static boolean x(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean y(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean z(int i2) {
        return i2 == 10 || i2 == 13;
    }
}

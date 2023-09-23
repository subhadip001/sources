package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.Chapter;
import com.google.firebase.messaging.Constants;
import com.google.logging.type.LogSeverity;
import f.a.b.a.a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeg {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;
    private static final Pattern zzh;
    private static final Pattern zzi;
    private static final Pattern zzj;
    private static HashMap zzk;
    private static final String[] zzl;
    private static final String[] zzm;
    private static final int[] zzn;
    private static final int[] zzo;

    static {
        int i2 = Build.VERSION.SDK_INT;
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
        zzf = new byte[0];
        zzg = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        zzh = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        zzi = Pattern.compile("%([A-Fa-f0-9]{2})");
        zzj = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        zzl = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", Chapter.KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzm = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzn = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzo = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, LogSeverity.INFO_VALUE, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Point zzA(Context context) {
        String zzah;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzW(context)) {
            if (zza < 28) {
                zzah = zzah("sys.display-size");
            } else {
                zzah = zzah("vendor.display-size");
            }
            if (!TextUtils.isEmpty(zzah)) {
                try {
                    String[] split = zzah.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.e("Util", "Invalid display size: ".concat(String.valueOf(zzah)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza >= 23) {
            Display.Mode mode = display.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        }
        display.getRealSize(point);
        return point;
    }

    public static Handler zzB(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static Handler zzC(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        return new Handler(myLooper, null);
    }

    public static Looper zzD() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static zzad zzE(int i2, int i3, int i4) {
        zzab zzabVar = new zzab();
        zzabVar.zzS("audio/raw");
        zzabVar.zzw(i3);
        zzabVar.zzT(i4);
        zzabVar.zzN(i2);
        return zzabVar.zzY();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzbx zzF(com.google.android.gms.internal.ads.zzcb r11, com.google.android.gms.internal.ads.zzbx r12) {
        /*
            boolean r0 = r11.zzs()
            boolean r1 = r11.zzc()
            r2 = r11
            com.google.android.gms.internal.ads.zzk r2 = (com.google.android.gms.internal.ads.zzk) r2
            com.google.android.gms.internal.ads.zzci r3 = r2.zzn()
            boolean r4 = r3.zzo()
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L1a
        L18:
            r3 = 0
            goto L2b
        L1a:
            int r4 = r2.zzf()
            r2.zzj()
            r2.zzr()
            int r3 = r3.zzk(r4, r7, r7)
            if (r3 == r5) goto L18
            r3 = 1
        L2b:
            com.google.android.gms.internal.ads.zzci r4 = r2.zzn()
            boolean r8 = r4.zzo()
            if (r8 == 0) goto L37
        L35:
            r2 = 0
            goto L48
        L37:
            int r8 = r2.zzf()
            r2.zzj()
            r2.zzr()
            int r2 = r4.zzj(r8, r7, r7)
            if (r2 == r5) goto L35
            r2 = 1
        L48:
            boolean r4 = r11.zzb()
            boolean r5 = r11.zza()
            com.google.android.gms.internal.ads.zzci r11 = r11.zzn()
            boolean r11 = r11.zzo()
            com.google.android.gms.internal.ads.zzbv r8 = new com.google.android.gms.internal.ads.zzbv
            r8.<init>()
            r8.zzb(r12)
            r12 = 4
            r9 = r0 ^ 1
            r8.zzd(r12, r9)
            if (r1 == 0) goto L6c
            if (r0 != 0) goto L6c
            r12 = 1
            goto L6d
        L6c:
            r12 = 0
        L6d:
            r10 = 5
            r8.zzd(r10, r12)
            if (r3 == 0) goto L77
            if (r0 != 0) goto L77
            r12 = 1
            goto L78
        L77:
            r12 = 0
        L78:
            r10 = 6
            r8.zzd(r10, r12)
            if (r11 != 0) goto L88
            if (r3 != 0) goto L84
            if (r4 == 0) goto L84
            if (r1 == 0) goto L88
        L84:
            if (r0 != 0) goto L88
            r12 = 1
            goto L89
        L88:
            r12 = 0
        L89:
            r3 = 7
            r8.zzd(r3, r12)
            if (r2 == 0) goto L93
            if (r0 != 0) goto L93
            r12 = 1
            goto L94
        L93:
            r12 = 0
        L94:
            r3 = 8
            r8.zzd(r3, r12)
            if (r11 != 0) goto La5
            if (r2 != 0) goto La1
            if (r4 == 0) goto La5
            if (r5 == 0) goto La5
        La1:
            if (r0 != 0) goto La5
            r11 = 1
            goto La6
        La5:
            r11 = 0
        La6:
            r12 = 9
            r8.zzd(r12, r11)
            r11 = 10
            r8.zzd(r11, r9)
            if (r1 == 0) goto Lb6
            if (r0 != 0) goto Lb6
            r11 = 1
            goto Lb7
        Lb6:
            r11 = 0
        Lb7:
            r12 = 11
            r8.zzd(r12, r11)
            if (r1 == 0) goto Lc1
            if (r0 != 0) goto Lc1
            goto Lc2
        Lc1:
            r6 = 0
        Lc2:
            r11 = 12
            r8.zzd(r11, r6)
            com.google.android.gms.internal.ads.zzbx r11 = r8.zze()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeg.zzF(com.google.android.gms.internal.ads.zzcb, com.google.android.gms.internal.ads.zzbx):com.google.android.gms.internal.ads.zzbx");
    }

    public static Object zzG(Object obj) {
        return obj;
    }

    public static String zzH(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String zzI(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, zzfog.zzc);
    }

    public static String zzJ(Object[] objArr) {
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

    public static String zzK(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return zzfoa.zzb(networkCountryIso);
            }
        }
        return zzfoa.zzb(Locale.getDefault().getCountry());
    }

    public static String zzL(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    public static String zzM(Locale locale) {
        return zza >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    public static String zzN(int i2) {
        switch (i2) {
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return NotificationCompat.MessagingStyle.Message.KEY_TEXT;
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String zzO(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String zza2 = zzfoa.zza(str);
        int i2 = 0;
        String str2 = zza2.split("-", 2)[0];
        if (zzk == null) {
            zzk = zzai();
        }
        String str3 = (String) zzk.get(str2);
        if (str3 != null) {
            zza2 = str3.concat(String.valueOf(zza2.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return zza2;
        }
        while (true) {
            String[] strArr = zzm;
            int length = strArr.length;
            if (i2 >= 18) {
                return zza2;
            }
            if (zza2.startsWith(strArr[i2])) {
                return String.valueOf(strArr[i2 + 1]).concat(String.valueOf(zza2.substring(strArr[i2].length())));
            }
            i2 += 2;
        }
    }

    public static ExecutorService zzP(String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory("ExoPlayer:Loader:ProgressiveMediaPeriod") { // from class: com.google.android.gms.internal.ads.zzef
            public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.zza);
            }
        });
    }

    public static void zzQ(long[] jArr, long j2, long j3) {
        int i2 = 0;
        int i3 = (j3 > 1000000L ? 1 : (j3 == 1000000L ? 0 : -1));
        if (i3 >= 0 && j3 % 1000000 == 0) {
            long j4 = j3 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
        } else if (i3 < 0 && 1000000 % j3 == 0) {
            long j5 = 1000000 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j5;
                i2++;
            }
        } else {
            double d2 = 1000000.0d / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
        }
    }

    public static void zzR(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean zzS(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean zzT(int i2) {
        return i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean zzU(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean zzV(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean zzW(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static boolean zzX(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    public static boolean zzY(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static byte[] zzZ(String str) {
        return str.getBytes(zzfog.zzc);
    }

    public static float zza(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static byte[] zzaa(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Object[] zzab(Object[] objArr) {
        return objArr;
    }

    public static Object[] zzac(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    public static Object[] zzad(Object[] objArr, int i2) {
        zzcw.zzd(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String[] zzae() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = zza >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{zzM(configuration.locale)};
        for (int i2 = 0; i2 < split.length; i2++) {
            split[i2] = zzO(split[i2]);
        }
        return split;
    }

    public static String[] zzaf(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] zzag(String str, String str2) {
        return str.split(str2, 2);
    }

    private static String zzah(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            zzdn.zza("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    private static HashMap zzai() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzl.length;
        HashMap hashMap = new HashMap(length + 86);
        int i2 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzl;
            int length3 = strArr.length;
            if (i2 >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i2], strArr[i2 + 1]);
            i2 += 2;
        }
    }

    public static int zzb(long[] jArr, long j2, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j2);
        return !z ? binarySearch : binarySearch - 1;
    }

    public static int zzc(int[] iArr, int i2, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0) {
                break;
            }
        } while (iArr[binarySearch] == i2);
        return binarySearch;
    }

    public static int zzd(long[] jArr, long j2, boolean z, boolean z2) {
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

    public static int zze(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static int zzf(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static int zzg(byte[] bArr, int i2, int i3, int i4) {
        int i5 = -1;
        for (int i6 = 0; i6 < i3; i6++) {
            i5 = zzn[(i5 >>> 24) ^ (bArr[i6] & 255)] ^ (i5 << 8);
        }
        return i5;
    }

    public static int zzh(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i2 < i3) {
            i5 = zzo[i5 ^ (bArr[i2] & 255)];
            i2++;
        }
        return i5;
    }

    public static int zzi(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    public static int zzj(int i2) {
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
                int i3 = zza;
                return (i3 < 23 && i3 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int zzk(ByteBuffer byteBuffer, int i2) {
        int i3 = byteBuffer.getInt(i2);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i3 : Integer.reverseBytes(i3);
    }

    public static int zzl(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 != 10) {
            if (i2 != 7) {
                if (i2 != 8) {
                    switch (i2) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }
                return 6003;
            }
            return 6005;
        }
        return 6004;
    }

    public static int zzm(String str) {
        String[] split;
        int length;
        int i2 = 0;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z = length >= 3 && "neg".equals(split[length + (-2)]);
            Objects.requireNonNull(str2);
            try {
                i2 = Integer.parseInt(str2);
                if (z) {
                    return -i2;
                }
            } catch (NumberFormatException unused) {
            }
            return i2;
        }
        return 0;
    }

    public static int zzn(int i2) {
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

    public static int zzo(int i2, int i3) {
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
        return i3 + i3;
    }

    public static int zzp(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || !zzfoa.zzc("rtsp", scheme)) {
            String path = uri.getPath();
            if (path == null) {
                return 4;
            }
            String zza2 = zzfoa.zza(path);
            if (!zza2.endsWith(".mpd")) {
                if (!zza2.endsWith(".m3u8")) {
                    Matcher matcher = zzj.matcher(zza2);
                    if (!matcher.matches()) {
                        return 4;
                    }
                    String group = matcher.group(2);
                    if (group == null) {
                        return 1;
                    }
                    if (!group.contains("format=mpd-time-csf")) {
                        if (!group.contains("format=m3u8-aapl")) {
                            return 1;
                        }
                    }
                }
                return 2;
            }
            return 0;
        }
        return 3;
    }

    public static long zzq(long j2, long j3, long j4) {
        long j5 = j2 + j3;
        if (((j2 ^ j5) & (j3 ^ j5)) < 0) {
            return Long.MAX_VALUE;
        }
        return j5;
    }

    public static long zzr(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static long zzs(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long zzt(long j2) {
        if (j2 == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j2 + SystemClock.elapsedRealtime();
    }

    public static long zzu(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static long zzv(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long zzw(long j2, long j3, long j4) {
        int i2 = (j4 > j3 ? 1 : (j4 == j3 ? 0 : -1));
        if (i2 >= 0 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (i2 >= 0 || j3 % j4 != 0) {
            return (long) ((j3 / j4) * j2);
        }
        return (j3 / j4) * j2;
    }

    public static long zzx(long j2, long j3, long j4) {
        long j5 = j2 - j3;
        if (((j2 ^ j5) & (j3 ^ j2)) < 0) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    public static long zzy(int i2, int i3) {
        return (i3 & 4294967295L) | ((i2 & 4294967295L) << 32);
    }

    public static long zzz(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }
}

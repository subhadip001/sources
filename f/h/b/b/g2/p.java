package f.h.b.b.g2;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: MimeTypes.java */
/* loaded from: classes.dex */
public final class p {
    public static final ArrayList<a> a = new ArrayList<>();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* compiled from: MimeTypes.java */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: MimeTypes.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public static boolean a(String str, String str2) {
        b e2;
        int a2;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
                return true;
            case 3:
                return (str2 == null || (e2 = e(str2)) == null || (a2 = f.h.b.b.u1.k.a(e2.b)) == 0 || a2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        b e2;
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (e2 = e(str2)) == null) {
                    return 0;
                }
                return f.h.b.b.u1.k.a(e2.b);
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case '\b':
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        b e2;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String I = b0.I(str.trim());
        if (I.startsWith("avc1") || I.startsWith("avc3")) {
            return "video/avc";
        }
        if (I.startsWith("hev1") || I.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (I.startsWith("dvav") || I.startsWith("dva1") || I.startsWith("dvhe") || I.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (I.startsWith("av01")) {
            return "video/av01";
        }
        if (I.startsWith("vp9") || I.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (I.startsWith("vp8") || I.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (I.startsWith("mp4a")) {
            if (I.startsWith("mp4a.") && (e2 = e(I)) != null) {
                str2 = d(e2.a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (I.startsWith("ac-3") || I.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (I.startsWith("ec-3") || I.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (I.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (I.startsWith("ac-4") || I.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (I.startsWith("dtsc") || I.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (I.startsWith("dtsh") || I.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (I.startsWith("opus")) {
                return "audio/opus";
            }
            if (I.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (I.startsWith("flac")) {
                return "audio/flac";
            }
            if (I.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (I.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (I.contains("cea708")) {
                return "application/cea-708";
            }
            if (I.contains("eia608") || I.contains("cea608")) {
                return "application/cea-608";
            }
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Objects.requireNonNull(a.get(i2));
                if (I.startsWith(null)) {
                    break;
                }
            }
            return null;
        }
    }

    public static String d(int i2) {
        if (i2 != 32) {
            if (i2 != 33) {
                if (i2 != 35) {
                    if (i2 != 64) {
                        if (i2 != 163) {
                            if (i2 != 177) {
                                if (i2 != 165) {
                                    if (i2 != 166) {
                                        switch (i2) {
                                            case 96:
                                            case 97:
                                            case 98:
                                            case 99:
                                            case 100:
                                            case 101:
                                                return "video/mpeg2";
                                            case 102:
                                            case 103:
                                            case 104:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case 107:
                                                return "audio/mpeg";
                                            case 106:
                                                return "video/mpeg";
                                            default:
                                                switch (i2) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    case 174:
                                                        return "audio/ac4";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    public static b e(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            try {
                return new b(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(a.get(i2));
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return NotificationCompat.MessagingStyle.Message.KEY_TEXT.equals(f(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean j(String str) {
        return "video".equals(f(str));
    }
}

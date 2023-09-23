package f.h.b.b.c2.s;

import android.text.Layout;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.Chapter;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.firebase.messaging.Constants;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.h;
import f.h.b.b.g2.m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: TtmlDecoder.java */
/* loaded from: classes.dex */
public final class b extends f.h.b.b.c2.d {
    public static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final C0106b u = new C0106b(30.0f, 1, 1);
    public static final a v = new a(32, 15);
    public final XmlPullParserFactory n;

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        public a(int i2, int i3) {
            this.a = i3;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* renamed from: f.h.b.b.c2.s.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0106b {
        public final float a;
        public final int b;
        public final int c;

        public C0106b(float f2, int i2, int i3) {
            this.a = f2;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;

        public c(int i2, int i3) {
            this.a = i2;
            this.b = i3;
        }
    }

    public b() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static e k(e eVar) {
        return eVar == null ? new e() : eVar;
    }

    public static boolean l(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE) || str.equals("information");
    }

    public static a m(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(parseInt);
            sb.append(" ");
            sb.append(parseInt2);
            throw new SubtitleDecoderException(sb.toString());
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    public static void n(String str, e eVar) {
        Matcher matcher;
        int i2 = b0.a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = q.matcher(str);
        } else if (split.length == 2) {
            matcher = q.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = split.length;
            StringBuilder sb = new StringBuilder(52);
            sb.append("Invalid number of entries for fontSize: ");
            sb.append(length);
            sb.append(".");
            throw new SubtitleDecoderException(sb.toString());
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            Objects.requireNonNull(group);
            group.hashCode();
            char c2 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    eVar.f4049j = 3;
                    break;
                case 1:
                    eVar.f4049j = 2;
                    break;
                case 2:
                    eVar.f4049j = 1;
                    break;
                default:
                    throw new SubtitleDecoderException(f.a.b.a.a.g(group.length() + 30, "Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            Objects.requireNonNull(group2);
            eVar.f4050k = Float.parseFloat(group2);
            return;
        }
        throw new SubtitleDecoderException(f.a.b.a.a.g(str.length() + 36, "Invalid expression for fontSize: '", str, "'."));
    }

    public static C0106b o(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i2 = b0.a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f2 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C0106b c0106b = u;
        int i3 = c0106b.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = c0106b.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new C0106b(parseInt * f2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01eb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, f.h.b.b.c2.s.e> p(org.xmlpull.v1.XmlPullParser r18, java.util.Map<java.lang.String, f.h.b.b.c2.s.e> r19, f.h.b.b.c2.s.b.a r20, f.h.b.b.c2.s.b.c r21, java.util.Map<java.lang.String, f.h.b.b.c2.s.d> r22, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.s.b.p(org.xmlpull.v1.XmlPullParser, java.util.Map, f.h.b.b.c2.s.b$a, f.h.b.b.c2.s.b$c, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f.h.b.b.c2.s.c q(XmlPullParser xmlPullParser, f.h.b.b.c2.s.c cVar, Map<String, d> map, C0106b c0106b) {
        long j2;
        long j3;
        char c2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        e r2 = r(xmlPullParser2, null);
        String str = null;
        String str2 = "";
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        long j6 = -9223372036854775807L;
        String[] strArr = null;
        int i2 = 0;
        while (i2 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i2);
            String attributeValue = xmlPullParser2.getAttributeValue(i2);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals(Chapter.KEY_END)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    j6 = t(attributeValue, c0106b);
                } else if (c2 == 2) {
                    j5 = t(attributeValue, c0106b);
                } else if (c2 == 3) {
                    j4 = t(attributeValue, c0106b);
                } else if (c2 != 4) {
                    if (c2 == 5 && attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                    }
                } else {
                    String[] s2 = s(attributeValue);
                    if (s2.length > 0) {
                        strArr = s2;
                    }
                }
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
            i2++;
            xmlPullParser2 = xmlPullParser;
        }
        if (cVar != null) {
            long j7 = cVar.f4026d;
            j2 = -9223372036854775807L;
            if (j7 != -9223372036854775807L) {
                if (j4 != -9223372036854775807L) {
                    j4 += j7;
                }
                if (j5 != -9223372036854775807L) {
                    j5 += j7;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (j5 == j2) {
            if (j6 != j2) {
                j3 = j4 + j6;
            } else if (cVar != null) {
                long j8 = cVar.f4027e;
                if (j8 != j2) {
                    j3 = j8;
                }
            }
            return new f.h.b.b.c2.s.c(xmlPullParser.getName(), null, j4, j3, r2, strArr, str2, str, cVar);
        }
        j3 = j5;
        return new f.h.b.b.c2.s.c(xmlPullParser.getName(), null, j4, j3, r2, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static e r(XmlPullParser xmlPullParser, e eVar) {
        char c2;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            attributeName.hashCode();
            char c3 = 65535;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3355:
                    if (attributeName.equals(Chapter.KEY_ID)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    eVar = k(eVar);
                    eVar.f4048i = "italic".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 1:
                    eVar = k(eVar);
                    eVar.a = attributeValue;
                    break;
                case 2:
                    String I = b0.I(attributeValue);
                    I.hashCode();
                    switch (I.hashCode()) {
                        case -1364013995:
                            if (I.equals("center")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case 100571:
                            if (I.equals(Chapter.KEY_END)) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 3317767:
                            if (I.equals("left")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 108511772:
                            if (I.equals("right")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 109757538:
                            if (I.equals(Chapter.KEY_START)) {
                                c3 = 4;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    if (c3 != 4) {
                                        break;
                                    }
                                }
                            }
                            eVar = k(eVar);
                            eVar.o = Layout.Alignment.ALIGN_NORMAL;
                            break;
                        }
                        eVar = k(eVar);
                        eVar.o = Layout.Alignment.ALIGN_OPPOSITE;
                        break;
                    } else {
                        eVar = k(eVar);
                        eVar.o = Layout.Alignment.ALIGN_CENTER;
                        break;
                    }
                case 3:
                    String I2 = b0.I(attributeValue);
                    I2.hashCode();
                    switch (I2.hashCode()) {
                        case -1461280213:
                            if (I2.equals("nounderline")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -1026963764:
                            if (I2.equals("underline")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case 913457136:
                            if (I2.equals("nolinethrough")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case 1679736913:
                            if (I2.equals("linethrough")) {
                                c3 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c3) {
                        case 0:
                            eVar = k(eVar);
                            eVar.f4046g = 0;
                            continue;
                        case 1:
                            eVar = k(eVar);
                            eVar.f4046g = 1;
                            continue;
                        case 2:
                            eVar = k(eVar);
                            eVar.f4045f = 0;
                            continue;
                        case 3:
                            eVar = k(eVar);
                            eVar.f4045f = 1;
                            continue;
                    }
                case 4:
                    eVar = k(eVar);
                    eVar.f4047h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        eVar = k(eVar);
                        eVar.f4051l = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    String I3 = b0.I(attributeValue);
                    I3.hashCode();
                    switch (I3.hashCode()) {
                        case -618561360:
                            if (I3.equals("baseContainer")) {
                                c3 = 0;
                                break;
                            }
                            break;
                        case -410956671:
                            if (I3.equals("container")) {
                                c3 = 1;
                                break;
                            }
                            break;
                        case -250518009:
                            if (I3.equals("delimiter")) {
                                c3 = 2;
                                break;
                            }
                            break;
                        case -136074796:
                            if (I3.equals("textContainer")) {
                                c3 = 3;
                                break;
                            }
                            break;
                        case 3016401:
                            if (I3.equals("base")) {
                                c3 = 4;
                                break;
                            }
                            break;
                        case 3556653:
                            if (I3.equals(NotificationCompat.MessagingStyle.Message.KEY_TEXT)) {
                                c3 = 5;
                                break;
                            }
                            break;
                    }
                    if (c3 != 0) {
                        if (c3 != 1) {
                            if (c3 != 2) {
                                if (c3 != 3) {
                                    if (c3 != 4) {
                                        if (c3 != 5) {
                                            break;
                                        }
                                    }
                                }
                                eVar = k(eVar);
                                eVar.f4052m = 3;
                                break;
                            } else {
                                eVar = k(eVar);
                                eVar.f4052m = 4;
                                break;
                            }
                        } else {
                            eVar = k(eVar);
                            eVar.f4052m = 1;
                            break;
                        }
                    }
                    eVar = k(eVar);
                    eVar.f4052m = 2;
                    break;
                case 7:
                    eVar = k(eVar);
                    try {
                        eVar.b = h.a(attributeValue, false);
                        eVar.c = true;
                        break;
                    } catch (IllegalArgumentException unused) {
                        String valueOf = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf.length() != 0 ? "Failed parsing color value: ".concat(valueOf) : new String("Failed parsing color value: "));
                        break;
                    }
                case '\b':
                    String I4 = b0.I(attributeValue);
                    I4.hashCode();
                    if (I4.equals("all")) {
                        eVar = k(eVar);
                        eVar.p = 1;
                        break;
                    } else if (I4.equals("none")) {
                        eVar = k(eVar);
                        eVar.p = 0;
                        break;
                    } else {
                        break;
                    }
                case '\t':
                    try {
                        eVar = k(eVar);
                        n(attributeValue, eVar);
                        break;
                    } catch (SubtitleDecoderException unused2) {
                        String valueOf2 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(valueOf2) : new String("Failed parsing fontSize value: "));
                        break;
                    }
                case '\n':
                    String I5 = b0.I(attributeValue);
                    I5.hashCode();
                    if (I5.equals("before")) {
                        eVar = k(eVar);
                        eVar.n = 1;
                        break;
                    } else if (I5.equals("after")) {
                        eVar = k(eVar);
                        eVar.n = 2;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    eVar = k(eVar);
                    try {
                        eVar.f4043d = h.a(attributeValue, false);
                        eVar.f4044e = true;
                        break;
                    } catch (IllegalArgumentException unused3) {
                        String valueOf3 = String.valueOf(attributeValue);
                        Log.w("TtmlDecoder", valueOf3.length() != 0 ? "Failed parsing background value: ".concat(valueOf3) : new String("Failed parsing background value: "));
                        break;
                    }
            }
        }
        return eVar;
    }

    public static String[] s(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i2 = b0.a;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long t(java.lang.String r13, f.h.b.b.c2.s.b.C0106b r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.s.b.t(java.lang.String, f.h.b.b.c2.s.b$b):long");
    }

    public static c u(XmlPullParser xmlPullParser) {
        String n = j.n(xmlPullParser, "extent");
        if (n == null) {
            return null;
        }
        Matcher matcher = s.matcher(n);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", n.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(n) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            return new c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", n.length() != 0 ? "Ignoring malformed tts extent: ".concat(n) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // f.h.b.b.c2.d
    public f.h.b.b.c2.f j(byte[] bArr, int i2, boolean z) {
        C0106b c0106b;
        try {
            XmlPullParser newPullParser = this.n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new d("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C0106b c0106b2 = u;
            a aVar = v;
            f fVar = null;
            int i3 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                f.h.b.b.c2.s.c cVar2 = (f.h.b.b.c2.s.c) arrayDeque.peek();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c0106b2 = o(newPullParser);
                            aVar = m(newPullParser, v);
                            cVar = u(newPullParser);
                        }
                        c cVar3 = cVar;
                        C0106b c0106b3 = c0106b2;
                        a aVar2 = aVar;
                        if (!l(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            Log.i("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i3++;
                            c0106b = c0106b3;
                        } else if ("head".equals(name)) {
                            c0106b = c0106b3;
                            p(newPullParser, hashMap, aVar2, cVar3, hashMap2, hashMap3);
                        } else {
                            c0106b = c0106b3;
                            try {
                                f.h.b.b.c2.s.c q2 = q(newPullParser, cVar2, hashMap2, c0106b);
                                arrayDeque.push(q2);
                                if (cVar2 != null) {
                                    cVar2.a(q2);
                                }
                            } catch (SubtitleDecoderException e2) {
                                m.c("TtmlDecoder", "Suppressing parser error", e2);
                                i3++;
                            }
                        }
                        c0106b2 = c0106b;
                        cVar = cVar3;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(cVar2);
                        f.h.b.b.c2.s.c b = f.h.b.b.c2.s.c.b(newPullParser.getText());
                        if (cVar2.f4035m == null) {
                            cVar2.f4035m = new ArrayList();
                        }
                        cVar2.f4035m.add(b);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            f.h.b.b.c2.s.c cVar4 = (f.h.b.b.c2.s.c) arrayDeque.peek();
                            Objects.requireNonNull(cVar4);
                            fVar = new f(cVar4, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                newPullParser.next();
            }
            if (fVar != null) {
                return fVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new SubtitleDecoderException("Unable to decode source", e4);
        }
    }
}

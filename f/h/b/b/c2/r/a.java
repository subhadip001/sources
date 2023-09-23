package f.h.b.b.c2.r;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import f.h.b.b.c2.c;
import f.h.b.b.c2.d;
import f.h.b.b.c2.f;
import f.h.b.b.g2.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: SubripDecoder.java */
/* loaded from: classes.dex */
public final class a extends d {
    public static final Pattern p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern q = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder n;
    public final ArrayList<String> o;

    public a() {
        super("SubripDecoder");
        this.n = new StringBuilder();
        this.o = new ArrayList<>();
    }

    public static float k(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    public static long l(Matcher matcher, int i2) {
        String group = matcher.group(i2 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L;
        String group2 = matcher.group(i2 + 2);
        Objects.requireNonNull(group2);
        String group3 = matcher.group(i2 + 3);
        Objects.requireNonNull(group3);
        long parseLong2 = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group4 = matcher.group(i2 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // f.h.b.b.c2.d
    public f j(byte[] bArr, int i2, boolean z) {
        t tVar;
        String g2;
        long[] jArr;
        t tVar2;
        char c;
        int i3;
        char c2;
        c cVar;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        t tVar3 = new t(bArr, i2);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            String g3 = tVar3.g();
            if (g3 != null) {
                if (g3.length() != 0) {
                    try {
                        Integer.parseInt(g3);
                        g2 = tVar3.g();
                    } catch (NumberFormatException unused) {
                        tVar = tVar3;
                        Log.w("SubripDecoder", g3.length() != 0 ? "Skipping invalid index: ".concat(g3) : new String("Skipping invalid index: "));
                    }
                    if (g2 == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = p.matcher(g2);
                        if (matcher.matches()) {
                            long l2 = l(matcher, 1);
                            if (i5 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i5 * 2);
                            }
                            int i6 = i5 + 1;
                            jArr2[i5] = l2;
                            long l3 = l(matcher, 6);
                            if (i6 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i6 * 2);
                            }
                            int i7 = i6 + 1;
                            jArr2[i6] = l3;
                            aVar.n.setLength(i4);
                            aVar.o.clear();
                            for (String g4 = tVar3.g(); !TextUtils.isEmpty(g4); g4 = tVar3.g()) {
                                if (aVar.n.length() > 0) {
                                    aVar.n.append("<br>");
                                }
                                StringBuilder sb = aVar.n;
                                ArrayList<String> arrayList2 = aVar.o;
                                String trim = g4.trim();
                                StringBuilder sb2 = new StringBuilder(trim);
                                Matcher matcher2 = q.matcher(trim);
                                int i8 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i8;
                                    int length = group.length();
                                    sb2.replace(start, start + length, "");
                                    i8 += length;
                                }
                                sb.append(sb2.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(aVar.n.toString());
                            String str = null;
                            int i9 = 0;
                            while (true) {
                                if (i9 < aVar.o.size()) {
                                    String str2 = aVar.o.get(i9);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                            if (str == null) {
                                cVar = new c(fromHtml, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, null);
                                jArr = jArr2;
                                tVar2 = tVar3;
                                i3 = i7;
                            } else {
                                jArr = jArr2;
                                tVar2 = tVar3;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c = '\b';
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                i3 = i7;
                                int i10 = (c == 0 || c == 1 || c == 2) ? 0 : (c == 3 || c == 4 || c == 5) ? 2 : 1;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c2 = '\b';
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                int i11 = (c2 == 0 || c2 == 1 || c2 == 2) ? 2 : (c2 == 3 || c2 == 4 || c2 == 5) ? 0 : 1;
                                cVar = new c(fromHtml, null, null, k(i11), 0, i11, k(i10), i10, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, null);
                            }
                            arrayList.add(cVar);
                            arrayList.add(c.p);
                            aVar = this;
                            jArr2 = jArr;
                            tVar3 = tVar2;
                            i5 = i3;
                            i4 = 0;
                        } else {
                            tVar = tVar3;
                            Log.w("SubripDecoder", g2.length() != 0 ? "Skipping invalid timing: ".concat(g2) : new String("Skipping invalid timing: "));
                            aVar = this;
                            tVar3 = tVar;
                            i4 = 0;
                        }
                    }
                }
            }
        }
        return new b((c[]) arrayList.toArray(new c[0]), Arrays.copyOf(jArr2, i5));
    }
}

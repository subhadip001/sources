package f.h.b.b.c2.u;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.arthenica.ffmpegkit.Chapter;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.h.b.b.c2.u.h;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WebvttCueParser.java */
/* loaded from: classes.dex */
public final class h {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map<String, Integer> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, Integer> f4073d;

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final /* synthetic */ int c = 0;
        public final c a;
        public final int b;

        public b(c cVar, int i2, a aVar) {
            this.a = cVar;
            this.b = i2;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final String a;
        public final int b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f4074d;

        public c(String str, int i2, String str2, Set<String> set) {
            this.b = i2;
            this.a = str;
            this.c = str2;
            this.f4074d = set;
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: f  reason: collision with root package name */
        public final int f4075f;

        /* renamed from: g  reason: collision with root package name */
        public final f f4076g;

        public d(int i2, f fVar) {
            this.f4075f = i2;
            this.f4076g = fVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return Integer.compare(this.f4075f, dVar.f4075f);
        }
    }

    /* compiled from: WebvttCueParser.java */
    /* loaded from: classes.dex */
    public static final class e {
        public CharSequence c;
        public long a = 0;
        public long b = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4077d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f4078e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f4079f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f4080g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f4081h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f4082i = Integer.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public float f4083j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f4084k = Integer.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0074, code lost:
            if (r6 == 0) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public f.h.b.b.c2.c.b a() {
            /*
                Method dump skipped, instructions count: 183
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.u.h.e.a():f.h.b.b.c2.c$b");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f4073d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<f> list2) {
        char c2;
        int i2 = cVar.b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.a;
        str2.hashCode();
        int hashCode = str2.hashCode();
        int i3 = -1;
        if (hashCode == 0) {
            if (str2.equals("")) {
                c2 = 0;
            }
            c2 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c2 = 3;
            }
            c2 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c2 = 6;
            }
            c2 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c2 = 7;
            }
            c2 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c2 = 1;
            }
            c2 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals("c")) {
                c2 = 2;
            }
            c2 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c2 = 5;
            }
            c2 = 65535;
        } else {
            if (str2.equals("u")) {
                c2 = 4;
            }
            c2 = 65535;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                for (String str3 : cVar.f4074d) {
                    Map<String, Integer> map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i2, length, 33);
                    } else {
                        Map<String, Integer> map2 = f4073d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                int c3 = c(list2, str, cVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                int i4 = b.c;
                Collections.sort(arrayList, new Comparator() { // from class: f.h.b.b.c2.u.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Integer.compare(((h.b) obj).a.b, ((h.b) obj2).a.b);
                    }
                });
                int i5 = cVar.b;
                int i6 = 0;
                int i7 = 0;
                while (i6 < arrayList.size()) {
                    if ("rt".equals(((b) arrayList.get(i6)).a.a)) {
                        b bVar = (b) arrayList.get(i6);
                        int c4 = c(list2, str, bVar.a);
                        if (c4 == i3) {
                            c4 = c3 != i3 ? c3 : 1;
                        }
                        int i8 = bVar.a.b - i7;
                        int i9 = bVar.b - i7;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i8, i9);
                        spannableStringBuilder.delete(i8, i9);
                        spannableStringBuilder.setSpan(new f.h.b.b.c2.p.b(subSequence.toString(), c4), i5, i8, 33);
                        i7 = subSequence.length() + i7;
                        i5 = i8;
                    }
                    i6++;
                    i3 = -1;
                }
                break;
            default:
                return;
        }
        List<d> b2 = b(list2, str, cVar);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) b2;
            if (i10 >= arrayList2.size()) {
                return;
            }
            f fVar = ((d) arrayList2.get(i10)).f4076g;
            if (fVar != null) {
                if (fVar.a() != -1) {
                    f.c.a.a.i.a(spannableStringBuilder, new StyleSpan(fVar.a()), i2, length, 33);
                }
                if (fVar.f4069j == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
                }
                if (fVar.f4070k == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                }
                if (fVar.f4066g) {
                    if (fVar.f4066g) {
                        f.c.a.a.i.a(spannableStringBuilder, new ForegroundColorSpan(fVar.f4065f), i2, length, 33);
                    } else {
                        throw new IllegalStateException("Font color not defined");
                    }
                }
                if (fVar.f4068i) {
                    if (fVar.f4068i) {
                        f.c.a.a.i.a(spannableStringBuilder, new BackgroundColorSpan(fVar.f4067h), i2, length, 33);
                    } else {
                        throw new IllegalStateException("Background color not defined.");
                    }
                }
                if (fVar.f4064e != null) {
                    f.c.a.a.i.a(spannableStringBuilder, new TypefaceSpan(fVar.f4064e), i2, length, 33);
                }
                int i11 = fVar.n;
                if (i11 == 1) {
                    f.c.a.a.i.a(spannableStringBuilder, new AbsoluteSizeSpan((int) 0.0f, true), i2, length, 33);
                } else if (i11 == 2) {
                    f.c.a.a.i.a(spannableStringBuilder, new RelativeSizeSpan(0.0f), i2, length, 33);
                } else if (i11 == 3) {
                    f.c.a.a.i.a(spannableStringBuilder, new RelativeSizeSpan(0.0f), i2, length, 33);
                }
                if (fVar.p) {
                    spannableStringBuilder.setSpan(new f.h.b.b.c2.p.a(), i2, length, 33);
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List<d> b(List<f> list, String str, c cVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            f fVar = list.get(i2);
            String str2 = cVar.a;
            Set<String> set = cVar.f4074d;
            String str3 = cVar.c;
            if (fVar.a.isEmpty() && fVar.b.isEmpty() && fVar.c.isEmpty() && fVar.f4063d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int b2 = f.b(f.b(f.b(0, fVar.a, str, CommonUtils.BYTES_IN_A_GIGABYTE), fVar.b, str2, 2), fVar.f4063d, str3, 4);
                size = (b2 == -1 || !set.containsAll(fVar.c)) ? 0 : b2 + (fVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new d(size, fVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<f> list, String str, c cVar) {
        List<d> b2 = b(list, str, cVar);
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) b2;
            if (i2 >= arrayList.size()) {
                return -1;
            }
            int i3 = ((d) arrayList.get(i2)).f4076g.o;
            if (i3 != -1) {
                return i3;
            }
            i2++;
        }
    }

    public static g d(String str, Matcher matcher, t tVar, List<f> list) {
        e eVar = new e();
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            eVar.a = j.b(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            eVar.b = j.b(group2);
            String group3 = matcher.group(3);
            Objects.requireNonNull(group3);
            e(group3, eVar);
            StringBuilder sb = new StringBuilder();
            String g2 = tVar.g();
            while (!TextUtils.isEmpty(g2)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(g2.trim());
                g2 = tVar.g();
            }
            eVar.c = f(str, sb.toString(), list);
            return new g(eVar.a().a(), eVar.a, eVar.b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, e eVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            int i2 = 1;
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            try {
                if ("line".equals(group)) {
                    g(group2, eVar);
                } else if ("align".equals(group)) {
                    char c2 = 65535;
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (group2.equals("middle")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 100571:
                            if (group2.equals(Chapter.KEY_END)) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (group2.equals(Chapter.KEY_START)) {
                                c2 = 5;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                            i2 = 2;
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 5;
                            break;
                        case 5:
                            break;
                        default:
                            Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid alignment value: ".concat(group2) : new String("Invalid alignment value: "));
                            i2 = 2;
                            break;
                    }
                    eVar.f4077d = i2;
                } else if ("position".equals(group)) {
                    h(group2, eVar);
                } else if (MediaInformation.KEY_SIZE.equals(group)) {
                    eVar.f4083j = j.a(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i2 = 2;
                    } else if (!group2.equals("rl")) {
                        Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid 'vertical' value: ".concat(group2) : new String("Invalid 'vertical' value: "));
                        i2 = Integer.MIN_VALUE;
                    }
                    eVar.f4084k = i2;
                } else {
                    StringBuilder sb = new StringBuilder(group.length() + 21 + group2.length());
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List<f> list) {
        char c2;
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            String str3 = "";
            if (i3 < str2.length()) {
                char charAt = str2.charAt(i3);
                if (charAt == '&') {
                    i3++;
                    int indexOf = str2.indexOf(59, i3);
                    int indexOf2 = str2.indexOf(32, i3);
                    char c3 = 65535;
                    if (indexOf == -1) {
                        indexOf = indexOf2;
                    } else if (indexOf2 != -1) {
                        indexOf = Math.min(indexOf, indexOf2);
                    }
                    if (indexOf != -1) {
                        String substring = str2.substring(i3, indexOf);
                        substring.hashCode();
                        switch (substring.hashCode()) {
                            case 3309:
                                if (substring.equals("gt")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring.equals("lt")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring.equals("amp")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring.equals("nbsp")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c3) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                StringBuilder sb = new StringBuilder(substring.length() + 33);
                                sb.append("ignoring unsupported entity: '&");
                                sb.append(substring);
                                sb.append(";'");
                                Log.w("WebvttCueParser", sb.toString());
                                break;
                        }
                        if (indexOf == indexOf2) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i3 = indexOf + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                } else if (charAt != '<') {
                    spannableStringBuilder.append(charAt);
                    i3++;
                } else {
                    int i4 = i3 + 1;
                    if (i4 < str2.length()) {
                        boolean z2 = str2.charAt(i4) == '/';
                        int indexOf3 = str2.indexOf(62, i4);
                        i4 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                        int i5 = i4 - 2;
                        boolean z3 = str2.charAt(i5) == '/';
                        int i6 = i3 + (z2 ? 2 : 1);
                        if (!z3) {
                            i5 = i4 - 1;
                        }
                        String substring2 = str2.substring(i6, i5);
                        if (!substring2.trim().isEmpty()) {
                            String trim = substring2.trim();
                            f.h.b.b.e2.j.c(!trim.isEmpty());
                            int i7 = b0.a;
                            String str4 = trim.split("[ \\.]", 2)[i2];
                            str4.hashCode();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 117:
                                    if (str4.equals("u")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3314158:
                                    if (str4.equals("lang")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3511770:
                                    if (str4.equals("ruby")) {
                                        c2 = 7;
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
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    z = true;
                                    break;
                                default:
                                    z = false;
                                    break;
                            }
                            if (z) {
                                if (z2) {
                                    while (!arrayDeque.isEmpty()) {
                                        c cVar = (c) arrayDeque.pop();
                                        a(str, cVar, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new b(cVar, spannableStringBuilder.length(), null));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (cVar.a.equals(str4)) {
                                        }
                                    }
                                } else if (!z3) {
                                    int length = spannableStringBuilder.length();
                                    String trim2 = substring2.trim();
                                    f.h.b.b.e2.j.c(!trim2.isEmpty());
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 != -1) {
                                        str3 = trim2.substring(indexOf4).trim();
                                        trim2 = trim2.substring(i2, indexOf4);
                                    }
                                    String[] G = b0.G(trim2, "\\.");
                                    String str5 = G[i2];
                                    HashSet hashSet = new HashSet();
                                    for (int i8 = 1; i8 < G.length; i8++) {
                                        hashSet.add(G[i8]);
                                    }
                                    arrayDeque.push(new c(str5, length, str3, hashSet));
                                }
                            }
                        }
                        i3 = i4;
                    }
                    i3 = i4;
                }
                i2 = 0;
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new c("", 0, "", Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, e eVar) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.hashCode();
            int i2 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals(Chapter.KEY_END)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals(Chapter.KEY_START)) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i2 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i2 = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            eVar.f4080g = i2;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f4078e = j.a(str);
            eVar.f4079f = 0;
            return;
        }
        eVar.f4078e = Integer.parseInt(str);
        eVar.f4079f = 1;
    }

    public static void h(String str, e eVar) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.hashCode();
            int i2 = 2;
            switch (substring.hashCode()) {
                case -1842484672:
                    if (substring.equals("line-left")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1276788989:
                    if (substring.equals("line-right")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals(Chapter.KEY_END)) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals(Chapter.KEY_START)) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 5:
                    i2 = 0;
                    break;
                case 1:
                case 3:
                    i2 = 1;
                    break;
                case 2:
                case 4:
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i2 = Integer.MIN_VALUE;
                    break;
            }
            eVar.f4082i = i2;
            str = str.substring(0, indexOf);
        }
        eVar.f4081h = j.a(str);
    }
}

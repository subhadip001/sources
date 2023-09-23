package f.h.b.b.c2.s;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import f.h.b.b.c2.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/* compiled from: TtmlNode.java */
/* loaded from: classes.dex */
public final class c {
    public final String a;
    public final String b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4026d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4027e;

    /* renamed from: f  reason: collision with root package name */
    public final e f4028f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f4029g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4030h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4031i;

    /* renamed from: j  reason: collision with root package name */
    public final c f4032j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<String, Integer> f4033k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap<String, Integer> f4034l;

    /* renamed from: m  reason: collision with root package name */
    public List<c> f4035m;

    public c(String str, String str2, long j2, long j3, e eVar, String[] strArr, String str3, String str4, c cVar) {
        this.a = str;
        this.b = str2;
        this.f4031i = str4;
        this.f4028f = eVar;
        this.f4029g = strArr;
        this.c = str2 != null;
        this.f4026d = j2;
        this.f4027e = j3;
        Objects.requireNonNull(str3);
        this.f4030h = str3;
        this.f4032j = cVar;
        this.f4033k = new HashMap<>();
        this.f4034l = new HashMap<>();
    }

    public static c b(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder f(String str, Map<String, c.b> map) {
        if (!map.containsKey(str)) {
            c.b bVar = new c.b();
            bVar.a = new SpannableStringBuilder();
            map.put(str, bVar);
        }
        CharSequence charSequence = map.get(str).a;
        Objects.requireNonNull(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    public void a(c cVar) {
        if (this.f4035m == null) {
            this.f4035m = new ArrayList();
        }
        this.f4035m.add(cVar);
    }

    public c c(int i2) {
        List<c> list = this.f4035m;
        if (list != null) {
            return list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public int d() {
        List<c> list = this.f4035m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void e(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.f4031i != null)) {
            long j2 = this.f4026d;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f4027e;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.f4035m == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f4035m.size(); i2++) {
            this.f4035m.get(i2).e(treeSet, z || equals);
        }
    }

    public boolean g(long j2) {
        long j3 = this.f4026d;
        return (j3 == -9223372036854775807L && this.f4027e == -9223372036854775807L) || (j3 <= j2 && this.f4027e == -9223372036854775807L) || ((j3 == -9223372036854775807L && j2 < this.f4027e) || (j3 <= j2 && j2 < this.f4027e));
    }

    public final void h(long j2, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f4030h)) {
            str = this.f4030h;
        }
        if (g(j2) && "div".equals(this.a) && this.f4031i != null) {
            list.add(new Pair<>(str, this.f4031i));
            return;
        }
        for (int i2 = 0; i2 < d(); i2++) {
            c(i2).h(j2, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r17, java.util.Map<java.lang.String, f.h.b.b.c2.s.e> r19, java.util.Map<java.lang.String, f.h.b.b.c2.c.b> r20) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.s.c.i(long, java.util.Map, java.util.Map):void");
    }

    public final void j(long j2, boolean z, String str, Map<String, c.b> map) {
        this.f4033k.clear();
        this.f4034l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.f4030h)) {
            str = this.f4030h;
        }
        if (this.c && z) {
            SpannableStringBuilder f2 = f(str, map);
            String str2 = this.b;
            Objects.requireNonNull(str2);
            f2.append((CharSequence) str2);
        } else if ("br".equals(this.a) && z) {
            f(str, map).append('\n');
        } else if (g(j2)) {
            for (Map.Entry<String, c.b> entry : map.entrySet()) {
                CharSequence charSequence = entry.getValue().a;
                Objects.requireNonNull(charSequence);
                this.f4033k.put(entry.getKey(), Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(this.a);
            for (int i2 = 0; i2 < d(); i2++) {
                c(i2).j(j2, z || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder f3 = f(str, map);
                int length = f3.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (f3.charAt(length) == ' ');
                if (length >= 0 && f3.charAt(length) != '\n') {
                    f3.append('\n');
                }
            }
            for (Map.Entry<String, c.b> entry2 : map.entrySet()) {
                CharSequence charSequence2 = entry2.getValue().a;
                Objects.requireNonNull(charSequence2);
                this.f4034l.put(entry2.getKey(), Integer.valueOf(charSequence2.length()));
            }
        }
    }
}

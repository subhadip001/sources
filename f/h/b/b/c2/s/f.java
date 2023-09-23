package f.h.b.b.c2.s;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import f.h.b.b.c2.c;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TtmlSubtitle.java */
/* loaded from: classes.dex */
public final class f implements f.h.b.b.c2.f {

    /* renamed from: f  reason: collision with root package name */
    public final c f4053f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f4054g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, e> f4055h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, d> f4056i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, String> f4057j;

    public f(c cVar, Map<String, e> map, Map<String, d> map2, Map<String, String> map3) {
        this.f4053f = cVar;
        this.f4056i = map2;
        this.f4057j = map3;
        this.f4055h = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i2 = 0;
        cVar.e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        this.f4054g = jArr;
    }

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        int b = b0.b(this.f4054g, j2, false, false);
        if (b < this.f4054g.length) {
            return b;
        }
        return -1;
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        return this.f4054g[i2];
    }

    @Override // f.h.b.b.c2.f
    public List<f.h.b.b.c2.c> f(long j2) {
        a[] aVarArr;
        c cVar = this.f4053f;
        Map<String, e> map = this.f4055h;
        Map<String, d> map2 = this.f4056i;
        Map<String, String> map3 = this.f4057j;
        Objects.requireNonNull(cVar);
        ArrayList arrayList = new ArrayList();
        cVar.h(j2, cVar.f4030h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.j(j2, false, cVar.f4030h, treeMap);
        cVar.i(j2, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                d dVar = map2.get(pair.first);
                Objects.requireNonNull(dVar);
                arrayList2.add(new f.h.b.b.c2.c(null, null, decodeByteArray, dVar.c, 0, dVar.f4037e, dVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, dVar.f4038f, dVar.f4039g, false, -16777216, dVar.f4042j, null));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            d dVar2 = map2.get(entry.getKey());
            Objects.requireNonNull(dVar2);
            c.b bVar = (c.b) entry.getValue();
            CharSequence charSequence = bVar.a;
            Objects.requireNonNull(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == '\n') {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == '\n') {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = dVar2.c;
            int i10 = dVar2.f4036d;
            bVar.f3932d = f2;
            bVar.f3933e = i10;
            bVar.f3934f = dVar2.f4037e;
            bVar.f3935g = dVar2.b;
            bVar.f3939k = dVar2.f4038f;
            float f3 = dVar2.f4041i;
            int i11 = dVar2.f4040h;
            bVar.f3938j = f3;
            bVar.f3937i = i11;
            bVar.o = dVar2.f4042j;
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return this.f4054g.length;
    }
}

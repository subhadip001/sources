package f.h.b.b.c2.u;

import f.h.b.b.c2.c;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: WebvttSubtitle.java */
/* loaded from: classes.dex */
public final class k implements f.h.b.b.c2.f {

    /* renamed from: f  reason: collision with root package name */
    public final List<g> f4085f;

    /* renamed from: g  reason: collision with root package name */
    public final long[] f4086g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f4087h;

    public k(List<g> list) {
        this.f4085f = Collections.unmodifiableList(new ArrayList(list));
        this.f4086g = new long[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            g gVar = list.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f4086g;
            jArr[i3] = gVar.b;
            jArr[i3 + 1] = gVar.c;
        }
        long[] jArr2 = this.f4086g;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4087h = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        int b = b0.b(this.f4087h, j2, false, false);
        if (b < this.f4087h.length) {
            return b;
        }
        return -1;
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        f.h.b.b.e2.j.c(i2 >= 0);
        f.h.b.b.e2.j.c(i2 < this.f4087h.length);
        return this.f4087h[i2];
    }

    @Override // f.h.b.b.c2.f
    public List<f.h.b.b.c2.c> f(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f4085f.size(); i2++) {
            long[] jArr = this.f4086g;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                g gVar = this.f4085f.get(i2);
                f.h.b.b.c2.c cVar = gVar.a;
                if (cVar.f3922d == -3.4028235E38f) {
                    arrayList2.add(gVar);
                } else {
                    arrayList.add(cVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: f.h.b.b.c2.u.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((g) obj).b, ((g) obj2).b);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            c.b a = ((g) arrayList2.get(i4)).a.a();
            a.f3932d = (-1) - i4;
            a.f3933e = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return this.f4087h.length;
    }
}

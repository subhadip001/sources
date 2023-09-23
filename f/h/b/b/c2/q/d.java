package f.h.b.b.c2.q;

import f.h.b.b.c2.f;
import f.h.b.b.e2.j;
import f.h.b.b.g2.b0;
import java.util.Collections;
import java.util.List;

/* compiled from: SsaSubtitle.java */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: f  reason: collision with root package name */
    public final List<List<f.h.b.b.c2.c>> f4022f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Long> f4023g;

    public d(List<List<f.h.b.b.c2.c>> list, List<Long> list2) {
        this.f4022f = list;
        this.f4023g = list2;
    }

    @Override // f.h.b.b.c2.f
    public int a(long j2) {
        int i2;
        List<Long> list = this.f4023g;
        Long valueOf = Long.valueOf(j2);
        int i3 = b0.a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i2 = binarySearch;
        }
        if (i2 < this.f4023g.size()) {
            return i2;
        }
        return -1;
    }

    @Override // f.h.b.b.c2.f
    public long d(int i2) {
        j.c(i2 >= 0);
        j.c(i2 < this.f4023g.size());
        return this.f4023g.get(i2).longValue();
    }

    @Override // f.h.b.b.c2.f
    public List<f.h.b.b.c2.c> f(long j2) {
        int i2;
        List<Long> list = this.f4023g;
        Long valueOf = Long.valueOf(j2);
        int i3 = b0.a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i2 = binarySearch + 1;
        }
        if (i2 == -1) {
            return Collections.emptyList();
        }
        return this.f4022f.get(i2);
    }

    @Override // f.h.b.b.c2.f
    public int g() {
        return this.f4023g.size();
    }
}

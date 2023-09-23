package f.h.b.b.g2;

import f.h.b.b.g2.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: SlidingPercentile.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f4302h = 0;
    public final int a;

    /* renamed from: e  reason: collision with root package name */
    public int f4304e;

    /* renamed from: f  reason: collision with root package name */
    public int f4305f;

    /* renamed from: g  reason: collision with root package name */
    public int f4306g;
    public final b[] c = new b[5];
    public final ArrayList<b> b = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public int f4303d = -1;

    /* compiled from: SlidingPercentile.java */
    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public int b;
        public float c;

        public b() {
        }

        public b(a aVar) {
        }
    }

    public v(int i2) {
        this.a = i2;
    }

    public void a(int i2, float f2) {
        b bVar;
        if (this.f4303d != 1) {
            Collections.sort(this.b, new Comparator() { // from class: f.h.b.b.g2.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i3 = v.f4302h;
                    return ((v.b) obj).a - ((v.b) obj2).a;
                }
            });
            this.f4303d = 1;
        }
        int i3 = this.f4306g;
        if (i3 > 0) {
            b[] bVarArr = this.c;
            int i4 = i3 - 1;
            this.f4306g = i4;
            bVar = bVarArr[i4];
        } else {
            bVar = new b(null);
        }
        int i5 = this.f4304e;
        this.f4304e = i5 + 1;
        bVar.a = i5;
        bVar.b = i2;
        bVar.c = f2;
        this.b.add(bVar);
        this.f4305f += i2;
        while (true) {
            int i6 = this.f4305f;
            int i7 = this.a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            b bVar2 = this.b.get(0);
            int i9 = bVar2.b;
            if (i9 <= i8) {
                this.f4305f -= i9;
                this.b.remove(0);
                int i10 = this.f4306g;
                if (i10 < 5) {
                    b[] bVarArr2 = this.c;
                    this.f4306g = i10 + 1;
                    bVarArr2[i10] = bVar2;
                }
            } else {
                bVar2.b = i9 - i8;
                this.f4305f -= i8;
            }
        }
    }

    public float b(float f2) {
        if (this.f4303d != 0) {
            Collections.sort(this.b, new Comparator() { // from class: f.h.b.b.g2.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i2 = v.f4302h;
                    return Float.compare(((v.b) obj).c, ((v.b) obj2).c);
                }
            });
            this.f4303d = 0;
        }
        float f3 = f2 * this.f4305f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            b bVar = this.b.get(i3);
            i2 += bVar.b;
            if (i2 >= f3) {
                return bVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.b;
        return arrayList.get(arrayList.size() - 1).c;
    }
}

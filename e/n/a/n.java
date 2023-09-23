package e.n.a;

import android.graphics.Typeface;
import android.util.SparseArray;

/* compiled from: MetadataRepo.java */
/* loaded from: classes.dex */
public final class n {
    public final e.n.a.q.b a;
    public final char[] b;
    public final a c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f2641d;

    public n(Typeface typeface, e.n.a.q.b bVar) {
        this.f2641d = typeface;
        this.a = bVar;
        this.b = new char[bVar.c() * 2];
        int c = bVar.c();
        for (int i2 = 0; i2 < c; i2++) {
            j jVar = new j(this, i2);
            Character.toChars(jVar.d(), this.b, i2 * 2);
            e.i.a.i(jVar, "emoji metadata cannot be null");
            e.i.a.f(jVar.b() > 0, "invalid metadata codepoint length");
            this.c.a(jVar, 0, jVar.b() - 1);
        }
    }

    /* compiled from: MetadataRepo.java */
    /* loaded from: classes.dex */
    public static class a {
        public final SparseArray<a> a;
        public j b;

        public a() {
            this.a = new SparseArray<>(1);
        }

        public void a(j jVar, int i2, int i3) {
            int a = jVar.a(i2);
            SparseArray<a> sparseArray = this.a;
            a aVar = sparseArray == null ? null : sparseArray.get(a);
            if (aVar == null) {
                aVar = new a();
                this.a.put(jVar.a(i2), aVar);
            }
            if (i3 > i2) {
                aVar.a(jVar, i2 + 1, i3);
            } else {
                aVar.b = jVar;
            }
        }

        public a(int i2) {
            this.a = new SparseArray<>(i2);
        }
    }
}

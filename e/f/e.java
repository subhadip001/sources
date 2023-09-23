package e.f;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1978j = new Object();

    /* renamed from: f  reason: collision with root package name */
    public boolean f1979f = false;

    /* renamed from: g  reason: collision with root package name */
    public long[] f1980g;

    /* renamed from: h  reason: collision with root package name */
    public Object[] f1981h;

    /* renamed from: i  reason: collision with root package name */
    public int f1982i;

    public e() {
        int f2 = d.f(10);
        this.f1980g = new long[f2];
        this.f1981h = new Object[f2];
    }

    public void a(long j2, E e2) {
        int i2 = this.f1982i;
        if (i2 != 0 && j2 <= this.f1980g[i2 - 1]) {
            j(j2, e2);
            return;
        }
        if (this.f1979f && i2 >= this.f1980g.length) {
            e();
        }
        int i3 = this.f1982i;
        if (i3 >= this.f1980g.length) {
            int f2 = d.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f1980g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1981h;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1980g = jArr;
            this.f1981h = objArr;
        }
        this.f1980g[i3] = j2;
        this.f1981h[i3] = e2;
        this.f1982i = i3 + 1;
    }

    public void b() {
        int i2 = this.f1982i;
        Object[] objArr = this.f1981h;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1982i = 0;
        this.f1979f = false;
    }

    /* renamed from: c */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f1980g = (long[]) this.f1980g.clone();
            eVar.f1981h = (Object[]) this.f1981h.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean d(long j2) {
        if (this.f1979f) {
            e();
        }
        return d.b(this.f1980g, this.f1982i, j2) >= 0;
    }

    public final void e() {
        int i2 = this.f1982i;
        long[] jArr = this.f1980g;
        Object[] objArr = this.f1981h;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1978j) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1979f = false;
        this.f1982i = i3;
    }

    public E f(long j2) {
        return g(j2, null);
    }

    public E g(long j2, E e2) {
        int b = d.b(this.f1980g, this.f1982i, j2);
        if (b >= 0) {
            Object[] objArr = this.f1981h;
            if (objArr[b] != f1978j) {
                return (E) objArr[b];
            }
        }
        return e2;
    }

    public boolean h() {
        return l() == 0;
    }

    public long i(int i2) {
        if (this.f1979f) {
            e();
        }
        return this.f1980g[i2];
    }

    public void j(long j2, E e2) {
        int b = d.b(this.f1980g, this.f1982i, j2);
        if (b >= 0) {
            this.f1981h[b] = e2;
            return;
        }
        int i2 = ~b;
        int i3 = this.f1982i;
        if (i2 < i3) {
            Object[] objArr = this.f1981h;
            if (objArr[i2] == f1978j) {
                this.f1980g[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1979f && i3 >= this.f1980g.length) {
            e();
            i2 = ~d.b(this.f1980g, this.f1982i, j2);
        }
        int i4 = this.f1982i;
        if (i4 >= this.f1980g.length) {
            int f2 = d.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f1980g;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1981h;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1980g = jArr;
            this.f1981h = objArr2;
        }
        int i5 = this.f1982i;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f1980g;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1981h;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1982i - i2);
        }
        this.f1980g[i2] = j2;
        this.f1981h[i2] = e2;
        this.f1982i++;
    }

    public void k(long j2) {
        int b = d.b(this.f1980g, this.f1982i, j2);
        if (b >= 0) {
            Object[] objArr = this.f1981h;
            Object obj = objArr[b];
            Object obj2 = f1978j;
            if (obj != obj2) {
                objArr[b] = obj2;
                this.f1979f = true;
            }
        }
    }

    public int l() {
        if (this.f1979f) {
            e();
        }
        return this.f1982i;
    }

    public E m(int i2) {
        if (this.f1979f) {
            e();
        }
        return (E) this.f1981h[i2];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1982i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1982i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(i(i2));
            sb.append('=');
            E m2 = m(i2);
            if (m2 != this) {
                sb.append(m2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

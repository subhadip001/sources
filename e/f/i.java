package e.f;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f2002i = new Object();

    /* renamed from: f  reason: collision with root package name */
    public int[] f2003f;

    /* renamed from: g  reason: collision with root package name */
    public Object[] f2004g;

    /* renamed from: h  reason: collision with root package name */
    public int f2005h;

    public i() {
        int e2 = d.e(10);
        this.f2003f = new int[e2];
        this.f2004g = new Object[e2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f2005h;
        if (i3 != 0 && i2 <= this.f2003f[i3 - 1]) {
            f(i2, e2);
            return;
        }
        if (i3 >= this.f2003f.length) {
            int e3 = d.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f2003f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2004g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2003f = iArr;
            this.f2004g = objArr;
        }
        this.f2003f[i3] = i2;
        this.f2004g[i3] = e2;
        this.f2005h = i3 + 1;
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f2003f = (int[]) this.f2003f.clone();
            iVar.f2004g = (Object[]) this.f2004g.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E c(int i2) {
        return d(i2, null);
    }

    public E d(int i2, E e2) {
        int a = d.a(this.f2003f, this.f2005h, i2);
        if (a >= 0) {
            Object[] objArr = this.f2004g;
            if (objArr[a] != f2002i) {
                return (E) objArr[a];
            }
        }
        return e2;
    }

    public int e(int i2) {
        return this.f2003f[i2];
    }

    public void f(int i2, E e2) {
        int a = d.a(this.f2003f, this.f2005h, i2);
        if (a >= 0) {
            this.f2004g[a] = e2;
            return;
        }
        int i3 = ~a;
        int i4 = this.f2005h;
        if (i3 < i4) {
            Object[] objArr = this.f2004g;
            if (objArr[i3] == f2002i) {
                this.f2003f[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (i4 >= this.f2003f.length) {
            int e3 = d.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f2003f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2004g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2003f = iArr;
            this.f2004g = objArr2;
        }
        int i5 = this.f2005h - i3;
        if (i5 != 0) {
            int[] iArr3 = this.f2003f;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5);
            Object[] objArr4 = this.f2004g;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f2005h - i3);
        }
        this.f2003f[i3] = i2;
        this.f2004g[i3] = e2;
        this.f2005h++;
    }

    public int g() {
        return this.f2005h;
    }

    public E h(int i2) {
        return (E) this.f2004g[i2];
    }

    public String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2005h * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2005h; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            E h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

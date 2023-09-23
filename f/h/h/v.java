package f.h.h;

import com.google.android.gms.common.api.Api;
import f.h.h.y;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: FloatArrayList.java */
/* loaded from: classes2.dex */
public final class v extends c<Float> implements y.f, RandomAccess, v0 {

    /* renamed from: i  reason: collision with root package name */
    public static final v f6427i;

    /* renamed from: g  reason: collision with root package name */
    public float[] f6428g;

    /* renamed from: h  reason: collision with root package name */
    public int f6429h;

    static {
        v vVar = new v(new float[0], 0);
        f6427i = vVar;
        vVar.f6325f = false;
    }

    public v() {
        this.f6428g = new float[10];
        this.f6429h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, Object obj) {
        int i3;
        float floatValue = ((Float) obj).floatValue();
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f6429h)) {
            float[] fArr = this.f6428g;
            if (i3 < fArr.length) {
                System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
            } else {
                float[] fArr2 = new float[f.a.b.a.a.m(i3, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i2);
                System.arraycopy(this.f6428g, i2, fArr2, i2 + 1, this.f6429h - i2);
                this.f6428g = fArr2;
            }
            this.f6428g[i2] = floatValue;
            this.f6429h++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i2));
    }

    @Override // f.h.h.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        a();
        Charset charset = y.a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof v)) {
            return super.addAll(collection);
        }
        v vVar = (v) collection;
        int i2 = vVar.f6429h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f6429h;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f6428g;
            if (i4 > fArr.length) {
                this.f6428g = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(vVar.f6428g, 0, this.f6428g, this.f6429h, vVar.f6429h);
            this.f6429h = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public void b(float f2) {
        a();
        int i2 = this.f6429h;
        float[] fArr = this.f6428g;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[f.a.b.a.a.m(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f6428g = fArr2;
        }
        float[] fArr3 = this.f6428g;
        int i3 = this.f6429h;
        this.f6429h = i3 + 1;
        fArr3[i3] = f2;
    }

    public final void c(int i2) {
        if (i2 < 0 || i2 >= this.f6429h) {
            throw new IndexOutOfBoundsException(d(i2));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final String d(int i2) {
        StringBuilder B = f.a.b.a.a.B("Index:", i2, ", Size:");
        B.append(this.f6429h);
        return B.toString();
    }

    @Override // f.h.h.y.i
    /* renamed from: e */
    public y.f p(int i2) {
        if (i2 >= this.f6429h) {
            return new v(Arrays.copyOf(this.f6428g, i2), this.f6429h);
        }
        throw new IllegalArgumentException();
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return super.equals(obj);
        }
        v vVar = (v) obj;
        if (this.f6429h != vVar.f6429h) {
            return false;
        }
        float[] fArr = vVar.f6428g;
        for (int i2 = 0; i2 < this.f6429h; i2++) {
            if (Float.floatToIntBits(this.f6428g[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        c(i2);
        return Float.valueOf(this.f6428g[i2]);
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f6429h; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f6428g[i3]);
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i2 = this.f6429h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (this.f6428g[i3] == floatValue) {
                    return i3;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.List
    public Object remove(int i2) {
        int i3;
        a();
        c(i2);
        float[] fArr = this.f6428g;
        float f2 = fArr[i2];
        if (i2 < this.f6429h - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.f6429h--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            float[] fArr = this.f6428g;
            System.arraycopy(fArr, i3, fArr, i2, this.f6429h - i3);
            this.f6429h -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        c(i2);
        float[] fArr = this.f6428g;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f6429h;
    }

    public v(float[] fArr, int i2) {
        this.f6428g = fArr;
        this.f6429h = i2;
    }

    @Override // f.h.h.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        b(((Float) obj).floatValue());
        return true;
    }
}

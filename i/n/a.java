package i.n;

import f.n.a.n.i;
import java.util.Iterator;

/* compiled from: Progressions.kt */
/* loaded from: classes2.dex */
public class a implements Iterable<Integer> {

    /* renamed from: f  reason: collision with root package name */
    public final int f8655f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8656g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8657h;

    public a(int i2, int i3, int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f8655f = i2;
            if (i4 > 0) {
                if (i2 < i3) {
                    i3 -= i.I(i.I(i3, i4) - i.I(i2, i4), i4);
                }
            } else if (i4 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else {
                if (i2 > i3) {
                    int i5 = -i4;
                    i3 += i.I(i.I(i2, i5) - i.I(i3, i5), i5);
                }
            }
            this.f8656g = i3;
            this.f8657h = i4;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f8655f != aVar.f8655f || this.f8656g != aVar.f8656g || this.f8657h != aVar.f8657h) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f8655f * 31) + this.f8656g) * 31) + this.f8657h;
    }

    public boolean isEmpty() {
        if (this.f8657h > 0) {
            if (this.f8655f > this.f8656g) {
                return true;
            }
        } else if (this.f8655f < this.f8656g) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new b(this.f8655f, this.f8656g, this.f8657h);
    }

    public String toString() {
        StringBuilder sb;
        int i2;
        if (this.f8657h > 0) {
            sb = new StringBuilder();
            sb.append(this.f8655f);
            sb.append("..");
            sb.append(this.f8656g);
            sb.append(" step ");
            i2 = this.f8657h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f8655f);
            sb.append(" downTo ");
            sb.append(this.f8656g);
            sb.append(" step ");
            i2 = -this.f8657h;
        }
        sb.append(i2);
        return sb.toString();
    }
}

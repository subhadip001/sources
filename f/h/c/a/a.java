package f.h.c.a;

import f.h.c.a.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: AbstractIterator.java */
/* loaded from: classes.dex */
public abstract class a<T> implements Iterator<T> {

    /* renamed from: f  reason: collision with root package name */
    public EnumC0130a f5832f = EnumC0130a.NOT_READY;

    /* renamed from: g  reason: collision with root package name */
    public T f5833g;

    /* compiled from: AbstractIterator.java */
    /* renamed from: f.h.c.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0130a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        T t;
        int b;
        EnumC0130a enumC0130a = this.f5832f;
        EnumC0130a enumC0130a2 = EnumC0130a.FAILED;
        f.h.b.c.a.B(enumC0130a != enumC0130a2);
        int ordinal = this.f5832f.ordinal();
        if (ordinal != 0) {
            if (ordinal != 2) {
                EnumC0130a enumC0130a3 = EnumC0130a.DONE;
                this.f5832f = enumC0130a2;
                n.a aVar = (n.a) this;
                int i2 = aVar.f5849k;
                while (true) {
                    int i3 = aVar.f5849k;
                    if (i3 != -1) {
                        l lVar = (l) aVar;
                        b = lVar.f5844m.a.b(lVar.f5846h, i3);
                        if (b == -1) {
                            b = aVar.f5846h.length();
                            aVar.f5849k = -1;
                        } else {
                            aVar.f5849k = b + 1;
                        }
                        int i4 = aVar.f5849k;
                        if (i4 == i2) {
                            int i5 = i4 + 1;
                            aVar.f5849k = i5;
                            if (i5 > aVar.f5846h.length()) {
                                aVar.f5849k = -1;
                            }
                        } else {
                            while (i2 < b && aVar.f5847i.c(aVar.f5846h.charAt(i2))) {
                                i2++;
                            }
                            while (b > i2) {
                                int i6 = b - 1;
                                if (!aVar.f5847i.c(aVar.f5846h.charAt(i6))) {
                                    break;
                                }
                                b = i6;
                            }
                            if (!aVar.f5848j || i2 != b) {
                                break;
                            }
                            i2 = aVar.f5849k;
                        }
                    } else {
                        aVar.f5832f = enumC0130a3;
                        t = null;
                        break;
                    }
                }
                int i7 = aVar.f5850l;
                if (i7 == 1) {
                    b = aVar.f5846h.length();
                    aVar.f5849k = -1;
                    while (b > i2) {
                        int i8 = b - 1;
                        if (!aVar.f5847i.c(aVar.f5846h.charAt(i8))) {
                            break;
                        }
                        b = i8;
                    }
                } else {
                    aVar.f5850l = i7 - 1;
                }
                t = (T) aVar.f5846h.subSequence(i2, b).toString();
                this.f5833g = t;
                if (this.f5832f != enumC0130a3) {
                    this.f5832f = EnumC0130a.READY;
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f5832f = EnumC0130a.NOT_READY;
            T t = this.f5833g;
            this.f5833g = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

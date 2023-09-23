package i.n;

import i.i.g;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: f  reason: collision with root package name */
    public final int f8658f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8659g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8660h;

    /* renamed from: i  reason: collision with root package name */
    public int f8661i;

    public b(int i2, int i3, int i4) {
        this.f8658f = i4;
        this.f8659g = i3;
        boolean z = true;
        if (i4 <= 0 ? i2 < i3 : i2 > i3) {
            z = false;
        }
        this.f8660h = z;
        this.f8661i = z ? i2 : i3;
    }

    @Override // i.i.g
    public int a() {
        int i2 = this.f8661i;
        if (i2 == this.f8659g) {
            if (this.f8660h) {
                this.f8660h = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f8661i = this.f8658f + i2;
        }
        return i2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8660h;
    }
}

package f.h.c.b;

/* compiled from: Iterators.java */
/* loaded from: classes.dex */
public final class x<T> extends a<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final a<Object> f6002j = new x(new Object[0], 0, 0, 0);

    /* renamed from: h  reason: collision with root package name */
    public final T[] f6003h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6004i;

    public x(T[] tArr, int i2, int i3, int i4) {
        super(i3, i4);
        this.f6003h = tArr;
        this.f6004i = i2;
    }

    @Override // f.h.c.b.a
    public T a(int i2) {
        return this.f6003h[this.f6004i + i2];
    }
}

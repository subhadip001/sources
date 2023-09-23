package e.b.h;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public class r0 {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1831d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1832e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1833f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1834g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1835h = false;

    public void a(int i2, int i3) {
        this.c = i2;
        this.f1831d = i3;
        this.f1835h = true;
        if (this.f1834g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.b = i3;
        }
    }
}

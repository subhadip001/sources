package f.n.a.n;

/* compiled from: VideoMetaDataCalc.java */
/* loaded from: classes2.dex */
public class j {
    public f.n.a.m.c.a a;

    /* renamed from: d  reason: collision with root package name */
    public int f7040d;

    /* renamed from: e  reason: collision with root package name */
    public int f7041e;

    /* renamed from: f  reason: collision with root package name */
    public double f7042f;

    /* renamed from: g  reason: collision with root package name */
    public long f7043g;
    public int b = 100;
    public int c = 100;

    /* renamed from: h  reason: collision with root package name */
    public double f7044h = 1.0d;

    public j(f.n.a.m.c.a aVar, long j2) {
        this.a = aVar;
        this.f7043g = j2;
    }

    public int a() {
        return ((int) ((this.b / 100.0d) * this.a.n)) & (-2);
    }

    public int b() {
        f.n.a.m.c.a aVar = this.a;
        return ((int) ((this.f7040d / aVar.n) * aVar.o)) & (-2);
    }
}

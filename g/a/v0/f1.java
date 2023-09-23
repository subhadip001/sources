package g.a.v0;

/* compiled from: InternalSubchannel.java */
/* loaded from: classes2.dex */
public class f1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z f7678f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f7679g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b1 f7680h;

    public f1(b1 b1Var, z zVar, boolean z) {
        this.f7680h = b1Var;
        this.f7678f = zVar;
        this.f7679g = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7680h.t.c(this.f7678f, this.f7679g);
    }
}

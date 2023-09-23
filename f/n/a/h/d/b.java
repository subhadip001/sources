package f.n.a.h.d;

import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;

/* compiled from: CompositionRoot.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: g  reason: collision with root package name */
    public static b f6944g;
    public FFmpegKitUseCase a;
    public f.n.a.s.a b;
    public f.n.a.h.c c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.d.b f6945d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.g.a f6946e;

    /* renamed from: f  reason: collision with root package name */
    public f.n.a.s.c f6947f;

    public static b c() {
        if (f6944g == null) {
            f6944g = new b();
        }
        return f6944g;
    }

    public f.n.a.g.a a() {
        if (this.f6946e == null) {
            this.f6946e = new f.n.a.g.a();
        }
        return this.f6946e;
    }

    public f.n.a.s.a b() {
        if (this.b == null) {
            if (this.a == null) {
                this.a = FFmpegKitUseCase.getInstance();
            }
            this.b = new f.n.a.s.a(this.a);
        }
        return this.b;
    }

    public f.n.a.h.c d() {
        if (this.c == null) {
            this.c = new f.n.a.h.c();
        }
        return this.c;
    }
}

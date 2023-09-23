package k.c0.i;

import java.io.IOException;
import java.util.Objects;
import k.c0.i.q;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public class h extends k.c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f9029g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ l.f f9030h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9031i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f9032j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ e f9033k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, String str, Object[] objArr, int i2, l.f fVar, int i3, boolean z) {
        super(str, objArr);
        this.f9033k = eVar;
        this.f9029g = i2;
        this.f9030h = fVar;
        this.f9031i = i3;
        this.f9032j = z;
    }

    @Override // k.c0.b
    public void a() {
        try {
            q qVar = this.f9033k.o;
            l.f fVar = this.f9030h;
            int i2 = this.f9031i;
            Objects.requireNonNull((q.a) qVar);
            fVar.e(i2);
            this.f9033k.w.p(this.f9029g, ErrorCode.CANCEL);
            synchronized (this.f9033k) {
                this.f9033k.y.remove(Integer.valueOf(this.f9029g));
            }
        } catch (IOException unused) {
        }
    }
}

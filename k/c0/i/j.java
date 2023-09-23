package k.c0.i;

import java.io.IOException;
import k.c0.i.e;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public class j extends k.c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ n f9037g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.f f9038h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e.f fVar, String str, Object[] objArr, n nVar) {
        super(str, objArr);
        this.f9038h = fVar;
        this.f9037g = nVar;
    }

    @Override // k.c0.b
    public void a() {
        try {
            e.this.f9000g.b(this.f9037g);
        } catch (IOException e2) {
            k.c0.k.f fVar = k.c0.k.f.a;
            StringBuilder A = f.a.b.a.a.A("Http2Connection.Listener failure for ");
            A.append(e.this.f9002i);
            fVar.k(4, A.toString(), e2);
            try {
                this.f9037g.c(ErrorCode.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}

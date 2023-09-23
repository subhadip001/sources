package k.c0.i;

import java.util.Objects;
import k.c0.i.q;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public class i extends k.c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f9034g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f9035h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f9036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, String str, Object[] objArr, int i2, ErrorCode errorCode) {
        super(str, objArr);
        this.f9036i = eVar;
        this.f9034g = i2;
        this.f9035h = errorCode;
    }

    @Override // k.c0.b
    public void a() {
        Objects.requireNonNull((q.a) this.f9036i.o);
        synchronized (this.f9036i) {
            this.f9036i.y.remove(Integer.valueOf(this.f9034g));
        }
    }
}

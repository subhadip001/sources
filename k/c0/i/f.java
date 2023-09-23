package k.c0.i;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public class f extends k.c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f9022g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ List f9023h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f9024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, String str, Object[] objArr, int i2, List list) {
        super(str, objArr);
        this.f9024i = eVar;
        this.f9022g = i2;
        this.f9023h = list;
    }

    @Override // k.c0.b
    public void a() {
        Objects.requireNonNull(this.f9024i.o);
        try {
            this.f9024i.w.p(this.f9022g, ErrorCode.CANCEL);
            synchronized (this.f9024i) {
                this.f9024i.y.remove(Integer.valueOf(this.f9022g));
            }
        } catch (IOException unused) {
        }
    }
}

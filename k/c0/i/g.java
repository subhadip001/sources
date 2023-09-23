package k.c0.i;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public class g extends k.c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f9025g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ List f9026h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f9027i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f9028j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, Object[] objArr, int i2, List list, boolean z) {
        super(str, objArr);
        this.f9028j = eVar;
        this.f9025g = i2;
        this.f9026h = list;
        this.f9027i = z;
    }

    @Override // k.c0.b
    public void a() {
        Objects.requireNonNull(this.f9028j.o);
        try {
            this.f9028j.w.p(this.f9025g, ErrorCode.CANCEL);
            synchronized (this.f9028j) {
                this.f9028j.y.remove(Integer.valueOf(this.f9025g));
            }
        } catch (IOException unused) {
        }
    }
}

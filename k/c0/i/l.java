package k.c0.i;

import java.io.IOException;
import k.c0.i.e;

/* compiled from: Http2Connection.java */
/* loaded from: classes2.dex */
public class l extends k.c0.b {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f9040g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ e.f f9041h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e.f fVar, String str, Object[] objArr, r rVar) {
        super(str, objArr);
        this.f9041h = fVar;
        this.f9040g = rVar;
    }

    @Override // k.c0.b
    public void a() {
        try {
            e.this.w.a(this.f9040g);
        } catch (IOException unused) {
            e.a(e.this);
        }
    }
}

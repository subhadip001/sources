package j.a;

import i.j.f;
import java.util.concurrent.CancellationException;

/* compiled from: Job.kt */
/* loaded from: classes2.dex */
public interface c1 extends f.a {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f8737e = 0;

    /* compiled from: Job.kt */
    /* loaded from: classes2.dex */
    public static final class a implements f.b<c1> {

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ a f8738f = new a();
    }

    void T(CancellationException cancellationException);

    l X(n nVar);

    boolean a();

    m0 q(boolean z, boolean z2, i.l.a.l<? super Throwable, i.h> lVar);

    boolean start();

    CancellationException v();
}

package f.h.b.d.a.i;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class o implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final Handler f5829f = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5829f.post(runnable);
    }
}

package f.h.b.d.a.i;

import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class q implements c, b {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // f.h.b.d.a.i.b
    public final void onFailure(Exception exc) {
        this.a.countDown();
    }

    @Override // f.h.b.d.a.i.c
    public final void onSuccess(Object obj) {
        this.a.countDown();
    }
}

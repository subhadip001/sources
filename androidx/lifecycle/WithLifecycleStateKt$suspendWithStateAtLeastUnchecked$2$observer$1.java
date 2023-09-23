package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import e.s.k;
import e.s.m;
import i.l.b.i;

/* compiled from: WithLifecycleState.kt */
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements k {
    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        i.e(mVar, "source");
        i.e(event, NotificationCompat.CATEGORY_EVENT);
        if (event != Lifecycle.Event.upTo(null)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
            return;
        }
        throw null;
    }
}

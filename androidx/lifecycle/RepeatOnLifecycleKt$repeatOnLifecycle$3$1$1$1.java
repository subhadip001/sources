package androidx.lifecycle;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import e.s.k;
import e.s.m;
import i.l.b.i;

/* compiled from: RepeatOnLifecycle.kt */
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements k {
    @Override // e.s.k
    public final void d(m mVar, Lifecycle.Event event) {
        i.e(mVar, "<anonymous parameter 0>");
        i.e(event, NotificationCompat.CATEGORY_EVENT);
        if (event == Lifecycle.Event.ON_DESTROY) {
            throw null;
        }
    }
}

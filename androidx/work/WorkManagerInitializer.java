package androidx.work;

import android.content.Context;
import e.g0.b;
import e.g0.k;
import e.g0.p;
import e.g0.t.l;
import e.y.b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b<p> {
    public static final String a = k.e("WrkMgrInitializer");

    @Override // e.y.b
    public p a(Context context) {
        k.c().a(a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        l.c(context, new e.g0.b(new b.a()));
        return l.b(context);
    }

    @Override // e.y.b
    public List<Class<? extends e.y.b<?>>> dependencies() {
        return Collections.emptyList();
    }
}

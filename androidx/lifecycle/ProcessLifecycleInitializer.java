package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import e.s.j;
import e.s.m;
import e.s.v;
import e.s.w;
import e.y.a;
import e.y.b;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements b<m> {
    @Override // e.y.b
    public m a(Context context) {
        if (a.c(context).b.contains(ProcessLifecycleInitializer.class)) {
            if (!j.a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new j.a());
            }
            v vVar = v.n;
            Objects.requireNonNull(vVar);
            vVar.f2824j = new Handler();
            vVar.f2825k.e(Lifecycle.Event.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new w(vVar));
            return vVar;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }

    @Override // e.y.b
    public List<Class<? extends b<?>>> dependencies() {
        return Collections.emptyList();
    }
}

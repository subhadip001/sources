package e.w;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.Recreator;
import e.s.k;
import e.s.m;
import e.s.n;
import e.w.a;
import java.util.Map;
import java.util.Objects;

/* compiled from: SavedStateRegistryController.java */
/* loaded from: classes.dex */
public final class b {
    public final c a;
    public final a b = new a();

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(Bundle bundle) {
        Lifecycle lifecycle = this.a.getLifecycle();
        if (((n) lifecycle).b == Lifecycle.State.INITIALIZED) {
            lifecycle.a(new Recreator(this.a));
            final a aVar = this.b;
            if (!aVar.c) {
                if (bundle != null) {
                    aVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.a(new k() { // from class: androidx.savedstate.SavedStateRegistry$1
                    @Override // e.s.k
                    public void d(m mVar, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_START) {
                            a.this.f2995e = true;
                        } else if (event == Lifecycle.Event.ON_STOP) {
                            a.this.f2995e = false;
                        }
                    }
                });
                aVar.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        e.c.a.b.b<String, a.b>.d b = aVar.a.b();
        while (b.hasNext()) {
            Map.Entry entry = (Map.Entry) b.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).b());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}

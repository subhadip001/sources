package e.s;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public class a0 {
    public final n a;
    public final Handler b = new Handler();
    public a c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final n f2806f;

        /* renamed from: g  reason: collision with root package name */
        public final Lifecycle.Event f2807g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2808h = false;

        public a(n nVar, Lifecycle.Event event) {
            this.f2806f = nVar;
            this.f2807g = event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2808h) {
                return;
            }
            this.f2806f.e(this.f2807g);
            this.f2808h = true;
        }
    }

    public a0(m mVar) {
        this.a = new n(mVar);
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, event);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }
}

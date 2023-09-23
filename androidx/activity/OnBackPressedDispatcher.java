package androidx.activity;

import androidx.lifecycle.Lifecycle;
import e.a.b;
import e.s.k;
import e.s.m;
import e.s.n;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements k, e.a.a {

        /* renamed from: f  reason: collision with root package name */
        public final Lifecycle f63f;

        /* renamed from: g  reason: collision with root package name */
        public final b f64g;

        /* renamed from: h  reason: collision with root package name */
        public e.a.a f65h;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, b bVar) {
            this.f63f = lifecycle;
            this.f64g = bVar;
            lifecycle.a(this);
        }

        @Override // e.a.a
        public void cancel() {
            n nVar = (n) this.f63f;
            nVar.d("removeObserver");
            nVar.a.e(this);
            this.f64g.b.remove(this);
            e.a.a aVar = this.f65h;
            if (aVar != null) {
                aVar.cancel();
                this.f65h = null;
            }
        }

        @Override // e.s.k
        public void d(m mVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f64g;
                onBackPressedDispatcher.b.add(bVar);
                a aVar = new a(bVar);
                bVar.b.add(aVar);
                this.f65h = aVar;
            } else if (event == Lifecycle.Event.ON_STOP) {
                e.a.a aVar2 = this.f65h;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements e.a.a {

        /* renamed from: f  reason: collision with root package name */
        public final b f67f;

        public a(b bVar) {
            this.f67f = bVar;
        }

        @Override // e.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.f67f);
            this.f67f.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}

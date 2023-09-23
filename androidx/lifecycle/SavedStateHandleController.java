package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import e.s.b0;
import e.s.i0;
import e.s.j0;
import e.s.k;
import e.s.m;
import e.s.n;
import e.s.y;
import e.w.a;
import e.w.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements k {

    /* renamed from: f  reason: collision with root package name */
    public final String f449f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f450g = false;

    /* renamed from: h  reason: collision with root package name */
    public final y f451h;

    /* loaded from: classes.dex */
    public static final class a implements a.InterfaceC0060a {
        @Override // e.w.a.InterfaceC0060a
        public void a(c cVar) {
            if (cVar instanceof j0) {
                i0 viewModelStore = ((j0) cVar).getViewModelStore();
                e.w.a savedStateRegistry = cVar.getSavedStateRegistry();
                Objects.requireNonNull(viewModelStore);
                Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
                while (it.hasNext()) {
                    HashMap<String, b0> hashMap = viewModelStore.a;
                    Lifecycle lifecycle = cVar.getLifecycle();
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).a("androidx.lifecycle.savedstate.vm.tag");
                    if (savedStateHandleController != null && !savedStateHandleController.f450g) {
                        savedStateHandleController.c(savedStateRegistry, lifecycle);
                        SavedStateHandleController.f(savedStateRegistry, lifecycle);
                    }
                }
                if (new HashSet(viewModelStore.a.keySet()).isEmpty()) {
                    return;
                }
                savedStateRegistry.c(a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, y yVar) {
        this.f449f = str;
        this.f451h = yVar;
    }

    public static void f(final e.w.a aVar, final Lifecycle lifecycle) {
        Lifecycle.State state = ((n) lifecycle).b;
        if (state != Lifecycle.State.INITIALIZED && !state.isAtLeast(Lifecycle.State.STARTED)) {
            lifecycle.a(new k() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // e.s.k
                public void d(m mVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        n nVar = (n) Lifecycle.this;
                        nVar.d("removeObserver");
                        nVar.a.e(this);
                        aVar.c(a.class);
                    }
                }
            });
        } else {
            aVar.c(a.class);
        }
    }

    public void c(e.w.a aVar, Lifecycle lifecycle) {
        if (!this.f450g) {
            this.f450g = true;
            lifecycle.a(this);
            aVar.b(this.f449f, this.f451h.f2832d);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f450g = false;
            n nVar = (n) mVar.getLifecycle();
            nVar.d("removeObserver");
            nVar.a.e(this);
        }
    }
}

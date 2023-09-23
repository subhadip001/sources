package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import e.s.k;
import e.s.m;
import e.s.n;
import e.w.a;
import e.w.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class Recreator implements k {

    /* renamed from: f  reason: collision with root package name */
    public final c f574f;

    /* loaded from: classes.dex */
    public static final class a implements a.b {
        public final Set<String> a = new HashSet();

        public a(e.w.a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        @Override // e.w.a.b
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f574f = cVar;
    }

    @Override // e.s.k
    public void d(m mVar, Lifecycle.Event event) {
        Class cls;
        if (event == Lifecycle.Event.ON_CREATE) {
            n nVar = (n) mVar.getLifecycle();
            nVar.d("removeObserver");
            nVar.a.e(this);
            Bundle a2 = this.f574f.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        try {
                            Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0060a.class).getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                ((a.InterfaceC0060a) declaredConstructor.newInstance(new Object[0])).a(this.f574f);
                            } catch (Exception e2) {
                                throw new RuntimeException(f.a.b.a.a.p("Failed to instantiate ", next), e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            StringBuilder A = f.a.b.a.a.A("Class");
                            A.append(cls.getSimpleName());
                            A.append(" must have default constructor in order to be automatically recreated");
                            throw new IllegalStateException(A.toString(), e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException(f.a.b.a.a.q("Class ", next, " wasn't found"), e4);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

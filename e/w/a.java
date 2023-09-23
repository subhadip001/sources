package e.w;

import android.os.Bundle;
import androidx.savedstate.Recreator;

/* compiled from: SavedStateRegistry.java */
/* loaded from: classes.dex */
public final class a {
    public Bundle b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f2994d;
    public e.c.a.b.b<String, b> a = new e.c.a.b.b<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2995e = true;

    /* compiled from: SavedStateRegistry.java */
    /* renamed from: e.w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0060a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry.java */
    /* loaded from: classes.dex */
    public interface b {
        Bundle b();
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.b.remove(str);
                if (this.b.isEmpty()) {
                    this.b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.a.d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends InterfaceC0060a> cls) {
        if (this.f2995e) {
            if (this.f2994d == null) {
                this.f2994d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.f2994d;
                aVar.a.add(cls.getName());
                return;
            } catch (NoSuchMethodException e2) {
                StringBuilder A = f.a.b.a.a.A("Class");
                A.append(cls.getSimpleName());
                A.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(A.toString(), e2);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}

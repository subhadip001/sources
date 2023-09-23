package e.b.c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import e.b.c.b;
import e.b.g.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: f  reason: collision with root package name */
    public static int f1480f = -100;

    /* renamed from: g  reason: collision with root package name */
    public static final e.f.c<WeakReference<m>> f1481g = new e.f.c<>(0);

    /* renamed from: h  reason: collision with root package name */
    public static final Object f1482h = new Object();

    public static void u(m mVar) {
        synchronized (f1482h) {
            Iterator<WeakReference<m>> it = f1481g.iterator();
            while (it.hasNext()) {
                m mVar2 = it.next().get();
                if (mVar2 == mVar || mVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void z(int i2) {
        if (i2 != -1 && i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f1480f != i2) {
            f1480f = i2;
            synchronized (f1482h) {
                Iterator<WeakReference<m>> it = f1481g.iterator();
                while (it.hasNext()) {
                    m mVar = it.next().get();
                    if (mVar != null) {
                        mVar.d();
                    }
                }
            }
        }
    }

    public abstract void A(Toolbar toolbar);

    public void B(int i2) {
    }

    public abstract void C(CharSequence charSequence);

    public abstract e.b.g.a D(a.InterfaceC0026a interfaceC0026a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean d();

    public Context e(Context context) {
        return context;
    }

    public abstract <T extends View> T f(int i2);

    public abstract b.a g();

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract a j();

    public abstract void k();

    public abstract void l();

    public abstract void m(Configuration configuration);

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r(Bundle bundle);

    public abstract void s();

    public abstract void t();

    public abstract boolean v(int i2);

    public abstract void w(int i2);

    public abstract void x(View view);

    public abstract void y(View view, ViewGroup.LayoutParams layoutParams);
}

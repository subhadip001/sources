package f.e.a.m;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import f.e.a.c;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: classes.dex */
public class q implements Handler.Callback {
    public static final b q = new a();

    /* renamed from: f  reason: collision with root package name */
    public volatile f.e.a.h f3532f;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f3535i;

    /* renamed from: j  reason: collision with root package name */
    public final b f3536j;

    /* renamed from: k  reason: collision with root package name */
    public final f.e.a.e f3537k;
    public final k o;
    public final n p;

    /* renamed from: g  reason: collision with root package name */
    public final Map<FragmentManager, p> f3533g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Map<androidx.fragment.app.FragmentManager, x> f3534h = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final e.f.a<View, Fragment> f3538l = new e.f.a<>();

    /* renamed from: m  reason: collision with root package name */
    public final e.f.a<View, android.app.Fragment> f3539m = new e.f.a<>();
    public final Bundle n = new Bundle();

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public class a implements b {
    }

    /* compiled from: RequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public q(b bVar, f.e.a.e eVar) {
        k gVar;
        bVar = bVar == null ? q : bVar;
        this.f3536j = bVar;
        this.f3537k = eVar;
        this.f3535i = new Handler(Looper.getMainLooper(), this);
        this.p = new n(bVar);
        if (f.e.a.l.s.c.p.f3467h && f.e.a.l.s.c.p.f3466g) {
            if (eVar.a.containsKey(c.e.class)) {
                gVar = new i();
            } else {
                gVar = new j();
            }
        } else {
            gVar = new g();
        }
        this.o = gVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager().M(), map);
            }
        }
    }

    public static boolean j(Context context) {
        Activity a2 = a(context);
        return a2 == null || !a2.isFinishing();
    }

    @Deprecated
    public final void b(FragmentManager fragmentManager, e.f.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    b(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            this.n.putInt("key", i2);
            android.app.Fragment fragment2 = null;
            try {
                fragment2 = fragmentManager.getFragment(this.n, "key");
            } catch (Exception unused) {
            }
            if (fragment2 == null) {
                return;
            }
            if (fragment2.getView() != null) {
                aVar.put(fragment2.getView(), fragment2);
                b(fragment2.getChildFragmentManager(), aVar);
            }
            i2 = i3;
        }
    }

    @Deprecated
    public final f.e.a.h d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        p h2 = h(fragmentManager, fragment);
        f.e.a.h hVar = h2.f3529i;
        if (hVar == null) {
            f.e.a.b b2 = f.e.a.b.b(context);
            b bVar = this.f3536j;
            f.e.a.m.a aVar = h2.f3526f;
            r rVar = h2.f3527g;
            Objects.requireNonNull((a) bVar);
            f.e.a.h hVar2 = new f.e.a.h(b2, aVar, rVar, context);
            if (z) {
                hVar2.onStart();
            }
            h2.f3529i = hVar2;
            return hVar2;
        }
        return hVar;
    }

    @Deprecated
    public f.e.a.h e(Activity activity) {
        if (f.e.a.r.l.h()) {
            return f(activity.getApplicationContext());
        }
        if (activity instanceof e.p.c.n) {
            return g((e.p.c.n) activity);
        }
        if (!activity.isDestroyed()) {
            this.o.a(activity);
            return d(activity, activity.getFragmentManager(), null, j(activity));
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public f.e.a.h f(Context context) {
        if (context != null) {
            if (f.e.a.r.l.i() && !(context instanceof Application)) {
                if (context instanceof e.p.c.n) {
                    return g((e.p.c.n) context);
                }
                if (context instanceof Activity) {
                    return e((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return f(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f3532f == null) {
                synchronized (this) {
                    if (this.f3532f == null) {
                        f.e.a.b b2 = f.e.a.b.b(context.getApplicationContext());
                        b bVar = this.f3536j;
                        f.e.a.m.b bVar2 = new f.e.a.m.b();
                        h hVar = new h();
                        Context applicationContext = context.getApplicationContext();
                        Objects.requireNonNull((a) bVar);
                        this.f3532f = new f.e.a.h(b2, bVar2, hVar, applicationContext);
                    }
                }
            }
            return this.f3532f;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public f.e.a.h g(e.p.c.n nVar) {
        if (f.e.a.r.l.h()) {
            return f(nVar.getApplicationContext());
        }
        if (!nVar.isDestroyed()) {
            this.o.a(nVar);
            androidx.fragment.app.FragmentManager H = nVar.H();
            boolean j2 = j(nVar);
            if (this.f3537k.a.containsKey(c.d.class)) {
                Context applicationContext = nVar.getApplicationContext();
                return this.p.a(applicationContext, f.e.a.b.b(applicationContext), nVar.getLifecycle(), nVar.H(), j2);
            }
            return k(nVar, H, null, j2);
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    public final p h(FragmentManager fragmentManager, android.app.Fragment fragment) {
        p pVar = this.f3533g.get(fragmentManager);
        if (pVar == null) {
            p pVar2 = (p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (pVar2 == null) {
                pVar2 = new p();
                pVar2.f3531k = fragment;
                if (fragment != null && fragment.getActivity() != null) {
                    pVar2.a(fragment.getActivity());
                }
                this.f3533g.put(fragmentManager, pVar2);
                fragmentManager.beginTransaction().add(pVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f3535i.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return pVar2;
        }
        return pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0149 A[ADDED_TO_REGION] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handleMessage(android.os.Message r17) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.m.q.handleMessage(android.os.Message):boolean");
    }

    public final x i(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        x xVar = this.f3534h.get(fragmentManager);
        if (xVar == null) {
            x xVar2 = (x) fragmentManager.I("com.bumptech.glide.manager");
            if (xVar2 == null) {
                xVar2 = new x();
                xVar2.f3558k = fragment;
                if (fragment != null && fragment.getContext() != null) {
                    Fragment fragment2 = fragment;
                    while (fragment2.getParentFragment() != null) {
                        fragment2 = fragment2.getParentFragment();
                    }
                    androidx.fragment.app.FragmentManager fragmentManager2 = fragment2.getFragmentManager();
                    if (fragmentManager2 != null) {
                        xVar2.k(fragment.getContext(), fragmentManager2);
                    }
                }
                this.f3534h.put(fragmentManager, xVar2);
                e.p.c.a aVar = new e.p.c.a(fragmentManager);
                aVar.g(0, xVar2, "com.bumptech.glide.manager", 1);
                aVar.e();
                this.f3535i.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return xVar2;
        }
        return xVar;
    }

    public final f.e.a.h k(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        x i2 = i(fragmentManager, fragment);
        f.e.a.h hVar = i2.f3557j;
        if (hVar == null) {
            f.e.a.b b2 = f.e.a.b.b(context);
            b bVar = this.f3536j;
            f.e.a.m.a aVar = i2.f3553f;
            r rVar = i2.f3554g;
            Objects.requireNonNull((a) bVar);
            f.e.a.h hVar2 = new f.e.a.h(b2, aVar, rVar, context);
            if (z) {
                hVar2.onStart();
            }
            i2.f3557j = hVar2;
            return hVar2;
        }
        return hVar;
    }
}

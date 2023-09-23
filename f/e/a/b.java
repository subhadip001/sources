package f.e.a;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.google.android.gms.common.api.Api;
import e.p.c.n;
import f.e.a.c;
import f.e.a.e;
import f.e.a.l.q.c0.j;
import f.e.a.l.q.d0.a;
import f.e.a.l.q.l;
import f.e.a.m.q;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Glide.java */
/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: m  reason: collision with root package name */
    public static volatile b f3152m;
    public static volatile boolean n;

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.l.q.b0.d f3153f;

    /* renamed from: g  reason: collision with root package name */
    public final f.e.a.l.q.c0.i f3154g;

    /* renamed from: h  reason: collision with root package name */
    public final d f3155h;

    /* renamed from: i  reason: collision with root package name */
    public final f.e.a.l.q.b0.b f3156i;

    /* renamed from: j  reason: collision with root package name */
    public final q f3157j;

    /* renamed from: k  reason: collision with root package name */
    public final f.e.a.m.d f3158k;

    /* renamed from: l  reason: collision with root package name */
    public final List<h> f3159l = new ArrayList();

    /* compiled from: Glide.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, l lVar, f.e.a.l.q.c0.i iVar, f.e.a.l.q.b0.d dVar, f.e.a.l.q.b0.b bVar, q qVar, f.e.a.m.d dVar2, int i2, a aVar, Map<Class<?>, i<?, ?>> map, List<f.e.a.p.e<Object>> list, List<f.e.a.n.c> list2, f.e.a.n.a aVar2, e eVar) {
        this.f3153f = dVar;
        this.f3156i = bVar;
        this.f3154g = iVar;
        this.f3157j = qVar;
        this.f3158k = dVar2;
        this.f3155h = new d(context, bVar, new f(this, list2, aVar2), new f.e.a.p.j.f(), aVar, map, list, lVar, eVar, i2);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!n) {
            n = true;
            c cVar = new c();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(f.e.a.n.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f.e.a.n.c cVar2 = (f.e.a.n.c) it.next();
                        if (hashSet.contains(cVar2.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar2);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        StringBuilder A = f.a.b.a.a.A("Discovered GlideModule from manifest: ");
                        A.append(((f.e.a.n.c) it2.next()).getClass());
                        Log.d("Glide", A.toString());
                    }
                }
                cVar.n = null;
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((f.e.a.n.c) it3.next()).a(applicationContext, cVar);
                }
                if (cVar.f3163g == null) {
                    a.b bVar = new a.b(null);
                    int a2 = f.e.a.l.q.d0.a.a();
                    if (!TextUtils.isEmpty("source")) {
                        cVar.f3163g = new f.e.a.l.q.d0.a(new ThreadPoolExecutor(a2, a2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.c(bVar, "source", a.d.b, false)));
                    } else {
                        throw new IllegalArgumentException(f.a.b.a.a.p("Name must be non-null and non-empty, but given: ", "source"));
                    }
                }
                if (cVar.f3164h == null) {
                    int i2 = f.e.a.l.q.d0.a.f3309h;
                    a.b bVar2 = new a.b(null);
                    if (!TextUtils.isEmpty("disk-cache")) {
                        cVar.f3164h = new f.e.a.l.q.d0.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.c(bVar2, "disk-cache", a.d.b, true)));
                    } else {
                        throw new IllegalArgumentException(f.a.b.a.a.p("Name must be non-null and non-empty, but given: ", "disk-cache"));
                    }
                }
                if (cVar.o == null) {
                    int i3 = f.e.a.l.q.d0.a.a() >= 4 ? 2 : 1;
                    a.b bVar3 = new a.b(null);
                    if (!TextUtils.isEmpty("animation")) {
                        cVar.o = new f.e.a.l.q.d0.a(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.c(bVar3, "animation", a.d.b, true)));
                    } else {
                        throw new IllegalArgumentException(f.a.b.a.a.p("Name must be non-null and non-empty, but given: ", "animation"));
                    }
                }
                if (cVar.f3166j == null) {
                    cVar.f3166j = new j(new j.a(applicationContext));
                }
                if (cVar.f3167k == null) {
                    cVar.f3167k = new f.e.a.m.f();
                }
                if (cVar.f3160d == null) {
                    int i4 = cVar.f3166j.a;
                    if (i4 > 0) {
                        cVar.f3160d = new f.e.a.l.q.b0.j(i4);
                    } else {
                        cVar.f3160d = new f.e.a.l.q.b0.e();
                    }
                }
                if (cVar.f3161e == null) {
                    cVar.f3161e = new f.e.a.l.q.b0.i(cVar.f3166j.f3295d);
                }
                if (cVar.f3162f == null) {
                    cVar.f3162f = new f.e.a.l.q.c0.h(cVar.f3166j.b);
                }
                if (cVar.f3165i == null) {
                    cVar.f3165i = new f.e.a.l.q.c0.g(applicationContext);
                }
                if (cVar.c == null) {
                    cVar.c = new l(cVar.f3162f, cVar.f3165i, cVar.f3164h, cVar.f3163g, new f.e.a.l.q.d0.a(new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, f.e.a.l.q.d0.a.f3308g, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.c(new a.b(null), "source-unlimited", a.d.b, false))), cVar.o, false);
                }
                List<f.e.a.p.e<Object>> list = cVar.p;
                if (list == null) {
                    cVar.p = Collections.emptyList();
                } else {
                    cVar.p = Collections.unmodifiableList(list);
                }
                e.a aVar = cVar.b;
                Objects.requireNonNull(aVar);
                e eVar = new e(aVar);
                b bVar4 = new b(applicationContext, cVar.c, cVar.f3162f, cVar.f3160d, cVar.f3161e, new q(cVar.n, eVar), cVar.f3167k, cVar.f3168l, cVar.f3169m, cVar.a, cVar.p, arrayList, generatedAppGlideModule, eVar);
                applicationContext.registerComponentCallbacks(bVar4);
                f3152m = bVar4;
                n = false;
                return;
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e2);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static b b(Context context) {
        if (f3152m == null) {
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (IllegalAccessException e2) {
                c(e2);
                throw null;
            } catch (InstantiationException e3) {
                c(e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                c(e4);
                throw null;
            } catch (InvocationTargetException e5) {
                c(e5);
                throw null;
            }
            synchronized (b.class) {
                if (f3152m == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f3152m;
    }

    public static void c(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static h d(Context context) {
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).f3157j.f(context);
    }

    public static h e(View view) {
        Context context = view.getContext();
        Objects.requireNonNull(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        q qVar = b(context).f3157j;
        Objects.requireNonNull(qVar);
        if (f.e.a.r.l.h()) {
            return qVar.f(view.getContext().getApplicationContext());
        }
        Objects.requireNonNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a2 = q.a(view.getContext());
        if (a2 == null) {
            return qVar.f(view.getContext().getApplicationContext());
        }
        if (a2 instanceof n) {
            n nVar = (n) a2;
            qVar.f3538l.clear();
            q.c(nVar.H().M(), qVar.f3538l);
            View findViewById = nVar.findViewById(16908290);
            Fragment fragment = null;
            while (!view.equals(findViewById) && (fragment = qVar.f3538l.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            qVar.f3538l.clear();
            if (fragment != null) {
                Objects.requireNonNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                if (f.e.a.r.l.h()) {
                    return qVar.f(fragment.getContext().getApplicationContext());
                }
                if (fragment.getActivity() != null) {
                    qVar.o.a(fragment.getActivity());
                }
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Context context2 = fragment.getContext();
                if (qVar.f3537k.a.containsKey(c.d.class)) {
                    return qVar.p.a(context2, b(context2.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
                }
                return qVar.k(context2, childFragmentManager, fragment, fragment.isVisible());
            }
            return qVar.g(nVar);
        }
        qVar.f3539m.clear();
        qVar.b(a2.getFragmentManager(), qVar.f3539m);
        View findViewById2 = a2.findViewById(16908290);
        android.app.Fragment fragment2 = null;
        while (!view.equals(findViewById2) && (fragment2 = qVar.f3539m.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        qVar.f3539m.clear();
        if (fragment2 == null) {
            return qVar.e(a2);
        }
        if (fragment2.getActivity() != null) {
            if (!f.e.a.r.l.h()) {
                if (fragment2.getActivity() != null) {
                    qVar.o.a(fragment2.getActivity());
                }
                return qVar.d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
            }
            return qVar.f(fragment2.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        f.e.a.r.l.a();
        ((f.e.a.r.i) this.f3154g).e(0L);
        this.f3153f.b();
        this.f3156i.b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        long j2;
        f.e.a.r.l.a();
        synchronized (this.f3159l) {
            for (h hVar : this.f3159l) {
                Objects.requireNonNull(hVar);
            }
        }
        f.e.a.l.q.c0.h hVar2 = (f.e.a.l.q.c0.h) this.f3154g;
        Objects.requireNonNull(hVar2);
        if (i2 >= 40) {
            hVar2.e(0L);
        } else if (i2 >= 20 || i2 == 15) {
            synchronized (hVar2) {
                j2 = hVar2.b;
            }
            hVar2.e(j2 / 2);
        }
        this.f3153f.a(i2);
        this.f3156i.a(i2);
    }
}

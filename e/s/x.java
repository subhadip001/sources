package e.s;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* compiled from: ReportFragment.java */
/* loaded from: classes.dex */
public class x extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f2829g = 0;

    /* renamed from: f  reason: collision with root package name */
    public a f2830f;

    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: ReportFragment.java */
    /* loaded from: classes.dex */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            x.a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            x.a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            x.a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            x.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            x.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            x.a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, Lifecycle.Event event) {
        if (activity instanceof o) {
            n lifecycle = ((o) activity).getLifecycle();
            lifecycle.d("handleLifecycleEvent");
            lifecycle.g(event.getTargetState());
        } else if (activity instanceof m) {
            Lifecycle lifecycle2 = ((m) activity).getLifecycle();
            if (lifecycle2 instanceof n) {
                n nVar = (n) lifecycle2;
                nVar.d("handleLifecycleEvent");
                nVar.g(event.getTargetState());
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new x(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), event);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        b(Lifecycle.Event.ON_DESTROY);
        this.f2830f = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        a aVar = this.f2830f;
        if (aVar != null) {
            v.this.a();
        }
        b(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        a aVar = this.f2830f;
        if (aVar != null) {
            v.this.c();
        }
        b(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        b(Lifecycle.Event.ON_STOP);
    }
}

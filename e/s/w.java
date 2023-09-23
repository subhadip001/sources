package e.s;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import e.s.v;

/* compiled from: ProcessLifecycleOwner.java */
/* loaded from: classes.dex */
public class w extends f {
    public final /* synthetic */ v this$0;

    /* compiled from: ProcessLifecycleOwner.java */
    /* loaded from: classes.dex */
    public class a extends f {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            w.this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            w.this.this$0.c();
        }
    }

    public w(v vVar) {
        this.this$0 = vVar;
    }

    @Override // e.s.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = x.f2829g;
            ((x) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2830f = this.this$0.f2827m;
        }
    }

    @Override // e.s.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        v vVar = this.this$0;
        int i2 = vVar.f2821g - 1;
        vVar.f2821g = i2;
        if (i2 == 0) {
            vVar.f2824j.postDelayed(vVar.f2826l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        v.c.a(activity, new a());
    }

    @Override // e.s.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        v vVar = this.this$0;
        int i2 = vVar.f2820f - 1;
        vVar.f2820f = i2;
        if (i2 == 0 && vVar.f2822h) {
            vVar.f2825k.e(Lifecycle.Event.ON_STOP);
            vVar.f2823i = true;
        }
    }
}

package f.j.a.m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import i.j.f;
import i.l.b.i;
import j.a.a0;

/* compiled from: Utils.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final c a = new c();
    public static final a0 b;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends i.j.a implements a0 {
        public a(f.b bVar) {
            super(bVar);
        }

        @Override // j.a.a0
        public void handleException(f fVar, Throwable th) {
            FirebaseCrashlytics.getInstance().log("Module: AdHelper");
            FirebaseCrashlytics.getInstance().log(i.g("CoroutineContext: ", fVar));
            FirebaseCrashlytics.getInstance().recordException(th);
            throw th;
        }
    }

    static {
        int i2 = a0.f8729d;
        b = new a(a0.a.f8730f);
    }

    public static boolean a(c cVar, Context context, Fragment fragment, int i2) {
        int i3 = i2 & 2;
        if (context == null) {
            return false;
        }
        i.e(context, "context");
        while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
            i.d(context, "tempContext as ContextWrapper).baseContext");
        }
        Activity activity = (Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public final Activity b(Context context) {
        i.e(context, "context");
        while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
            i.d(context, "tempContext as ContextWrapper).baseContext");
        }
        return (Activity) context;
    }
}

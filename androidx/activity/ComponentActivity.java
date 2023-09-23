package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import com.video_converter.video_compressor.R;
import e.a.e.d.a;
import e.s.e0;
import e.s.i0;
import e.s.j0;
import e.s.k;
import e.s.m;
import e.s.n;
import e.s.x;
import e.w.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements m, j0, e.w.c, e.a.c, e.a.e.c {

    /* renamed from: f  reason: collision with root package name */
    public final e.a.d.a f39f = new e.a.d.a();

    /* renamed from: g  reason: collision with root package name */
    public final n f40g = new n(this);

    /* renamed from: h  reason: collision with root package name */
    public final e.w.b f41h;

    /* renamed from: i  reason: collision with root package name */
    public i0 f42i;

    /* renamed from: j  reason: collision with root package name */
    public e0 f43j;

    /* renamed from: k  reason: collision with root package name */
    public final OnBackPressedDispatcher f44k;

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f45l;

    /* renamed from: m  reason: collision with root package name */
    public final ActivityResultRegistry f46m;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f52f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ a.C0018a f53g;

            public a(int i2, a.C0018a c0018a) {
                this.f52f = i2;
                this.f53g = c0018a;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.a.e.a<?> aVar;
                b bVar = b.this;
                int i2 = this.f52f;
                Object obj = this.f53g.a;
                String str = bVar.b.get(Integer.valueOf(i2));
                if (str == null) {
                    return;
                }
                bVar.f72e.remove(str);
                ActivityResultRegistry.c<?> cVar = bVar.f73f.get(str);
                if (cVar != null && (aVar = cVar.a) != null) {
                    aVar.a(obj);
                    return;
                }
                bVar.f75h.remove(str);
                bVar.f74g.put(str, obj);
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000b implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f55f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f56g;

            public RunnableC0000b(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f55f = i2;
                this.f56g = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.a(this.f55f, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f56g));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void b(int i2, e.a.e.d.a<I, O> aVar, I i3, ActivityOptionsCompat activityOptionsCompat) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0018a<O> b = aVar.b(componentActivity, i3);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, b));
                return;
            }
            Intent a2 = aVar.a(componentActivity, i3);
            Bundle bundle = null;
            if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
                a2.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (activityOptionsCompat != null) {
                bundle = activityOptionsCompat.toBundle();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i2);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.f82f, i2, intentSenderRequest.f83g, intentSenderRequest.f84h, intentSenderRequest.f85i, 0, bundle2);
                } catch (IntentSender.SendIntentException e2) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0000b(i2, e2));
                }
            } else {
                ActivityCompat.startActivityForResult(componentActivity, a2, i2, bundle2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.b {
        public c() {
        }

        @Override // e.w.a.b
        public Bundle b() {
            Bundle bundle = new Bundle();
            ActivityResultRegistry activityResultRegistry = ComponentActivity.this.f46m;
            Objects.requireNonNull(activityResultRegistry);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f72e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f75h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.a);
            return bundle;
        }
    }

    /* loaded from: classes.dex */
    public class d implements e.a.d.b {
        public d() {
        }

        @Override // e.a.d.b
        public void a(Context context) {
            Bundle a = ComponentActivity.this.f41h.b.a("android:support:activity-result");
            if (a != null) {
                ActivityResultRegistry activityResultRegistry = ComponentActivity.this.f46m;
                Objects.requireNonNull(activityResultRegistry);
                ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList == null || integerArrayList == null) {
                    return;
                }
                activityResultRegistry.f72e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                activityResultRegistry.a = (Random) a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                activityResultRegistry.f75h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                    String str = stringArrayList.get(i2);
                    if (activityResultRegistry.c.containsKey(str)) {
                        Integer remove = activityResultRegistry.c.remove(str);
                        if (!activityResultRegistry.f75h.containsKey(str)) {
                            activityResultRegistry.b.remove(remove);
                        }
                    }
                    int intValue = integerArrayList.get(i2).intValue();
                    String str2 = stringArrayList.get(i2);
                    activityResultRegistry.b.put(Integer.valueOf(intValue), str2);
                    activityResultRegistry.c.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public i0 a;
    }

    public ComponentActivity() {
        e.w.b bVar = new e.w.b(this);
        this.f41h = bVar;
        this.f44k = new OnBackPressedDispatcher(new a());
        this.f45l = new AtomicInteger();
        this.f46m = new b();
        if (getLifecycle() != null) {
            int i2 = Build.VERSION.SDK_INT;
            getLifecycle().a(new k() { // from class: androidx.activity.ComponentActivity.3
                @Override // e.s.k
                public void d(m mVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new k() { // from class: androidx.activity.ComponentActivity.4
                @Override // e.s.k
                public void d(m mVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.f39f.b = null;
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            getLifecycle().a(new k() { // from class: androidx.activity.ComponentActivity.5
                @Override // e.s.k
                public void d(m mVar, Lifecycle.Event event) {
                    ComponentActivity.this.E();
                    n nVar = (n) ComponentActivity.this.getLifecycle();
                    nVar.d("removeObserver");
                    nVar.a.e(this);
                }
            });
            if (i2 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            bVar.b.b("android:support:activity-result", new c());
            D(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final void D(e.a.d.b bVar) {
        e.a.d.a aVar = this.f39f;
        if (aVar.b != null) {
            bVar.a(aVar.b);
        }
        aVar.a.add(bVar);
    }

    public void E() {
        if (this.f42i == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f42i = eVar.a;
            }
            if (this.f42i == null) {
                this.f42i = new i0();
            }
        }
    }

    public final void F() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public final <I, O> e.a.e.b<I> G(e.a.e.d.a<I, O> aVar, e.a.e.a<O> aVar2) {
        ActivityResultRegistry activityResultRegistry = this.f46m;
        StringBuilder A = f.a.b.a.a.A("activity_rq#");
        A.append(this.f45l.getAndIncrement());
        return activityResultRegistry.d(A.toString(), this, aVar, aVar2);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        super.addContentView(view, layoutParams);
    }

    @Override // e.a.c
    public final OnBackPressedDispatcher b() {
        return this.f44k;
    }

    @Override // androidx.core.app.ComponentActivity, e.s.m
    public Lifecycle getLifecycle() {
        return this.f40g;
    }

    @Override // e.w.c
    public final e.w.a getSavedStateRegistry() {
        return this.f41h.b;
    }

    @Override // e.s.j0
    public i0 getViewModelStore() {
        if (getApplication() != null) {
            E();
            return this.f42i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // e.a.e.c
    public final ActivityResultRegistry o() {
        return this.f46m;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.f46m.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f44k.a();
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f41h.a(bundle);
        e.a.d.a aVar = this.f39f;
        aVar.b = this;
        for (e.a.d.b bVar : aVar.a) {
            bVar.a(this);
        }
        super.onCreate(bundle);
        x.c(this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (this.f46m.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        i0 i0Var = this.f42i;
        if (i0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            i0Var = eVar.a;
        }
        if (i0Var == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = i0Var;
        return eVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof n) {
            ((n) lifecycle).i(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f41h.b(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (e.p.a.m()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        F();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        F();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        super.setContentView(view, layoutParams);
    }
}

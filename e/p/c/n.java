package e.p.c;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class n extends ComponentActivity implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator {
    public final u n;
    public final e.s.n o;
    public boolean p;
    public boolean q;
    public boolean r;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a extends w<n> implements e.s.j0, e.a.c, e.a.e.c, b0 {
        public a() {
            super(n.this);
        }

        @Override // e.p.c.b0
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            n.this.J();
        }

        @Override // e.a.c
        public OnBackPressedDispatcher b() {
            return n.this.f44k;
        }

        @Override // e.p.c.t
        public View c(int i2) {
            return n.this.findViewById(i2);
        }

        @Override // e.p.c.t
        public boolean d() {
            Window window = n.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // e.p.c.w
        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            n.this.dump(str, null, printWriter, strArr);
        }

        @Override // e.p.c.w
        public n f() {
            return n.this;
        }

        @Override // e.p.c.w
        public LayoutInflater g() {
            return n.this.getLayoutInflater().cloneInContext(n.this);
        }

        @Override // e.s.m
        public Lifecycle getLifecycle() {
            return n.this.o;
        }

        @Override // e.s.j0
        public e.s.i0 getViewModelStore() {
            return n.this.getViewModelStore();
        }

        @Override // e.p.c.w
        public boolean h(Fragment fragment) {
            return !n.this.isFinishing();
        }

        @Override // e.p.c.w
        public boolean i(String str) {
            return ActivityCompat.shouldShowRequestPermissionRationale(n.this, str);
        }

        @Override // e.p.c.w
        public void j() {
            n.this.K();
        }

        @Override // e.a.e.c
        public ActivityResultRegistry o() {
            return n.this.f46m;
        }
    }

    public n() {
        a aVar = new a();
        e.i.a.i(aVar, "callbacks == null");
        this.n = new u(aVar);
        this.o = new e.s.n(this);
        this.r = true;
        this.f41h.b.b("android:support:fragments", new l(this));
        D(new m(this));
    }

    public static boolean I(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.M()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= I(fragment.getChildFragmentManager(), state);
                }
                q0 q0Var = fragment.mViewLifecycleOwner;
                if (q0Var != null) {
                    q0Var.c();
                    if (q0Var.f2770g.b.isAtLeast(Lifecycle.State.STARTED)) {
                        e.s.n nVar = fragment.mViewLifecycleOwner.f2770g;
                        nVar.d("setCurrentState");
                        nVar.g(state);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.b.isAtLeast(Lifecycle.State.STARTED)) {
                    e.s.n nVar2 = fragment.mLifecycleRegistry;
                    nVar2.d("setCurrentState");
                    nVar2.g(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public FragmentManager H() {
        return this.n.a.f2802i;
    }

    @Deprecated
    public void J() {
    }

    @Deprecated
    public void K() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.p);
        printWriter.print(" mResumed=");
        printWriter.print(this.q);
        printWriter.print(" mStopped=");
        printWriter.print(this.r);
        if (getApplication() != null) {
            e.t.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.n.a.f2802i.y(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.n.a();
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.n.a();
        super.onConfigurationChanged(configuration);
        this.n.a.f2802i.k(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o.e(Lifecycle.Event.ON_CREATE);
        this.n.a.f2802i.m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
            u uVar = this.n;
            return onCreatePanelMenu | uVar.a.f2802i.n(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.n.a.f2802i.f400f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.n.a.f2802i.o();
        this.o.e(Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.n.a.f2802i.p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            if (i2 != 6) {
                return false;
            }
            return this.n.a.f2802i.l(menuItem);
        }
        return this.n.a.f2802i.r(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.n.a.f2802i.q(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.n.a();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.n.a.f2802i.s(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.q = false;
        this.n.a.f2802i.w(5);
        this.o.e(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.n.a.f2802i.u(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.o.e(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.n.a.f2802i;
        fragmentManager.B = false;
        fragmentManager.C = false;
        fragmentManager.J.f2677h = false;
        fragmentManager.w(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.n.a.f2802i.v(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.n.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.n.a();
        super.onResume();
        this.q = true;
        this.n.a.f2802i.C(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.n.a();
        super.onStart();
        this.r = false;
        if (!this.p) {
            this.p = true;
            FragmentManager fragmentManager = this.n.a.f2802i;
            fragmentManager.B = false;
            fragmentManager.C = false;
            fragmentManager.J.f2677h = false;
            fragmentManager.w(4);
        }
        this.n.a.f2802i.C(true);
        this.o.e(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.n.a.f2802i;
        fragmentManager2.B = false;
        fragmentManager2.C = false;
        fragmentManager2.J.f2677h = false;
        fragmentManager2.w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.n.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.r = true;
        do {
        } while (I(H(), Lifecycle.State.CREATED));
        FragmentManager fragmentManager = this.n.a.f2802i;
        fragmentManager.C = true;
        fragmentManager.J.f2677h = true;
        fragmentManager.w(4);
        this.o.e(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.n.a.f2802i.f400f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}

package e.b.c;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.app.TaskStackBuilder;
import com.video_converter.video_compressor.R;
import e.b.c.b;
import e.b.g.a;
import e.b.h.e1;

/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class k extends e.p.c.n implements l, TaskStackBuilder.SupportParentable, b.InterfaceC0023b {
    public m s;

    public k() {
        this.f41h.b.b("androidx:appcompat", new i(this));
        D(new j(this));
    }

    private void F() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // e.p.c.n
    public void K() {
        L().l();
    }

    public m L() {
        if (this.s == null) {
            int i2 = m.f1480f;
            this.s = new n(this, null, this, this);
        }
        return this.s;
    }

    public a M() {
        return L().j();
    }

    public void N() {
    }

    public void O() {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        L().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(L().e(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a M = M();
        if (getWindow().hasFeature(0)) {
            if (M == null || !M.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a M = M();
        if (keyCode == 82 && M != null && M.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // e.b.c.l
    public void e(e.b.g.a aVar) {
    }

    @Override // e.b.c.b.InterfaceC0023b
    public b.a f() {
        return L().g();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) L().f(i2);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return L().i();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i2 = e1.a;
        return super.getResources();
    }

    @Override // androidx.core.app.TaskStackBuilder.SupportParentable
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent(this);
    }

    @Override // e.b.c.l
    public void i(e.b.g.a aVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        L().l();
    }

    @Override // e.p.c.n, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L().m(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        L().o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // e.p.c.n, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent supportParentActivityIntent;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a M = M();
        if (menuItem.getItemId() != 16908332 || M == null || (M.d() & 4) == 0 || (supportParentActivityIntent = getSupportParentActivityIntent()) == null) {
            return false;
        }
        if (NavUtils.shouldUpRecreateTask(this, supportParentActivityIntent)) {
            TaskStackBuilder create = TaskStackBuilder.create(this);
            create.addParentStack(this);
            O();
            create.startActivities();
            try {
                ActivityCompat.finishAffinity(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        NavUtils.navigateUpTo(this, supportParentActivityIntent);
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // e.p.c.n, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        L().p(bundle);
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        L().q();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onStart() {
        super.onStart();
        L().s();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
        L().t();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        L().C(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a M = M();
        if (getWindow().hasFeature(0)) {
            if (M == null || !M.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // e.b.c.l
    public e.b.g.a r(a.InterfaceC0026a interfaceC0026a) {
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        F();
        L().w(i2);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        L().B(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        F();
        L().x(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        F();
        L().y(view, layoutParams);
    }
}

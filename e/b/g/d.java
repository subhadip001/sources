package e.b.g;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import e.b.g.a;
import e.b.g.i.g;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class d extends a implements g.a {

    /* renamed from: h  reason: collision with root package name */
    public Context f1581h;

    /* renamed from: i  reason: collision with root package name */
    public ActionBarContextView f1582i;

    /* renamed from: j  reason: collision with root package name */
    public a.InterfaceC0026a f1583j;

    /* renamed from: k  reason: collision with root package name */
    public WeakReference<View> f1584k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1585l;

    /* renamed from: m  reason: collision with root package name */
    public e.b.g.i.g f1586m;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0026a interfaceC0026a, boolean z) {
        this.f1581h = context;
        this.f1582i = actionBarContextView;
        this.f1583j = interfaceC0026a;
        e.b.g.i.g gVar = new e.b.g.i.g(actionBarContextView.getContext());
        gVar.f1659l = 1;
        this.f1586m = gVar;
        gVar.f1652e = this;
    }

    @Override // e.b.g.i.g.a
    public boolean a(e.b.g.i.g gVar, MenuItem menuItem) {
        return this.f1583j.d(this, menuItem);
    }

    @Override // e.b.g.i.g.a
    public void b(e.b.g.i.g gVar) {
        i();
        ActionMenuPresenter actionMenuPresenter = this.f1582i.f1716i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.p();
        }
    }

    @Override // e.b.g.a
    public void c() {
        if (this.f1585l) {
            return;
        }
        this.f1585l = true;
        this.f1583j.a(this);
    }

    @Override // e.b.g.a
    public View d() {
        WeakReference<View> weakReference = this.f1584k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // e.b.g.a
    public Menu e() {
        return this.f1586m;
    }

    @Override // e.b.g.a
    public MenuInflater f() {
        return new f(this.f1582i.getContext());
    }

    @Override // e.b.g.a
    public CharSequence g() {
        return this.f1582i.getSubtitle();
    }

    @Override // e.b.g.a
    public CharSequence h() {
        return this.f1582i.getTitle();
    }

    @Override // e.b.g.a
    public void i() {
        this.f1583j.c(this, this.f1586m);
    }

    @Override // e.b.g.a
    public boolean j() {
        return this.f1582i.x;
    }

    @Override // e.b.g.a
    public void k(View view) {
        this.f1582i.setCustomView(view);
        this.f1584k = view != null ? new WeakReference<>(view) : null;
    }

    @Override // e.b.g.a
    public void l(int i2) {
        this.f1582i.setSubtitle(this.f1581h.getString(i2));
    }

    @Override // e.b.g.a
    public void m(CharSequence charSequence) {
        this.f1582i.setSubtitle(charSequence);
    }

    @Override // e.b.g.a
    public void n(int i2) {
        this.f1582i.setTitle(this.f1581h.getString(i2));
    }

    @Override // e.b.g.a
    public void o(CharSequence charSequence) {
        this.f1582i.setTitle(charSequence);
    }

    @Override // e.b.g.a
    public void p(boolean z) {
        this.f1578g = z;
        this.f1582i.setTitleOptional(z);
    }
}

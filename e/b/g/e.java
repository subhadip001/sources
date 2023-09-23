package e.b.g;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import e.b.g.a;
import e.b.g.i.j;
import e.b.g.i.o;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class e extends ActionMode {
    public final Context a;
    public final e.b.g.a b;

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0026a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<e> c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final e.f.h<Menu, Menu> f1587d = new e.f.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // e.b.g.a.InterfaceC0026a
        public void a(e.b.g.a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        @Override // e.b.g.a.InterfaceC0026a
        public boolean b(e.b.g.a aVar, Menu menu) {
            return this.a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // e.b.g.a.InterfaceC0026a
        public boolean c(e.b.g.a aVar, Menu menu) {
            return this.a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // e.b.g.a.InterfaceC0026a
        public boolean d(e.b.g.a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new j(this.b, (e.i.e.a.b) menuItem));
        }

        public ActionMode e(e.b.g.a aVar) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.c.get(i2);
                if (eVar != null && eVar.b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.b, aVar);
            this.c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f1587d.getOrDefault(menu, null);
            if (orDefault == null) {
                o oVar = new o(this.b, (e.i.e.a.a) menu);
                this.f1587d.put(menu, oVar);
                return oVar;
            }
            return orDefault;
        }
    }

    public e(Context context, e.b.g.a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.a, (e.i.e.a.a) this.b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.b.f1577f;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.b.f1578g;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.b.f1577f = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.b.l(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.b.n(i2);
    }
}

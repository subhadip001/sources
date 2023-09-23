package e.b.g.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import e.i.j.d;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
/* loaded from: classes.dex */
public class j extends e.b.g.i.c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final e.i.e.a.b f1674d;

    /* renamed from: e  reason: collision with root package name */
    public Method f1675e;

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class a extends e.i.j.d {
        public final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        @Override // e.i.j.d
        public boolean a() {
            return this.b.hasSubMenu();
        }

        @Override // e.i.j.d
        public View c() {
            return this.b.onCreateActionView();
        }

        @Override // e.i.j.d
        public boolean e() {
            return this.b.onPerformDefaultAction();
        }

        @Override // e.i.j.d
        public void f(SubMenu subMenu) {
            this.b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public d.a f1676d;

        public b(j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // e.i.j.d
        public boolean b() {
            return this.b.isVisible();
        }

        @Override // e.i.j.d
        public View d(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        @Override // e.i.j.d
        public boolean g() {
            return this.b.overridesItemVisibility();
        }

        @Override // e.i.j.d
        public void h(d.a aVar) {
            this.f1676d = aVar;
            this.b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            d.a aVar = this.f1676d;
            if (aVar != null) {
                g gVar = i.this.n;
                gVar.f1655h = true;
                gVar.q(true);
            }
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public static class c extends FrameLayout implements e.b.g.b {

        /* renamed from: f  reason: collision with root package name */
        public final CollapsibleActionView f1677f;

        public c(View view) {
            super(view.getContext());
            this.f1677f = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // e.b.g.b
        public void c() {
            this.f1677f.onActionViewExpanded();
        }

        @Override // e.b.g.b
        public void e() {
            this.f1677f.onActionViewCollapsed();
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class d implements MenuItem.OnActionExpandListener {
        public final MenuItem.OnActionExpandListener a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    /* loaded from: classes.dex */
    public class e implements MenuItem.OnMenuItemClickListener {
        public final MenuItem.OnMenuItemClickListener a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, e.i.e.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f1674d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1674d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1674d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        e.i.j.d b2 = this.f1674d.b();
        if (b2 instanceof a) {
            return ((a) b2).b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1674d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f1677f : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1674d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1674d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1674d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1674d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1674d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1674d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1674d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1674d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1674d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1674d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1674d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1674d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1674d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f1674d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1674d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1674d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1674d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1674d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1674d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1674d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1674d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1674d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1674d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.a, actionProvider);
        e.i.e.a.b bVar2 = this.f1674d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f1674d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1674d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1674d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1674d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1674d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1674d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1674d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1674d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1674d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1674d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f1674d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1674d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1674d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1674d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i2) {
        this.f1674d.setShowAsAction(i2);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        this.f1674d.setShowAsActionFlags(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1674d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1674d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1674d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f1674d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1674d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f1674d.setIcon(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1674d.setNumericShortcut(c2, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1674d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f1674d.setTitle(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i2) {
        this.f1674d.setActionView(i2);
        View actionView = this.f1674d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1674d.setActionView(new c(actionView));
        }
        return this;
    }
}

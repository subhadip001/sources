package e.b.g.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionMenuItem.java */
/* loaded from: classes.dex */
public class a implements e.i.e.a.b {
    public CharSequence a;
    public CharSequence b;
    public Intent c;

    /* renamed from: d  reason: collision with root package name */
    public char f1605d;

    /* renamed from: f  reason: collision with root package name */
    public char f1607f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1609h;

    /* renamed from: i  reason: collision with root package name */
    public Context f1610i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1611j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1612k;

    /* renamed from: e  reason: collision with root package name */
    public int f1606e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f1608g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1613l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1614m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1610i = context;
        this.a = charSequence;
    }

    @Override // e.i.e.a.b
    public e.i.e.a.b a(e.i.j.d dVar) {
        throw new UnsupportedOperationException();
    }

    @Override // e.i.e.a.b
    public e.i.j.d b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1609h;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable l0 = e.i.a.l0(drawable);
                this.f1609h = l0;
                Drawable mutate = l0.mutate();
                this.f1609h = mutate;
                if (this.n) {
                    mutate.setTintList(this.f1613l);
                }
                if (this.o) {
                    this.f1609h.setTintMode(this.f1614m);
                }
            }
        }
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1608g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1607f;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1611j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1609h;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1613l;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1614m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1606e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1605d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1612k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1607f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.p = (z ? 1 : 0) | (this.p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.p = (z ? 2 : 0) | (this.p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1611j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.p = (z ? 16 : 0) | (this.p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1609h = drawable;
        c();
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1613l = colorStateList;
        this.n = true;
        c();
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1614m = mode;
        this.o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1605d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1605d = c;
        this.f1607f = Character.toLowerCase(c2);
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1612k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.p = (this.p & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i2) {
        this.f1607f = Character.toLowerCase(c);
        this.f1608g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public e.i.e.a.b setContentDescription(CharSequence charSequence) {
        this.f1611j = charSequence;
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i2) {
        this.f1605d = c;
        this.f1606e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.a = this.f1610i.getResources().getString(i2);
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public e.i.e.a.b setTooltipText(CharSequence charSequence) {
        this.f1612k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f1609h = e.i.c.a.getDrawable(this.f1610i, i2);
        c();
        return this;
    }

    @Override // e.i.e.a.b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i2, int i3) {
        this.f1605d = c;
        this.f1606e = KeyEvent.normalizeMetaState(i2);
        this.f1607f = Character.toLowerCase(c2);
        this.f1608g = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}

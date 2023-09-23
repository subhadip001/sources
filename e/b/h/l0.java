package e.b.h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public class l0 extends j0 implements k0 {
    public static Method J;
    public k0 I;

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a extends f0 {
        public final int s;
        public final int t;
        public k0 u;
        public MenuItem v;

        public a(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.s = 21;
                this.t = 22;
                return;
            }
            this.s = 22;
            this.t = 21;
        }

        @Override // e.b.h.f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            e.b.g.i.f fVar;
            int pointToPosition;
            int i3;
            if (this.u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    fVar = (e.b.g.i.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                    fVar = (e.b.g.i.f) adapter;
                }
                e.b.g.i.i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < fVar.getCount()) {
                    iVar = fVar.getItem(i3);
                }
                MenuItem menuItem = this.v;
                if (menuItem != iVar) {
                    e.b.g.i.g gVar = fVar.f1645f;
                    if (menuItem != null) {
                        this.u.f(gVar, menuItem);
                    }
                    this.v = iVar;
                    if (iVar != null) {
                        this.u.c(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            e.b.g.i.f fVar;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i2 == this.t) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    fVar = (e.b.g.i.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    fVar = (e.b.g.i.f) adapter;
                }
                fVar.f1645f.c(false);
                return true;
            } else {
                return super.onKeyDown(i2, keyEvent);
            }
        }

        public void setHoverListener(k0 k0Var) {
            this.u = k0Var;
        }

        @Override // e.b.h.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public l0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, i2, i3);
    }

    @Override // e.b.h.k0
    public void c(e.b.g.i.g gVar, MenuItem menuItem) {
        k0 k0Var = this.I;
        if (k0Var != null) {
            k0Var.c(gVar, menuItem);
        }
    }

    @Override // e.b.h.k0
    public void f(e.b.g.i.g gVar, MenuItem menuItem) {
        k0 k0Var = this.I;
        if (k0Var != null) {
            k0Var.f(gVar, menuItem);
        }
    }

    @Override // e.b.h.j0
    public f0 q(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import e.b.g.i.g;
import e.b.g.i.i;
import e.b.g.i.n;
import e.b.g.i.p;
import e.b.h.h0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: l  reason: collision with root package name */
    public i f109l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f110m;
    public Drawable n;
    public g.b o;
    public h0 p;
    public b q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public int v;

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // e.b.h.h0
        public p b() {
            ActionMenuPresenter.a aVar;
            b bVar = ActionMenuItemView.this.q;
            if (bVar == null || (aVar = ActionMenuPresenter.this.A) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // e.b.h.h0
        public boolean c() {
            p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.o;
            return bVar != null && bVar.a(actionMenuItemView.f109l) && (b = b()) != null && b.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.r = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.b.b.c, 0, 0);
        this.t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.u = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return c() && this.f109l.getIcon() == null;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // e.b.g.i.n.a
    public void d(i iVar, int i2) {
        this.f109l = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.p == null) {
            this.p = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f110m);
        if (this.n != null) {
            if (!((this.f109l.y & 4) == 4) || (!this.r && !this.s)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f110m : null);
        CharSequence charSequence = this.f109l.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f109l.f1665e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f109l.r;
        if (TextUtils.isEmpty(charSequence2)) {
            e.b.a.d(this, z3 ? null : this.f109l.f1665e);
        } else {
            e.b.a.d(this, charSequence2);
        }
    }

    @Override // e.b.g.i.n.a
    public i getItemData() {
        return this.f109l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.o;
        if (bVar != null) {
            bVar.a(this.f109l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r = e();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        boolean c = c();
        if (c && (i5 = this.u) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i4 = Math.min(size, this.t);
        } else {
            i4 = this.t;
        }
        if (mode != 1073741824 && this.t > 0 && measuredWidth < i4) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, CommonUtils.BYTES_IN_A_GIGABYTE), i3);
        }
        if (c || this.n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (this.f109l.hasSubMenu() && (h0Var = this.p) != null && h0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.s != z) {
            this.s = z;
            i iVar = this.f109l;
            if (iVar != null) {
                iVar.n.p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.v;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.o = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.u = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f110m = charSequence;
        f();
    }
}

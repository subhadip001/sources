package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import e.b.g.i.i;
import e.b.g.i.n;
import e.i.c.d.j;
import e.i.j.c;
import e.i.j.h0.d;
import e.i.j.z;
import f.h.b.c.s.h;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends h implements n.a {
    public static final int[] K = {16842912};
    public int A;
    public boolean B;
    public boolean C;
    public final CheckedTextView D;
    public FrameLayout E;
    public i F;
    public ColorStateList G;
    public boolean H;
    public Drawable I;
    public final c J;

    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
        }

        @Override // e.i.j.c
        public void d(View view, d dVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            dVar.a.setCheckable(NavigationMenuItemView.this.C);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.J = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        z.w(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.E == null) {
                this.E = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.E.removeAllViews();
            this.E.addView(view);
        }
    }

    @Override // e.b.g.i.n.a
    public void d(i iVar, int i2) {
        StateListDrawable stateListDrawable;
        this.F = iVar;
        int i3 = iVar.a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(K, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = z.a;
            z.d.q(this, stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.f1665e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.q);
        e.b.a.d(this, iVar.r);
        i iVar2 = this.F;
        if ((iVar2.f1665e == null && iVar2.getIcon() == null && this.F.getActionView() != null) ? false : false) {
            this.D.setVisibility(8);
            FrameLayout frameLayout = this.E;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.E.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.D.setVisibility(0);
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.E.setLayoutParams(aVar2);
        }
    }

    @Override // e.b.g.i.n.a
    public i getItemData() {
        return this.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.F;
        if (iVar != null && iVar.isCheckable() && this.F.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.C != z) {
            this.C = z;
            this.J.h(this.D, RecyclerView.a0.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.D.setChecked(z);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = e.i.a.l0(drawable).mutate();
                drawable.setTintList(this.G);
            }
            int i2 = this.A;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.B) {
            if (this.I == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = j.a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.I = drawable2;
                if (drawable2 != null) {
                    int i3 = this.A;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.I;
        }
        this.D.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.D.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.A = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.G = colorStateList;
        this.H = colorStateList != null;
        i iVar = this.F;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.D.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.B = z;
    }

    public void setTextAppearance(int i2) {
        e.i.a.b0(this.D, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.D.setText(charSequence);
    }
}

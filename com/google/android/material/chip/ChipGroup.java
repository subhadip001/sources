package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import f.h.b.c.s.g;
import f.h.b.c.s.r;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ChipGroup extends g {

    /* renamed from: j  reason: collision with root package name */
    public int f1137j;

    /* renamed from: k  reason: collision with root package name */
    public int f1138k;

    /* renamed from: l  reason: collision with root package name */
    public d f1139l;

    /* renamed from: m  reason: collision with root package name */
    public final f.h.b.c.s.b<Chip> f1140m;
    public final int n;
    public final e o;

    /* loaded from: classes.dex */
    public class a implements d {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(int i2, int i3) {
            super(i2, i3);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c {
        void a(ChipGroup chipGroup, int i2);
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f1141f;

        public e(f.h.b.c.l.d dVar) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    AtomicInteger atomicInteger = z.a;
                    view2.setId(z.e.a());
                }
                f.h.b.c.s.b<Chip> bVar = ChipGroup.this.f1140m;
                Chip chip = (Chip) view2;
                bVar.a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new f.h.b.c.s.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1141f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                f.h.b.c.s.b<Chip> bVar = chipGroup.f1140m;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(bVar);
                chip.setInternalOnCheckedChangeListener(null);
                bVar.a.remove(Integer.valueOf(chip.getId()));
                bVar.b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1141f;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.chipGroupStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_ChipGroup), attributeSet, R.attr.chipGroupStyle);
        f.h.b.c.s.b<Chip> bVar = new f.h.b.c.s.b<>();
        this.f1140m = bVar;
        e eVar = new e(null);
        this.o = eVar;
        TypedArray d2 = r.d(getContext(), attributeSet, f.h.b.c.b.f5154g, R.attr.chipGroupStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = d2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d2.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d2.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d2.getBoolean(5, false));
        setSingleSelection(d2.getBoolean(6, false));
        setSelectionRequired(d2.getBoolean(4, false));
        this.n = d2.getResourceId(0, -1);
        d2.recycle();
        bVar.c = new f.h.b.c.l.d(this);
        super.setOnHierarchyChangeListener(eVar);
        AtomicInteger atomicInteger = z.a;
        z.d.s(this, 1);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    @Override // f.h.b.c.s.g
    public boolean a() {
        return this.f5411h;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f1140m.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f1140m.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f1137j;
    }

    public int getChipSpacingVertical() {
        return this.f1138k;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.n;
        if (i2 != -1) {
            f.h.b.c.s.b<Chip> bVar = this.f1140m;
            Chip chip = bVar.a.get(Integer.valueOf(i2));
            if (chip != null && bVar.a(chip)) {
                bVar.d();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(getRowCount(), this.f5411h ? getChipCount() : -1, false, this.f1140m.f5396d ? 1 : 2).a);
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f1137j != i2) {
            this.f1137j = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f1138k != i2) {
            this.f1138k = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f1139l = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.o.f1141f = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f1140m.f5397e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // f.h.b.c.s.g
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        f.h.b.c.s.b<Chip> bVar = this.f1140m;
        if (bVar.f5396d != z) {
            bVar.f5396d = z;
            boolean z2 = !bVar.b.isEmpty();
            for (Chip chip : bVar.a.values()) {
                bVar.e(chip, false);
            }
            if (z2) {
                bVar.d();
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}

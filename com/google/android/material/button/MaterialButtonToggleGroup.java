package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.video_converter.video_compressor.R;
import e.i.j.h0.d;
import e.i.j.z;
import f.h.b.c.s.r;
import f.h.b.c.y.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String p = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f1113f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1114g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashSet<d> f1115h;

    /* renamed from: i  reason: collision with root package name */
    public final Comparator<MaterialButton> f1116i;

    /* renamed from: j  reason: collision with root package name */
    public Integer[] f1117j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1118k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1119l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1120m;
    public final int n;
    public Set<Integer> o;

    /* loaded from: classes.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes.dex */
    public class b extends e.i.j.c {
        public b() {
        }

        @Override // e.i.j.c
        public void d(View view, e.i.j.h0.d dVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.p;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i2 = -1;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i2 = i4;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.d(i3)) {
                            i4++;
                        }
                        i3++;
                    }
                }
            }
            dVar.n(d.c.a(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final f.h.b.c.y.c f1123e = new f.h.b.c.y.a(0.0f);
        public f.h.b.c.y.c a;
        public f.h.b.c.y.c b;
        public f.h.b.c.y.c c;

        /* renamed from: d  reason: collision with root package name */
        public f.h.b.c.y.c f1124d;

        public c(f.h.b.c.y.c cVar, f.h.b.c.y.c cVar2, f.h.b.c.y.c cVar3, f.h.b.c.y.c cVar4) {
            this.a = cVar;
            this.b = cVar3;
            this.c = cVar4;
            this.f1124d = cVar2;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z);
    }

    /* loaded from: classes.dex */
    public class e implements MaterialButton.b {
        public e(a aVar) {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(f.h.b.c.c0.a.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f1113f = new ArrayList();
        this.f1114g = new e(null);
        this.f1115h = new LinkedHashSet<>();
        this.f1116i = new a();
        this.f1118k = false;
        this.o = new HashSet();
        TypedArray d2 = r.d(getContext(), attributeSet, f.h.b.c.b.q, R.attr.materialButtonToggleGroupStyle, com.arthenica.ffmpegkit.R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(d2.getBoolean(2, false));
        this.n = d2.getResourceId(0, -1);
        this.f1120m = d2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d2.recycle();
        AtomicInteger atomicInteger = z.a;
        z.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            AtomicInteger atomicInteger = z.a;
            materialButton.setId(z.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f1114g);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
            MaterialButton c2 = c(i2);
            int min = Math.min(c2.getStrokeWidth(), c(i2 - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = c2.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(-min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                layoutParams.setMarginStart(0);
            }
            c2.setLayoutParams(layoutParams);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            return;
        }
        layoutParams3.setMarginEnd(0);
        layoutParams3.setMarginStart(0);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(p, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f1113f.add(new c(shapeAppearanceModel.f5500e, shapeAppearanceModel.f5503h, shapeAppearanceModel.f5501f, shapeAppearanceModel.f5502g));
        z.w(materialButton, new b());
    }

    public final void b(int i2, boolean z) {
        if (i2 == -1) {
            String str = p;
            Log.e(str, "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.o);
        if (z && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f1119l && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (z || !hashSet.contains(Integer.valueOf(i2))) {
            return;
        } else {
            if (!this.f1120m || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        }
        e(hashSet);
    }

    public final MaterialButton c(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean d(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f1116i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(c(i2), Integer.valueOf(i2));
        }
        this.f1117j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        Set<Integer> set2 = this.o;
        this.o = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = c(i2).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1118k = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1118k = false;
            }
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f1115h.iterator();
                while (it.hasNext()) {
                    it.next().a(this, id, contains2);
                }
            }
        }
        invalidate();
    }

    public void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton c2 = c(i2);
            if (c2.getVisibility() != 8) {
                j shapeAppearanceModel = c2.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                j.b bVar = new j.b(shapeAppearanceModel);
                c cVar2 = this.f1113f.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i2 == firstVisibleChildIndex) {
                        if (z) {
                            if (f.h.b.c.a.y0(this)) {
                                f.h.b.c.y.c cVar3 = c.f1123e;
                                cVar = new c(cVar3, cVar3, cVar2.b, cVar2.c);
                            } else {
                                f.h.b.c.y.c cVar4 = cVar2.a;
                                f.h.b.c.y.c cVar5 = cVar2.f1124d;
                                f.h.b.c.y.c cVar6 = c.f1123e;
                                cVar = new c(cVar4, cVar5, cVar6, cVar6);
                            }
                        } else {
                            f.h.b.c.y.c cVar7 = cVar2.a;
                            f.h.b.c.y.c cVar8 = c.f1123e;
                            cVar = new c(cVar7, cVar8, cVar2.b, cVar8);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (z) {
                        if (f.h.b.c.a.y0(this)) {
                            f.h.b.c.y.c cVar9 = cVar2.a;
                            f.h.b.c.y.c cVar10 = cVar2.f1124d;
                            f.h.b.c.y.c cVar11 = c.f1123e;
                            cVar = new c(cVar9, cVar10, cVar11, cVar11);
                        } else {
                            f.h.b.c.y.c cVar12 = c.f1123e;
                            cVar = new c(cVar12, cVar12, cVar2.b, cVar2.c);
                        }
                    } else {
                        f.h.b.c.y.c cVar13 = c.f1123e;
                        cVar = new c(cVar13, cVar2.f1124d, cVar13, cVar2.c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.f5509e = cVar2.a;
                    bVar.f5512h = cVar2.f1124d;
                    bVar.f5510f = cVar2.b;
                    bVar.f5511g = cVar2.c;
                }
                c2.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f1119l || this.o.isEmpty()) {
            return -1;
        }
        return this.o.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = c(i2).getId();
            if (this.o.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f1117j;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w(p, "Child order wasn't updated");
        return i3;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.n;
        if (i2 != -1) {
            e(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, getVisibleButtonCount(), false, this.f1119l ? 1 : 2).a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        f();
        a();
        super.onMeasure(i2, i3);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f1113f.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.f1120m = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f1119l != z) {
            this.f1119l = z;
            e(new HashSet());
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}

package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.video_converter.video_compressor.R;
import e.i.j.z;
import f.h.b.c.c.g;
import f.h.b.c.c.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public Map<View, Integer> f1263i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean C(View view, View view2, boolean z, boolean z2) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f1263i = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z3 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z3) {
                    if (!z) {
                        Map<View, Integer> map = this.f1263i;
                        if (map != null && map.containsKey(childAt)) {
                            int intValue = this.f1263i.get(childAt).intValue();
                            AtomicInteger atomicInteger = z.a;
                            z.d.s(childAt, intValue);
                        }
                    } else {
                        this.f1263i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        AtomicInteger atomicInteger2 = z.a;
                        z.d.s(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f1263i = null;
            }
        }
        super.C(view, view2, z, z2);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.b N(Context context, boolean z) {
        int i2 = z ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.a = g.b(context, i2);
        bVar.b = new i(17, 0.0f, 0.0f);
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

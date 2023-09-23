package e.g.c;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.arthenica.ffmpegkit.Chapter;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class a extends View {

    /* renamed from: f  reason: collision with root package name */
    public int[] f2113f;

    /* renamed from: g  reason: collision with root package name */
    public int f2114g;

    /* renamed from: h  reason: collision with root package name */
    public Context f2115h;

    /* renamed from: i  reason: collision with root package name */
    public e.g.a.h.e f2116i;

    /* renamed from: j  reason: collision with root package name */
    public String f2117j;

    /* renamed from: k  reason: collision with root package name */
    public String f2118k;

    /* renamed from: l  reason: collision with root package name */
    public View[] f2119l;

    /* renamed from: m  reason: collision with root package name */
    public HashMap<Integer, String> f2120m;

    public a(Context context) {
        super(context);
        this.f2113f = new int[32];
        this.f2119l = null;
        this.f2120m = new HashMap<>();
        this.f2115h = context;
        j(null);
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f2115h == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout2 != null) {
            Object c = constraintLayout2.c(0, trim);
            if (c instanceof Integer) {
                i2 = ((Integer) c).intValue();
            }
        }
        if (i2 == 0 && constraintLayout2 != null) {
            i2 = i(constraintLayout2, trim);
        }
        if (i2 == 0) {
            try {
                i2 = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i2 == 0) {
            i2 = this.f2115h.getResources().getIdentifier(trim, Chapter.KEY_ID, this.f2115h.getPackageName());
        }
        if (i2 != 0) {
            this.f2120m.put(Integer.valueOf(i2), trim);
            d(i2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void d(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f2114g + 1;
        int[] iArr = this.f2113f;
        if (i3 > iArr.length) {
            this.f2113f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2113f;
        int i4 = this.f2114g;
        iArr2[i4] = i2;
        this.f2114g = i4 + 1;
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f2115h == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    StringBuilder A = f.a.b.a.a.A("to use ConstraintTag view ");
                    A.append(childAt.getClass().getSimpleName());
                    A.append(" must have an ID");
                    Log.w("ConstraintHelper", A.toString());
                } else {
                    d(childAt.getId());
                }
            }
        }
    }

    public void f() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        g((ConstraintLayout) parent);
    }

    public void g(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f2114g; i2++) {
            View d2 = constraintLayout.d(this.f2113f[i2]);
            if (d2 != null) {
                d2.setVisibility(visibility);
                if (elevation > 0.0f) {
                    d2.setTranslationZ(d2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2113f, this.f2114g);
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public final int i(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2115h.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void j(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2117j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2118k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void k(ConstraintWidget constraintWidget, boolean z) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
        if (this.f2116i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).q0 = (ConstraintWidget) this.f2116i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2117j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2118k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f2117j = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f2114g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                c(str.substring(i2));
                return;
            } else {
                c(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2118k = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f2114g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                e(str.substring(i2));
                return;
            } else {
                e(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2117j = null;
        this.f2114g = 0;
        for (int i2 : iArr) {
            d(i2);
        }
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f2117j == null) {
            d(i2);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2113f = new int[32];
        this.f2119l = null;
        this.f2120m = new HashMap<>();
        this.f2115h = context;
        j(attributeSet);
    }
}

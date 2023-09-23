package e.b.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f1701l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1702m = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Field> n = new ConcurrentHashMap<>();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1703d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1704e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1705f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1706g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1707h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1708i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1709j;

    /* renamed from: k  reason: collision with root package name */
    public final c f1710k;

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // e.b.h.a0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) a0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // e.b.h.a0.a, e.b.h.a0.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // e.b.h.a0.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* compiled from: AppCompatTextViewAutoSizeHelper.java */
    /* loaded from: classes.dex */
    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) a0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public a0(TextView textView) {
        this.f1708i = textView;
        this.f1709j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.f1710k = new b();
        } else if (i2 >= 23) {
            this.f1710k = new a();
        } else {
            this.f1710k = new c();
        }
    }

    public static Method d(String str) {
        try {
            Method method = f1702m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1702m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public void a() {
        if (i() && this.a != 0) {
            if (this.b) {
                if (this.f1708i.getMeasuredHeight() <= 0 || this.f1708i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1710k.b(this.f1708i) ? CommonUtils.BYTES_IN_A_MEGABYTE : (this.f1708i.getMeasuredWidth() - this.f1708i.getTotalPaddingLeft()) - this.f1708i.getTotalPaddingRight();
                int height = (this.f1708i.getHeight() - this.f1708i.getCompoundPaddingBottom()) - this.f1708i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1701l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c2 = c(rectF);
                    if (c2 != this.f1708i.getTextSize()) {
                        f(0, c2);
                    }
                }
            }
            this.b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0104, code lost:
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(android.graphics.RectF r21) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.a0.c(android.graphics.RectF):int");
    }

    public void f(int i2, float f2) {
        Resources resources;
        Context context = this.f1709j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics());
        if (applyDimension != this.f1708i.getPaint().getTextSize()) {
            this.f1708i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f1708i.isInLayout();
            if (this.f1708i.getLayout() != null) {
                this.b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.f1708i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f1708i.requestLayout();
                } else {
                    this.f1708i.forceLayout();
                }
                this.f1708i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.a == 1) {
            if (!this.f1706g || this.f1705f.length == 0) {
                int floor = ((int) Math.floor((this.f1704e - this.f1703d) / this.c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.c) + this.f1703d);
                }
                this.f1705f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final boolean h() {
        int[] iArr = this.f1705f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1706g = z;
        if (z) {
            this.a = 1;
            this.f1703d = iArr[0];
            this.f1704e = iArr[length - 1];
            this.c = -1.0f;
        }
        return z;
    }

    public final boolean i() {
        return !(this.f1708i instanceof j);
    }

    public final void j(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.f1703d = f2;
            this.f1704e = f3;
            this.c = f4;
            this.f1706g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}

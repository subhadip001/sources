package e.b.h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import java.lang.reflect.Field;

/* compiled from: DropDownListView.java */
/* loaded from: classes.dex */
public class f0 extends ListView {

    /* renamed from: f  reason: collision with root package name */
    public final Rect f1762f;

    /* renamed from: g  reason: collision with root package name */
    public int f1763g;

    /* renamed from: h  reason: collision with root package name */
    public int f1764h;

    /* renamed from: i  reason: collision with root package name */
    public int f1765i;

    /* renamed from: j  reason: collision with root package name */
    public int f1766j;

    /* renamed from: k  reason: collision with root package name */
    public int f1767k;

    /* renamed from: l  reason: collision with root package name */
    public Field f1768l;

    /* renamed from: m  reason: collision with root package name */
    public a f1769m;
    public boolean n;
    public boolean o;
    public boolean p;
    public e.i.k.d q;
    public b r;

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public static class a extends e.b.d.a.c {

        /* renamed from: g  reason: collision with root package name */
        public boolean f1770g;

        public a(Drawable drawable) {
            super(drawable);
            this.f1770g = true;
        }

        @Override // e.b.d.a.c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1770g) {
                this.f1565f.draw(canvas);
            }
        }

        @Override // e.b.d.a.c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1770g) {
                this.f1565f.setHotspot(f2, f3);
            }
        }

        @Override // e.b.d.a.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1770g) {
                this.f1565f.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // e.b.d.a.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1770g) {
                return this.f1565f.setState(iArr);
            }
            return false;
        }

        @Override // e.b.d.a.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1770g) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0 f0Var = f0.this;
            f0Var.r = null;
            f0Var.drawableStateChanged();
        }
    }

    public f0(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1762f = new Rect();
        this.f1763g = 0;
        this.f1764h = 0;
        this.f1765i = 0;
        this.f1766j = 0;
        this.o = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1768l = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f1769m;
        if (aVar != null) {
            aVar.f1770g = z;
        }
    }

    public int a(int i2, int i3, int i4) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            if (i9 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, CommonUtils.BYTES_IN_A_GIGABYTE);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, makeMeasureSpec);
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.f0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.p && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1762f.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1762f);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.r != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.o || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.o || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.o || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.o && this.n) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.r = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.r == null) {
            b bVar = new b();
            this.r = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1767k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.r;
        if (bVar != null) {
            f0 f0Var = f0.this;
            f0Var.r = null;
            f0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.n = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1769m = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1763g = rect.left;
        this.f1764h = rect.top;
        this.f1765i = rect.right;
        this.f1766j = rect.bottom;
    }
}

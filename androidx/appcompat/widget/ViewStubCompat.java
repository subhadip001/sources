package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.b.b;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: f  reason: collision with root package name */
    public int f246f;

    /* renamed from: g  reason: collision with root package name */
    public int f247g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference<View> f248h;

    /* renamed from: i  reason: collision with root package name */
    public LayoutInflater f249i;

    /* renamed from: j  reason: collision with root package name */
    public a f250j;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f246f = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.C, 0, 0);
        this.f247g = obtainStyledAttributes.getResourceId(2, -1);
        this.f246f = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f246f != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f249i;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f246f, viewGroup, false);
                int i2 = this.f247g;
                if (i2 != -1) {
                    inflate.setId(i2);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f248h = new WeakReference<>(inflate);
                a aVar = this.f250j;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f247g;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f249i;
    }

    public int getLayoutResource() {
        return this.f246f;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f247g = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f249i = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f246f = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f250j = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f248h;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }
}

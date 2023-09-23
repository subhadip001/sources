package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import e.b.c.n;
import e.b.c.p;
import e.b.g.i.g;
import e.b.h.c0;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f188f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f189g;

    /* renamed from: h  reason: collision with root package name */
    public TypedValue f190h;

    /* renamed from: i  reason: collision with root package name */
    public TypedValue f191i;

    /* renamed from: j  reason: collision with root package name */
    public TypedValue f192j;

    /* renamed from: k  reason: collision with root package name */
    public TypedValue f193k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f194l;

    /* renamed from: m  reason: collision with root package name */
    public a f195m;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f194l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f192j == null) {
            this.f192j = new TypedValue();
        }
        return this.f192j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f193k == null) {
            this.f193k = new TypedValue();
        }
        return this.f193k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f190h == null) {
            this.f190h = new TypedValue();
        }
        return this.f190h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f191i == null) {
            this.f191i = new TypedValue();
        }
        return this.f191i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f188f == null) {
            this.f188f = new TypedValue();
        }
        return this.f188f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f189g == null) {
            this.f189g = new TypedValue();
        }
        return this.f189g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f195m;
        if (aVar != null) {
            Objects.requireNonNull((p) aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f195m;
        if (aVar != null) {
            n nVar = ((p) aVar).a;
            c0 c0Var = nVar.q;
            if (c0Var != null) {
                c0Var.i();
            }
            if (nVar.v != null) {
                nVar.f1485k.getDecorView().removeCallbacks(nVar.w);
                if (nVar.v.isShowing()) {
                    try {
                        nVar.v.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                nVar.v = null;
            }
            nVar.M();
            g gVar = nVar.S(0).f1498h;
            if (gVar != null) {
                gVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f195m = aVar;
    }
}

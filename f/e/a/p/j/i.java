package f.e.a.p.j;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.video_converter.video_compressor.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: ViewTarget.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends f.e.a.p.j.a<Z> {

    /* renamed from: f  reason: collision with root package name */
    public final T f3593f;

    /* renamed from: g  reason: collision with root package name */
    public final a f3594g;

    /* compiled from: ViewTarget.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        public static Integer f3595d;
        public final View a;
        public final List<g> b = new ArrayList();
        public ViewTreeObserver$OnPreDrawListenerC0090a c;

        /* compiled from: ViewTarget.java */
        /* renamed from: f.e.a.p.j.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC0090a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: f  reason: collision with root package name */
            public final WeakReference<a> f3596f;

            public ViewTreeObserver$OnPreDrawListenerC0090a(a aVar) {
                this.f3596f = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f3596f.get();
                if (aVar == null || aVar.b.isEmpty()) {
                    return true;
                }
                int d2 = aVar.d();
                int c = aVar.c();
                if (aVar.e(d2, c)) {
                    Iterator it = new ArrayList(aVar.b).iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).b(d2, c);
                    }
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            this.c = null;
            this.b.clear();
        }

        public final int b(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.a.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.a.getContext();
            if (f3595d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f3595d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f3595d.intValue();
        }

        public final int c() {
            int paddingBottom = this.a.getPaddingBottom() + this.a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return b(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.a.getPaddingRight() + this.a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return b(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i2, int i3) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                if (i3 > 0 || i3 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }
    }

    public i(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f3593f = t;
        this.f3594g = new a(t);
    }

    @Override // f.e.a.p.j.h
    public f.e.a.p.d getRequest() {
        Object tag = this.f3593f.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof f.e.a.p.d) {
                return (f.e.a.p.d) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // f.e.a.p.j.h
    public void getSize(g gVar) {
        a aVar = this.f3594g;
        int d2 = aVar.d();
        int c = aVar.c();
        if (aVar.e(d2, c)) {
            ((f.e.a.p.h) gVar).b(d2, c);
            return;
        }
        if (!aVar.b.contains(gVar)) {
            aVar.b.add(gVar);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
            a.ViewTreeObserver$OnPreDrawListenerC0090a viewTreeObserver$OnPreDrawListenerC0090a = new a.ViewTreeObserver$OnPreDrawListenerC0090a(aVar);
            aVar.c = viewTreeObserver$OnPreDrawListenerC0090a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0090a);
        }
    }

    @Override // f.e.a.p.j.h
    public void removeCallback(g gVar) {
        this.f3594g.b.remove(gVar);
    }

    @Override // f.e.a.p.j.h
    public void setRequest(f.e.a.p.d dVar) {
        this.f3593f.setTag(R.id.glide_custom_view_target_tag, dVar);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("Target for: ");
        A.append(this.f3593f);
        return A.toString();
    }
}

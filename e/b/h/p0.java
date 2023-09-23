package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.video_converter.video_compressor.R;
import e.b.h.i;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: i  reason: collision with root package name */
    public static p0 f1821i;
    public WeakHashMap<Context, e.f.i<ColorStateList>> a;
    public e.f.h<String, e> b;
    public e.f.i<String> c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, e.f.e<WeakReference<Drawable.ConstantState>>> f1823d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1824e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1825f;

    /* renamed from: g  reason: collision with root package name */
    public f f1826g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1820h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final c f1822j = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        @Override // e.b.h.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.b.d.a.a.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        @Override // e.b.h.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                e.b0.a.a.b bVar = new e.b0.a.a.b(context, null, null);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends e.f.f<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class d implements e {
        @Override // e.b.h.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    e.b.e.b.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e2) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface f {
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        @Override // e.b.h.p0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return e.b0.a.a.f.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static synchronized p0 d() {
        p0 p0Var;
        synchronized (p0.class) {
            if (f1821i == null) {
                p0 p0Var2 = new p0();
                f1821i = p0Var2;
                j(p0Var2);
            }
            p0Var = f1821i;
        }
        return p0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (p0.class) {
            c cVar = f1822j;
            Objects.requireNonNull(cVar);
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = cVar.get(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(cVar);
                cVar.put(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(p0 p0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            p0Var.a("vector", new g());
            p0Var.a("animated-vector", new b());
            p0Var.a("animated-selector", new a());
            p0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.b == null) {
            this.b = new e.f.h<>();
        }
        this.b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            e.f.e<WeakReference<Drawable.ConstantState>> eVar = this.f1823d.get(context);
            if (eVar == null) {
                eVar = new e.f.e<>();
                this.f1823d.put(context, eVar);
            }
            eVar.j(j2, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    public final Drawable c(Context context, int i2) {
        if (this.f1824e == null) {
            this.f1824e = new TypedValue();
        }
        TypedValue typedValue = this.f1824e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        f fVar = this.f1826g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            i.a aVar = (i.a) fVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawable = aVar.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        e.f.e<WeakReference<Drawable.ConstantState>> eVar = this.f1823d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g2 = eVar.g(j2, null);
        if (g2 != null) {
            Drawable.ConstantState constantState = g2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            eVar.k(j2);
        }
        return null;
    }

    public synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable k2;
        if (!this.f1825f) {
            boolean z2 = true;
            this.f1825f = true;
            Drawable f2 = f(context, R.drawable.abc_vector_test);
            if (f2 != null) {
                if (!(f2 instanceof e.b0.a.a.f) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f1825f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        k2 = k(context, i2);
        if (k2 == null) {
            k2 = c(context, i2);
        }
        if (k2 == null) {
            k2 = e.i.c.a.getDrawable(context, i2);
        }
        if (k2 != null) {
            k2 = l(context, i2, z, k2);
        }
        if (k2 != null) {
            e0.b(k2);
        }
        return k2;
    }

    public synchronized ColorStateList i(Context context, int i2) {
        ColorStateList d2;
        e.f.i<ColorStateList> iVar;
        WeakHashMap<Context, e.f.i<ColorStateList>> weakHashMap = this.a;
        ColorStateList colorStateList = null;
        d2 = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.d(i2, null);
        if (d2 == null) {
            f fVar = this.f1826g;
            if (fVar != null) {
                colorStateList = ((i.a) fVar).d(context, i2);
            }
            if (colorStateList != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                e.f.i<ColorStateList> iVar2 = this.a.get(context);
                if (iVar2 == null) {
                    iVar2 = new e.f.i<>();
                    this.a.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList);
            }
            d2 = colorStateList;
        }
        return d2;
    }

    public final Drawable k(Context context, int i2) {
        int next;
        e.f.h<String, e> hVar = this.b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        e.f.i<String> iVar = this.c;
        if (iVar != null) {
            String d2 = iVar.d(i2, null);
            if ("appcompat_skip_skip".equals(d2) || (d2 != null && this.b.getOrDefault(d2, null) == null)) {
                return null;
            }
        } else {
            this.c = new e.f.i<>();
        }
        if (this.f1824e == null) {
            this.f1824e = new TypedValue();
        }
        TypedValue typedValue = this.f1824e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.c.a(i2, name);
                    e eVar = this.b.get(name);
                    if (eVar != null) {
                        e2 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (e2 != null) {
                        e2.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, j2, e2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (e2 == null) {
            this.c.a(i2, "appcompat_skip_skip");
        }
        return e2;
    }

    public final Drawable l(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList i3 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i3 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable l0 = e.i.a.l0(drawable);
            l0.setTintList(i3);
            f fVar = this.f1826g;
            if (fVar != null) {
                i.a aVar = (i.a) fVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode != null) {
                l0.setTintMode(mode);
                return l0;
            }
            return l0;
        }
        f fVar2 = this.f1826g;
        if (fVar2 != null) {
            i.a aVar2 = (i.a) fVar2;
            Objects.requireNonNull(aVar2);
            boolean z2 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = u0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = i.b;
                aVar2.e(findDrawableByLayerId, c2, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), u0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), u0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = u0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = i.b;
                aVar2.e(findDrawableByLayerId2, b2, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), u0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), u0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            e.b.h.p0$f r0 = r7.f1826g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            e.b.h.i$a r0 = (e.b.h.i.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = e.b.h.i.b
            int[] r4 = r0.a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1d
            r5 = 2130968812(0x7f0400ec, float:1.7546288E38)
            goto L49
        L1d:
            int[] r4 = r0.c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L29
            r5 = 2130968810(0x7f0400ea, float:1.7546284E38)
            goto L49
        L29:
            int[] r4 = r0.f1788d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L49
        L34:
            r0 = 2131230815(0x7f08005f, float:1.8077693E38)
            if (r9 != r0) goto L44
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L4b
        L44:
            r0 = 2131230797(0x7f08004d, float:1.8077657E38)
            if (r9 != r0) goto L4d
        L49:
            r9 = r5
            r0 = -1
        L4b:
            r4 = 1
            goto L50
        L4d:
            r9 = 0
            r0 = -1
            r4 = 0
        L50:
            if (r4 == 0) goto L6e
            boolean r4 = e.b.h.e0.a(r10)
            if (r4 == 0) goto L5c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5c:
            int r8 = e.b.h.u0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = e.b.h.i.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6c
            r10.setAlpha(r0)
        L6c:
            r8 = 1
            goto L6f
        L6e:
            r8 = 0
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = 0
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.p0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}

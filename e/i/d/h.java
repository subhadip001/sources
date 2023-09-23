package e.i.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2457g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f2458h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f2459i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f2460j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f2461k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f2462l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f2463m;

    public h() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = n(cls2);
            method4 = o(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder A = f.a.b.a.a.A("Unable to collect necessary methods for class ");
            A.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", A.toString(), e2);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2457g = cls;
        this.f2458h = constructor;
        this.f2459i = method3;
        this.f2460j = method4;
        this.f2461k = method5;
        this.f2462l = method2;
        this.f2463m = method;
    }

    private Object m() {
        try {
            return this.f2458h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e.i.d.f, e.i.d.l
    public Typeface a(Context context, e.i.c.d.f fVar, Resources resources, int i2) {
        e.i.c.d.g[] gVarArr;
        if (!l()) {
            return super.a(context, fVar, resources, i2);
        }
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        for (e.i.c.d.g gVar : fVar.a) {
            if (!i(context, m2, gVar.a, gVar.f2435e, gVar.b, gVar.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.f2434d))) {
                h(m2);
                return null;
            }
        }
        if (k(m2)) {
            return j(m2);
        }
        return null;
    }

    @Override // e.i.d.f, e.i.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.i.g.l[] lVarArr, int i2) {
        Typeface j2;
        boolean z;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            e.i.g.l lVar = (e.i.g.l) l.e(lVarArr, i2, new k(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(lVar.a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(lVar.c).setItalic(lVar.f2489d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (e.i.g.l lVar2 : lVarArr) {
            if (lVar2.f2490e == 0) {
                Uri uri = lVar2.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, e.i.a.P(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        boolean z2 = false;
        for (e.i.g.l lVar3 : lVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar3.a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.f2460j.invoke(m2, byteBuffer, Integer.valueOf(lVar3.b), null, Integer.valueOf(lVar3.c), Integer.valueOf(lVar3.f2489d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    h(m2);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            h(m2);
            return null;
        } else if (k(m2) && (j2 = j(m2)) != null) {
            return Typeface.create(j2, i2);
        } else {
            return null;
        }
    }

    @Override // e.i.d.l
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!l()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        if (!i(context, m2, str, 0, -1, -1, null)) {
            h(m2);
            return null;
        } else if (k(m2)) {
            return j(m2);
        } else {
            return null;
        }
    }

    public final void h(Object obj) {
        try {
            this.f2462l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2459i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2457g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2463m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f2461k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f2459i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2459i != null;
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

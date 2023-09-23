package e.i.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
public class g extends l {
    public static final Class<?> b;
    public static final Constructor<?> c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f2455d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f2456e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        f2455d = method2;
        f2456e = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) f2455d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2456e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // e.i.d.l
    public Typeface a(Context context, e.i.c.d.f fVar, Resources resources, int i2) {
        Object obj;
        e.i.c.d.g[] gVarArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (e.i.c.d.g gVar : fVar.a) {
            int i3 = gVar.f2436f;
            File E = e.i.a.E(context);
            if (E != null) {
                try {
                    if (e.i.a.q(E, resources, i3)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(E);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !f(obj, mappedByteBuffer, gVar.f2435e, gVar.b, gVar.c)) {
                            return null;
                        }
                    }
                } finally {
                    E.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return g(obj);
    }

    @Override // e.i.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.i.g.l[] lVarArr, int i2) {
        Object obj;
        try {
            obj = c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        e.f.h hVar = new e.f.h();
        for (e.i.g.l lVar : lVarArr) {
            Uri uri = lVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = e.i.a.P(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !f(obj, byteBuffer, lVar.b, lVar.c, lVar.f2489d)) {
                return null;
            }
        }
        Typeface g2 = g(obj);
        if (g2 == null) {
            return null;
        }
        return Typeface.create(g2, i2);
    }
}

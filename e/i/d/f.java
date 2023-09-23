package e.i.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class f extends l {
    public static Class<?> b = null;
    public static Constructor<?> c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f2452d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f2453e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2454f = false;

    public static boolean f(Object obj, String str, int i2, boolean z) {
        g();
        try {
            return ((Boolean) f2452d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2454f) {
            return;
        }
        f2454f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        f2452d = method2;
        f2453e = method;
    }

    @Override // e.i.d.l
    public Typeface a(Context context, e.i.c.d.f fVar, Resources resources, int i2) {
        e.i.c.d.g[] gVarArr;
        g();
        try {
            Object newInstance = c.newInstance(new Object[0]);
            for (e.i.c.d.g gVar : fVar.a) {
                File E = e.i.a.E(context);
                if (E == null) {
                    return null;
                }
                try {
                    if (!e.i.a.q(E, resources, gVar.f2436f)) {
                        return null;
                    }
                    if (!f(newInstance, E.getPath(), gVar.b, gVar.c)) {
                        return null;
                    }
                    E.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    E.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2453e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // e.i.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.i.g.l[] lVarArr, int i2) {
        File file;
        String readlink;
        if (lVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(((e.i.g.l) l.e(lVarArr, i2, new k(this))).a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface c2 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c2;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface c22 = c(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return c22;
        } catch (IOException unused2) {
            return null;
        }
    }
}

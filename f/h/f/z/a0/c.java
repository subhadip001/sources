package f.h.f.z.a0;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* compiled from: UnsafeReflectionAccessor.java */
/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f6245d;
    public final Object b;
    public final Field c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f6245d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.c = field;
    }

    @Override // f.h.f.z.a0.b
    public void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (this.b != null && this.c != null) {
            try {
                f6245d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject, Long.valueOf(((Long) f6245d.getMethod("objectFieldOffset", Field.class).invoke(this.b, this.c)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}

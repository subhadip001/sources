package f.h.f.z;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: ConstructorConstructor.java */
/* loaded from: classes2.dex */
public class f<T> implements t<T> {
    public final y a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ Type c;

    public f(g gVar, Class cls, Type type) {
        y xVar;
        this.b = cls;
        this.c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            xVar = new u(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    xVar = new v(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    xVar = new x();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                xVar = new w(declaredMethod3);
            }
        }
        this.a = xVar;
    }

    @Override // f.h.f.z.t
    public T a() {
        try {
            return (T) this.a.b(this.b);
        } catch (Exception e2) {
            StringBuilder A = f.a.b.a.a.A("Unable to invoke no-args constructor for ");
            A.append(this.c);
            A.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(A.toString(), e2);
        }
    }
}

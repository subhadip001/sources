package f.h.f.z;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public class v extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ int b;

    public v(Method method, int i2) {
        this.a = method;
        this.b = i2;
    }

    @Override // f.h.f.z.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}

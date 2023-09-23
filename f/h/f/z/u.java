package f.h.f.z;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public class u extends y {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public u(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // f.h.f.z.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.a.invoke(this.b, cls);
    }
}

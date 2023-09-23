package f.h.f.z;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator.java */
/* loaded from: classes2.dex */
public class w extends y {
    public final /* synthetic */ Method a;

    public w(Method method) {
        this.a = method;
    }

    @Override // f.h.f.z.y
    public <T> T b(Class<T> cls) {
        y.a(cls);
        return (T) this.a.invoke(null, cls, Object.class);
    }
}

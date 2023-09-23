package m.a.a;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: SubscriberMethod.java */
/* loaded from: classes2.dex */
public class n {
    public final Method a;
    public final ThreadMode b;
    public final Class<?> c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9288d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9289e;

    /* renamed from: f  reason: collision with root package name */
    public String f9290f;

    public n(Method method, Class<?> cls, ThreadMode threadMode, int i2, boolean z) {
        this.a = method;
        this.b = threadMode;
        this.c = cls;
        this.f9288d = i2;
        this.f9289e = z;
    }

    public final synchronized void a() {
        if (this.f9290f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.f9290f = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            a();
            n nVar = (n) obj;
            nVar.a();
            return this.f9290f.equals(nVar.f9290f);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

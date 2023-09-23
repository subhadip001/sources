package e.y;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.video_converter.video_compressor.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: AppInitializer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f3012d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f3013e = new Object();
    public final Context c;
    public final Set<Class<? extends b<?>>> b = new HashSet();
    public final Map<Class<?>, Object> a = new HashMap();

    public a(Context context) {
        this.c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f3012d == null) {
            synchronized (f3013e) {
                if (f3012d == null) {
                    f3012d = new a(context);
                }
            }
        }
        return f3012d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Bundle bundle) {
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.b.add(cls);
                        }
                    }
                }
                for (Class<? extends b<?>> cls2 : this.b) {
                    b(cls2, hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public final <T> T b(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t;
        if (e.p.a.m()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!set.contains(cls)) {
            if (!this.a.containsKey(cls)) {
                set.add(cls);
                b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> dependencies = newInstance.dependencies();
                if (!dependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : dependencies) {
                        if (!this.a.containsKey(cls2)) {
                            b(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.a(this.c);
                set.remove(cls);
                this.a.put(cls, t);
            } else {
                t = (T) this.a.get(cls);
            }
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}

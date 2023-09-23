package f.h.b.a.i.w.i;

import android.content.Context;
import java.util.Objects;

/* compiled from: EventStoreModule_PackageNameFactory.java */
/* loaded from: classes.dex */
public final class d0 implements Object<String> {
    public final h.a.a<Context> a;

    public d0(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public Object get() {
        String packageName = this.a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}

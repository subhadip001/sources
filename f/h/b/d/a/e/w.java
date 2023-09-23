package f.h.b.d.a.e;

import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class w implements x, u {
    public static final Object c = new Object();
    public volatile x a;
    public volatile Object b = c;

    public w(x xVar) {
        this.a = xVar;
    }

    public static u a(x xVar) {
        if (xVar instanceof u) {
            return (u) xVar;
        }
        Objects.requireNonNull(xVar);
        return new w(xVar);
    }

    @Override // f.h.b.d.a.e.x
    public final Object zza() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.b;
                if (obj == obj2) {
                    obj = this.a.zza();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != obj) {
                        String valueOf = String.valueOf(obj3);
                        String valueOf2 = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }
}

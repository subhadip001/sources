package g.a.v0;

import java.util.concurrent.TimeUnit;

/* compiled from: TimeProvider.java */
/* loaded from: classes2.dex */
public interface u2 {
    public static final u2 a = new a();

    /* compiled from: TimeProvider.java */
    /* loaded from: classes2.dex */
    public class a implements u2 {
        @Override // g.a.v0.u2
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}

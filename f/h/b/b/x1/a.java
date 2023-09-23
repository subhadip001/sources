package f.h.b.b.x1;

import android.os.Handler;
import f.h.b.b.b2.z;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: DrmSessionEventListener.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: DrmSessionEventListener.java */
    /* renamed from: f.h.b.b.x1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0110a {
        public final int a;
        public final z.a b;
        public final CopyOnWriteArrayList<C0111a> c;

        /* compiled from: DrmSessionEventListener.java */
        /* renamed from: f.h.b.b.x1.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0111a {
            public C0111a(Handler handler, a aVar) {
            }
        }

        public C0110a() {
            this.c = new CopyOnWriteArrayList<>();
            this.a = 0;
            this.b = null;
        }

        public C0110a a(int i2, z.a aVar) {
            return new C0110a(this.c, i2, aVar);
        }

        public C0110a(CopyOnWriteArrayList<C0111a> copyOnWriteArrayList, int i2, z.a aVar) {
            this.c = copyOnWriteArrayList;
            this.a = i2;
            this.b = aVar;
        }
    }
}

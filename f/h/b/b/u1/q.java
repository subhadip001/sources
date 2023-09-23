package f.h.b.b.u1;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import f.h.b.b.u1.q;
import java.util.Objects;

/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes.dex */
public interface q {

    /* compiled from: AudioRendererEventListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Handler a;
        public final q b;

        public a(Handler handler, q qVar) {
            if (qVar != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = qVar;
        }

        public void a(final f.h.b.b.v1.d dVar) {
            synchronized (dVar) {
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f.h.b.b.u1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.a aVar = q.a.this;
                        f.h.b.b.v1.d dVar2 = dVar;
                        Objects.requireNonNull(aVar);
                        synchronized (dVar2) {
                        }
                        q qVar = aVar.b;
                        int i2 = f.h.b.b.g2.b0.a;
                        qVar.c(dVar2);
                    }
                });
            }
        }
    }

    void B(boolean z);

    void C(Exception exc);

    void F(long j2);

    void L(int i2, long j2, long j3);

    void c(f.h.b.b.v1.d dVar);

    void g(f.h.b.b.v1.d dVar);

    void r(String str);

    void s(String str, long j2, long j3);

    void y(Format format, f.h.b.b.v1.e eVar);
}

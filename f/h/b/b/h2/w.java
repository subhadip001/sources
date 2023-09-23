package f.h.b.b.h2;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import f.h.b.b.g2.b0;
import f.h.b.b.h2.w;
import java.util.Objects;

/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes.dex */
public interface w {

    /* compiled from: VideoRendererEventListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final Handler a;
        public final w b;

        public a(Handler handler, w wVar) {
            if (wVar != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.a = handler;
            this.b = wVar;
        }

        public void a(final int i2, final int i3, final int i4, final float f2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: f.h.b.b.h2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        w.a aVar = w.a.this;
                        int i5 = i2;
                        int i6 = i3;
                        int i7 = i4;
                        float f3 = f2;
                        w wVar = aVar.b;
                        int i8 = b0.a;
                        wVar.b(i5, i6, i7, f3);
                    }
                });
            }
        }
    }

    void D(f.h.b.b.v1.d dVar);

    void E(Format format, f.h.b.b.v1.e eVar);

    void J(f.h.b.b.v1.d dVar);

    void N(long j2, int i2);

    void b(int i2, int i3, int i4, float f2);

    void f(String str);

    void i(String str, long j2, long j3);

    void q(Surface surface);

    void v(int i2, long j2);
}

package f.h.b.b.x1;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import f.h.b.b.x1.a;

/* compiled from: DrmSessionManager.java */
/* loaded from: classes.dex */
public interface c {
    public static final c a = new a();

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes.dex */
    public class a implements c {
        @Override // f.h.b.b.x1.c
        public DrmSession a(Looper looper, a.C0110a c0110a, Format format) {
            if (format.t == null) {
                return null;
            }
            return new d(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        @Override // f.h.b.b.x1.c
        public Class<f> b(Format format) {
            if (format.t != null) {
                return f.class;
            }
            return null;
        }

        @Override // f.h.b.b.x1.c
        public /* synthetic */ void d() {
            b.a(this);
        }

        @Override // f.h.b.b.x1.c
        public /* synthetic */ void release() {
            b.b(this);
        }
    }

    DrmSession a(Looper looper, a.C0110a c0110a, Format format);

    Class<? extends Object> b(Format format);

    void d();

    void release();
}

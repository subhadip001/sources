package f.h.b.b.d2;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;

/* compiled from: ExoTrackSelection.java */
/* loaded from: classes.dex */
public interface g extends j {

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    int b();

    void c(boolean z);

    void e();

    void g();

    Format h();

    void i(float f2);

    void j();

    void k();

    /* compiled from: ExoTrackSelection.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final TrackGroup a;
        public final int[] b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f4098d;

        public a(TrackGroup trackGroup, int... iArr) {
            this.a = trackGroup;
            this.b = iArr;
            this.c = 0;
            this.f4098d = null;
        }

        public a(TrackGroup trackGroup, int[] iArr, int i2, Object obj) {
            this.a = trackGroup;
            this.b = iArr;
            this.c = i2;
            this.f4098d = obj;
        }
    }
}

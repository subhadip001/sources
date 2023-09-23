package f.h.b.b;

import com.arthenica.ffmpegkit.AbstractSession;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;

/* compiled from: DefaultLoadControl.java */
/* loaded from: classes.dex */
public class l0 {
    public final f.h.b.b.f2.k a;
    public final long b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4396d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4397e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4398f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4399g;

    /* renamed from: h  reason: collision with root package name */
    public int f4400h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4401i;

    public l0() {
        f.h.b.b.f2.k kVar = new f.h.b.b.f2.k(true, LogFileManager.MAX_LOG_SIZE);
        a(2500, 0, "bufferForPlaybackMs", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        a(AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT, 0, "bufferForPlaybackAfterRebufferMs", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", CrashlyticsReportDataCapture.SIGNAL_DEFAULT);
        this.a = kVar;
        long j2 = 50000;
        this.b = h0.a(j2);
        this.c = h0.a(j2);
        this.f4396d = h0.a(2500);
        this.f4397e = h0.a((long) AbstractSession.DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
        this.f4398f = -1;
        this.f4400h = 13107200;
        this.f4399g = h0.a(0);
    }

    public static void a(int i2, int i3, String str, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        f.h.b.b.e2.j.d(z, sb.toString());
    }

    public final void b(boolean z) {
        int i2 = this.f4398f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.f4400h = i2;
        this.f4401i = false;
        if (z) {
            f.h.b.b.f2.k kVar = this.a;
            synchronized (kVar) {
                if (kVar.a) {
                    kVar.b(0);
                }
            }
        }
    }
}

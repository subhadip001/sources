package g.a.w0;

import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.okhttp.internal.framed.ErrorCode;
import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import l.w;

/* compiled from: OkHttpFrameLogger.java */
/* loaded from: classes2.dex */
public class h {
    public final Logger a;
    public final Level b;

    /* compiled from: OkHttpFrameLogger.java */
    /* loaded from: classes2.dex */
    public enum a {
        INBOUND,
        OUTBOUND
    }

    /* compiled from: OkHttpFrameLogger.java */
    /* loaded from: classes2.dex */
    public enum b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: f  reason: collision with root package name */
        public final int f8056f;

        b(int i2) {
            this.f8056f = i2;
        }
    }

    public h(Level level, Class<?> cls) {
        Logger logger = Logger.getLogger(cls.getName());
        f.h.b.c.a.x(level, FirebaseAnalytics.Param.LEVEL);
        this.b = level;
        f.h.b.c.a.x(logger, "logger");
        this.a = logger;
    }

    public static String h(l.f fVar) {
        l.i wVar;
        long j2 = fVar.f9230g;
        if (j2 <= 64) {
            return fVar.T().l();
        }
        int min = (int) Math.min(j2, 64L);
        StringBuilder sb = new StringBuilder();
        if (min == 0) {
            wVar = l.i.f9232j;
        } else {
            wVar = new w(fVar, min);
        }
        sb.append(wVar.l());
        sb.append("...");
        return sb.toString();
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }

    public void b(a aVar, int i2, l.f fVar, int i3, boolean z) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            logger.log(level, aVar + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + h(fVar));
        }
    }

    public void c(a aVar, int i2, ErrorCode errorCode, l.i iVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(aVar);
            sb.append(" GO_AWAY: lastStreamId=");
            sb.append(i2);
            sb.append(" errorCode=");
            sb.append(errorCode);
            sb.append(" length=");
            sb.append(iVar.p());
            sb.append(" bytes=");
            l.f fVar = new l.f();
            fVar.X(iVar);
            sb.append(h(fVar));
            logger.log(level, sb.toString());
        }
    }

    public void d(a aVar, long j2) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j2);
        }
    }

    public void e(a aVar, int i2, ErrorCode errorCode) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i2 + " errorCode=" + errorCode);
        }
    }

    public void f(a aVar, g.a.w0.p.i.g gVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(aVar);
            sb.append(" SETTINGS: ack=false settings=");
            EnumMap enumMap = new EnumMap(b.class);
            b[] values = b.values();
            for (int i2 = 0; i2 < 6; i2++) {
                b bVar = values[i2];
                if (gVar.a(bVar.f8056f)) {
                    enumMap.put((EnumMap) bVar, (b) Integer.valueOf(gVar.f8110d[bVar.f8056f]));
                }
            }
            sb.append(enumMap.toString());
            logger.log(level, sb.toString());
        }
    }

    public void g(a aVar, int i2, long j2) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j2);
        }
    }
}

package g.a.v0;

import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz$ChannelTrace$Event;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: ChannelTracer.java */
/* loaded from: classes2.dex */
public final class p {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f7876e = Logger.getLogger(ChannelLogger.class.getName());
    public final Object a = new Object();
    public final g.a.y b;
    public final Collection<InternalChannelz$ChannelTrace$Event> c;

    /* renamed from: d  reason: collision with root package name */
    public int f7877d;

    /* compiled from: ChannelTracer.java */
    /* loaded from: classes2.dex */
    public class a extends ArrayDeque<InternalChannelz$ChannelTrace$Event> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f7878f;

        public a(int i2) {
            this.f7878f = i2;
        }

        @Override // java.util.ArrayDeque, java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
        public boolean add(Object obj) {
            InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event = (InternalChannelz$ChannelTrace$Event) obj;
            if (size() == this.f7878f) {
                removeFirst();
            }
            p.this.f7877d++;
            return super.add(internalChannelz$ChannelTrace$Event);
        }
    }

    public p(g.a.y yVar, int i2, long j2, String str) {
        f.h.b.c.a.x(str, "description");
        f.h.b.c.a.x(yVar, "logId");
        this.b = yVar;
        if (i2 > 0) {
            this.c = new a(i2);
        } else {
            this.c = null;
        }
        String p = f.a.b.a.a.p(str, " created");
        InternalChannelz$ChannelTrace$Event.Severity severity = InternalChannelz$ChannelTrace$Event.Severity.CT_INFO;
        Long valueOf = Long.valueOf(j2);
        f.h.b.c.a.x(p, "description");
        f.h.b.c.a.x(severity, "severity");
        f.h.b.c.a.x(valueOf, "timestampNanos");
        f.h.b.c.a.C(true, "at least one of channelRef and subchannelRef must be null");
        b(new InternalChannelz$ChannelTrace$Event(p, severity, valueOf.longValue(), null, null, null));
    }

    public static void a(g.a.y yVar, Level level, String str) {
        Logger logger = f7876e;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + yVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public void b(InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event) {
        Level level;
        int ordinal = internalChannelz$ChannelTrace$Event.b.ordinal();
        if (ordinal == 2) {
            level = Level.FINER;
        } else if (ordinal != 3) {
            level = Level.FINEST;
        } else {
            level = Level.FINE;
        }
        synchronized (this.a) {
            Collection<InternalChannelz$ChannelTrace$Event> collection = this.c;
            if (collection != null) {
                collection.add(internalChannelz$ChannelTrace$Event);
            }
        }
        a(this.b, level, internalChannelz$ChannelTrace$Event.a);
    }
}

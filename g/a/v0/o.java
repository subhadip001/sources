package g.a.v0;

import androidx.core.app.NotificationCompat;
import io.grpc.ChannelLogger;
import io.grpc.InternalChannelz$ChannelTrace$Event;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.logging.Level;

/* compiled from: ChannelLoggerImpl.java */
/* loaded from: classes2.dex */
public final class o extends ChannelLogger {
    public final p a;
    public final u2 b;

    public o(p pVar, u2 u2Var) {
        f.h.b.c.a.x(pVar, "tracer");
        this.a = pVar;
        f.h.b.c.a.x(u2Var, NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP);
        this.b = u2Var;
    }

    public static Level d(ChannelLogger.ChannelLogLevel channelLogLevel) {
        int ordinal = channelLogLevel.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return Level.FINEST;
            }
            return Level.FINE;
        }
        return Level.FINER;
    }

    @Override // io.grpc.ChannelLogger
    public void a(ChannelLogger.ChannelLogLevel channelLogLevel, String str) {
        InternalChannelz$ChannelTrace$Event.Severity severity;
        g.a.y yVar = this.a.b;
        Level d2 = d(channelLogLevel);
        if (p.f7876e.isLoggable(d2)) {
            p.a(yVar, d2, str);
        }
        if (!c(channelLogLevel) || channelLogLevel == ChannelLogger.ChannelLogLevel.DEBUG) {
            return;
        }
        p pVar = this.a;
        int ordinal = channelLogLevel.ordinal();
        if (ordinal == 2) {
            severity = InternalChannelz$ChannelTrace$Event.Severity.CT_WARNING;
        } else if (ordinal != 3) {
            severity = InternalChannelz$ChannelTrace$Event.Severity.CT_INFO;
        } else {
            severity = InternalChannelz$ChannelTrace$Event.Severity.CT_ERROR;
        }
        InternalChannelz$ChannelTrace$Event.Severity severity2 = severity;
        Long valueOf = Long.valueOf(this.b.a());
        f.h.b.c.a.x(str, "description");
        f.h.b.c.a.x(severity2, "severity");
        f.h.b.c.a.x(valueOf, "timestampNanos");
        f.h.b.c.a.C(true, "at least one of channelRef and subchannelRef must be null");
        InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event = new InternalChannelz$ChannelTrace$Event(str, severity2, valueOf.longValue(), null, null, null);
        synchronized (pVar.a) {
            Collection<InternalChannelz$ChannelTrace$Event> collection = pVar.c;
            if (collection != null) {
                collection.add(internalChannelz$ChannelTrace$Event);
            }
        }
    }

    @Override // io.grpc.ChannelLogger
    public void b(ChannelLogger.ChannelLogLevel channelLogLevel, String str, Object... objArr) {
        a(channelLogLevel, (c(channelLogLevel) || p.f7876e.isLoggable(d(channelLogLevel))) ? MessageFormat.format(str, objArr) : null);
    }

    public final boolean c(ChannelLogger.ChannelLogLevel channelLogLevel) {
        boolean z;
        if (channelLogLevel != ChannelLogger.ChannelLogLevel.DEBUG) {
            p pVar = this.a;
            synchronized (pVar.a) {
                z = pVar.c != null;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}

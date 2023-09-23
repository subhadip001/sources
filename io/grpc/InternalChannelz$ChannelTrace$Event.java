package io.grpc;

import f.h.b.c.a;
import f.h.c.a.i;
import g.a.v;
import g.a.x;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class InternalChannelz$ChannelTrace$Event {
    public final String a;
    public final Severity b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final x f8674d;

    /* renamed from: e  reason: collision with root package name */
    public final x f8675e;

    /* loaded from: classes2.dex */
    public enum Severity {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public InternalChannelz$ChannelTrace$Event(String str, Severity severity, long j2, x xVar, x xVar2, v.a aVar) {
        this.a = str;
        a.x(severity, "severity");
        this.b = severity;
        this.c = j2;
        this.f8674d = null;
        this.f8675e = xVar2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof InternalChannelz$ChannelTrace$Event) {
            InternalChannelz$ChannelTrace$Event internalChannelz$ChannelTrace$Event = (InternalChannelz$ChannelTrace$Event) obj;
            return a.i0(this.a, internalChannelz$ChannelTrace$Event.a) && a.i0(this.b, internalChannelz$ChannelTrace$Event.b) && this.c == internalChannelz$ChannelTrace$Event.c && a.i0(this.f8674d, internalChannelz$ChannelTrace$Event.f8674d) && a.i0(this.f8675e, internalChannelz$ChannelTrace$Event.f8675e);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.f8674d, this.f8675e});
    }

    public String toString() {
        i c1 = a.c1(this);
        c1.c("description", this.a);
        c1.c("severity", this.b);
        c1.b("timestampNanos", this.c);
        c1.c("channelRef", this.f8674d);
        c1.c("subchannelRef", this.f8675e);
        return c1.toString();
    }
}

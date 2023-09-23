package com.arthenica.ffmpegkit;

import f.a.b.a.a;

/* loaded from: classes.dex */
public class Log {
    private final Level level;
    private final String message;
    private final long sessionId;

    public Log(long j2, Level level, String str) {
        this.sessionId = j2;
        this.level = level;
        this.message = str;
    }

    public Level getLevel() {
        return this.level;
    }

    public String getMessage() {
        return this.message;
    }

    public long getSessionId() {
        return this.sessionId;
    }

    public String toString() {
        StringBuilder D = a.D("Log{", "sessionId=");
        D.append(this.sessionId);
        D.append(", level=");
        D.append(this.level);
        D.append(", message=");
        D.append("'");
        D.append(this.message);
        D.append('\'');
        D.append('}');
        return D.toString();
    }
}

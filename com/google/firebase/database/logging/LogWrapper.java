package com.google.firebase.database.logging;

import com.google.firebase.database.logging.Logger;
import f.a.b.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class LogWrapper {
    private final String component;
    private final Logger logger;
    private final String prefix;

    public LogWrapper(Logger logger, String str) {
        this(logger, str, null);
    }

    private static String exceptionStacktrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    private long now() {
        return System.currentTimeMillis();
    }

    private String toLog(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return this.prefix == null ? str : a.v(new StringBuilder(), this.prefix, " - ", str);
    }

    public void debug(String str, Object... objArr) {
        debug(str, null, objArr);
    }

    public void error(String str, Throwable th) {
        this.logger.onLogMessage(Logger.Level.ERROR, this.component, toLog(str, new Object[0]) + "\n" + exceptionStacktrace(th), now());
    }

    public void info(String str) {
        this.logger.onLogMessage(Logger.Level.INFO, this.component, toLog(str, new Object[0]), now());
    }

    public boolean logsDebug() {
        int ordinal = this.logger.getLogLevel().ordinal();
        Logger.Level level = Logger.Level.DEBUG;
        return ordinal <= 0;
    }

    public void warn(String str) {
        warn(str, null);
    }

    public LogWrapper(Logger logger, String str, String str2) {
        this.logger = logger;
        this.component = str;
        this.prefix = str2;
    }

    public void debug(String str, Throwable th, Object... objArr) {
        if (logsDebug()) {
            String log = toLog(str, objArr);
            if (th != null) {
                StringBuilder D = a.D(log, "\n");
                D.append(exceptionStacktrace(th));
                log = D.toString();
            }
            this.logger.onLogMessage(Logger.Level.DEBUG, this.component, log, now());
        }
    }

    public void warn(String str, Throwable th) {
        String log = toLog(str, new Object[0]);
        if (th != null) {
            StringBuilder D = a.D(log, "\n");
            D.append(exceptionStacktrace(th));
            log = D.toString();
        }
        this.logger.onLogMessage(Logger.Level.WARN, this.component, log, now());
    }
}

package com.google.firebase.database.logging;

import com.google.firebase.database.logging.Logger;
import f.a.b.a.a;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class DefaultLogger implements Logger {
    private final Set<String> enabledComponents;
    private final Logger.Level minLevel;

    /* renamed from: com.google.firebase.database.logging.DefaultLogger$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$logging$Logger$Level;

        static {
            Logger.Level.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$database$logging$Logger$Level = iArr;
            try {
                Logger.Level level = Logger.Level.ERROR;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$database$logging$Logger$Level;
                Logger.Level level2 = Logger.Level.WARN;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$database$logging$Logger$Level;
                Logger.Level level3 = Logger.Level.INFO;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$database$logging$Logger$Level;
                Logger.Level level4 = Logger.Level.DEBUG;
                iArr4[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public DefaultLogger(Logger.Level level, List<String> list) {
        if (list != null) {
            this.enabledComponents = new HashSet(list);
        } else {
            this.enabledComponents = null;
        }
        this.minLevel = level;
    }

    public String buildLogMessage(Logger.Level level, String str, String str2, long j2) {
        Date date = new Date(j2);
        StringBuilder sb = new StringBuilder();
        sb.append(date.toString());
        sb.append(" [");
        sb.append(level);
        sb.append("] ");
        return a.v(sb, str, ": ", str2);
    }

    public void debug(String str, String str2) {
        System.out.println(str2);
    }

    public void error(String str, String str2) {
        System.err.println(str2);
    }

    @Override // com.google.firebase.database.logging.Logger
    public Logger.Level getLogLevel() {
        return this.minLevel;
    }

    public void info(String str, String str2) {
        System.out.println(str2);
    }

    @Override // com.google.firebase.database.logging.Logger
    public void onLogMessage(Logger.Level level, String str, String str2, long j2) {
        if (shouldLog(level, str)) {
            String buildLogMessage = buildLogMessage(level, str, str2, j2);
            int ordinal = level.ordinal();
            if (ordinal == 0) {
                debug(str, buildLogMessage);
            } else if (ordinal == 1) {
                info(str, buildLogMessage);
            } else if (ordinal == 2) {
                warn(str, buildLogMessage);
            } else if (ordinal == 3) {
                error(str, buildLogMessage);
            } else {
                throw new RuntimeException("Should not reach here!");
            }
        }
    }

    public boolean shouldLog(Logger.Level level, String str) {
        if (level.ordinal() >= this.minLevel.ordinal()) {
            if (this.enabledComponents != null) {
                int ordinal = level.ordinal();
                Logger.Level level2 = Logger.Level.DEBUG;
                if (ordinal > 0 || this.enabledComponents.contains(str)) {
                }
            }
            return true;
        }
        return false;
    }

    public void warn(String str, String str2) {
        System.out.println(str2);
    }
}

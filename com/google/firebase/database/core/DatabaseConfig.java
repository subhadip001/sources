package com.google.firebase.database.core;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseException;
import com.google.firebase.database.Logger;
import com.google.firebase.database.logging.Logger;
import java.util.List;

/* loaded from: classes2.dex */
public class DatabaseConfig extends Context {

    /* renamed from: com.google.firebase.database.core.DatabaseConfig$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$firebase$database$Logger$Level;

        static {
            Logger.Level.values();
            int[] iArr = new int[5];
            $SwitchMap$com$google$firebase$database$Logger$Level = iArr;
            try {
                Logger.Level level = Logger.Level.DEBUG;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$google$firebase$database$Logger$Level;
                Logger.Level level2 = Logger.Level.INFO;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$google$firebase$database$Logger$Level;
                Logger.Level level3 = Logger.Level.WARN;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$google$firebase$database$Logger$Level;
                Logger.Level level4 = Logger.Level.ERROR;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$google$firebase$database$Logger$Level;
                Logger.Level level5 = Logger.Level.NONE;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void setAppCheckTokenProvider(TokenProvider tokenProvider) {
        this.appCheckTokenProvider = tokenProvider;
    }

    public void setAuthTokenProvider(TokenProvider tokenProvider) {
        this.authTokenProvider = tokenProvider;
    }

    public synchronized void setDebugLogComponents(List<String> list) {
        assertUnfrozen();
        setLogLevel(Logger.Level.DEBUG);
        this.loggedComponents = list;
    }

    public synchronized void setEventTarget(EventTarget eventTarget) {
        assertUnfrozen();
        this.eventTarget = eventTarget;
    }

    public synchronized void setFirebaseApp(FirebaseApp firebaseApp) {
        this.firebaseApp = firebaseApp;
    }

    public synchronized void setLogLevel(Logger.Level level) {
        assertUnfrozen();
        int ordinal = level.ordinal();
        if (ordinal == 0) {
            this.logLevel = Logger.Level.DEBUG;
        } else if (ordinal == 1) {
            this.logLevel = Logger.Level.INFO;
        } else if (ordinal == 2) {
            this.logLevel = Logger.Level.WARN;
        } else if (ordinal == 3) {
            this.logLevel = Logger.Level.ERROR;
        } else if (ordinal == 4) {
            this.logLevel = Logger.Level.NONE;
        } else {
            throw new IllegalArgumentException("Unknown log level: " + level);
        }
    }

    public synchronized void setLogger(com.google.firebase.database.logging.Logger logger) {
        assertUnfrozen();
        this.logger = logger;
    }

    public synchronized void setPersistenceCacheSizeBytes(long j2) {
        assertUnfrozen();
        if (j2 < 1048576) {
            throw new DatabaseException("The minimum cache size must be at least 1MB");
        }
        if (j2 <= 104857600) {
            this.cacheSize = j2;
        } else {
            throw new DatabaseException("Firebase Database currently doesn't support a cache size larger than 100MB");
        }
    }

    public synchronized void setPersistenceEnabled(boolean z) {
        assertUnfrozen();
        this.persistenceEnabled = z;
    }

    public void setRunLoop(RunLoop runLoop) {
        this.runLoop = runLoop;
    }

    public synchronized void setSessionPersistenceKey(String str) {
        assertUnfrozen();
        if (str != null && !str.isEmpty()) {
            this.persistenceKey = str;
        } else {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
    }
}

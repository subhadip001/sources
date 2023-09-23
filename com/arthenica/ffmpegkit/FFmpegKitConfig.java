package com.arthenica.ffmpegkit;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import f.d.a.c.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class FFmpegKitConfig {
    public static final String FFMPEG_KIT_NAMED_PIPE_PREFIX = "fk_pipe_";
    public static final String TAG = "ffmpeg-kit";
    private static Level activeLogLevel;
    private static int asyncConcurrencyLimit;
    private static ExecutorService asyncExecutorService;
    private static FFmpegSessionCompleteCallback globalFFmpegSessionCompleteCallback;
    private static FFprobeSessionCompleteCallback globalFFprobeSessionCompleteCallback;
    private static LogCallback globalLogCallback;
    private static LogRedirectionStrategy globalLogRedirectionStrategy;
    private static MediaInformationSessionCompleteCallback globalMediaInformationSessionCompleteCallback;
    private static StatisticsCallback globalStatisticsCallback;
    private static final SparseArray<SAFProtocolUrl> safFileDescriptorMap;
    private static final SparseArray<SAFProtocolUrl> safIdMap;
    private static final List<Session> sessionHistoryList;
    private static final Object sessionHistoryLock;
    private static final Map<Long, Session> sessionHistoryMap;
    private static int sessionHistorySize;
    private static final AtomicInteger uniqueIdGenerator;

    /* renamed from: com.arthenica.ffmpegkit.FFmpegKitConfig$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$arthenica$ffmpegkit$Level;
        public static final /* synthetic */ int[] $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy;

        static {
            Level.values();
            int[] iArr = new int[10];
            $SwitchMap$com$arthenica$ffmpegkit$Level = iArr;
            try {
                Level level = Level.AV_LOG_QUIET;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level2 = Level.AV_LOG_TRACE;
                iArr2[9] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level3 = Level.AV_LOG_DEBUG;
                iArr3[8] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level4 = Level.AV_LOG_INFO;
                iArr4[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level5 = Level.AV_LOG_WARNING;
                iArr5[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level6 = Level.AV_LOG_ERROR;
                iArr6[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level7 = Level.AV_LOG_FATAL;
                iArr7[3] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level8 = Level.AV_LOG_PANIC;
                iArr8[2] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level9 = Level.AV_LOG_STDERR;
                iArr9[0] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                int[] iArr10 = $SwitchMap$com$arthenica$ffmpegkit$Level;
                Level level10 = Level.AV_LOG_VERBOSE;
                iArr10[7] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            LogRedirectionStrategy.values();
            int[] iArr11 = new int[5];
            $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy = iArr11;
            try {
                LogRedirectionStrategy logRedirectionStrategy = LogRedirectionStrategy.NEVER_PRINT_LOGS;
                iArr11[4] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                int[] iArr12 = $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy;
                LogRedirectionStrategy logRedirectionStrategy2 = LogRedirectionStrategy.PRINT_LOGS_WHEN_GLOBAL_CALLBACK_NOT_DEFINED;
                iArr12[2] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                int[] iArr13 = $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy;
                LogRedirectionStrategy logRedirectionStrategy3 = LogRedirectionStrategy.PRINT_LOGS_WHEN_SESSION_CALLBACK_NOT_DEFINED;
                iArr13[3] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                int[] iArr14 = $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy;
                LogRedirectionStrategy logRedirectionStrategy4 = LogRedirectionStrategy.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED;
                iArr14[1] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                int[] iArr15 = $SwitchMap$com$arthenica$ffmpegkit$LogRedirectionStrategy;
                LogRedirectionStrategy logRedirectionStrategy5 = LogRedirectionStrategy.ALWAYS_PRINT_LOGS;
                iArr15[0] = 5;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class SAFProtocolUrl {
        private final ContentResolver contentResolver;
        private final String openMode;
        private ParcelFileDescriptor parcelFileDescriptor;
        private final Integer safId;
        private final Uri uri;

        public SAFProtocolUrl(Integer num, Uri uri, String str, ContentResolver contentResolver) {
            this.safId = num;
            this.uri = uri;
            this.openMode = str;
            this.contentResolver = contentResolver;
        }

        public ContentResolver getContentResolver() {
            return this.contentResolver;
        }

        public String getOpenMode() {
            return this.openMode;
        }

        public ParcelFileDescriptor getParcelFileDescriptor() {
            return this.parcelFileDescriptor;
        }

        public Integer getSafId() {
            return this.safId;
        }

        public Uri getUri() {
            return this.uri;
        }

        public void setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor) {
            this.parcelFileDescriptor = parcelFileDescriptor;
        }
    }

    static {
        int i2 = a.a;
        f.d.a.a.a.add("com.arthenica");
        android.util.Log.i(TAG, "Loading ffmpeg-kit.");
        NativeLoader.loadFFmpegKit(NativeLoader.loadFFmpeg());
        uniqueIdGenerator = new AtomicInteger(1);
        activeLogLevel = Level.from(NativeLoader.loadLogLevel());
        asyncConcurrencyLimit = 10;
        asyncExecutorService = Executors.newFixedThreadPool(10);
        sessionHistorySize = 10;
        sessionHistoryMap = new LinkedHashMap<Long, Session>() { // from class: com.arthenica.ffmpegkit.FFmpegKitConfig.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Long, Session> entry) {
                return size() > FFmpegKitConfig.sessionHistorySize;
            }
        };
        sessionHistoryList = new LinkedList();
        sessionHistoryLock = new Object();
        globalLogCallback = null;
        globalStatisticsCallback = null;
        globalFFmpegSessionCompleteCallback = null;
        globalFFprobeSessionCompleteCallback = null;
        globalMediaInformationSessionCompleteCallback = null;
        safIdMap = new SparseArray<>();
        safFileDescriptorMap = new SparseArray<>();
        globalLogRedirectionStrategy = LogRedirectionStrategy.PRINT_LOGS_WHEN_NO_CALLBACKS_DEFINED;
        android.util.Log.i(TAG, String.format("Loaded ffmpeg-kit-%s-%s-%s-%s.", NativeLoader.loadPackageName(), NativeLoader.loadAbi(), NativeLoader.loadVersion(), NativeLoader.loadBuildDate()));
    }

    private FFmpegKitConfig() {
    }

    public static void addSession(Session session) {
        synchronized (sessionHistoryLock) {
            Map<Long, Session> map = sessionHistoryMap;
            if (!map.containsKey(Long.valueOf(session.getSessionId()))) {
                map.put(Long.valueOf(session.getSessionId()), session);
                sessionHistoryList.add(session);
                deleteExpiredSessions();
            }
        }
    }

    public static String argumentsToString(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (i2 > 0) {
                sb.append(" ");
            }
            sb.append(strArr[i2]);
        }
        return sb.toString();
    }

    public static void asyncFFmpegExecute(FFmpegSession fFmpegSession) {
        fFmpegSession.setFuture(asyncExecutorService.submit(new AsyncFFmpegExecuteTask(fFmpegSession)));
    }

    public static void asyncFFprobeExecute(FFprobeSession fFprobeSession) {
        fFprobeSession.setFuture(asyncExecutorService.submit(new AsyncFFprobeExecuteTask(fFprobeSession)));
    }

    public static void asyncGetMediaInformationExecute(MediaInformationSession mediaInformationSession, int i2) {
        mediaInformationSession.setFuture(asyncExecutorService.submit(new AsyncGetMediaInformationTask(mediaInformationSession, Integer.valueOf(i2))));
    }

    public static void clearSessions() {
        synchronized (sessionHistoryLock) {
            sessionHistoryList.clear();
            sessionHistoryMap.clear();
        }
    }

    public static void closeFFmpegPipe(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    private static void deleteExpiredSessions() {
        while (true) {
            List<Session> list = sessionHistoryList;
            if (list.size() <= sessionHistorySize) {
                return;
            }
            try {
                Session remove = list.remove(0);
                if (remove != null) {
                    sessionHistoryMap.remove(Long.valueOf(remove.getSessionId()));
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
    }

    private static native void disableNativeRedirection();

    public static void disableRedirection() {
        disableNativeRedirection();
    }

    public static void enableFFmpegSessionCompleteCallback(FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback) {
        globalFFmpegSessionCompleteCallback = fFmpegSessionCompleteCallback;
    }

    public static void enableFFprobeSessionCompleteCallback(FFprobeSessionCompleteCallback fFprobeSessionCompleteCallback) {
        globalFFprobeSessionCompleteCallback = fFprobeSessionCompleteCallback;
    }

    public static void enableLogCallback(LogCallback logCallback) {
        globalLogCallback = logCallback;
    }

    public static void enableMediaInformationSessionCompleteCallback(MediaInformationSessionCompleteCallback mediaInformationSessionCompleteCallback) {
        globalMediaInformationSessionCompleteCallback = mediaInformationSessionCompleteCallback;
    }

    private static native void enableNativeRedirection();

    public static void enableRedirection() {
        enableNativeRedirection();
    }

    public static void enableStatisticsCallback(StatisticsCallback statisticsCallback) {
        globalStatisticsCallback = statisticsCallback;
    }

    public static String extractExtensionFromSafDisplayName(String str) {
        try {
            return new StringTokenizer(str.lastIndexOf(".") >= 0 ? str.substring(str.lastIndexOf(".")) : str, " .").nextToken();
        } catch (Exception e2) {
            android.util.Log.w(TAG, String.format("Failed to extract extension from saf display name: %s.%s", str, a.a(e2)));
            return "raw";
        }
    }

    public static void ffmpegExecute(FFmpegSession fFmpegSession) {
        fFmpegSession.startRunning();
        try {
            fFmpegSession.complete(new ReturnCode(nativeFFmpegExecute(fFmpegSession.getSessionId(), fFmpegSession.getArguments())));
        } catch (Exception e2) {
            fFmpegSession.fail(e2);
            android.util.Log.w(TAG, String.format("FFmpeg execute failed: %s.%s", argumentsToString(fFmpegSession.getArguments()), a.a(e2)));
        }
    }

    public static void ffprobeExecute(FFprobeSession fFprobeSession) {
        fFprobeSession.startRunning();
        try {
            fFprobeSession.complete(new ReturnCode(nativeFFprobeExecute(fFprobeSession.getSessionId(), fFprobeSession.getArguments())));
        } catch (Exception e2) {
            fFprobeSession.fail(e2);
            android.util.Log.w(TAG, String.format("FFprobe execute failed: %s.%s", argumentsToString(fFprobeSession.getArguments()), a.a(e2)));
        }
    }

    public static int getAsyncConcurrencyLimit() {
        return asyncConcurrencyLimit;
    }

    public static String getBuildDate() {
        return getNativeBuildDate();
    }

    public static FFmpegSessionCompleteCallback getFFmpegSessionCompleteCallback() {
        return globalFFmpegSessionCompleteCallback;
    }

    public static List<FFmpegSession> getFFmpegSessions() {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            for (Session session : sessionHistoryList) {
                if (session.isFFmpeg()) {
                    linkedList.add((FFmpegSession) session);
                }
            }
        }
        return linkedList;
    }

    public static String getFFmpegVersion() {
        return getNativeFFmpegVersion();
    }

    public static FFprobeSessionCompleteCallback getFFprobeSessionCompleteCallback() {
        return globalFFprobeSessionCompleteCallback;
    }

    public static List<FFprobeSession> getFFprobeSessions() {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            for (Session session : sessionHistoryList) {
                if (session.isFFprobe()) {
                    linkedList.add((FFprobeSession) session);
                }
            }
        }
        return linkedList;
    }

    public static Session getLastCompletedSession() {
        synchronized (sessionHistoryLock) {
            for (int size = sessionHistoryList.size() - 1; size >= 0; size--) {
                Session session = sessionHistoryList.get(size);
                if (session.getState() == SessionState.COMPLETED) {
                    return session;
                }
            }
            return null;
        }
    }

    public static Session getLastSession() {
        synchronized (sessionHistoryLock) {
            List<Session> list = sessionHistoryList;
            if (list.size() > 0) {
                return list.get(list.size() - 1);
            }
            return null;
        }
    }

    public static Level getLogLevel() {
        return activeLogLevel;
    }

    public static LogRedirectionStrategy getLogRedirectionStrategy() {
        return globalLogRedirectionStrategy;
    }

    public static void getMediaInformationExecute(MediaInformationSession mediaInformationSession, int i2) {
        mediaInformationSession.startRunning();
        try {
            ReturnCode returnCode = new ReturnCode(nativeFFprobeExecute(mediaInformationSession.getSessionId(), mediaInformationSession.getArguments()));
            mediaInformationSession.complete(returnCode);
            if (returnCode.isValueSuccess()) {
                List<Log> allLogs = mediaInformationSession.getAllLogs(i2);
                StringBuilder sb = new StringBuilder();
                int size = allLogs.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Log log = allLogs.get(i3);
                    if (log.getLevel() == Level.AV_LOG_STDERR) {
                        sb.append(log.getMessage());
                    }
                }
                mediaInformationSession.setMediaInformation(MediaInformationJsonParser.fromWithError(sb.toString()));
            }
        } catch (Exception e2) {
            mediaInformationSession.fail(e2);
            android.util.Log.w(TAG, String.format("Get media information execute failed: %s.%s", argumentsToString(mediaInformationSession.getArguments()), a.a(e2)));
        }
    }

    public static MediaInformationSessionCompleteCallback getMediaInformationSessionCompleteCallback() {
        return globalMediaInformationSessionCompleteCallback;
    }

    public static List<MediaInformationSession> getMediaInformationSessions() {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            for (Session session : sessionHistoryList) {
                if (session.isMediaInformation()) {
                    linkedList.add((MediaInformationSession) session);
                }
            }
        }
        return linkedList;
    }

    private static native String getNativeBuildDate();

    private static native String getNativeFFmpegVersion();

    public static native int getNativeLogLevel();

    private static native String getNativeVersion();

    public static String getSafParameter(Context context, Uri uri, String str) {
        try {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            String string = (query == null || !query.moveToFirst()) ? "unknown" : query.getString(query.getColumnIndex("_display_name"));
            if (query != null) {
                query.close();
            }
            int andIncrement = uniqueIdGenerator.getAndIncrement();
            safIdMap.put(andIncrement, new SAFProtocolUrl(Integer.valueOf(andIncrement), uri, str, context.getContentResolver()));
            return "saf:" + andIncrement + "." + extractExtensionFromSafDisplayName(string);
        } catch (Throwable th) {
            android.util.Log.e(TAG, String.format("Failed to get %s column for %s.%s", "_display_name", uri.toString(), a.a(th)));
            throw th;
        }
    }

    public static String getSafParameterForRead(Context context, Uri uri) {
        return getSafParameter(context, uri, "r");
    }

    public static String getSafParameterForWrite(Context context, Uri uri) {
        return getSafParameter(context, uri, "w");
    }

    public static Session getSession(long j2) {
        Session session;
        synchronized (sessionHistoryLock) {
            session = sessionHistoryMap.get(Long.valueOf(j2));
        }
        return session;
    }

    public static int getSessionHistorySize() {
        return sessionHistorySize;
    }

    public static List<Session> getSessions() {
        LinkedList linkedList;
        synchronized (sessionHistoryLock) {
            linkedList = new LinkedList(sessionHistoryList);
        }
        return linkedList;
    }

    public static List<Session> getSessionsByState(SessionState sessionState) {
        LinkedList linkedList = new LinkedList();
        synchronized (sessionHistoryLock) {
            for (Session session : sessionHistoryList) {
                if (session.getState() == sessionState) {
                    linkedList.add(session);
                }
            }
        }
        return linkedList;
    }

    public static List<String> getSupportedCameraIds(Context context) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList.addAll(CameraSupport.extractSupportedCameraIds(context));
        }
        return arrayList;
    }

    public static String getVersion() {
        return isLTSBuild() ? String.format("%s-lts", getNativeVersion()) : getNativeVersion();
    }

    private static native void ignoreNativeSignal(int i2);

    public static void ignoreSignal(Signal signal) {
        ignoreNativeSignal(signal.getValue());
    }

    public static boolean isLTSBuild() {
        return AbiDetect.isNativeLTSBuild();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void log(long r5, int r7, byte[] r8) {
        /*
            com.arthenica.ffmpegkit.Level r0 = com.arthenica.ffmpegkit.Level.from(r7)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r8)
            com.arthenica.ffmpegkit.Log r8 = new com.arthenica.ffmpegkit.Log
            r8.<init>(r5, r0, r1)
            com.arthenica.ffmpegkit.LogRedirectionStrategy r2 = com.arthenica.ffmpegkit.FFmpegKitConfig.globalLogRedirectionStrategy
            com.arthenica.ffmpegkit.Level r3 = com.arthenica.ffmpegkit.FFmpegKitConfig.activeLogLevel
            com.arthenica.ffmpegkit.Level r4 = com.arthenica.ffmpegkit.Level.AV_LOG_QUIET
            if (r3 != r4) goto L1e
            com.arthenica.ffmpegkit.Level r3 = com.arthenica.ffmpegkit.Level.AV_LOG_STDERR
            int r3 = r3.getValue()
            if (r7 != r3) goto L26
        L1e:
            com.arthenica.ffmpegkit.Level r3 = com.arthenica.ffmpegkit.FFmpegKitConfig.activeLogLevel
            int r3 = r3.getValue()
            if (r7 <= r3) goto L27
        L26:
            return
        L27:
            com.arthenica.ffmpegkit.Session r5 = getSession(r5)
            r6 = 0
            r7 = 1
            java.lang.String r3 = "ffmpeg-kit"
            if (r5 == 0) goto L5a
            com.arthenica.ffmpegkit.LogRedirectionStrategy r2 = r5.getLogRedirectionStrategy()
            r5.addLog(r8)
            com.arthenica.ffmpegkit.LogCallback r4 = r5.getLogCallback()
            if (r4 == 0) goto L5a
            com.arthenica.ffmpegkit.LogCallback r5 = r5.getLogCallback()     // Catch: java.lang.Exception -> L46
            r5.apply(r8)     // Catch: java.lang.Exception -> L46
            goto L58
        L46:
            r5 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r5 = f.d.a.c.a.a(r5)
            r4[r6] = r5
            java.lang.String r5 = "Exception thrown inside session log callback.%s"
            java.lang.String r5 = java.lang.String.format(r5, r4)
            android.util.Log.e(r3, r5)
        L58:
            r5 = 1
            goto L5b
        L5a:
            r5 = 0
        L5b:
            com.arthenica.ffmpegkit.LogCallback r4 = com.arthenica.ffmpegkit.FFmpegKitConfig.globalLogCallback
            if (r4 == 0) goto L76
            r4.apply(r8)     // Catch: java.lang.Exception -> L63
            goto L75
        L63:
            r8 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.String r8 = f.d.a.c.a.a(r8)
            r4[r6] = r8
            java.lang.String r6 = "Exception thrown inside global log callback.%s"
            java.lang.String r6 = java.lang.String.format(r6, r4)
            android.util.Log.e(r3, r6)
        L75:
            r6 = 1
        L76:
            int r8 = r2.ordinal()
            if (r8 == r7) goto L8d
            r7 = 2
            if (r8 == r7) goto L8a
            r6 = 3
            if (r8 == r6) goto L87
            r5 = 4
            if (r8 == r5) goto L86
            goto L92
        L86:
            return
        L87:
            if (r5 == 0) goto L92
            return
        L8a:
            if (r6 == 0) goto L92
            return
        L8d:
            if (r6 != 0) goto Lac
            if (r5 == 0) goto L92
            goto Lac
        L92:
            int r5 = r0.ordinal()
            switch(r5) {
                case 1: goto Lac;
                case 2: goto L9d;
                case 3: goto L9d;
                case 4: goto L9d;
                case 5: goto La1;
                case 6: goto La5;
                case 7: goto L99;
                case 8: goto La9;
                case 9: goto La9;
                default: goto L99;
            }
        L99:
            android.util.Log.v(r3, r1)
            goto Lac
        L9d:
            android.util.Log.e(r3, r1)
            goto Lac
        La1:
            android.util.Log.w(r3, r1)
            goto Lac
        La5:
            android.util.Log.i(r3, r1)
            goto Lac
        La9:
            android.util.Log.d(r3, r1)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arthenica.ffmpegkit.FFmpegKitConfig.log(long, int, byte[]):void");
    }

    public static native int messagesInTransmit(long j2);

    public static native void nativeFFmpegCancel(long j2);

    private static native int nativeFFmpegExecute(long j2, String[] strArr);

    public static native int nativeFFprobeExecute(long j2, String[] strArr);

    public static String[] parseArguments(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i2 < str.length()) {
            Character valueOf = i2 > 0 ? Character.valueOf(str.charAt(i2 - 1)) : null;
            char charAt = str.charAt(i2);
            if (charAt == ' ') {
                if (!z && !z2) {
                    if (sb.length() > 0) {
                        arrayList.add(sb.toString());
                        sb = new StringBuilder();
                    }
                } else {
                    sb.append(charAt);
                }
            } else if (charAt != '\'' || (valueOf != null && valueOf.charValue() == '\\')) {
                if (charAt != '\"' || (valueOf != null && valueOf.charValue() == '\\')) {
                    sb.append(charAt);
                } else if (z2) {
                    z2 = false;
                } else if (z) {
                    sb.append(charAt);
                } else {
                    z2 = true;
                }
            } else if (z) {
                z = false;
            } else if (z2) {
                sb.append(charAt);
            } else {
                z = true;
            }
            i2++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void printToLogcat(int i2, String str) {
        do {
            if (str.length() <= 4000) {
                android.util.Log.println(i2, TAG, str);
                str = "";
            } else {
                int lastIndexOf = str.substring(0, 4000).lastIndexOf(10);
                if (lastIndexOf < 0) {
                    android.util.Log.println(i2, TAG, str.substring(0, 4000));
                    str = str.substring(4000);
                } else {
                    android.util.Log.println(i2, TAG, str.substring(0, lastIndexOf));
                    str = str.substring(lastIndexOf);
                }
            }
        } while (str.length() > 0);
    }

    public static String registerNewFFmpegPipe(Context context) {
        File file = new File(context.getCacheDir(), "pipes");
        if (!file.exists() && !file.mkdirs()) {
            android.util.Log.e(TAG, String.format("Failed to create pipes directory: %s.", file.getAbsolutePath()));
            return null;
        }
        String format = MessageFormat.format("{0}{1}{2}{3}", file, File.separator, FFMPEG_KIT_NAMED_PIPE_PREFIX, Integer.valueOf(uniqueIdGenerator.getAndIncrement()));
        closeFFmpegPipe(format);
        int registerNewNativeFFmpegPipe = registerNewNativeFFmpegPipe(format);
        if (registerNewNativeFFmpegPipe == 0) {
            return format;
        }
        android.util.Log.e(TAG, String.format("Failed to register new FFmpeg pipe %s. Operation failed with rc=%d.", format, Integer.valueOf(registerNewNativeFFmpegPipe)));
        return null;
    }

    private static native int registerNewNativeFFmpegPipe(String str);

    private static int safClose(int i2) {
        try {
            SparseArray<SAFProtocolUrl> sparseArray = safFileDescriptorMap;
            SAFProtocolUrl sAFProtocolUrl = sparseArray.get(i2);
            if (sAFProtocolUrl != null) {
                ParcelFileDescriptor parcelFileDescriptor = sAFProtocolUrl.getParcelFileDescriptor();
                if (parcelFileDescriptor != null) {
                    sparseArray.delete(i2);
                    safIdMap.delete(sAFProtocolUrl.getSafId().intValue());
                    parcelFileDescriptor.close();
                    return 1;
                }
                android.util.Log.e(TAG, String.format("ParcelFileDescriptor for SAF fd %d not found.", Integer.valueOf(i2)));
            } else {
                android.util.Log.e(TAG, String.format("SAF fd %d not found.", Integer.valueOf(i2)));
            }
        } catch (Throwable th) {
            android.util.Log.e(TAG, String.format("Failed to close SAF fd: %d.%s", Integer.valueOf(i2), a.a(th)));
        }
        return 0;
    }

    private static int safOpen(int i2) {
        SAFProtocolUrl sAFProtocolUrl;
        try {
            sAFProtocolUrl = safIdMap.get(i2);
        } catch (Throwable th) {
            android.util.Log.e(TAG, String.format("Failed to open SAF id: %d.%s", Integer.valueOf(i2), a.a(th)));
        }
        if (sAFProtocolUrl == null) {
            android.util.Log.e(TAG, String.format("SAF id %d not found.", Integer.valueOf(i2)));
            return 0;
        }
        ParcelFileDescriptor openFileDescriptor = sAFProtocolUrl.getContentResolver().openFileDescriptor(sAFProtocolUrl.getUri(), sAFProtocolUrl.getOpenMode());
        sAFProtocolUrl.setParcelFileDescriptor(openFileDescriptor);
        int fd = openFileDescriptor.getFd();
        safFileDescriptorMap.put(fd, sAFProtocolUrl);
        return fd;
    }

    public static String sessionStateToString(SessionState sessionState) {
        return sessionState.toString();
    }

    public static void setAsyncConcurrencyLimit(int i2) {
        if (i2 > 0) {
            asyncConcurrencyLimit = i2;
            ExecutorService executorService = asyncExecutorService;
            asyncExecutorService = Executors.newFixedThreadPool(i2);
            executorService.shutdown();
        }
    }

    public static int setEnvironmentVariable(String str, String str2) {
        return setNativeEnvironmentVariable(str, str2);
    }

    public static void setFontDirectory(Context context, String str, Map<String, String> map) {
        setFontDirectoryList(context, Collections.singletonList(str), map);
    }

    public static void setFontDirectoryList(Context context, List<String> list, Map<String, String> map) {
        int i2;
        Object obj;
        File file = new File(context.getCacheDir(), "fontconfig");
        if (!file.exists()) {
            android.util.Log.d(TAG, String.format("Created temporary font conf directory: %s.", Boolean.valueOf(file.mkdirs())));
        }
        File file2 = new File(file, "fonts.conf");
        if (file2.exists()) {
            android.util.Log.d(TAG, String.format("Deleted old temporary font configuration: %s.", Boolean.valueOf(file2.delete())));
        }
        StringBuilder sb = new StringBuilder("");
        if (map == null || map.size() <= 0) {
            i2 = 0;
        } else {
            map.entrySet();
            i2 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null && key.trim().length() > 0 && value.trim().length() > 0) {
                    sb.append("    <match target=\"pattern\">\n");
                    sb.append("        <test qual=\"any\" name=\"family\">\n");
                    sb.append(String.format("            <string>%s</string>\n", key));
                    sb.append("        </test>\n");
                    sb.append("        <edit name=\"family\" mode=\"assign\" binding=\"same\">\n");
                    sb.append(String.format("            <string>%s</string>\n", value));
                    sb.append("        </edit>\n");
                    sb.append("    </match>\n");
                    i2++;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<?xml version=\"1.0\"?>\n");
        sb2.append("<!DOCTYPE fontconfig SYSTEM \"fonts.dtd\">\n");
        sb2.append("<fontconfig>\n");
        sb2.append("    <dir prefix=\"cwd\">.</dir>\n");
        for (String str : list) {
            sb2.append("    <dir>");
            sb2.append(str);
            sb2.append("</dir>\n");
        }
        sb2.append((CharSequence) sb);
        sb2.append("</fontconfig>\n");
        AtomicReference atomicReference = new AtomicReference();
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    atomicReference.set(fileOutputStream);
                    fileOutputStream.write(sb2.toString().getBytes());
                    fileOutputStream.flush();
                    android.util.Log.d(TAG, String.format("Saved new temporary font configuration with %d font name mappings.", Integer.valueOf(i2)));
                    setFontconfigConfigurationPath(file.getAbsolutePath());
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        android.util.Log.d(TAG, String.format("Font directory %s registered successfully.", it.next()));
                    }
                } catch (IOException e2) {
                    android.util.Log.e(TAG, String.format("Failed to set font directory: %s.%s", Arrays.toString(list.toArray()), a.a(e2)));
                    if (atomicReference.get() == null) {
                        return;
                    }
                    obj = atomicReference.get();
                }
                if (atomicReference.get() == null) {
                    return;
                }
                obj = atomicReference.get();
                ((FileOutputStream) obj).close();
            } catch (Throwable th) {
                if (atomicReference.get() != null) {
                    try {
                        ((FileOutputStream) atomicReference.get()).close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
    }

    public static int setFontconfigConfigurationPath(String str) {
        return setNativeEnvironmentVariable("FONTCONFIG_PATH", str);
    }

    public static void setLogLevel(Level level) {
        if (level != null) {
            activeLogLevel = level;
            setNativeLogLevel(level.getValue());
        }
    }

    public static void setLogRedirectionStrategy(LogRedirectionStrategy logRedirectionStrategy) {
        globalLogRedirectionStrategy = logRedirectionStrategy;
    }

    private static native int setNativeEnvironmentVariable(String str, String str2);

    private static native void setNativeLogLevel(int i2);

    public static void setSessionHistorySize(int i2) {
        if (i2 >= 1000) {
            throw new IllegalArgumentException("Session history size must not exceed the hard limit!");
        }
        if (i2 > 0) {
            sessionHistorySize = i2;
            deleteExpiredSessions();
        }
    }

    private static void statistics(long j2, int i2, float f2, float f3, long j3, int i3, double d2, double d3) {
        Statistics statistics = new Statistics(j2, i2, f2, f3, j3, i3, d2, d3);
        Session session = getSession(j2);
        if (session != null && session.isFFmpeg()) {
            FFmpegSession fFmpegSession = (FFmpegSession) session;
            fFmpegSession.addStatistics(statistics);
            if (fFmpegSession.getStatisticsCallback() != null) {
                try {
                    fFmpegSession.getStatisticsCallback().apply(statistics);
                } catch (Exception e2) {
                    android.util.Log.e(TAG, String.format("Exception thrown inside session statistics callback.%s", a.a(e2)));
                }
            }
        }
        StatisticsCallback statisticsCallback = globalStatisticsCallback;
        if (statisticsCallback != null) {
            try {
                statisticsCallback.apply(statistics);
            } catch (Exception e3) {
                android.util.Log.e(TAG, String.format("Exception thrown inside global statistics callback.%s", a.a(e3)));
            }
        }
    }

    public static void asyncFFmpegExecute(FFmpegSession fFmpegSession, ExecutorService executorService) {
        fFmpegSession.setFuture(executorService.submit(new AsyncFFmpegExecuteTask(fFmpegSession)));
    }

    public static void asyncFFprobeExecute(FFprobeSession fFprobeSession, ExecutorService executorService) {
        fFprobeSession.setFuture(executorService.submit(new AsyncFFprobeExecuteTask(fFprobeSession)));
    }

    public static void asyncGetMediaInformationExecute(MediaInformationSession mediaInformationSession, ExecutorService executorService, int i2) {
        mediaInformationSession.setFuture(executorService.submit(new AsyncGetMediaInformationTask(mediaInformationSession, Integer.valueOf(i2))));
    }
}

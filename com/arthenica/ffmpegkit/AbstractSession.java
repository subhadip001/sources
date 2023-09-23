package com.arthenica.ffmpegkit;

import f.d.a.c.a;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class AbstractSession implements Session {
    public static final int DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT = 5000;
    public static final AtomicLong sessionIdGenerator = new AtomicLong(1);
    public final String[] arguments;
    public final LogCallback logCallback;
    public final LogRedirectionStrategy logRedirectionStrategy;
    public final long sessionId = sessionIdGenerator.getAndIncrement();
    public final Date createTime = new Date();
    public Date startTime = null;
    public Date endTime = null;
    public final List<Log> logs = new LinkedList();
    public final Object logsLock = new Object();
    public Future<?> future = null;
    public SessionState state = SessionState.CREATED;
    public ReturnCode returnCode = null;
    public String failStackTrace = null;

    public AbstractSession(String[] strArr, LogCallback logCallback, LogRedirectionStrategy logRedirectionStrategy) {
        this.logCallback = logCallback;
        this.arguments = strArr;
        this.logRedirectionStrategy = logRedirectionStrategy;
        FFmpegKitConfig.addSession(this);
    }

    @Override // com.arthenica.ffmpegkit.Session
    public void addLog(Log log) {
        synchronized (this.logsLock) {
            this.logs.add(log);
        }
    }

    @Override // com.arthenica.ffmpegkit.Session
    public void cancel() {
        if (this.state == SessionState.RUNNING) {
            FFmpegKit.cancel(this.sessionId);
        }
    }

    public void complete(ReturnCode returnCode) {
        this.returnCode = returnCode;
        this.state = SessionState.COMPLETED;
        this.endTime = new Date();
    }

    public void fail(Exception exc) {
        this.failStackTrace = a.a(exc);
        this.state = SessionState.FAILED;
        this.endTime = new Date();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public List<Log> getAllLogs(int i2) {
        waitForAsynchronousMessagesInTransmit(i2);
        if (thereAreAsynchronousMessagesInTransmit()) {
            android.util.Log.i(FFmpegKitConfig.TAG, String.format("getAllLogs was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.sessionId)));
        }
        return getLogs();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String getAllLogsAsString(int i2) {
        waitForAsynchronousMessagesInTransmit(i2);
        if (thereAreAsynchronousMessagesInTransmit()) {
            android.util.Log.i(FFmpegKitConfig.TAG, String.format("getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d.", Long.valueOf(this.sessionId)));
        }
        return getLogsAsString();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String[] getArguments() {
        return this.arguments;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String getCommand() {
        return FFmpegKitConfig.argumentsToString(this.arguments);
    }

    @Override // com.arthenica.ffmpegkit.Session
    public Date getCreateTime() {
        return this.createTime;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public long getDuration() {
        Date date = this.startTime;
        Date date2 = this.endTime;
        if (date == null || date2 == null) {
            return 0L;
        }
        return date2.getTime() - date.getTime();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public Date getEndTime() {
        return this.endTime;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String getFailStackTrace() {
        return this.failStackTrace;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public Future<?> getFuture() {
        return this.future;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public LogCallback getLogCallback() {
        return this.logCallback;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public LogRedirectionStrategy getLogRedirectionStrategy() {
        return this.logRedirectionStrategy;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public List<Log> getLogs() {
        LinkedList linkedList;
        synchronized (this.logsLock) {
            linkedList = new LinkedList(this.logs);
        }
        return linkedList;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String getLogsAsString() {
        StringBuilder sb = new StringBuilder();
        synchronized (this.logsLock) {
            for (Log log : this.logs) {
                sb.append(log.getMessage());
            }
        }
        return sb.toString();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String getOutput() {
        return getAllLogsAsString();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public ReturnCode getReturnCode() {
        return this.returnCode;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public long getSessionId() {
        return this.sessionId;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public Date getStartTime() {
        return this.startTime;
    }

    @Override // com.arthenica.ffmpegkit.Session
    public SessionState getState() {
        return this.state;
    }

    public void setFuture(Future<?> future) {
        this.future = future;
    }

    public void startRunning() {
        this.state = SessionState.RUNNING;
        this.startTime = new Date();
    }

    @Override // com.arthenica.ffmpegkit.Session
    public boolean thereAreAsynchronousMessagesInTransmit() {
        return FFmpegKitConfig.messagesInTransmit(this.sessionId) != 0;
    }

    public void waitForAsynchronousMessagesInTransmit(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        while (thereAreAsynchronousMessagesInTransmit() && System.currentTimeMillis() < i2 + currentTimeMillis) {
            synchronized (this) {
                try {
                    wait(100L);
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    @Override // com.arthenica.ffmpegkit.Session
    public List<Log> getAllLogs() {
        return getAllLogs(DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
    }

    @Override // com.arthenica.ffmpegkit.Session
    public String getAllLogsAsString() {
        return getAllLogsAsString(DEFAULT_TIMEOUT_FOR_ASYNCHRONOUS_MESSAGES_IN_TRANSMIT);
    }
}

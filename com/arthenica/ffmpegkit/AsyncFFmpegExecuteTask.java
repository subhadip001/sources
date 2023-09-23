package com.arthenica.ffmpegkit;

import f.d.a.c.a;

/* loaded from: classes.dex */
public class AsyncFFmpegExecuteTask implements Runnable {
    private final FFmpegSessionCompleteCallback completeCallback;
    private final FFmpegSession ffmpegSession;

    public AsyncFFmpegExecuteTask(FFmpegSession fFmpegSession) {
        this.ffmpegSession = fFmpegSession;
        this.completeCallback = fFmpegSession.getCompleteCallback();
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.ffmpegExecute(this.ffmpegSession);
        FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback = this.completeCallback;
        if (fFmpegSessionCompleteCallback != null) {
            try {
                fFmpegSessionCompleteCallback.apply(this.ffmpegSession);
            } catch (Exception e2) {
                android.util.Log.e(FFmpegKitConfig.TAG, String.format("Exception thrown inside session complete callback.%s", a.a(e2)));
            }
        }
        FFmpegSessionCompleteCallback fFmpegSessionCompleteCallback2 = FFmpegKitConfig.getFFmpegSessionCompleteCallback();
        if (fFmpegSessionCompleteCallback2 != null) {
            try {
                fFmpegSessionCompleteCallback2.apply(this.ffmpegSession);
            } catch (Exception e3) {
                android.util.Log.e(FFmpegKitConfig.TAG, String.format("Exception thrown inside global complete callback.%s", a.a(e3)));
            }
        }
    }
}

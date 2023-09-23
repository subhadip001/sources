package com.arthenica.ffmpegkit.usecase;

/* loaded from: classes.dex */
public interface FFcommandExecuteResponseHandler extends ResponseHandler {
    void onFailure(String str);

    void onProgress(String str);

    void onSuccess(String str);
}

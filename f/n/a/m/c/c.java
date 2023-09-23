package f.n.a.m.c;

import com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler;
import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;

/* compiled from: MediaInformationExtractor.java */
/* loaded from: classes2.dex */
public class c extends ExecuteBinaryResponseHandler {
    public a a;
    public FFmpegKitUseCase b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f7027d;

    /* renamed from: e  reason: collision with root package name */
    public long f7028e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7029f = false;

    /* compiled from: MediaInformationExtractor.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public c(FFmpegKitUseCase fFmpegKitUseCase, a aVar) {
        this.b = fFmpegKitUseCase;
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0081 -> B:13:0x0082). Please submit an issue!!! */
    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.FFcommandExecuteResponseHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFailure(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.n.a.m.c.c.onFailure(java.lang.String):void");
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.ResponseHandler
    public void onFinish() {
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.FFcommandExecuteResponseHandler
    public void onProgress(String str) {
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.ResponseHandler
    public void onStart() {
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.FFcommandExecuteResponseHandler
    public void onSuccess(String str) {
    }
}

package f.n.a.s;

import android.util.Log;
import com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler;
import com.arthenica.ffmpegkit.usecase.FFmpegKitUseCase;

/* compiled from: CommandProcessor.java */
/* loaded from: classes2.dex */
public class a extends ExecuteBinaryResponseHandler {
    public FFmpegKitUseCase a;
    public InterfaceC0181a b;
    public boolean c = false;

    /* compiled from: CommandProcessor.java */
    /* renamed from: f.n.a.s.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0181a {
        void a();

        void b(long j2, long j3);

        void e(boolean z, String str);

        void onFinish();
    }

    public a(FFmpegKitUseCase fFmpegKitUseCase) {
        this.a = fFmpegKitUseCase;
    }

    public void a(String[] strArr, InterfaceC0181a interfaceC0181a) {
        Log.d("TEST_FF", "executeCommand: ");
        this.b = interfaceC0181a;
        this.a.execute(strArr, this);
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.FFcommandExecuteResponseHandler
    public void onFailure(String str) {
        this.b.e(this.c, str);
        this.c = false;
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.ResponseHandler
    public void onFinish() {
        this.b.onFinish();
        Log.d("TEST_FF", "onFinish: 2");
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.FFcommandExecuteResponseHandler
    public void onProgress(String str) {
        String[] split = str.split(" ");
        this.b.b(Long.parseLong(split[0]), Long.parseLong(split[1]));
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.ResponseHandler
    public void onStart() {
    }

    @Override // com.arthenica.ffmpegkit.usecase.ExecuteBinaryResponseHandler, com.arthenica.ffmpegkit.usecase.FFcommandExecuteResponseHandler
    public void onSuccess(String str) {
        this.b.a();
    }
}

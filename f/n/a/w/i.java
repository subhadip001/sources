package f.n.a.w;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.services.FFService;
import java.util.Random;

/* compiled from: FFService.java */
/* loaded from: classes2.dex */
public class i extends Handler {
    public final /* synthetic */ FFService a;

    public i(FFService fFService) {
        this.a = fFService;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 0) {
            m.a.a.c.b().f(new f.n.a.o.g());
        }
        if (User.a()) {
            return;
        }
        this.a.s = new Random();
        FFService fFService = this.a;
        if (fFService.v == 0) {
            fFService.v = FFService.z;
        }
        int i2 = fFService.v;
        int i3 = 180000 + i2;
        fFService.u = i3;
        int nextInt = fFService.s.nextInt((i3 + 1) - i2);
        FFService fFService2 = this.a;
        fFService.t = nextInt + fFService2.v;
        FFService.z = fFService2.t;
        StringBuilder A = f.a.b.a.a.A("handleMessage: mx:");
        A.append(this.a.u);
        A.append(" min:");
        A.append(this.a.v);
        Log.d("FFService", A.toString());
        Log.d("FFService", "initServiceComponents: " + this.a.t);
        this.a.f1404i.sendEmptyMessageDelayed(1, (long) FFService.z);
    }
}

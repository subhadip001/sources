package f.m.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class c0 extends Handler {
    public c0(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000L);
    }
}

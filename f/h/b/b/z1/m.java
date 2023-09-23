package f.h.b.b.z1;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f.h.b.b.z1.n;
import java.util.ArrayDeque;
import java.util.Objects;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
public class m extends Handler {
    public final /* synthetic */ n a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Looper looper) {
        super(looper);
        this.a = nVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        n.a aVar;
        n nVar = this.a;
        Objects.requireNonNull(nVar);
        int i2 = message.what;
        if (i2 == 0) {
            aVar = (n.a) message.obj;
            try {
                nVar.a.queueInputBuffer(aVar.a, aVar.b, aVar.c, aVar.f5128e, aVar.f5129f);
            } catch (RuntimeException e2) {
                nVar.f5123d.set(e2);
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                nVar.f5123d.set(new IllegalStateException(String.valueOf(message.what)));
            } else {
                nVar.f5124e.b();
            }
            aVar = null;
        } else {
            aVar = (n.a) message.obj;
            int i3 = aVar.a;
            int i4 = aVar.b;
            MediaCodec.CryptoInfo cryptoInfo = aVar.f5127d;
            long j2 = aVar.f5128e;
            int i5 = aVar.f5129f;
            try {
                if (nVar.f5125f) {
                    synchronized (n.f5122i) {
                        nVar.a.queueSecureInputBuffer(i3, i4, cryptoInfo, j2, i5);
                    }
                } else {
                    nVar.a.queueSecureInputBuffer(i3, i4, cryptoInfo, j2, i5);
                }
            } catch (RuntimeException e3) {
                nVar.f5123d.set(e3);
            }
        }
        if (aVar != null) {
            ArrayDeque<n.a> arrayDeque = n.f5121h;
            synchronized (arrayDeque) {
                arrayDeque.add(aVar);
            }
        }
    }
}

package f.e.a.l.q;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* loaded from: classes.dex */
public class y {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((v) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public synchronized void a(v<?> vVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            vVar.a();
            this.a = false;
        }
        this.b.obtainMessage(1, vVar).sendToTarget();
    }
}

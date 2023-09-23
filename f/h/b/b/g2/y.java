package f.h.b.b.g2;

import android.os.Handler;
import android.os.Message;

/* compiled from: SystemHandlerWrapper.java */
/* loaded from: classes.dex */
public final class y {
    public final Handler a;

    public y(Handler handler) {
        this.a = handler;
    }

    public Message a(int i2) {
        return this.a.obtainMessage(i2);
    }

    public Message b(int i2, int i3, int i4) {
        return this.a.obtainMessage(i2, i3, i4);
    }

    public Message c(int i2, Object obj) {
        return this.a.obtainMessage(i2, obj);
    }

    public boolean d(int i2) {
        return this.a.sendEmptyMessage(i2);
    }
}

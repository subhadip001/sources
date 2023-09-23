package m.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import org.greenrobot.eventbus.EventBusException;

/* compiled from: HandlerPoster.java */
/* loaded from: classes2.dex */
public class e extends Handler implements k {

    /* renamed from: f  reason: collision with root package name */
    public final j f9283f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9284g;

    /* renamed from: h  reason: collision with root package name */
    public final c f9285h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9286i;

    public e(c cVar, Looper looper, int i2) {
        super(looper);
        this.f9285h = cVar;
        this.f9284g = i2;
        this.f9283f = new j();
    }

    @Override // m.a.a.k
    public void a(p pVar, Object obj) {
        i a = i.a(pVar, obj);
        synchronized (this) {
            this.f9283f.a(a);
            if (!this.f9286i) {
                this.f9286i = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                i b = this.f9283f.b();
                if (b == null) {
                    synchronized (this) {
                        b = this.f9283f.b();
                        if (b == null) {
                            this.f9286i = false;
                            return;
                        }
                    }
                }
                this.f9285h.c(b);
            } while (SystemClock.uptimeMillis() - uptimeMillis < this.f9284g);
            if (sendMessage(obtainMessage())) {
                this.f9286i = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } finally {
            this.f9286i = false;
        }
    }
}

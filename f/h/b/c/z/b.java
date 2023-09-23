package f.h.b.c.z;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* compiled from: SnackbarManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static b f5537d;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper(), new a());
    public c c;

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            c cVar = (c) message.obj;
            synchronized (bVar.a) {
                if (bVar.c == cVar || cVar == null) {
                    Objects.requireNonNull(cVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: f.h.b.c.z.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0129b {
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    public static b a() {
        if (f5537d == null) {
            f5537d = new b();
        }
        return f5537d;
    }

    public final boolean b(InterfaceC0129b interfaceC0129b) {
        if (this.c == null || interfaceC0129b == null) {
            return false;
        }
        throw null;
    }
}

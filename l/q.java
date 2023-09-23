package l;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class q extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Socket f9252k;

    public q(Socket socket) {
        this.f9252k = socket;
    }

    @Override // l.c
    public IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // l.c
    public void m() {
        try {
            this.f9252k.close();
        } catch (AssertionError e2) {
            if (o.b(e2)) {
                Logger logger = o.a;
                Level level = Level.WARNING;
                StringBuilder A = f.a.b.a.a.A("Failed to close timed out socket ");
                A.append(this.f9252k);
                logger.log(level, A.toString(), (Throwable) e2);
                return;
            }
            throw e2;
        } catch (Exception e3) {
            Logger logger2 = o.a;
            Level level2 = Level.WARNING;
            StringBuilder A2 = f.a.b.a.a.A("Failed to close timed out socket ");
            A2.append(this.f9252k);
            logger2.log(level2, A2.toString(), (Throwable) e3);
        }
    }
}

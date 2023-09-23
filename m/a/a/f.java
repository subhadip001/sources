package m.a.a;

import java.io.PrintStream;
import java.util.logging.Level;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: Logger.java */
    /* loaded from: classes2.dex */
    public static class a implements f {
        @Override // m.a.a.f
        public void a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        @Override // m.a.a.f
        public void b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th);
}

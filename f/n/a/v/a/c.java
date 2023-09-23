package f.n.a.v.a;

import java.io.File;

/* compiled from: FileOperationHandler.java */
/* loaded from: classes2.dex */
public class c implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        File file = new File(f.n.a.i.b.c);
        if (file.exists()) {
            file.delete();
        }
    }
}

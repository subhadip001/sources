package f.n.a.v.a;

import java.io.File;

/* compiled from: FileOperationHandler.java */
/* loaded from: classes2.dex */
public class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f7087f;

    public f(String str) {
        this.f7087f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = new File(this.f7087f);
        if (file.exists()) {
            file.delete();
        }
    }
}

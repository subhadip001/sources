package f.m.b;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import k.e;
import k.t;

/* compiled from: OkHttp3Downloader.java */
/* loaded from: classes2.dex */
public final class r implements j {
    public final e.a a;

    public r(Context context) {
        long j2;
        StringBuilder sb = d0.a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j2 = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j2 = 5242880;
        }
        long max = Math.max(Math.min(j2, 52428800L), 5242880L);
        t.b bVar = new t.b();
        bVar.f9164i = new k.c(file, max);
        this.a = new k.t(bVar);
    }
}

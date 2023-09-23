package f.n.a.v.r;

import android.content.Intent;
import android.net.Uri;
import com.video_converter.video_compressor.screens.batchProcessingScreen.BatchScreenActivity;
import com.video_converter.video_compressor.screens.processingScreen.ProcessingScreenActivity;
import java.io.File;

/* compiled from: SplashScreenController.java */
/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f7409f;

    public a(b bVar) {
        this.f7409f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b bVar = this.f7409f;
        Uri data = bVar.a.getIntent().getData();
        if (e.i.c.a.checkSelfPermission(bVar.a, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            if (!((Boolean) f.l.b.c.b(bVar.a, Boolean.class, "process_active")).booleanValue()) {
                if (((Boolean) f.l.b.c.b(bVar.a, Boolean.class, "batch_active")).booleanValue()) {
                    if (!new File(f.n.a.i.b.f6955e).exists()) {
                        f.l.b.c.j(bVar.a, Boolean.class, "batch_active", Boolean.FALSE);
                        bVar.a(data);
                        return;
                    }
                    Intent putExtra = new Intent(bVar.a, BatchScreenActivity.class).putExtra("FROM_NOTIFICATION_KEY", true);
                    if (data != null) {
                        putExtra.putExtra("deep_link_uri", data.toString());
                    }
                    bVar.a.startActivity(putExtra);
                    bVar.a.finish();
                    return;
                }
                bVar.a(data);
                return;
            } else if (!new File(f.n.a.i.b.c).exists()) {
                f.l.b.c.j(bVar.a, Boolean.class, "process_active", Boolean.FALSE);
                bVar.a(data);
                return;
            } else {
                Intent putExtra2 = new Intent(bVar.a, ProcessingScreenActivity.class).putExtra("FROM_NOTIFICATION_KEY", true);
                if (data != null) {
                    putExtra2.putExtra("deep_link_uri", data.toString());
                }
                bVar.a.startActivity(putExtra2);
                bVar.a.finish();
                return;
            }
        }
        bVar.a(data);
    }
}

package f.n.a.v.s;

import android.util.Log;
import android.widget.Toast;
import com.video_converter.video_compressor.constants.FileFormat;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class s implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Item f7456f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f7457g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ j f7458h;

    /* compiled from: VidCompInputScreenController.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s.this.f7458h.q();
        }
    }

    public s(j jVar, Item item, int i2) {
        this.f7458h = jVar;
        this.f7456f = item;
        this.f7457g = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d("VidCompInputScreenL", "run: Rewarded for format");
        j jVar = this.f7458h;
        jVar.H = true;
        jVar.I();
        Toast.makeText(this.f7458h.o, "Format unlocked", 0).show();
        this.f7458h.f(this.f7456f, 0);
        FileFormat b = this.f7458h.f7430d.b(this.f7456f.f1395f);
        j jVar2 = this.f7458h;
        h hVar = jVar2.b;
        int i2 = this.f7457g;
        boolean z = jVar2.f7435i;
        hVar.b(i2);
        this.f7458h.G(b);
        this.f7458h.o.runOnUiThread(new a());
        this.f7458h.y = null;
    }
}

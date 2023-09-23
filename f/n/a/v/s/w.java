package f.n.a.v.s;

import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class w implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Item f7462f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f7463g;

    public w(j jVar, Item item) {
        this.f7463g = jVar;
        this.f7462f = item;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f7463g;
        jVar.I = true;
        jVar.P(this.f7462f);
        j jVar2 = this.f7463g;
        jVar2.y = null;
        jVar2.K();
    }
}

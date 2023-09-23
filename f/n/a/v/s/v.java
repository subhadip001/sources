package f.n.a.v.s;

import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class v implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Item f7460f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ j f7461g;

    public v(j jVar, Item item) {
        this.f7461g = jVar;
        this.f7460f = item;
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.f7461g;
        jVar.F = true;
        jVar.N(this.f7460f);
        j jVar2 = this.f7461g;
        jVar2.y = null;
        jVar2.K();
    }
}

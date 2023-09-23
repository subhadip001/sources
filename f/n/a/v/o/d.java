package f.n.a.v.o;

import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: SelectableListScreenController.java */
/* loaded from: classes2.dex */
public class d implements c {
    public boolean a = false;
    public f b;
    public a c;

    /* compiled from: SelectableListScreenController.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    @Override // f.n.a.v.o.c
    public void a(Item item) {
        ((b) this.c).l(item);
    }

    @Override // f.n.a.v.o.c
    public void b() {
        a aVar = this.c;
        if (aVar != null) {
            ((b) aVar).k();
        }
    }
}

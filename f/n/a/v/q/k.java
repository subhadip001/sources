package f.n.a.v.q;

import android.view.View;
import android.widget.AdapterView;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: SimpleOptionsScreenView.java */
/* loaded from: classes2.dex */
public class k implements AdapterView.OnItemSelectedListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f7401f;

    public k(o oVar) {
        this.f7401f = oVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        Item item = (Item) adapterView.getSelectedItem();
        for (b bVar : this.f7401f.c()) {
            bVar.l(item);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

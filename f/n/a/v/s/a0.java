package f.n.a.v.s;

import android.view.View;
import android.widget.AdapterView;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;

/* compiled from: VidCompInputScreenView.java */
/* loaded from: classes2.dex */
public class a0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c0 f7413f;

    public a0(c0 c0Var) {
        this.f7413f = c0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        Item item = (Item) adapterView.getSelectedItem();
        for (i iVar : this.f7413f.c()) {
            iVar.f(item, i2);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}

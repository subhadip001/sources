package f.n.a.n;

import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.constants.Preset;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import e.p.c.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CustomOptionsListHelper.java */
/* loaded from: classes2.dex */
public class b {
    public n a;
    public final double[] b = {60.0d, 48.0d, 30.0d, 29.7d, 25.0d, 24.0d, 23.976d, 15.0d, 14.985d, 12.45d};

    public b(n nVar) {
        this.a = nVar;
    }

    public List<Item> a(double d2, boolean z) {
        double[] dArr;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new Item("Original", (String) null, true));
            for (double d3 : this.b) {
                arrayList.add(new Item(Double.toString(d3), false));
            }
            return arrayList;
        }
        boolean z2 = false;
        for (double d4 : this.b) {
            if (d4 != d2 && (d2 <= d4 || z2)) {
                arrayList.add(new Item(Double.toString(d4), false));
            } else {
                arrayList.add(new Item(Double.toString(d2), "Original", true));
                if (d2 > d4) {
                    arrayList.add(new Item(Double.toString(d4), false));
                }
                z2 = true;
            }
        }
        if (!z2) {
            arrayList.add(new Item(Double.toString(d2), "Original", true));
        }
        return arrayList;
    }

    public List<Item> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Item(this.a.getString(R.string.normal_txt), this.a.getString(R.string.normal_preset_hint), Preset.NORMAL.getPreset(), true));
        arrayList.add(new Item(this.a.getString(R.string.fast_txt), this.a.getString(R.string.fast_preset_hint), Preset.VERYFAST.getPreset(), false));
        arrayList.add(new Item(this.a.getString(R.string.fastest_txt), this.a.getString(R.string.fastest_speed_hint), Preset.ULTRAFAST.getPreset(), false));
        return arrayList;
    }
}

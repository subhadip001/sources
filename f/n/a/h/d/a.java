package f.n.a.h.d;

import android.os.Bundle;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import e.p.c.n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BundleProvider.java */
/* loaded from: classes2.dex */
public class a {
    public a(n nVar) {
    }

    public Bundle a(String str, String str2, List<Item> list, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("SELECTABLE_LIST_TITLE", str);
        bundle.putBoolean("CUSTOOM_ACTION", z);
        bundle.putString("SELECTABLE_LIST_SUBTITLE", str2);
        bundle.putSerializable("SELECTABLE_LIST_ITEMS", (ArrayList) list);
        return bundle;
    }
}

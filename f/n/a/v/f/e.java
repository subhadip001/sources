package f.n.a.v.f;

import android.util.Log;
import com.video_converter.video_compressor.model.MediaFile;
import java.util.List;

/* compiled from: FixedSizeListController.java */
/* loaded from: classes2.dex */
public class e implements d {
    public f a;
    public c b;
    public List<MediaFile> c;

    @Override // f.n.a.v.f.d
    public void a() {
        Log.d("Ariful", "onDoneBtnCLicked: ");
        c cVar = this.b;
        if (cVar != null) {
            a aVar = cVar.f7189f;
            if (aVar != null) {
                aVar.f(cVar.f7191h.f7193i.b);
            }
            cVar.getDialog().dismiss();
        }
    }
}

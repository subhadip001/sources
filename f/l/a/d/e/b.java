package f.l.a.d.e;

import androidx.lifecycle.LiveData;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import f.l.a.d.d.e;
import java.util.List;

/* compiled from: MediaPickerInterface.kt */
/* loaded from: classes2.dex */
public interface b {
    void A();

    void B(List<? extends e> list);

    SortMode a();

    void c(e eVar);

    MediaType g();

    void j(boolean z);

    void n(List<? extends e> list);

    SortOrder q();

    LayoutMode t();

    boolean u();

    LiveData<List<e>> w();

    boolean x(e eVar);

    boolean y();

    void z(e eVar);
}

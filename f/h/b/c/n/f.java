package f.h.b.c.n;

import android.view.View;
import com.video_converter.video_compressor.R;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes.dex */
public class f extends e.i.j.c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f5324d;

    public f(d dVar) {
        this.f5324d = dVar;
    }

    @Override // e.i.j.c
    public void d(View view, e.i.j.h0.d dVar) {
        String string;
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        if (this.f5324d.p.getVisibility() == 0) {
            string = this.f5324d.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            string = this.f5324d.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        dVar.o(string);
    }
}

package f.h.b.c.l;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: Chip.java */
/* loaded from: classes.dex */
public class b extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public b(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        c cVar = this.a.f1133j;
        if (cVar != null) {
            cVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}

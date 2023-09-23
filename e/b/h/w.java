package e.b.h;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public class w extends h0 {
    public final /* synthetic */ AppCompatSpinner.d o;
    public final /* synthetic */ AppCompatSpinner p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.d dVar) {
        super(view);
        this.p = appCompatSpinner;
        this.o = dVar;
    }

    @Override // e.b.h.h0
    public e.b.g.i.p b() {
        return this.o;
    }

    @Override // e.b.h.h0
    public boolean c() {
        if (this.p.getInternalPopup().a()) {
            return true;
        }
        this.p.b();
        return true;
    }
}

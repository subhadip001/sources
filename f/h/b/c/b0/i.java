package f.h.b.c.b0;

import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public class i implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public void onDismiss() {
        h.i(this.a);
        h.g(this.a, false);
    }
}

package f.h.b.c.b0;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes.dex */
public class l implements View.OnTouchListener {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f5188f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ h f5189g;

    public l(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.f5189g = hVar;
        this.f5188f = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f5189g.m()) {
                this.f5189g.f5178l = false;
            }
            h.h(this.f5189g, this.f5188f);
            h.i(this.f5189g);
        }
        return false;
    }
}

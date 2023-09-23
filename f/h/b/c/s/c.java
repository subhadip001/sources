package f.h.b.c.s;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: CheckableImageButton.java */
/* loaded from: classes.dex */
public class c extends e.i.j.c {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f5398d;

    public c(CheckableImageButton checkableImageButton) {
        this.f5398d = checkableImageButton;
    }

    @Override // e.i.j.c
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f5398d.isChecked());
    }

    @Override // e.i.j.c
    public void d(View view, e.i.j.h0.d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        dVar.a.setCheckable(this.f5398d.f1172j);
        dVar.a.setChecked(this.f5398d.isChecked());
    }
}

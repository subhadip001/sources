package e.i.j.h0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f  reason: collision with root package name */
    public final int f2528f;

    /* renamed from: g  reason: collision with root package name */
    public final d f2529g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2530h;

    public a(int i2, d dVar, int i3) {
        this.f2528f = i2;
        this.f2529g = dVar;
        this.f2530h = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2528f);
        d dVar = this.f2529g;
        dVar.a.performAction(this.f2530h, bundle);
    }
}

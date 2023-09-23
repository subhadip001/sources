package e.b.h;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class z implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f1868f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Typeface f1869g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f1870h;

    public z(y yVar, TextView textView, Typeface typeface, int i2) {
        this.f1868f = textView;
        this.f1869g = typeface;
        this.f1870h = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1868f.setTypeface(this.f1869g, this.f1870h);
    }
}

package f.n.a.v.l;

import java.util.Locale;

/* compiled from: PreviewFragmentController.java */
/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f7276f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e f7277g;

    public d(e eVar, int i2) {
        this.f7277g = eVar;
        this.f7276f = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.f7277g.f7279e;
        gVar.n.setText(String.format(Locale.US, "%d%%", Integer.valueOf(this.f7276f)));
        gVar.n.invalidate();
    }
}

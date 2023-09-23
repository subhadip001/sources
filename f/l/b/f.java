package f.l.b;

/* compiled from: RatingDialog.java */
/* loaded from: classes2.dex */
public class f implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f6805f;

    public f(e eVar) {
        this.f6805f = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f6805f.isShowing()) {
            this.f6805f.p.setVisibility(8);
        }
    }
}

package f.n.a.m;

/* compiled from: MediaInfoExtractor.java */
/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f7010f;

    public a(b bVar) {
        this.f7010f = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b bVar = this.f7010f;
            bVar.f7015h = false;
            bVar.a.cancelTask();
            this.f7010f.c();
            this.f7010f.a(null);
        } catch (Exception unused) {
        }
    }
}

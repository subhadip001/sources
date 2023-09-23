package f.n.a.v.s;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class n extends Thread {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7451f;

    public n(j jVar) {
        this.f7451f = jVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            Thread.sleep(2000L);
            this.f7451f.S.sendEmptyMessage(0);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }
}

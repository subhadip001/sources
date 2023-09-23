package f.n.a.z;

/* compiled from: PurchaseEventTracker.java */
/* loaded from: classes2.dex */
public class b {
    public static b c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object f7525d = new Object();
    public boolean a = false;
    public String b = null;

    public static b a() {
        b bVar;
        synchronized (f7525d) {
            if (c == null) {
                c = new b();
            }
            bVar = c;
        }
        return bVar;
    }
}

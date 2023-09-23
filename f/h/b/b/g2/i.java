package f.h.b.b.g2;

/* compiled from: ConditionVariable.java */
/* loaded from: classes.dex */
public class i {
    public final f a = f.a;
    public boolean b;

    public synchronized boolean a() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean b() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }
}

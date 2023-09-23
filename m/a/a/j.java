package m.a.a;

/* compiled from: PendingPostQueue.java */
/* loaded from: classes2.dex */
public final class j {
    public i a;
    public i b;

    public synchronized void a(i iVar) {
        i iVar2 = this.b;
        if (iVar2 != null) {
            iVar2.c = iVar;
            this.b = iVar;
        } else if (this.a == null) {
            this.b = iVar;
            this.a = iVar;
        } else {
            throw new IllegalStateException("Head present, but no tail");
        }
        notifyAll();
    }

    public synchronized i b() {
        i iVar;
        iVar = this.a;
        if (iVar != null) {
            i iVar2 = iVar.c;
            this.a = iVar2;
            if (iVar2 == null) {
                this.b = null;
            }
        }
        return iVar;
    }
}

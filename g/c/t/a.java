package g.c.t;

import f.n.a.n.i;
import g.c.w.g.g;
import g.c.w.j.d;
import g.c.w.j.e;
import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;

/* compiled from: CompositeDisposable.java */
/* loaded from: classes2.dex */
public final class a implements b, g.c.w.a.a {

    /* renamed from: f  reason: collision with root package name */
    public e<b> f8137f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f8138g;

    @Override // g.c.w.a.a
    public boolean a(b bVar) {
        if (c(bVar)) {
            ((g) bVar).dispose();
            return true;
        }
        return false;
    }

    @Override // g.c.w.a.a
    public boolean b(b bVar) {
        if (!this.f8138g) {
            synchronized (this) {
                if (!this.f8138g) {
                    e<b> eVar = this.f8137f;
                    if (eVar == null) {
                        eVar = new e<>();
                        this.f8137f = eVar;
                    }
                    eVar.a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x004d, DONT_GENERATE, TryCatch #0 {, blocks: (B:6:0x000c, B:8:0x0010, B:10:0x0012, B:12:0x0016, B:27:0x0049, B:15:0x002a, B:17:0x0030, B:19:0x0035, B:22:0x003c, B:24:0x0042, B:29:0x004b), top: B:34:0x000c }] */
    @Override // g.c.w.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(g.c.t.b r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Disposable item is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.f8138g
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            monitor-enter(r7)
            boolean r0 = r7.f8138g     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L12
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r1
        L12:
            g.c.w.j.e<g.c.t.b> r0 = r7.f8137f     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4b
            T[] r2 = r0.f8584d     // Catch: java.lang.Throwable -> L4d
            int r3 = r0.a     // Catch: java.lang.Throwable -> L4d
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> L4d
            int r4 = g.c.w.j.e.b(r4)     // Catch: java.lang.Throwable -> L4d
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4d
            r6 = 1
            if (r5 != 0) goto L2a
        L28:
            r8 = 0
            goto L46
        L2a:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L35
            r0.c(r4, r2, r3)     // Catch: java.lang.Throwable -> L4d
        L33:
            r8 = 1
            goto L46
        L35:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L3c
            goto L28
        L3c:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L35
            r0.c(r4, r2, r3)     // Catch: java.lang.Throwable -> L4d
            goto L33
        L46:
            if (r8 != 0) goto L49
            goto L4b
        L49:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r6
        L4b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g.c.t.a.c(g.c.t.b):boolean");
    }

    @Override // g.c.t.b
    public void dispose() {
        b[] bVarArr;
        if (this.f8138g) {
            return;
        }
        synchronized (this) {
            if (this.f8138g) {
                return;
            }
            this.f8138g = true;
            e<b> eVar = this.f8137f;
            ArrayList arrayList = null;
            this.f8137f = null;
            if (eVar == null) {
                return;
            }
            for (b bVar : eVar.f8584d) {
                if (bVar instanceof b) {
                    try {
                        bVar.dispose();
                    } catch (Throwable th) {
                        i.d0(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw d.d((Throwable) arrayList.get(0));
                }
                throw new CompositeException(arrayList);
            }
        }
    }
}

package f.e.a.l.q.c0;

import android.util.Log;
import f.e.a.j.a;
import f.e.a.l.q.c0.a;
import f.e.a.l.q.c0.c;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public class e implements a {
    public final File b;
    public final long c;

    /* renamed from: e  reason: collision with root package name */
    public f.e.a.j.a f3293e;

    /* renamed from: d  reason: collision with root package name */
    public final c f3292d = new c();
    public final k a = new k();

    @Deprecated
    public e(File file, long j2) {
        this.b = file;
        this.c = j2;
    }

    @Override // f.e.a.l.q.c0.a
    public void a(f.e.a.l.j jVar, a.b bVar) {
        c.a aVar;
        boolean z;
        String a = this.a.a(jVar);
        c cVar = this.f3292d;
        synchronized (cVar) {
            aVar = cVar.a.get(a);
            if (aVar == null) {
                c.b bVar2 = cVar.b;
                synchronized (bVar2.a) {
                    aVar = bVar2.a.poll();
                }
                if (aVar == null) {
                    aVar = new c.a();
                }
                cVar.a.put(a, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + a + " for for Key: " + jVar);
            }
            try {
                f.e.a.j.a c = c();
                if (c.v(a) == null) {
                    a.c p = c.p(a);
                    if (p != null) {
                        try {
                            f.e.a.l.q.f fVar = (f.e.a.l.q.f) bVar;
                            if (fVar.a.a(fVar.b, p.b(0), fVar.c)) {
                                f.e.a.j.a.a(f.e.a.j.a.this, p, true);
                                p.c = true;
                            }
                            if (!z) {
                                try {
                                    p.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!p.c) {
                                try {
                                    p.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + a);
                    }
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } finally {
            this.f3292d.a(a);
        }
    }

    @Override // f.e.a.l.q.c0.a
    public File b(f.e.a.l.j jVar) {
        String a = this.a.a(jVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a + " for for Key: " + jVar);
        }
        try {
            a.e v = c().v(a);
            if (v != null) {
                return v.a[0];
            }
            return null;
        } catch (IOException e2) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
                return null;
            }
            return null;
        }
    }

    public final synchronized f.e.a.j.a c() {
        if (this.f3293e == null) {
            this.f3293e = f.e.a.j.a.F(this.b, 1, 1, this.c);
        }
        return this.f3293e;
    }
}

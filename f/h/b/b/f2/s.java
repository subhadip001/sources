package f.h.b.b.f2;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: StatsDataSource.java */
/* loaded from: classes.dex */
public final class s implements i {
    public final i a;
    public long b;
    public Uri c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, List<String>> f4247d;

    public s(i iVar) {
        Objects.requireNonNull(iVar);
        this.a = iVar;
        this.c = Uri.EMPTY;
        this.f4247d = Collections.emptyMap();
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        int b = this.a.b(bArr, i2, i3);
        if (b != -1) {
            this.b += b;
        }
        return b;
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        this.a.close();
    }

    @Override // f.h.b.b.f2.i
    public void d(t tVar) {
        Objects.requireNonNull(tVar);
        this.a.d(tVar);
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        this.c = jVar.a;
        this.f4247d = Collections.emptyMap();
        long i2 = this.a.i(jVar);
        Uri n = n();
        Objects.requireNonNull(n);
        this.c = n;
        this.f4247d = k();
        return i2;
    }

    @Override // f.h.b.b.f2.i
    public Map<String, List<String>> k() {
        return this.a.k();
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        return this.a.n();
    }
}

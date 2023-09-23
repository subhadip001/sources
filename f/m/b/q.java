package f.m.b;

import android.net.NetworkInfo;
import android.os.Handler;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import f.m.b.x;
import java.io.IOException;
import java.util.Objects;
import k.d;
import k.q;
import k.v;

/* compiled from: NetworkRequestHandler.java */
/* loaded from: classes2.dex */
public class q extends x {
    public final j a;
    public final z b;

    /* compiled from: NetworkRequestHandler.java */
    /* loaded from: classes2.dex */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: NetworkRequestHandler.java */
    /* loaded from: classes2.dex */
    public static final class b extends IOException {

        /* renamed from: f  reason: collision with root package name */
        public final int f6871f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6872g;

        public b(int i2, int i3) {
            super(f.a.b.a.a.i("HTTP ", i2));
            this.f6871f = i2;
            this.f6872g = i3;
        }
    }

    public q(j jVar, z zVar) {
        this.a = jVar;
        this.b = zVar;
    }

    @Override // f.m.b.x
    public boolean c(v vVar) {
        String scheme = vVar.c.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // f.m.b.x
    public int e() {
        return 2;
    }

    @Override // f.m.b.x
    public x.a f(v vVar, int i2) {
        k.d dVar;
        boolean z = true;
        if (i2 == 0) {
            dVar = null;
        } else if (NetworkPolicy.isOfflineOnly(i2)) {
            dVar = k.d.n;
        } else {
            d.a aVar = new d.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i2)) {
                aVar.a = true;
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i2)) {
                aVar.b = true;
            }
            dVar = new k.d(aVar);
        }
        v.a aVar2 = new v.a();
        aVar2.d(vVar.c.toString());
        if (dVar != null) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                aVar2.c.e("Cache-Control");
            } else {
                q.a aVar3 = aVar2.c;
                aVar3.c("Cache-Control", dVar2);
                aVar3.e("Cache-Control");
                aVar3.a.add("Cache-Control");
                aVar3.a.add(dVar2.trim());
            }
        }
        k.v a2 = aVar2.a();
        k.t tVar = (k.t) ((r) this.a).a;
        Objects.requireNonNull(tVar);
        k.u uVar = new k.u(tVar, a2, false);
        uVar.f9171h = ((k.o) tVar.f9156k).a;
        synchronized (uVar) {
            if (!uVar.f9174k) {
                uVar.f9174k = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        uVar.f9170g.c = k.c0.k.f.a.i("response.body().close()");
        Objects.requireNonNull(uVar.f9171h);
        try {
            try {
                k.l lVar = uVar.f9169f.f9151f;
                synchronized (lVar) {
                    lVar.f9131d.add(uVar);
                }
                k.y a3 = uVar.a();
                k.l lVar2 = uVar.f9169f.f9151f;
                lVar2.a(lVar2.f9131d, uVar, false);
                k.a0 a0Var = a3.f9186l;
                int i3 = a3.f9182h;
                if ((i3 < 200 || i3 >= 300) ? false : false) {
                    Picasso.LoadedFrom loadedFrom = a3.n == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
                    if (loadedFrom == Picasso.LoadedFrom.DISK && a0Var.a() == 0) {
                        a0Var.close();
                        throw new a("Received response with 0 content-length header.");
                    }
                    if (loadedFrom == Picasso.LoadedFrom.NETWORK && a0Var.a() > 0) {
                        z zVar = this.b;
                        long a4 = a0Var.a();
                        Handler handler = zVar.c;
                        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(a4)));
                    }
                    return new x.a(a0Var.f(), loadedFrom);
                }
                a0Var.close();
                throw new b(a3.f9182h, 0);
            } catch (IOException e2) {
                Objects.requireNonNull(uVar.f9171h);
                throw e2;
            }
        } catch (Throwable th) {
            k.l lVar3 = uVar.f9169f.f9151f;
            lVar3.a(lVar3.f9131d, uVar, false);
            throw th;
        }
    }

    @Override // f.m.b.x
    public boolean g(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // f.m.b.x
    public boolean h() {
        return true;
    }
}

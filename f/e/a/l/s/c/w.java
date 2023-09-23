package f.e.a.l.s.c;

import android.graphics.Bitmap;
import f.e.a.l.s.c.k;
import f.e.a.l.s.c.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Queue;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes.dex */
public class w implements f.e.a.l.m<InputStream, Bitmap> {
    public final k a;
    public final f.e.a.l.q.b0.b b;

    /* compiled from: StreamBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static class a implements k.b {
        public final u a;
        public final f.e.a.r.d b;

        public a(u uVar, f.e.a.r.d dVar) {
            this.a = uVar;
            this.b = dVar;
        }

        @Override // f.e.a.l.s.c.k.b
        public void a(f.e.a.l.q.b0.d dVar, Bitmap bitmap) {
            IOException iOException = this.b.f3604g;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.d(bitmap);
                }
                throw iOException;
            }
        }

        @Override // f.e.a.l.s.c.k.b
        public void b() {
            u uVar = this.a;
            synchronized (uVar) {
                uVar.f3478h = uVar.f3476f.length;
            }
        }
    }

    public w(k kVar, f.e.a.l.q.b0.b bVar) {
        this.a = kVar;
        this.b = bVar;
    }

    @Override // f.e.a.l.m
    public boolean a(InputStream inputStream, f.e.a.l.l lVar) {
        Objects.requireNonNull(this.a);
        return true;
    }

    @Override // f.e.a.l.m
    public f.e.a.l.q.v<Bitmap> b(InputStream inputStream, int i2, int i3, f.e.a.l.l lVar) {
        u uVar;
        boolean z;
        f.e.a.r.d poll;
        InputStream inputStream2 = inputStream;
        if (inputStream2 instanceof u) {
            uVar = (u) inputStream2;
            z = false;
        } else {
            uVar = new u(inputStream2, this.b);
            z = true;
        }
        Queue<f.e.a.r.d> queue = f.e.a.r.d.f3602h;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new f.e.a.r.d();
        }
        poll.f3603f = uVar;
        f.e.a.r.j jVar = new f.e.a.r.j(poll);
        a aVar = new a(uVar, poll);
        try {
            k kVar = this.a;
            return kVar.a(new q.b(jVar, kVar.f3464d, kVar.c), i2, i3, lVar, aVar);
        } finally {
            poll.release();
            if (z) {
                uVar.release();
            }
        }
    }
}

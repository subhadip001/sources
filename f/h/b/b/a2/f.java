package f.h.b.b.a2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import f.h.b.b.g0;
import f.h.b.b.g2.b0;
import f.h.b.b.s0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: MetadataRenderer.java */
/* loaded from: classes.dex */
public final class f extends g0 implements Handler.Callback {
    public long A;
    public final c q;
    public final e r;
    public final Handler s;
    public final d t;
    public final Metadata[] u;
    public final long[] v;
    public int w;
    public int x;
    public b y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, Looper looper) {
        super(5);
        Handler handler;
        c cVar = c.a;
        Objects.requireNonNull(eVar);
        this.r = eVar;
        if (looper == null) {
            handler = null;
        } else {
            int i2 = b0.a;
            handler = new Handler(looper, this);
        }
        this.s = handler;
        this.q = cVar;
        this.t = new d();
        this.u = new Metadata[5];
        this.v = new long[5];
    }

    @Override // f.h.b.b.g0
    public void B() {
        Arrays.fill(this.u, (Object) null);
        this.w = 0;
        this.x = 0;
        this.y = null;
    }

    @Override // f.h.b.b.g0
    public void D(long j2, boolean z) {
        Arrays.fill(this.u, (Object) null);
        this.w = 0;
        this.x = 0;
        this.z = false;
    }

    @Override // f.h.b.b.g0
    public void H(Format[] formatArr, long j2, long j3) {
        this.y = this.q.b(formatArr[0]);
    }

    public final void J(Metadata metadata, List<Metadata.Entry> list) {
        int i2 = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.f770f;
            if (i2 >= entryArr.length) {
                return;
            }
            Format v = entryArr[i2].v();
            if (v != null && this.q.a(v)) {
                b b = this.q.b(v);
                byte[] g0 = metadata.f770f[i2].g0();
                Objects.requireNonNull(g0);
                this.t.o();
                this.t.q(g0.length);
                ByteBuffer byteBuffer = this.t.f752h;
                int i3 = b0.a;
                byteBuffer.put(g0);
                this.t.r();
                Metadata a = b.a(this.t);
                if (a != null) {
                    J(a, list);
                }
            } else {
                list.add(metadata.f770f[i2]);
            }
            i2++;
        }
    }

    @Override // f.h.b.b.k1
    public int a(Format format) {
        if (this.q.a(format)) {
            return (format.J == null ? 4 : 2) | 0 | 0;
        }
        return 0;
    }

    @Override // f.h.b.b.j1
    public boolean b() {
        return this.z;
    }

    @Override // f.h.b.b.j1
    public boolean e() {
        return true;
    }

    @Override // f.h.b.b.j1, f.h.b.b.k1
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.r.k((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // f.h.b.b.j1
    public void q(long j2, long j3) {
        if (!this.z && this.x < 5) {
            this.t.o();
            s0 A = A();
            int I = I(A, this.t, false);
            if (I == -4) {
                if (this.t.m()) {
                    this.z = true;
                } else {
                    d dVar = this.t;
                    dVar.n = this.A;
                    dVar.r();
                    b bVar = this.y;
                    int i2 = b0.a;
                    Metadata a = bVar.a(this.t);
                    if (a != null) {
                        ArrayList arrayList = new ArrayList(a.f770f.length);
                        J(a, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata(arrayList);
                            int i3 = this.w;
                            int i4 = this.x;
                            int i5 = (i3 + i4) % 5;
                            this.u[i5] = metadata;
                            this.v[i5] = this.t.f754j;
                            this.x = i4 + 1;
                        }
                    }
                }
            } else if (I == -5) {
                Format format = A.b;
                Objects.requireNonNull(format);
                this.A = format.u;
            }
        }
        if (this.x > 0) {
            long[] jArr = this.v;
            int i6 = this.w;
            if (jArr[i6] <= j2) {
                Metadata metadata2 = this.u[i6];
                int i7 = b0.a;
                Handler handler = this.s;
                if (handler != null) {
                    handler.obtainMessage(0, metadata2).sendToTarget();
                } else {
                    this.r.k(metadata2);
                }
                Metadata[] metadataArr = this.u;
                int i8 = this.w;
                metadataArr[i8] = null;
                this.w = (i8 + 1) % 5;
                this.x--;
            }
        }
    }
}

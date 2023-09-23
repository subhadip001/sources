package f.h.b.b.c2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import f.h.b.b.c2.h;
import f.h.b.b.g0;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.m;
import f.h.b.b.g2.p;
import f.h.b.b.s0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: TextRenderer.java */
/* loaded from: classes.dex */
public final class l extends g0 implements Handler.Callback {
    public i A;
    public j B;
    public j C;
    public int D;
    public final Handler q;
    public final k r;
    public final h s;
    public final s0 t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public Format y;
    public g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, Looper looper) {
        super(3);
        Handler handler;
        h hVar = h.a;
        Objects.requireNonNull(kVar);
        this.r = kVar;
        if (looper == null) {
            handler = null;
        } else {
            int i2 = b0.a;
            handler = new Handler(looper, this);
        }
        this.q = handler;
        this.s = hVar;
        this.t = new s0();
    }

    @Override // f.h.b.b.g0
    public void B() {
        this.y = null;
        J();
        N();
        g gVar = this.z;
        Objects.requireNonNull(gVar);
        gVar.release();
        this.z = null;
        this.x = 0;
    }

    @Override // f.h.b.b.g0
    public void D(long j2, boolean z) {
        J();
        this.u = false;
        this.v = false;
        if (this.x != 0) {
            O();
            return;
        }
        N();
        g gVar = this.z;
        Objects.requireNonNull(gVar);
        gVar.flush();
    }

    @Override // f.h.b.b.g0
    public void H(Format[] formatArr, long j2, long j3) {
        this.y = formatArr[0];
        if (this.z != null) {
            this.x = 1;
        } else {
            M();
        }
    }

    public final void J() {
        List<c> emptyList = Collections.emptyList();
        Handler handler = this.q;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.r.l(emptyList);
        }
    }

    public final long K() {
        if (this.D == -1) {
            return Long.MAX_VALUE;
        }
        Objects.requireNonNull(this.B);
        int i2 = this.D;
        f fVar = this.B.f3943h;
        Objects.requireNonNull(fVar);
        if (i2 >= fVar.g()) {
            return Long.MAX_VALUE;
        }
        j jVar = this.B;
        int i3 = this.D;
        f fVar2 = jVar.f3943h;
        Objects.requireNonNull(fVar2);
        return fVar2.d(i3) + jVar.f3944i;
    }

    public final void L(SubtitleDecoderException subtitleDecoderException) {
        String valueOf = String.valueOf(this.y);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(valueOf);
        m.b("TextRenderer", sb.toString(), subtitleDecoderException);
        J();
        O();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
        if (r1.equals("application/pgs") == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.c2.l.M():void");
    }

    public final void N() {
        this.A = null;
        this.D = -1;
        j jVar = this.B;
        if (jVar != null) {
            jVar.o();
            this.B = null;
        }
        j jVar2 = this.C;
        if (jVar2 != null) {
            jVar2.o();
            this.C = null;
        }
    }

    public final void O() {
        N();
        g gVar = this.z;
        Objects.requireNonNull(gVar);
        gVar.release();
        this.z = null;
        this.x = 0;
        M();
    }

    @Override // f.h.b.b.k1
    public int a(Format format) {
        Objects.requireNonNull((h.a) this.s);
        String str = format.q;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) {
            return (format.J == null ? 4 : 2) | 0 | 0;
        }
        return p.i(format.q) ? 1 : 0;
    }

    @Override // f.h.b.b.j1
    public boolean b() {
        return this.v;
    }

    @Override // f.h.b.b.j1
    public boolean e() {
        return true;
    }

    @Override // f.h.b.b.j1, f.h.b.b.k1
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.r.l((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // f.h.b.b.j1
    public void q(long j2, long j3) {
        boolean z;
        if (this.v) {
            return;
        }
        if (this.C == null) {
            g gVar = this.z;
            Objects.requireNonNull(gVar);
            gVar.a(j2);
            try {
                g gVar2 = this.z;
                Objects.requireNonNull(gVar2);
                this.C = gVar2.b();
            } catch (SubtitleDecoderException e2) {
                L(e2);
                return;
            }
        }
        if (this.f4252j != 2) {
            return;
        }
        if (this.B != null) {
            long K = K();
            z = false;
            while (K <= j2) {
                this.D++;
                K = K();
                z = true;
            }
        } else {
            z = false;
        }
        j jVar = this.C;
        if (jVar != null) {
            if (jVar.m()) {
                if (!z && K() == Long.MAX_VALUE) {
                    if (this.x == 2) {
                        O();
                    } else {
                        N();
                        this.v = true;
                    }
                }
            } else if (jVar.f4628g <= j2) {
                j jVar2 = this.B;
                if (jVar2 != null) {
                    jVar2.o();
                }
                f fVar = jVar.f3943h;
                Objects.requireNonNull(fVar);
                this.D = fVar.a(j2 - jVar.f3944i);
                this.B = jVar;
                this.C = null;
                z = true;
            }
        }
        if (z) {
            Objects.requireNonNull(this.B);
            j jVar3 = this.B;
            f fVar2 = jVar3.f3943h;
            Objects.requireNonNull(fVar2);
            List<c> f2 = fVar2.f(j2 - jVar3.f3944i);
            Handler handler = this.q;
            if (handler != null) {
                handler.obtainMessage(0, f2).sendToTarget();
            } else {
                this.r.l(f2);
            }
        }
        if (this.x == 2) {
            return;
        }
        while (!this.u) {
            try {
                i iVar = this.A;
                if (iVar == null) {
                    g gVar3 = this.z;
                    Objects.requireNonNull(gVar3);
                    iVar = gVar3.c();
                    if (iVar == null) {
                        return;
                    }
                    this.A = iVar;
                }
                if (this.x == 1) {
                    iVar.f4610f = 4;
                    g gVar4 = this.z;
                    Objects.requireNonNull(gVar4);
                    gVar4.d(iVar);
                    this.A = null;
                    this.x = 2;
                    return;
                }
                int I = I(this.t, iVar, false);
                if (I == -4) {
                    if (iVar.m()) {
                        this.u = true;
                        this.w = false;
                    } else {
                        Format format = this.t.b;
                        if (format == null) {
                            return;
                        }
                        iVar.n = format.u;
                        iVar.r();
                        this.w &= !iVar.n();
                    }
                    if (!this.w) {
                        g gVar5 = this.z;
                        Objects.requireNonNull(gVar5);
                        gVar5.d(iVar);
                        this.A = null;
                    }
                } else if (I == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e3) {
                L(e3);
                return;
            }
        }
    }
}

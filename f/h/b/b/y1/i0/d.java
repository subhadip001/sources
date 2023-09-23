package f.h.b.b.y1.i0;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.b.b.y1.k;
import f.h.b.b.y1.l;
import java.util.Arrays;
import java.util.Map;

/* compiled from: OggExtractor.java */
/* loaded from: classes.dex */
public class d implements f.h.b.b.y1.h {
    public f.h.b.b.y1.j a;
    public i b;
    public boolean c;

    static {
        a aVar = new l() { // from class: f.h.b.b.y1.i0.a
            @Override // f.h.b.b.y1.l
            public final f.h.b.b.y1.h[] a() {
                return new f.h.b.b.y1.h[]{new d()};
            }

            @Override // f.h.b.b.y1.l
            public /* synthetic */ f.h.b.b.y1.h[] b(Uri uri, Map map) {
                return k.a(this, uri, map);
            }
        };
    }

    public final boolean a(f.h.b.b.y1.i iVar) {
        boolean z;
        boolean equals;
        f fVar = new f();
        if (fVar.a(iVar, true) && (fVar.b & 2) == 2) {
            int min = Math.min(fVar.f4862f, 8);
            t tVar = new t(min);
            iVar.o(tVar.a, 0, min);
            tVar.C(0);
            if (tVar.a() >= 5 && tVar.r() == 127 && tVar.s() == 1179402563) {
                this.b = new c();
            } else {
                tVar.C(0);
                try {
                    z = f.c.a.a.i.L(1, tVar, true);
                } catch (ParserException unused) {
                    z = false;
                }
                if (z) {
                    this.b = new j();
                } else {
                    tVar.C(0);
                    int a = tVar.a();
                    byte[] bArr = h.o;
                    if (a < bArr.length) {
                        equals = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        int length = bArr.length;
                        System.arraycopy(tVar.a, tVar.b, bArr2, 0, length);
                        tVar.b += length;
                        equals = Arrays.equals(bArr2, bArr);
                    }
                    if (equals) {
                        this.b = new h();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // f.h.b.b.y1.h
    public boolean b(f.h.b.b.y1.i iVar) {
        try {
            return a(iVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // f.h.b.b.y1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(f.h.b.b.y1.i r20, f.h.b.b.y1.s r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.y1.i0.d.e(f.h.b.b.y1.i, f.h.b.b.y1.s):int");
    }

    @Override // f.h.b.b.y1.h
    public void f(f.h.b.b.y1.j jVar) {
        this.a = jVar;
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        i iVar = this.b;
        if (iVar != null) {
            e eVar = iVar.a;
            eVar.a.b();
            eVar.b.y(0);
            eVar.c = -1;
            eVar.f4859e = false;
            if (j2 == 0) {
                iVar.e(!iVar.f4873l);
            } else if (iVar.f4869h != 0) {
                long j4 = (iVar.f4870i * j3) / 1000000;
                iVar.f4866e = j4;
                g gVar = iVar.f4865d;
                int i2 = b0.a;
                gVar.c(j4);
                iVar.f4869h = 2;
            }
        }
    }

    @Override // f.h.b.b.y1.h
    public void release() {
    }
}

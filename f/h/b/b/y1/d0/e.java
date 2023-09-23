package f.h.b.b.y1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import f.h.b.b.g2.r;
import f.h.b.b.g2.t;
import f.h.b.b.h2.j;
import f.h.b.b.y1.w;

/* compiled from: VideoTagPayloadReader.java */
/* loaded from: classes.dex */
public final class e extends TagPayloadReader {
    public final t b;
    public final t c;

    /* renamed from: d  reason: collision with root package name */
    public int f4724d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4725e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4726f;

    /* renamed from: g  reason: collision with root package name */
    public int f4727g;

    public e(w wVar) {
        super(wVar);
        this.b = new t(r.a);
        this.c = new t(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        int r = tVar.r();
        int i2 = (r >> 4) & 15;
        int i3 = r & 15;
        if (i3 == 7) {
            this.f4727g = i2;
            return i2 != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException(f.a.b.a.a.d(39, "Video format not supported: ", i3));
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j2) {
        int r = tVar.r();
        byte[] bArr = tVar.a;
        int i2 = tVar.b;
        int i3 = i2 + 1;
        tVar.b = i3;
        int i4 = i3 + 1;
        tVar.b = i4;
        int i5 = (((bArr[i2] & 255) << 24) >> 8) | ((bArr[i3] & 255) << 8);
        tVar.b = i4 + 1;
        long j3 = (((bArr[i4] & 255) | i5) * 1000) + j2;
        if (r == 0 && !this.f4725e) {
            t tVar2 = new t(new byte[tVar.a()]);
            tVar.e(tVar2.a, 0, tVar.a());
            j b = j.b(tVar2);
            this.f4724d = b.b;
            Format.b bVar = new Format.b();
            bVar.f722k = "video/avc";
            bVar.f719h = b.f4348f;
            bVar.p = b.c;
            bVar.q = b.f4346d;
            bVar.t = b.f4347e;
            bVar.f724m = b.a;
            this.a.e(bVar.a());
            this.f4725e = true;
            return false;
        } else if (r == 1 && this.f4725e) {
            int i6 = this.f4727g == 1 ? 1 : 0;
            if (this.f4726f || i6 != 0) {
                byte[] bArr2 = this.c.a;
                bArr2[0] = 0;
                bArr2[1] = 0;
                bArr2[2] = 0;
                int i7 = 4 - this.f4724d;
                int i8 = 0;
                while (tVar.a() > 0) {
                    tVar.e(this.c.a, i7, this.f4724d);
                    this.c.C(0);
                    int u = this.c.u();
                    this.b.C(0);
                    this.a.c(this.b, 4);
                    this.a.c(tVar, u);
                    i8 = i8 + 4 + u;
                }
                this.a.d(j3, i6, i8, 0, null);
                this.f4726f = true;
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}

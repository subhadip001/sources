package f.h.b.b.y1.d0;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import f.h.b.b.g2.s;
import f.h.b.b.g2.t;
import f.h.b.b.u1.k;
import f.h.b.b.y1.w;
import java.util.Collections;

/* compiled from: AudioTagPayloadReader.java */
/* loaded from: classes.dex */
public final class b extends TagPayloadReader {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4711e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f4712d;

    public b(w wVar) {
        super(wVar);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        if (!this.b) {
            int r = tVar.r();
            int i2 = (r >> 4) & 15;
            this.f4712d = i2;
            if (i2 == 2) {
                int i3 = f4711e[(r >> 2) & 3];
                Format.b bVar = new Format.b();
                bVar.f722k = "audio/mpeg";
                bVar.x = 1;
                bVar.y = i3;
                this.a.e(bVar.a());
                this.c = true;
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                Format.b bVar2 = new Format.b();
                bVar2.f722k = str;
                bVar2.x = 1;
                bVar2.y = 8000;
                this.a.e(bVar2.a());
                this.c = true;
            } else if (i2 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException(f.a.b.a.a.d(39, "Audio format not supported: ", this.f4712d));
            }
            this.b = true;
        } else {
            tVar.D(1);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j2) {
        if (this.f4712d == 2) {
            int a = tVar.a();
            this.a.c(tVar, a);
            this.a.d(j2, 1, a, 0, null);
            return true;
        }
        int r = tVar.r();
        if (r == 0 && !this.c) {
            int a2 = tVar.a();
            byte[] bArr = new byte[a2];
            System.arraycopy(tVar.a, tVar.b, bArr, 0, a2);
            tVar.b += a2;
            k.b c = k.c(new s(bArr), false);
            Format.b bVar = new Format.b();
            bVar.f722k = "audio/mp4a-latm";
            bVar.f719h = c.c;
            bVar.x = c.b;
            bVar.y = c.a;
            bVar.f724m = Collections.singletonList(bArr);
            this.a.e(bVar.a());
            this.c = true;
            return false;
        } else if (this.f4712d != 10 || r == 1) {
            int a3 = tVar.a();
            this.a.c(tVar, a3);
            this.a.d(j2, 1, a3, 0, null);
            return true;
        } else {
            return false;
        }
    }
}

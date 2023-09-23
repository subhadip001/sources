package f.h.b.b.y1;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes.dex */
public final class o {
    public final int a;
    public final int b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5100d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5101e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5102f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5103g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5104h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5105i;

    /* renamed from: j  reason: collision with root package name */
    public final long f5106j;

    /* renamed from: k  reason: collision with root package name */
    public final a f5107k;

    /* renamed from: l  reason: collision with root package name */
    public final Metadata f5108l;

    /* compiled from: FlacStreamMetadata.java */
    /* loaded from: classes.dex */
    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public o(byte[] bArr, int i2) {
        f.h.b.b.g2.s sVar = new f.h.b.b.g2.s(bArr);
        sVar.k(i2 * 8);
        this.a = sVar.g(16);
        this.b = sVar.g(16);
        this.c = sVar.g(24);
        this.f5100d = sVar.g(24);
        int g2 = sVar.g(20);
        this.f5101e = g2;
        this.f5102f = h(g2);
        this.f5103g = sVar.g(3) + 1;
        int g3 = sVar.g(5) + 1;
        this.f5104h = g3;
        this.f5105i = c(g3);
        this.f5106j = (b0.J(sVar.g(4)) << 32) | b0.J(sVar.g(32));
        this.f5107k = null;
        this.f5108l = null;
    }

    public static Metadata a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String[] H = b0.H(str, "=");
            if (H.length != 2) {
                String valueOf = String.valueOf(str);
                Log.w("FlacStreamMetadata", valueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(valueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(H[0], H[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static int c(int i2) {
        if (i2 != 8) {
            if (i2 != 12) {
                if (i2 != 16) {
                    if (i2 != 20) {
                        return i2 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int h(int i2) {
        switch (i2) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public o b(a aVar) {
        return new o(this.a, this.b, this.c, this.f5100d, this.f5101e, this.f5103g, this.f5104h, this.f5106j, aVar, this.f5108l);
    }

    public long d() {
        long j2 = this.f5106j;
        if (j2 == 0) {
            return -9223372036854775807L;
        }
        return (j2 * 1000000) / this.f5101e;
    }

    public Format e(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i2 = this.f5100d;
        if (i2 <= 0) {
            i2 = -1;
        }
        Metadata f2 = f(metadata);
        Format.b bVar = new Format.b();
        bVar.f722k = "audio/flac";
        bVar.f723l = i2;
        bVar.x = this.f5103g;
        bVar.y = this.f5101e;
        bVar.f724m = Collections.singletonList(bArr);
        bVar.f720i = f2;
        return bVar.a();
    }

    public Metadata f(Metadata metadata) {
        Metadata metadata2 = this.f5108l;
        return metadata2 == null ? metadata : metadata == null ? metadata2 : metadata2.b(metadata.f770f);
    }

    public long g(long j2) {
        return b0.i((j2 * this.f5101e) / 1000000, 0L, this.f5106j - 1);
    }

    public o(int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, a aVar, Metadata metadata) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.f5100d = i5;
        this.f5101e = i6;
        this.f5102f = h(i6);
        this.f5103g = i7;
        this.f5104h = i8;
        this.f5105i = c(i8);
        this.f5106j = j2;
        this.f5107k = aVar;
        this.f5108l = metadata;
    }
}

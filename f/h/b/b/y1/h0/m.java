package f.h.b.b.y1.h0;

import com.google.android.exoplayer2.Format;

/* compiled from: Track.java */
/* loaded from: classes.dex */
public final class m {
    public final int a;
    public final int b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4823d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4824e;

    /* renamed from: f  reason: collision with root package name */
    public final Format f4825f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4826g;

    /* renamed from: h  reason: collision with root package name */
    public final long[] f4827h;

    /* renamed from: i  reason: collision with root package name */
    public final long[] f4828i;

    /* renamed from: j  reason: collision with root package name */
    public final int f4829j;

    /* renamed from: k  reason: collision with root package name */
    public final n[] f4830k;

    public m(int i2, int i3, long j2, long j3, long j4, Format format, int i4, n[] nVarArr, int i5, long[] jArr, long[] jArr2) {
        this.a = i2;
        this.b = i3;
        this.c = j2;
        this.f4823d = j3;
        this.f4824e = j4;
        this.f4825f = format;
        this.f4826g = i4;
        this.f4830k = nVarArr;
        this.f4829j = i5;
        this.f4827h = jArr;
        this.f4828i = jArr2;
    }

    public n a(int i2) {
        n[] nVarArr = this.f4830k;
        if (nVarArr == null) {
            return null;
        }
        return nVarArr[i2];
    }
}

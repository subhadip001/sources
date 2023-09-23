package f.h.b.b.y1.e0;

import android.util.Log;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import f.h.b.b.g2.b0;
import f.h.b.b.g2.t;
import f.h.b.b.y1.e0.b;
import f.h.b.b.y1.h;
import f.h.b.b.y1.h0.l;
import f.h.b.b.y1.i;
import f.h.b.b.y1.j;
import f.h.b.b.y1.s;
import f.h.b.b.y1.t;
import f.h.b.b.y1.w;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: JpegExtractor.java */
/* loaded from: classes.dex */
public final class a implements h {
    public j b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f4732d;

    /* renamed from: e  reason: collision with root package name */
    public int f4733e;

    /* renamed from: g  reason: collision with root package name */
    public MotionPhotoMetadata f4735g;

    /* renamed from: h  reason: collision with root package name */
    public i f4736h;

    /* renamed from: i  reason: collision with root package name */
    public c f4737i;

    /* renamed from: j  reason: collision with root package name */
    public f.h.b.b.y1.h0.i f4738j;
    public final t a = new t(12);

    /* renamed from: f  reason: collision with root package name */
    public long f4734f = -1;

    public final void a() {
        c(new Metadata.Entry[0]);
        j jVar = this.b;
        Objects.requireNonNull(jVar);
        jVar.j();
        this.b.a(new t.b(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // f.h.b.b.y1.h
    public boolean b(i iVar) {
        iVar.o(this.a.a, 0, 12);
        if (this.a.w() == 65496 && this.a.w() == 65505) {
            this.a.D(2);
            return this.a.s() == 1165519206 && this.a.w() == 0;
        }
        return false;
    }

    public final void c(Metadata.Entry... entryArr) {
        j jVar = this.b;
        Objects.requireNonNull(jVar);
        w p = jVar.p(1024, 4);
        Format.b bVar = new Format.b();
        bVar.f720i = new Metadata(entryArr);
        p.e(bVar.a());
    }

    @Override // f.h.b.b.y1.h
    public int e(i iVar, s sVar) {
        int i2;
        String l2;
        String l3;
        b bVar;
        long j2;
        int i3 = this.c;
        if (i3 == 0) {
            this.a.y(2);
            iVar.readFully(this.a.a, 0, 2);
            int w = this.a.w();
            this.f4732d = w;
            if (w == 65498) {
                if (this.f4734f != -1) {
                    this.c = 4;
                } else {
                    a();
                }
            } else if ((w < 65488 || w > 65497) && w != 65281) {
                this.c = 1;
            }
            return 0;
        } else if (i3 == 1) {
            this.a.y(2);
            iVar.readFully(this.a.a, 0, 2);
            this.f4733e = this.a.w() - 2;
            this.c = 2;
            return 0;
        } else if (i3 != 2) {
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f4737i == null || iVar != this.f4736h) {
                    this.f4736h = iVar;
                    this.f4737i = new c(iVar, this.f4734f);
                }
                f.h.b.b.y1.h0.i iVar2 = this.f4738j;
                Objects.requireNonNull(iVar2);
                int e2 = iVar2.e(this.f4737i, sVar);
                if (e2 == 1) {
                    sVar.a += this.f4734f;
                }
                return e2;
            }
            long position = iVar.getPosition();
            long j3 = this.f4734f;
            if (position != j3) {
                sVar.a = j3;
                return 1;
            }
            if (!iVar.e(this.a.a, 0, 1, true)) {
                a();
            } else {
                iVar.l();
                if (this.f4738j == null) {
                    this.f4738j = new f.h.b.b.y1.h0.i(0);
                }
                c cVar = new c(iVar, this.f4734f);
                this.f4737i = cVar;
                if (l.a(cVar, false, (this.f4738j.a & 2) != 0)) {
                    f.h.b.b.y1.h0.i iVar3 = this.f4738j;
                    long j4 = this.f4734f;
                    j jVar = this.b;
                    Objects.requireNonNull(jVar);
                    iVar3.r = new d(j4, jVar);
                    MotionPhotoMetadata motionPhotoMetadata = this.f4735g;
                    Objects.requireNonNull(motionPhotoMetadata);
                    c(motionPhotoMetadata);
                    this.c = 5;
                } else {
                    a();
                }
            }
            return 0;
        } else {
            if (this.f4732d == 65505) {
                int i4 = this.f4733e;
                byte[] bArr = new byte[i4];
                iVar.readFully(bArr, 0, i4);
                if (this.f4735g == null) {
                    MotionPhotoMetadata motionPhotoMetadata2 = null;
                    if (i4 + 0 == 0) {
                        l2 = null;
                        i2 = 0;
                    } else {
                        i2 = 0;
                        while (i2 < i4 && bArr[i2] != 0) {
                            i2++;
                        }
                        l2 = b0.l(bArr, 0, i2 + 0);
                        if (i2 < i4) {
                            i2++;
                        }
                    }
                    if ("http://ns.adobe.com/xap/1.0/".equals(l2)) {
                        if (i4 - i2 == 0) {
                            l3 = null;
                        } else {
                            int i5 = i2;
                            while (i5 < i4 && bArr[i5] != 0) {
                                i5++;
                            }
                            l3 = b0.l(bArr, i2, i5 - i2);
                        }
                        if (l3 != null) {
                            long a = iVar.a();
                            if (a != -1) {
                                try {
                                    bVar = e.a(l3);
                                } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                                    Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                    bVar = null;
                                }
                                if (bVar != null && bVar.b.size() >= 2) {
                                    long j5 = -1;
                                    long j6 = -1;
                                    long j7 = -1;
                                    long j8 = -1;
                                    boolean z = false;
                                    for (int size = bVar.b.size() - 1; size >= 0; size--) {
                                        b.a aVar = bVar.b.get(size);
                                        z |= "video/mp4".equals(aVar.a);
                                        if (size == 0) {
                                            j2 = a - aVar.c;
                                            a = 0;
                                        } else {
                                            long j9 = a - aVar.b;
                                            j2 = a;
                                            a = j9;
                                        }
                                        if (z && a != j2) {
                                            j8 = j2 - a;
                                            j7 = a;
                                            z = false;
                                        }
                                        if (size == 0) {
                                            j6 = j2;
                                            j5 = a;
                                        }
                                    }
                                    if (j7 != -1 && j8 != -1 && j5 != -1 && j6 != -1) {
                                        motionPhotoMetadata2 = new MotionPhotoMetadata(j5, j6, bVar.a, j7, j8);
                                    }
                                }
                            }
                            this.f4735g = motionPhotoMetadata2;
                            if (motionPhotoMetadata2 != null) {
                                this.f4734f = motionPhotoMetadata2.f845i;
                            }
                        }
                    }
                }
            } else {
                iVar.m(this.f4733e);
            }
            this.c = 0;
            return 0;
        }
    }

    @Override // f.h.b.b.y1.h
    public void f(j jVar) {
        this.b = jVar;
    }

    @Override // f.h.b.b.y1.h
    public void g(long j2, long j3) {
        if (j2 == 0) {
            this.c = 0;
        } else if (this.c == 5) {
            f.h.b.b.y1.h0.i iVar = this.f4738j;
            Objects.requireNonNull(iVar);
            iVar.g(j2, j3);
        }
    }

    @Override // f.h.b.b.y1.h
    public void release() {
        f.h.b.b.y1.h0.i iVar = this.f4738j;
        if (iVar != null) {
            Objects.requireNonNull(iVar);
        }
    }
}

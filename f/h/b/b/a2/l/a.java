package f.h.b.b.a2.l;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import f.h.b.b.a2.d;
import f.h.b.b.a2.g;
import f.h.b.b.g2.a0;
import f.h.b.b.g2.s;
import f.h.b.b.g2.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceInfoDecoder.java */
/* loaded from: classes.dex */
public final class a extends g {
    public final t a = new t();
    public final s b = new s();
    public a0 c;

    @Override // f.h.b.b.a2.g
    public Metadata b(d dVar, ByteBuffer byteBuffer) {
        int i2;
        long j2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        int i3;
        int i4;
        int i5;
        boolean z4;
        long j5;
        List list;
        long j6;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j7;
        int i6;
        int i7;
        int i8;
        boolean z9;
        long j8;
        a0 a0Var = this.c;
        if (a0Var == null || dVar.n != a0Var.c()) {
            a0 a0Var2 = new a0(dVar.f754j);
            this.c = a0Var2;
            a0Var2.a(dVar.f754j - dVar.n);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.A(array, limit);
        this.b.j(array, limit);
        this.b.m(39);
        long g2 = (this.b.g(1) << 32) | this.b.g(32);
        this.b.m(20);
        int g3 = this.b.g(12);
        int g4 = this.b.g(8);
        this.a.D(14);
        Metadata.Entry entry = null;
        if (g4 == 0) {
            entry = new SpliceNullCommand();
        } else if (g4 != 255) {
            long j9 = 128;
            if (g4 == 4) {
                t tVar = this.a;
                int r = tVar.r();
                ArrayList arrayList2 = new ArrayList(r);
                int i9 = 0;
                while (i9 < r) {
                    long s = tVar.s();
                    boolean z10 = (tVar.r() & 128) != 0;
                    ArrayList arrayList3 = new ArrayList();
                    if (z10) {
                        i2 = r;
                        j2 = j9;
                        arrayList = arrayList3;
                        z = false;
                        z2 = false;
                        j3 = -9223372036854775807L;
                        z3 = false;
                        j4 = -9223372036854775807L;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    } else {
                        int r2 = tVar.r();
                        boolean z11 = (r2 & 128) != 0;
                        boolean z12 = (r2 & 64) != 0;
                        boolean z13 = (r2 & 32) != 0;
                        long s2 = z12 ? tVar.s() : -9223372036854775807L;
                        if (z12) {
                            i2 = r;
                        } else {
                            int r3 = tVar.r();
                            ArrayList arrayList4 = new ArrayList(r3);
                            int i10 = 0;
                            while (i10 < r3) {
                                arrayList4.add(new SpliceScheduleCommand.b(tVar.r(), tVar.s(), null));
                                i10++;
                                r3 = r3;
                                r = r;
                            }
                            i2 = r;
                            arrayList3 = arrayList4;
                        }
                        if (z13) {
                            long r4 = tVar.r();
                            j2 = 128;
                            z4 = (r4 & 128) != 0;
                            j5 = ((((r4 & 1) << 32) | tVar.s()) * 1000) / 90;
                        } else {
                            j2 = 128;
                            z4 = false;
                            j5 = -9223372036854775807L;
                        }
                        z3 = z4;
                        j4 = j5;
                        arrayList = arrayList3;
                        i3 = tVar.w();
                        z = z11;
                        z2 = z12;
                        j3 = s2;
                        i4 = tVar.r();
                        i5 = tVar.r();
                    }
                    arrayList2.add(new SpliceScheduleCommand.c(s, z10, z, z2, arrayList, j3, z3, j4, i3, i4, i5));
                    i9++;
                    j9 = j2;
                    r = i2;
                }
                entry = new SpliceScheduleCommand(arrayList2);
            } else if (g4 == 5) {
                t tVar2 = this.a;
                a0 a0Var3 = this.c;
                long s3 = tVar2.s();
                boolean z14 = (tVar2.r() & 128) != 0;
                List emptyList = Collections.emptyList();
                if (z14) {
                    list = emptyList;
                    j6 = -9223372036854775807L;
                    z5 = false;
                    z6 = false;
                    z7 = false;
                    z8 = false;
                    j7 = -9223372036854775807L;
                    i6 = 0;
                    i7 = 0;
                    i8 = 0;
                } else {
                    int r5 = tVar2.r();
                    boolean z15 = (r5 & 128) != 0;
                    boolean z16 = (r5 & 64) != 0;
                    boolean z17 = (r5 & 32) != 0;
                    boolean z18 = (r5 & 16) != 0;
                    long b = (!z16 || z18) ? -9223372036854775807L : TimeSignalCommand.b(tVar2, g2);
                    if (!z16) {
                        int r6 = tVar2.r();
                        ArrayList arrayList5 = new ArrayList(r6);
                        for (int i11 = 0; i11 < r6; i11++) {
                            int r7 = tVar2.r();
                            long b2 = !z18 ? TimeSignalCommand.b(tVar2, g2) : -9223372036854775807L;
                            arrayList5.add(new SpliceInsertCommand.b(r7, b2, a0Var3.b(b2), null));
                        }
                        emptyList = arrayList5;
                    }
                    if (z17) {
                        long r8 = tVar2.r();
                        z9 = (r8 & 128) != 0;
                        j8 = ((((r8 & 1) << 32) | tVar2.s()) * 1000) / 90;
                    } else {
                        z9 = false;
                        j8 = -9223372036854775807L;
                    }
                    int w = tVar2.w();
                    int r9 = tVar2.r();
                    i6 = w;
                    z8 = z9;
                    i8 = tVar2.r();
                    list = emptyList;
                    j7 = j8;
                    i7 = r9;
                    z5 = z15;
                    j6 = b;
                    z7 = z18;
                    z6 = z16;
                }
                entry = new SpliceInsertCommand(s3, z14, z5, z6, z7, j6, a0Var3.b(j6), list, z8, j7, i6, i7, i8);
            } else if (g4 == 6) {
                t tVar3 = this.a;
                a0 a0Var4 = this.c;
                long b3 = TimeSignalCommand.b(tVar3, g2);
                entry = new TimeSignalCommand(b3, a0Var4.b(b3));
            }
        } else {
            t tVar4 = this.a;
            long s4 = tVar4.s();
            int i12 = g3 - 4;
            byte[] bArr = new byte[i12];
            System.arraycopy(tVar4.a, tVar4.b, bArr, 0, i12);
            tVar4.b += i12;
            entry = new PrivateCommand(s4, bArr, g2);
        }
        return entry == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entry);
    }
}

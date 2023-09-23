package f.h.b.b.y1;

import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import f.h.b.b.g2.b0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* compiled from: DefaultExtractorInput.java */
/* loaded from: classes.dex */
public final class e implements i {
    public final f.h.b.b.f2.f b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public long f4728d;

    /* renamed from: f  reason: collision with root package name */
    public int f4730f;

    /* renamed from: g  reason: collision with root package name */
    public int f4731g;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f4729e = new byte[LogFileManager.MAX_LOG_SIZE];
    public final byte[] a = new byte[4096];

    public e(f.h.b.b.f2.f fVar, long j2, long j3) {
        this.b = fVar;
        this.f4728d = j2;
        this.c = j3;
    }

    @Override // f.h.b.b.y1.i
    public long a() {
        return this.c;
    }

    @Override // f.h.b.b.y1.i, f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        int i4 = this.f4731g;
        int i5 = 0;
        if (i4 != 0) {
            int min = Math.min(i4, i3);
            System.arraycopy(this.f4729e, 0, bArr, i2, min);
            t(min);
            i5 = min;
        }
        if (i5 == 0) {
            i5 = s(bArr, i2, i3, 0, true);
        }
        q(i5);
        return i5;
    }

    @Override // f.h.b.b.y1.i
    public boolean c(byte[] bArr, int i2, int i3, boolean z) {
        int min;
        int i4 = this.f4731g;
        if (i4 == 0) {
            min = 0;
        } else {
            min = Math.min(i4, i3);
            System.arraycopy(this.f4729e, 0, bArr, i2, min);
            t(min);
        }
        int i5 = min;
        while (i5 < i3 && i5 != -1) {
            i5 = s(bArr, i2, i3, i5, z);
        }
        q(i5);
        return i5 != -1;
    }

    @Override // f.h.b.b.y1.i
    public boolean e(byte[] bArr, int i2, int i3, boolean z) {
        if (p(i3, z)) {
            System.arraycopy(this.f4729e, this.f4730f - i3, bArr, i2, i3);
            return true;
        }
        return false;
    }

    @Override // f.h.b.b.y1.i
    public long f() {
        return this.f4728d + this.f4730f;
    }

    @Override // f.h.b.b.y1.i
    public void g(int i2) {
        p(i2, false);
    }

    @Override // f.h.b.b.y1.i
    public long getPosition() {
        return this.f4728d;
    }

    @Override // f.h.b.b.y1.i
    public int h(int i2) {
        int min = Math.min(this.f4731g, i2);
        t(min);
        if (min == 0) {
            byte[] bArr = this.a;
            min = s(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        q(min);
        return min;
    }

    @Override // f.h.b.b.y1.i
    public int j(byte[] bArr, int i2, int i3) {
        int min;
        r(i3);
        int i4 = this.f4731g;
        int i5 = this.f4730f;
        int i6 = i4 - i5;
        if (i6 == 0) {
            min = s(this.f4729e, i5, i3, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f4731g += min;
        } else {
            min = Math.min(i3, i6);
        }
        System.arraycopy(this.f4729e, this.f4730f, bArr, i2, min);
        this.f4730f += min;
        return min;
    }

    @Override // f.h.b.b.y1.i
    public void l() {
        this.f4730f = 0;
    }

    @Override // f.h.b.b.y1.i
    public void m(int i2) {
        int min = Math.min(this.f4731g, i2);
        t(min);
        int i3 = min;
        while (i3 < i2 && i3 != -1) {
            i3 = s(this.a, -i3, Math.min(i2, this.a.length + i3), i3, false);
        }
        q(i3);
    }

    @Override // f.h.b.b.y1.i
    public void o(byte[] bArr, int i2, int i3) {
        e(bArr, i2, i3, false);
    }

    public boolean p(int i2, boolean z) {
        r(i2);
        int i3 = this.f4731g - this.f4730f;
        while (i3 < i2) {
            i3 = s(this.f4729e, this.f4730f, i2, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.f4731g = this.f4730f + i3;
        }
        this.f4730f += i2;
        return true;
    }

    public final void q(int i2) {
        if (i2 != -1) {
            this.f4728d += i2;
        }
    }

    public final void r(int i2) {
        int i3 = this.f4730f + i2;
        byte[] bArr = this.f4729e;
        if (i3 > bArr.length) {
            this.f4729e = Arrays.copyOf(this.f4729e, b0.h(bArr.length * 2, LogFileManager.MAX_LOG_SIZE + i3, i3 + 524288));
        }
    }

    @Override // f.h.b.b.y1.i
    public void readFully(byte[] bArr, int i2, int i3) {
        c(bArr, i2, i3, false);
    }

    public final int s(byte[] bArr, int i2, int i3, int i4, boolean z) {
        if (!Thread.interrupted()) {
            int b = this.b.b(bArr, i2 + i4, i3 - i4);
            if (b == -1) {
                if (i4 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + b;
        }
        throw new InterruptedIOException();
    }

    public final void t(int i2) {
        int i3 = this.f4731g - i2;
        this.f4731g = i3;
        this.f4730f = 0;
        byte[] bArr = this.f4729e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[LogFileManager.MAX_LOG_SIZE + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f4729e = bArr2;
    }
}

package com.google.android.exoplayer2.decoder;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import f.h.b.b.v1.a;
import f.h.b.b.v1.b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class DecoderInputBuffer extends a {

    /* renamed from: h  reason: collision with root package name */
    public ByteBuffer f752h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f753i;

    /* renamed from: j  reason: collision with root package name */
    public long f754j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f755k;

    /* renamed from: l  reason: collision with root package name */
    public final int f756l;

    /* renamed from: g  reason: collision with root package name */
    public final b f751g = new b();

    /* renamed from: m  reason: collision with root package name */
    public final int f757m = 0;

    /* loaded from: classes.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 44
                r0.<init>(r1)
                java.lang.String r1 = "Buffer too small ("
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = " < "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = ")"
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i2) {
        this.f756l = i2;
    }

    public void o() {
        this.f4610f = 0;
        ByteBuffer byteBuffer = this.f752h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f755k;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f753i = false;
    }

    public final ByteBuffer p(int i2) {
        int i3 = this.f756l;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f752h;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    public void q(int i2) {
        int i3 = i2 + this.f757m;
        ByteBuffer byteBuffer = this.f752h;
        if (byteBuffer == null) {
            this.f752h = p(i3);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i3 + position;
        if (capacity >= i4) {
            this.f752h = byteBuffer;
            return;
        }
        ByteBuffer p = p(i4);
        p.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            p.put(byteBuffer);
        }
        this.f752h = p;
    }

    public final void r() {
        ByteBuffer byteBuffer = this.f752h;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f755k;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean s() {
        return j(CommonUtils.BYTES_IN_A_GIGABYTE);
    }
}

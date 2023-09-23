package f.h.b.b.v1;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import f.h.b.b.c2.i;
import f.h.b.b.e2.j;
import f.h.b.b.v1.f;
import java.util.ArrayDeque;
import java.util.Objects;

/* compiled from: SimpleDecoder.java */
/* loaded from: classes.dex */
public abstract class g<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements c<I, O, E> {
    public final Thread a;
    public final Object b = new Object();
    public final ArrayDeque<I> c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<O> f4629d = new ArrayDeque<>();

    /* renamed from: e  reason: collision with root package name */
    public final I[] f4630e;

    /* renamed from: f  reason: collision with root package name */
    public final O[] f4631f;

    /* renamed from: g  reason: collision with root package name */
    public int f4632g;

    /* renamed from: h  reason: collision with root package name */
    public int f4633h;

    /* renamed from: i  reason: collision with root package name */
    public I f4634i;

    /* renamed from: j  reason: collision with root package name */
    public E f4635j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4636k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4637l;

    /* renamed from: m  reason: collision with root package name */
    public int f4638m;

    /* compiled from: SimpleDecoder.java */
    /* loaded from: classes.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            do {
                try {
                } catch (InterruptedException e2) {
                    throw new IllegalStateException(e2);
                }
            } while (gVar.f());
        }
    }

    public g(I[] iArr, O[] oArr) {
        this.f4630e = iArr;
        this.f4632g = iArr.length;
        for (int i2 = 0; i2 < this.f4632g; i2++) {
            this.f4630e[i2] = new i();
        }
        this.f4631f = oArr;
        this.f4633h = oArr.length;
        for (int i3 = 0; i3 < this.f4633h; i3++) {
            final f.h.b.b.c2.d dVar = (f.h.b.b.c2.d) this;
            this.f4631f[i3] = new f.h.b.b.c2.e(new f.a() { // from class: f.h.b.b.c2.a
                @Override // f.h.b.b.v1.f.a
                public final void a(f.h.b.b.v1.f fVar) {
                    d dVar2 = d.this;
                    j jVar = (j) fVar;
                    synchronized (dVar2.b) {
                        jVar.p();
                        O[] oArr2 = dVar2.f4631f;
                        int i4 = dVar2.f4633h;
                        dVar2.f4633h = i4 + 1;
                        oArr2[i4] = jVar;
                        dVar2.g();
                    }
                }
            });
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    @Override // f.h.b.b.v1.c
    public Object b() {
        O removeFirst;
        synchronized (this.b) {
            h();
            removeFirst = this.f4629d.isEmpty() ? null : this.f4629d.removeFirst();
        }
        return removeFirst;
    }

    @Override // f.h.b.b.v1.c
    public Object c() {
        I i2;
        synchronized (this.b) {
            h();
            j.g(this.f4634i == null);
            int i3 = this.f4632g;
            if (i3 == 0) {
                i2 = null;
            } else {
                I[] iArr = this.f4630e;
                int i4 = i3 - 1;
                this.f4632g = i4;
                i2 = iArr[i4];
            }
            this.f4634i = i2;
        }
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f.h.b.b.v1.c
    public void d(Object obj) {
        DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) obj;
        synchronized (this.b) {
            h();
            j.c(decoderInputBuffer == this.f4634i);
            this.c.addLast(decoderInputBuffer);
            g();
            this.f4634i = null;
        }
    }

    public abstract E e(I i2, O o, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            monitor-enter(r0)
        L3:
            boolean r1 = r7.f4637l     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L20
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r1 = r7.c     // Catch: java.lang.Throwable -> L9e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L17
            int r1 = r7.f4633h     // Catch: java.lang.Throwable -> L9e
            if (r1 <= 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            if (r1 != 0) goto L20
            java.lang.Object r1 = r7.b     // Catch: java.lang.Throwable -> L9e
            r1.wait()     // Catch: java.lang.Throwable -> L9e
            goto L3
        L20:
            boolean r1 = r7.f4637l     // Catch: java.lang.Throwable -> L9e
            if (r1 == 0) goto L26
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            return r2
        L26:
            java.util.ArrayDeque<I extends com.google.android.exoplayer2.decoder.DecoderInputBuffer> r1 = r7.c     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L9e
            com.google.android.exoplayer2.decoder.DecoderInputBuffer r1 = (com.google.android.exoplayer2.decoder.DecoderInputBuffer) r1     // Catch: java.lang.Throwable -> L9e
            O extends f.h.b.b.v1.f[] r4 = r7.f4631f     // Catch: java.lang.Throwable -> L9e
            int r5 = r7.f4633h     // Catch: java.lang.Throwable -> L9e
            int r5 = r5 - r3
            r7.f4633h = r5     // Catch: java.lang.Throwable -> L9e
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r7.f4636k     // Catch: java.lang.Throwable -> L9e
            r7.f4636k = r2     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            boolean r0 = r1.m()
            if (r0 == 0) goto L47
            r0 = 4
            r4.i(r0)
            goto L75
        L47:
            boolean r0 = r1.l()
            if (r0 == 0) goto L52
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.i(r0)
        L52:
            com.google.android.exoplayer2.decoder.DecoderException r0 = r7.e(r1, r4, r5)     // Catch: java.lang.OutOfMemoryError -> L57 java.lang.RuntimeException -> L60
            goto L69
        L57:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L68
        L60:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L68:
            r0 = r5
        L69:
            if (r0 == 0) goto L75
            java.lang.Object r5 = r7.b
            monitor-enter(r5)
            r7.f4635j = r0     // Catch: java.lang.Throwable -> L72
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
            return r2
        L72:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L72
            throw r0
        L75:
            java.lang.Object r5 = r7.b
            monitor-enter(r5)
            boolean r0 = r7.f4636k     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L80
            r4.o()     // Catch: java.lang.Throwable -> L9b
            goto L96
        L80:
            boolean r0 = r4.l()     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8f
            int r0 = r7.f4638m     // Catch: java.lang.Throwable -> L9b
            int r0 = r0 + r3
            r7.f4638m = r0     // Catch: java.lang.Throwable -> L9b
            r4.o()     // Catch: java.lang.Throwable -> L9b
            goto L96
        L8f:
            r7.f4638m = r2     // Catch: java.lang.Throwable -> L9b
            java.util.ArrayDeque<O extends f.h.b.b.v1.f> r0 = r7.f4629d     // Catch: java.lang.Throwable -> L9b
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L9b
        L96:
            r7.i(r1)     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            return r3
        L9b:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L9b
            throw r0
        L9e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.b.b.v1.g.f():boolean");
    }

    @Override // f.h.b.b.v1.c
    public final void flush() {
        synchronized (this.b) {
            this.f4636k = true;
            this.f4638m = 0;
            I i2 = this.f4634i;
            if (i2 != null) {
                i(i2);
                this.f4634i = null;
            }
            while (!this.c.isEmpty()) {
                i(this.c.removeFirst());
            }
            while (!this.f4629d.isEmpty()) {
                this.f4629d.removeFirst().o();
            }
        }
    }

    public final void g() {
        if (!this.c.isEmpty() && this.f4633h > 0) {
            this.b.notify();
        }
    }

    public final void h() {
        E e2 = this.f4635j;
        if (e2 != null) {
            throw e2;
        }
    }

    public final void i(I i2) {
        i2.o();
        I[] iArr = this.f4630e;
        int i3 = this.f4632g;
        this.f4632g = i3 + 1;
        iArr[i3] = i2;
    }

    @Override // f.h.b.b.v1.c
    public void release() {
        synchronized (this.b) {
            this.f4637l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}

package e.u.b;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal<n> f2886j = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    public static Comparator<c> f2887k = new a();

    /* renamed from: g  reason: collision with root package name */
    public long f2889g;

    /* renamed from: h  reason: collision with root package name */
    public long f2890h;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<RecyclerView> f2888f = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<c> f2891i = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return r1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(e.u.b.n.c r7, e.u.b.n.c r8) {
            /*
                r6 = this;
                e.u.b.n$c r7 = (e.u.b.n.c) r7
                e.u.b.n$c r8 = (e.u.b.n.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2893d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2893d
                if (r4 != 0) goto L13
                r4 = 1
                goto L14
            L13:
                r4 = 0
            L14:
                r5 = -1
                if (r3 == r4) goto L1a
                if (r0 != 0) goto L22
                goto L23
            L1a:
                boolean r0 = r7.a
                boolean r3 = r8.a
                if (r0 == r3) goto L25
                if (r0 == 0) goto L23
            L22:
                r1 = -1
            L23:
                r2 = r1
                goto L36
            L25:
                int r0 = r8.b
                int r1 = r7.b
                int r0 = r0 - r1
                if (r0 == 0) goto L2e
                r2 = r0
                goto L36
            L2e:
                int r7 = r7.c
                int r8 = r8.c
                int r7 = r7 - r8
                if (r7 == 0) goto L36
                r2 = r7
            L36:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: e.u.b.n.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.m.c {
        public int a;
        public int b;
        public int[] c;

        /* renamed from: d  reason: collision with root package name */
        public int f2892d;

        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i3 >= 0) {
                int i4 = this.f2892d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[i4 * 2];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.f2892d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.f2892d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.r;
            if (recyclerView.q == null || mVar == null || !mVar.f494k) {
                return;
            }
            if (z) {
                if (!recyclerView.f476i.g()) {
                    mVar.l(recyclerView.q.getItemCount(), this);
                }
            } else if (!recyclerView.P()) {
                mVar.k(this.a, this.b, recyclerView.m0, this);
            }
            int i2 = this.f2892d;
            if (i2 > mVar.f495l) {
                mVar.f495l = i2;
                mVar.f496m = z;
                recyclerView.f474g.l();
            }
        }

        public boolean c(int i2) {
            if (this.c != null) {
                int i3 = this.f2892d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f2893d;

        /* renamed from: e  reason: collision with root package name */
        public int f2894e;
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f2889g == 0) {
            this.f2889g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.l0;
        bVar.a = i2;
        bVar.b = i3;
    }

    public void b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2888f.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = this.f2888f.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.l0.b(recyclerView3, false);
                i2 += recyclerView3.l0.f2892d;
            }
        }
        this.f2891i.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = this.f2888f.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.l0;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i6 = 0; i6 < bVar.f2892d * 2; i6 += 2) {
                    if (i4 >= this.f2891i.size()) {
                        cVar2 = new c();
                        this.f2891i.add(cVar2);
                    } else {
                        cVar2 = this.f2891i.get(i4);
                    }
                    int[] iArr = bVar.c;
                    int i7 = iArr[i6 + 1];
                    cVar2.a = i7 <= abs;
                    cVar2.b = abs;
                    cVar2.c = i7;
                    cVar2.f2893d = recyclerView4;
                    cVar2.f2894e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f2891i, f2887k);
        for (int i8 = 0; i8 < this.f2891i.size() && (recyclerView = (cVar = this.f2891i.get(i8)).f2893d) != null; i8++) {
            RecyclerView.a0 c2 = c(recyclerView, cVar.f2894e, cVar.a ? Long.MAX_VALUE : j2);
            if (c2 != null && c2.mNestedRecyclerView != null && c2.isBound() && !c2.isInvalid() && (recyclerView2 = c2.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.I && recyclerView2.f477j.h() != 0) {
                    recyclerView2.g0();
                }
                b bVar2 = recyclerView2.l0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2892d != 0) {
                    try {
                        int i9 = e.i.f.h.a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.m0;
                        RecyclerView.e eVar = recyclerView2.q;
                        xVar.f514d = 1;
                        xVar.f515e = eVar.getItemCount();
                        xVar.f517g = false;
                        xVar.f518h = false;
                        xVar.f519i = false;
                        for (int i10 = 0; i10 < bVar2.f2892d * 2; i10 += 2) {
                            c(recyclerView2, bVar2.c[i10], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i11 = e.i.f.h.a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.f2893d = null;
            cVar.f2894e = 0;
        }
    }

    public final RecyclerView.a0 c(RecyclerView recyclerView, int i2, long j2) {
        boolean z;
        int h2 = recyclerView.f477j.h();
        int i3 = 0;
        while (true) {
            if (i3 >= h2) {
                z = false;
                break;
            }
            RecyclerView.a0 M = RecyclerView.M(recyclerView.f477j.g(i3));
            if (M.mPosition == i2 && !M.isInvalid()) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            return null;
        }
        RecyclerView.t tVar = recyclerView.f474g;
        try {
            recyclerView.X();
            RecyclerView.a0 j3 = tVar.j(i2, false, j2);
            if (j3 != null) {
                if (j3.isBound() && !j3.isInvalid()) {
                    tVar.g(j3.itemView);
                } else {
                    tVar.a(j3, false);
                }
            }
            return j3;
        } finally {
            recyclerView.Y(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i2 = e.i.f.h.a;
            Trace.beginSection("RV Prefetch");
            if (this.f2888f.isEmpty()) {
                this.f2889g = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f2888f.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = this.f2888f.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f2889g = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2890h);
            this.f2889g = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f2889g = 0L;
            int i4 = e.i.f.h.a;
            Trace.endSection();
            throw th;
        }
    }
}

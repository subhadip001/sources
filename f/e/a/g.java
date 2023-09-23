package f.e.a;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Priority;
import com.bumptech.glide.request.RequestCoordinator;
import f.e.a.l.q.k;
import f.e.a.l.q.l;
import f.e.a.m.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public class g<TranscodeType> extends f.e.a.p.a<g<TranscodeType>> implements Cloneable {
    public final Context F;
    public final h G;
    public final Class<TranscodeType> H;
    public final d I;
    public i<?, ? super TranscodeType> J;
    public Object K;
    public List<f.e.a.p.e<TranscodeType>> L;
    public g<TranscodeType> M;
    public g<TranscodeType> N;
    public boolean O = true;
    public boolean P;
    public boolean Q;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            Priority.values();
            int[] iArr = new int[4];
            b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new f.e.a.p.f().d(k.b).j(Priority.LOW).n(true);
    }

    public g(b bVar, h hVar, Class<TranscodeType> cls, Context context) {
        f.e.a.p.f fVar;
        this.G = hVar;
        this.H = cls;
        this.F = context;
        d dVar = hVar.f3179f.f3155h;
        i<?, ?> iVar = dVar.f3173f.get(cls);
        if (iVar == null) {
            for (Map.Entry<Class<?>, i<?, ?>> entry : dVar.f3173f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    iVar = (i<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.J = (i<?, ? super TranscodeType>) (iVar == null ? (i<?, ? super TranscodeType>) d.f3170k : iVar);
        this.I = bVar.f3155h;
        for (f.e.a.p.e<Object> eVar : hVar.n) {
            s(eVar);
        }
        synchronized (hVar) {
            fVar = hVar.o;
        }
        a(fVar);
    }

    public final f.e.a.p.d A(Object obj, f.e.a.p.j.h<TranscodeType> hVar, f.e.a.p.e<TranscodeType> eVar, f.e.a.p.a<?> aVar, RequestCoordinator requestCoordinator, i<?, ? super TranscodeType> iVar, Priority priority, int i2, int i3, Executor executor) {
        Context context = this.F;
        d dVar = this.I;
        Object obj2 = this.K;
        Class<TranscodeType> cls = this.H;
        List<f.e.a.p.e<TranscodeType>> list = this.L;
        l lVar = dVar.f3174g;
        Objects.requireNonNull(iVar);
        return new f.e.a.p.h(context, dVar, obj, obj2, cls, aVar, i2, i3, priority, hVar, eVar, list, requestCoordinator, lVar, f.e.a.p.k.a.b, executor);
    }

    public g<TranscodeType> B(g<TranscodeType> gVar) {
        if (this.A) {
            return clone().B(gVar);
        }
        this.M = gVar;
        k();
        return this;
    }

    @Override // f.e.a.p.a
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            return super.equals(gVar) && Objects.equals(this.H, gVar.H) && this.J.equals(gVar.J) && Objects.equals(this.K, gVar.K) && Objects.equals(this.L, gVar.L) && Objects.equals(this.M, gVar.M) && Objects.equals(this.N, gVar.N) && Objects.equals(null, null) && this.O == gVar.O && this.P == gVar.P;
        }
        return false;
    }

    @Override // f.e.a.p.a
    public int hashCode() {
        return (((f.e.a.r.l.g(null, f.e.a.r.l.g(this.N, f.e.a.r.l.g(this.M, f.e.a.r.l.g(this.L, f.e.a.r.l.g(this.K, f.e.a.r.l.g(this.J, f.e.a.r.l.g(this.H, super.hashCode()))))))) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0);
    }

    public g<TranscodeType> s(f.e.a.p.e<TranscodeType> eVar) {
        if (this.A) {
            return clone().s(eVar);
        }
        if (eVar != null) {
            if (this.L == null) {
                this.L = new ArrayList();
            }
            this.L.add(eVar);
        }
        k();
        return this;
    }

    @Override // f.e.a.p.a
    /* renamed from: t */
    public g<TranscodeType> a(f.e.a.p.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (g) super.a(aVar);
    }

    public final f.e.a.p.d u(Object obj, f.e.a.p.j.h<TranscodeType> hVar, f.e.a.p.e<TranscodeType> eVar, RequestCoordinator requestCoordinator, i<?, ? super TranscodeType> iVar, Priority priority, int i2, int i3, f.e.a.p.a<?> aVar, Executor executor) {
        f.e.a.p.b bVar;
        f.e.a.p.b bVar2;
        f.e.a.p.i A;
        int i4;
        int i5;
        Priority w;
        int i6;
        int i7;
        if (this.N != null) {
            f.e.a.p.b bVar3 = new f.e.a.p.b(obj, requestCoordinator);
            bVar = bVar3;
            bVar2 = bVar3;
        } else {
            bVar = null;
            bVar2 = requestCoordinator;
        }
        g<TranscodeType> gVar = this.M;
        if (gVar != null) {
            if (!this.Q) {
                i<?, ? super TranscodeType> iVar2 = gVar.O ? iVar : gVar.J;
                if (f.e.a.p.a.f(gVar.f3560f, 8)) {
                    w = this.M.f3563i;
                } else {
                    w = w(priority);
                }
                Priority priority2 = w;
                g<TranscodeType> gVar2 = this.M;
                int i8 = gVar2.p;
                int i9 = gVar2.o;
                if (f.e.a.r.l.j(i2, i3)) {
                    g<TranscodeType> gVar3 = this.M;
                    if (!f.e.a.r.l.j(gVar3.p, gVar3.o)) {
                        i7 = aVar.p;
                        i6 = aVar.o;
                        f.e.a.p.i iVar3 = new f.e.a.p.i(obj, bVar2);
                        f.e.a.p.d A2 = A(obj, hVar, eVar, aVar, iVar3, iVar, priority, i2, i3, executor);
                        this.Q = true;
                        g<TranscodeType> gVar4 = this.M;
                        f.e.a.p.d u = gVar4.u(obj, hVar, eVar, iVar3, iVar2, priority2, i7, i6, gVar4, executor);
                        this.Q = false;
                        iVar3.c = A2;
                        iVar3.f3588d = u;
                        A = iVar3;
                    }
                }
                i6 = i9;
                i7 = i8;
                f.e.a.p.i iVar32 = new f.e.a.p.i(obj, bVar2);
                f.e.a.p.d A22 = A(obj, hVar, eVar, aVar, iVar32, iVar, priority, i2, i3, executor);
                this.Q = true;
                g<TranscodeType> gVar42 = this.M;
                f.e.a.p.d u2 = gVar42.u(obj, hVar, eVar, iVar32, iVar2, priority2, i7, i6, gVar42, executor);
                this.Q = false;
                iVar32.c = A22;
                iVar32.f3588d = u2;
                A = iVar32;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            A = A(obj, hVar, eVar, aVar, bVar2, iVar, priority, i2, i3, executor);
        }
        if (bVar == null) {
            return A;
        }
        g<TranscodeType> gVar5 = this.N;
        int i10 = gVar5.p;
        int i11 = gVar5.o;
        if (f.e.a.r.l.j(i2, i3)) {
            g<TranscodeType> gVar6 = this.N;
            if (!f.e.a.r.l.j(gVar6.p, gVar6.o)) {
                i5 = aVar.p;
                i4 = aVar.o;
                g<TranscodeType> gVar7 = this.N;
                f.e.a.p.d u3 = gVar7.u(obj, hVar, eVar, bVar, gVar7.J, gVar7.f3563i, i5, i4, gVar7, executor);
                bVar.c = A;
                bVar.f3568d = u3;
                return bVar;
            }
        }
        i4 = i11;
        i5 = i10;
        g<TranscodeType> gVar72 = this.N;
        f.e.a.p.d u32 = gVar72.u(obj, hVar, eVar, bVar, gVar72.J, gVar72.f3563i, i5, i4, gVar72, executor);
        bVar.c = A;
        bVar.f3568d = u32;
        return bVar;
    }

    @Override // f.e.a.p.a
    /* renamed from: v */
    public g<TranscodeType> clone() {
        g<TranscodeType> gVar = (g) super.clone();
        gVar.J = (i<?, ? super TranscodeType>) gVar.J.a();
        if (gVar.L != null) {
            gVar.L = new ArrayList(gVar.L);
        }
        g<TranscodeType> gVar2 = gVar.M;
        if (gVar2 != null) {
            gVar.M = gVar2.clone();
        }
        g<TranscodeType> gVar3 = gVar.N;
        if (gVar3 != null) {
            gVar.N = gVar3.clone();
        }
        return gVar;
    }

    public final Priority w(Priority priority) {
        int ordinal = priority.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return Priority.IMMEDIATE;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return Priority.NORMAL;
            }
            StringBuilder A = f.a.b.a.a.A("unknown priority: ");
            A.append(this.f3563i);
            throw new IllegalArgumentException(A.toString());
        }
        return Priority.HIGH;
    }

    public final <Y extends f.e.a.p.j.h<TranscodeType>> Y x(Y y, f.e.a.p.e<TranscodeType> eVar, f.e.a.p.a<?> aVar, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (this.P) {
            f.e.a.p.d u = u(new Object(), y, eVar, null, this.J, aVar.f3563i, aVar.p, aVar.o, aVar, executor);
            f.e.a.p.d request = y.getRequest();
            if (u.f(request)) {
                if (!(!aVar.n && request.k())) {
                    Objects.requireNonNull(request, "Argument must not be null");
                    if (!request.isRunning()) {
                        request.i();
                    }
                    return y;
                }
            }
            this.G.b(y);
            y.setRequest(u);
            h hVar = this.G;
            synchronized (hVar) {
                hVar.f3184k.f3559f.add(y);
                s sVar = hVar.f3182i;
                sVar.a.add(u);
                if (!sVar.c) {
                    u.i();
                } else {
                    u.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    sVar.b.add(u);
                }
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f.e.a.p.j.i<android.widget.ImageView, TranscodeType> y(android.widget.ImageView r5) {
        /*
            r4 = this;
            f.e.a.r.l.a()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r4.f3560f
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = f.e.a.p.a.f(r0, r1)
            if (r0 != 0) goto L73
            boolean r0 = r4.s
            if (r0 == 0) goto L73
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L73
            int[] r0 = f.e.a.g.a.a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L63;
                case 2: goto L51;
                case 3: goto L3f;
                case 4: goto L3f;
                case 5: goto L3f;
                case 6: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L73
        L2d:
            f.e.a.g r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.b
            f.e.a.l.s.c.j r3 = new f.e.a.l.s.c.j
            r3.<init>()
            f.e.a.p.a r0 = r0.g(r2, r3)
            r0.D = r1
            goto L74
        L3f:
            f.e.a.g r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.a
            f.e.a.l.s.c.o r3 = new f.e.a.l.s.c.o
            r3.<init>()
            f.e.a.p.a r0 = r0.g(r2, r3)
            r0.D = r1
            goto L74
        L51:
            f.e.a.g r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r2 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.b
            f.e.a.l.s.c.j r3 = new f.e.a.l.s.c.j
            r3.<init>()
            f.e.a.p.a r0 = r0.g(r2, r3)
            r0.D = r1
            goto L74
        L63:
            f.e.a.g r0 = r4.clone()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy r1 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.c
            f.e.a.l.s.c.i r2 = new f.e.a.l.s.c.i
            r2.<init>()
            f.e.a.p.a r0 = r0.g(r1, r2)
            goto L74
        L73:
            r0 = r4
        L74:
            f.e.a.d r1 = r4.I
            java.lang.Class<TranscodeType> r2 = r4.H
            f.e.a.p.j.f r1 = r1.c
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8b
            f.e.a.p.j.b r1 = new f.e.a.p.j.b
            r1.<init>(r5)
            goto L98
        L8b:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L9f
            f.e.a.p.j.d r1 = new f.e.a.p.j.d
            r1.<init>(r5)
        L98:
            r5 = 0
            java.util.concurrent.Executor r2 = f.e.a.r.e.a
            r4.x(r1, r5, r0, r2)
            return r1
        L9f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.g.y(android.widget.ImageView):f.e.a.p.j.i");
    }

    public final g<TranscodeType> z(Object obj) {
        if (this.A) {
            return clone().z(obj);
        }
        this.K = obj;
        this.P = true;
        k();
        return this;
    }
}

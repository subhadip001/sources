package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.google.android.gms.common.api.Api;
import e.g.a.d;
import e.g.a.h.g;
import e.g.a.h.h;
import e.g.a.h.j.c;
import e.g.a.h.j.f;
import e.g.a.h.j.k;
import e.g.a.h.j.m;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public ConstraintAnchor J;
    public ConstraintAnchor K;
    public ConstraintAnchor L;
    public ConstraintAnchor M;
    public ConstraintAnchor N;
    public ConstraintAnchor O;
    public ConstraintAnchor P;
    public ConstraintAnchor Q;
    public ConstraintAnchor[] R;
    public ArrayList<ConstraintAnchor> S;
    public boolean[] T;
    public DimensionBehaviour[] U;
    public ConstraintWidget V;
    public int W;
    public int X;
    public float Y;
    public int Z;
    public int a0;
    public c b;
    public int b0;
    public c c;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public float g0;
    public Object h0;
    public int i0;

    /* renamed from: j  reason: collision with root package name */
    public String f273j;
    public String j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f274k;
    public int k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f275l;
    public int l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f276m;
    public float[] m0;
    public boolean n;
    public ConstraintWidget[] n0;
    public int o;
    public ConstraintWidget[] o0;
    public int p;
    public int p0;
    public int q;
    public int q0;
    public int r;
    public int s;
    public int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;
    public boolean a = false;

    /* renamed from: d  reason: collision with root package name */
    public k f267d = null;

    /* renamed from: e  reason: collision with root package name */
    public m f268e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f269f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public boolean f270g = true;

    /* renamed from: h  reason: collision with root package name */
    public int f271h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f272i = -1;

    /* loaded from: classes.dex */
    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        new HashMap();
        this.f274k = false;
        this.f275l = false;
        this.f276m = false;
        this.n = false;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = new int[2];
        this.u = 0;
        this.v = 0;
        this.w = 1.0f;
        this.x = 0;
        this.y = 0;
        this.z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.J = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.K = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.L = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.M = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.N = constraintAnchor5;
        this.O = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.Q = constraintAnchor6;
        this.R = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        ArrayList<ConstraintAnchor> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.U = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        this.i0 = 0;
        this.j0 = null;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = new float[]{-1.0f, -1.0f};
        this.n0 = new ConstraintWidget[]{null, null};
        this.o0 = new ConstraintWidget[]{null, null};
        this.p0 = -1;
        this.q0 = -1;
        arrayList.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    public final boolean A(int i2) {
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.R;
        if (constraintAnchorArr[i3].f263f != null && constraintAnchorArr[i3].f263f.f263f != constraintAnchorArr[i3]) {
            int i4 = i3 + 1;
            if (constraintAnchorArr[i4].f263f != null && constraintAnchorArr[i4].f263f.f263f == constraintAnchorArr[i4]) {
                return true;
            }
        }
        return false;
    }

    public boolean B() {
        ConstraintAnchor constraintAnchor = this.J;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f263f;
        if (constraintAnchor2 == null || constraintAnchor2.f263f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.L;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f263f;
            return constraintAnchor4 != null && constraintAnchor4.f263f == constraintAnchor3;
        }
        return true;
    }

    public boolean C() {
        ConstraintAnchor constraintAnchor = this.K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f263f;
        if (constraintAnchor2 == null || constraintAnchor2.f263f != constraintAnchor) {
            ConstraintAnchor constraintAnchor3 = this.M;
            ConstraintAnchor constraintAnchor4 = constraintAnchor3.f263f;
            return constraintAnchor4 != null && constraintAnchor4.f263f == constraintAnchor3;
        }
        return true;
    }

    public boolean D() {
        return this.f270g && this.i0 != 8;
    }

    public boolean E() {
        return this.f274k || (this.J.c && this.L.c);
    }

    public boolean F() {
        return this.f275l || (this.K.c && this.M.c);
    }

    public void G() {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.O.h();
        this.P.h();
        this.Q.h();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0.5f;
        this.g0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.U;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.h0 = null;
        this.i0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        float[] fArr = this.m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.o = -1;
        this.p = -1;
        int[] iArr = this.C;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.r = 0;
        this.s = 0;
        this.w = 1.0f;
        this.z = 1.0f;
        this.v = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.y = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f269f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f270g = true;
        int[] iArr2 = this.t;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f271h = -1;
        this.f272i = -1;
    }

    public void H() {
        this.f274k = false;
        this.f275l = false;
        this.f276m = false;
        this.n = false;
        int size = this.S.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintAnchor constraintAnchor = this.S.get(i2);
            constraintAnchor.c = false;
            constraintAnchor.b = 0;
        }
    }

    public void I(e.g.a.c cVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void J(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    public final void K(StringBuilder sb, String str, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i2);
        sb.append(",\n");
    }

    public void L(int i2) {
        this.c0 = i2;
        this.E = i2 > 0;
    }

    public void M(int i2, int i3) {
        if (this.f274k) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.J;
        constraintAnchor.b = i2;
        constraintAnchor.c = true;
        ConstraintAnchor constraintAnchor2 = this.L;
        constraintAnchor2.b = i3;
        constraintAnchor2.c = true;
        this.a0 = i2;
        this.W = i3 - i2;
        this.f274k = true;
    }

    public void N(int i2, int i3) {
        if (this.f275l) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.K;
        constraintAnchor.b = i2;
        constraintAnchor.c = true;
        ConstraintAnchor constraintAnchor2 = this.M;
        constraintAnchor2.b = i3;
        constraintAnchor2.c = true;
        this.b0 = i2;
        this.X = i3 - i2;
        if (this.E) {
            this.N.j(i2 + this.c0);
        }
        this.f275l = true;
    }

    public void O(int i2) {
        this.X = i2;
        int i3 = this.e0;
        if (i2 < i3) {
            this.X = i3;
        }
    }

    public void P(DimensionBehaviour dimensionBehaviour) {
        this.U[0] = dimensionBehaviour;
    }

    public void Q(int i2) {
        if (i2 < 0) {
            this.e0 = 0;
        } else {
            this.e0 = i2;
        }
    }

    public void R(int i2) {
        if (i2 < 0) {
            this.d0 = 0;
        } else {
            this.d0 = i2;
        }
    }

    public void S(DimensionBehaviour dimensionBehaviour) {
        this.U[1] = dimensionBehaviour;
    }

    public void T(int i2) {
        this.W = i2;
        int i3 = this.d0;
        if (i2 < i3) {
            this.W = i3;
        }
    }

    public void U(boolean z, boolean z2) {
        int i2;
        int i3;
        k kVar = this.f267d;
        boolean z3 = z & kVar.f2096g;
        m mVar = this.f268e;
        boolean z4 = z2 & mVar.f2096g;
        int i4 = kVar.f2097h.f2072g;
        int i5 = mVar.f2097h.f2072g;
        int i6 = kVar.f2098i.f2072g;
        int i7 = mVar.f2098i.f2072g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z3) {
            this.a0 = i4;
        }
        if (z4) {
            this.b0 = i5;
        }
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z3) {
            if (this.U[0] == DimensionBehaviour.FIXED && i9 < (i3 = this.W)) {
                i9 = i3;
            }
            this.W = i9;
            int i11 = this.d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
        if (z4) {
            if (this.U[1] == DimensionBehaviour.FIXED && i10 < (i2 = this.X)) {
                i10 = i2;
            }
            this.X = i10;
            int i12 = this.e0;
            if (i10 < i12) {
                this.X = i12;
            }
        }
    }

    public void V(d dVar, boolean z) {
        int i2;
        int i3;
        m mVar;
        k kVar;
        int o = dVar.o(this.J);
        int o2 = dVar.o(this.K);
        int o3 = dVar.o(this.L);
        int o4 = dVar.o(this.M);
        if (z && (kVar = this.f267d) != null) {
            f fVar = kVar.f2097h;
            if (fVar.f2075j) {
                f fVar2 = kVar.f2098i;
                if (fVar2.f2075j) {
                    o = fVar.f2072g;
                    o3 = fVar2.f2072g;
                }
            }
        }
        if (z && (mVar = this.f268e) != null) {
            f fVar3 = mVar.f2097h;
            if (fVar3.f2075j) {
                f fVar4 = mVar.f2098i;
                if (fVar4.f2075j) {
                    o2 = fVar3.f2072g;
                    o4 = fVar4.f2072g;
                }
            }
        }
        int i4 = o4 - o2;
        if (o3 - o < 0 || i4 < 0 || o == Integer.MIN_VALUE || o == Integer.MAX_VALUE || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE) {
            o4 = 0;
            o = 0;
            o2 = 0;
            o3 = 0;
        }
        int i5 = o3 - o;
        int i6 = o4 - o2;
        this.a0 = o;
        this.b0 = o2;
        if (this.i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.U;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i5 < (i3 = this.W)) {
            i5 = i3;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i6 < (i2 = this.X)) {
            i6 = i2;
        }
        this.W = i5;
        this.X = i6;
        int i7 = this.e0;
        if (i6 < i7) {
            this.X = i7;
        }
        int i8 = this.d0;
        if (i5 < i8) {
            this.W = i8;
        }
        int i9 = this.v;
        if (i9 > 0 && dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.y;
        if (i10 > 0 && this.U[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i10);
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.f271h = i11;
        }
        int i12 = this.X;
        if (i6 != i12) {
            this.f272i = i12;
        }
    }

    public void b(e.g.a.h.c cVar, d dVar, HashSet<ConstraintWidget> hashSet, int i2, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(cVar, dVar, this);
            hashSet.remove(this);
            d(dVar, cVar.g0(64));
        }
        if (i2 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.J.a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f261d.b(cVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.L.a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f261d.b(cVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.K.a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f261d.b(cVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.M.a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f261d.b(cVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.N.a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f261d.b(cVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean c() {
        return (this instanceof h) || (this instanceof e.g.a.h.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(e.g.a.d r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 1753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.d(e.g.a.d, boolean):void");
    }

    public boolean e() {
        return this.i0 != 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x03e5, code lost:
        if ((r3 instanceof e.g.a.h.a) != false) goto L188;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0362 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x040e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0485 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:362:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(e.g.a.d r37, boolean r38, boolean r39, boolean r40, boolean r41, androidx.constraintlayout.core.SolverVariable r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r44, boolean r45, androidx.constraintlayout.core.widgets.ConstraintAnchor r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            Method dump skipped, instructions count: 1279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.f(e.g.a.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void g(d dVar) {
        dVar.l(this.J);
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        if (this.c0 > 0) {
            dVar.l(this.N);
        }
    }

    public void h() {
        if (this.f267d == null) {
            this.f267d = new k(this);
        }
        if (this.f268e == null) {
            this.f268e = new m(this);
        }
    }

    public ConstraintAnchor i(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(type.name());
        }
    }

    public int j() {
        return w() + this.X;
    }

    public DimensionBehaviour k(int i2) {
        if (i2 == 0) {
            return m();
        }
        if (i2 == 1) {
            return t();
        }
        return null;
    }

    public int l() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public DimensionBehaviour m() {
        return this.U[0];
    }

    public ConstraintWidget n(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.M).f263f) != null && constraintAnchor2.f263f == constraintAnchor) {
                return constraintAnchor2.f261d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.L;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f263f;
        if (constraintAnchor4 == null || constraintAnchor4.f263f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f261d;
    }

    public ConstraintWidget o(int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 != 0) {
            if (i2 == 1 && (constraintAnchor2 = (constraintAnchor = this.K).f263f) != null && constraintAnchor2.f263f == constraintAnchor) {
                return constraintAnchor2.f261d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.J;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f263f;
        if (constraintAnchor4 == null || constraintAnchor4.f263f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f261d;
    }

    public int p() {
        return v() + this.W;
    }

    public void q(StringBuilder sb) {
        StringBuilder A = a.A("  ");
        A.append(this.f273j);
        A.append(":{\n");
        sb.append(A.toString());
        sb.append("    actualWidth:" + this.W);
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.b0);
        sb.append("\n");
        s(sb, "left", this.J);
        s(sb, "top", this.K);
        s(sb, "right", this.L);
        s(sb, "bottom", this.M);
        s(sb, "baseline", this.N);
        s(sb, "centerX", this.O);
        s(sb, "centerY", this.P);
        int i2 = this.W;
        int i3 = this.d0;
        int i4 = this.C[0];
        int i5 = this.u;
        int i6 = this.r;
        float f2 = this.w;
        float f3 = this.m0[0];
        r(sb, "    width", i2, i3, i4, i5, i6, f2);
        int i7 = this.X;
        int i8 = this.e0;
        int i9 = this.C[1];
        int i10 = this.x;
        int i11 = this.s;
        float f4 = this.z;
        float f5 = this.m0[1];
        r(sb, "    height", i7, i8, i9, i10, i11, f4);
        float f6 = this.Y;
        int i12 = this.Z;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i12);
            sb.append("");
            sb.append("],\n");
        }
        J(sb, "    horizontalBias", this.f0, 0.5f);
        J(sb, "    verticalBias", this.g0, 0.5f);
        K(sb, "    horizontalChainStyle", this.k0, 0);
        K(sb, "    verticalChainStyle", this.l0, 0);
        sb.append("  }");
    }

    public final void r(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        K(sb, "      size", i2, 0);
        K(sb, "      min", i3, 0);
        K(sb, "      max", i4, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        K(sb, "      matchMin", i5, 0);
        K(sb, "      matchDef", i6, 0);
        J(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public final void s(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f263f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(constraintAnchor.f263f);
        sb.append("'");
        if (constraintAnchor.f265h != Integer.MIN_VALUE || constraintAnchor.f264g != 0) {
            sb.append(",");
            sb.append(constraintAnchor.f264g);
            if (constraintAnchor.f265h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(constraintAnchor.f265h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    public DimensionBehaviour t() {
        return this.U[1];
    }

    public String toString() {
        StringBuilder A = a.A("");
        A.append(this.j0 != null ? a.u(a.A("id: "), this.j0, " ") : "");
        A.append("(");
        A.append(this.a0);
        A.append(", ");
        A.append(this.b0);
        A.append(") - (");
        A.append(this.W);
        A.append(" x ");
        return a.t(A, this.X, ")");
    }

    public int u() {
        if (this.i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public int v() {
        ConstraintWidget constraintWidget = this.V;
        if (constraintWidget != null && (constraintWidget instanceof e.g.a.h.c)) {
            return ((e.g.a.h.c) constraintWidget).y0 + this.a0;
        }
        return this.a0;
    }

    public int w() {
        ConstraintWidget constraintWidget = this.V;
        if (constraintWidget != null && (constraintWidget instanceof e.g.a.h.c)) {
            return ((e.g.a.h.c) constraintWidget).z0 + this.b0;
        }
        return this.b0;
    }

    public boolean x(int i2) {
        if (i2 == 0) {
            return (this.J.f263f != null ? 1 : 0) + (this.L.f263f != null ? 1 : 0) < 2;
        }
        return ((this.K.f263f != null ? 1 : 0) + (this.M.f263f != null ? 1 : 0)) + (this.N.f263f != null ? 1 : 0) < 2;
    }

    public boolean y(int i2, int i3) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor3 = this.J.f263f;
            if (constraintAnchor3 != null && constraintAnchor3.c && (constraintAnchor2 = this.L.f263f) != null && constraintAnchor2.c) {
                return (constraintAnchor2.c() - this.L.d()) - (this.J.d() + this.J.f263f.c()) >= i3;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.K.f263f;
            if (constraintAnchor4 != null && constraintAnchor4.c && (constraintAnchor = this.M.f263f) != null && constraintAnchor.c) {
                return (constraintAnchor.c() - this.M.d()) - (this.K.d() + this.K.f263f.c()) >= i3;
            }
        }
        return false;
    }

    public void z(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
        i(type).a(constraintWidget.i(type2), i2, i3, true);
    }
}

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import e.e.a;
import e.g.a.h.j.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintAnchor {
    public int b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintWidget f261d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f262e;

    /* renamed from: f  reason: collision with root package name */
    public ConstraintAnchor f263f;

    /* renamed from: i  reason: collision with root package name */
    public SolverVariable f266i;
    public HashSet<ConstraintAnchor> a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f264g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f265h = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f261d = constraintWidget;
        this.f262e = type;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r4.f261d.E == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
        if (r8 != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (r8 != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0063, code lost:
        if (r8 != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007e, code lost:
        if (r8 != androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(androidx.constraintlayout.core.widgets.ConstraintAnchor r5, int r6, int r7, boolean r8) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L7
            r4.h()
            return r0
        L7:
            if (r8 != 0) goto L84
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = r5.f262e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r4.f262e
            r2 = 0
            if (r8 != r1) goto L21
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r1 != r8) goto L40
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r5.f261d
            boolean r8 = r8.E
            if (r8 == 0) goto L42
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r4.f261d
            boolean r8 = r8.E
            if (r8 != 0) goto L40
            goto L42
        L21:
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L42;
                case 1: goto L68;
                case 2: goto L4d;
                case 3: goto L68;
                case 4: goto L4d;
                case 5: goto L44;
                case 6: goto L34;
                case 7: goto L42;
                case 8: goto L42;
                default: goto L28;
            }
        L28:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = r4.f262e
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L34:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r8 == r1) goto L42
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r8 == r1) goto L42
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r8 == r1) goto L42
        L40:
            r8 = 1
            goto L81
        L42:
            r8 = 0
            goto L81
        L44:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r8 == r1) goto L42
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r8 != r1) goto L40
            goto L42
        L4d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r8 == r1) goto L58
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r8 != r1) goto L56
            goto L58
        L56:
            r1 = 0
            goto L59
        L58:
            r1 = 1
        L59:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.f261d
            boolean r3 = r3 instanceof e.g.a.h.d
            if (r3 == 0) goto L66
            if (r1 != 0) goto L40
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r8 != r1) goto L42
            goto L40
        L66:
            r8 = r1
            goto L81
        L68:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r8 == r1) goto L73
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r8 != r1) goto L71
            goto L73
        L71:
            r1 = 0
            goto L74
        L73:
            r1 = 1
        L74:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.f261d
            boolean r3 = r3 instanceof e.g.a.h.d
            if (r3 == 0) goto L66
            if (r1 != 0) goto L40
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r8 != r1) goto L42
            goto L40
        L81:
            if (r8 != 0) goto L84
            return r2
        L84:
            r4.f263f = r5
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r8 = r5.a
            if (r8 != 0) goto L91
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            r5.a = r8
        L91:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.f263f
            java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintAnchor> r5 = r5.a
            if (r5 == 0) goto L9a
            r5.add(r4)
        L9a:
            r4.f264g = r6
            r4.f265h = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.a(androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, boolean):boolean");
    }

    public void b(int i2, ArrayList<n> arrayList, n nVar) {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                a.b(it.next().f261d, i2, arrayList, nVar);
            }
        }
    }

    public int c() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public int d() {
        ConstraintAnchor constraintAnchor;
        if (this.f261d.i0 == 8) {
            return 0;
        }
        int i2 = this.f265h;
        return (i2 == Integer.MIN_VALUE || (constraintAnchor = this.f263f) == null || constraintAnchor.f261d.i0 != 8) ? this.f264g : i2;
    }

    public boolean e() {
        ConstraintAnchor constraintAnchor;
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            ConstraintAnchor next = it.next();
            switch (next.f262e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    constraintAnchor = null;
                    break;
                case 1:
                    constraintAnchor = next.f261d.L;
                    break;
                case 2:
                    constraintAnchor = next.f261d.M;
                    break;
                case 3:
                    constraintAnchor = next.f261d.J;
                    break;
                case 4:
                    constraintAnchor = next.f261d.K;
                    break;
                default:
                    throw new AssertionError(next.f262e.name());
            }
            if (constraintAnchor.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        HashSet<ConstraintAnchor> hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean g() {
        return this.f263f != null;
    }

    public void h() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f263f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.a) != null) {
            hashSet.remove(this);
            if (this.f263f.a.size() == 0) {
                this.f263f.a = null;
            }
        }
        this.a = null;
        this.f263f = null;
        this.f264g = 0;
        this.f265h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void i() {
        SolverVariable solverVariable = this.f266i;
        if (solverVariable == null) {
            this.f266i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.f();
        }
    }

    public void j(int i2) {
        this.b = i2;
        this.c = true;
    }

    public String toString() {
        return this.f261d.j0 + ":" + this.f262e.toString();
    }
}

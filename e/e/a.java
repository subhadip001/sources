package e.e;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import e.g.a.h.d;
import e.g.a.h.f;
import e.g.a.h.j.n;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01eb, code lost:
        if (r5 == r6) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01fe, code lost:
        if (r5 == 2) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0200, code lost:
        r22 = r21;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0206, code lost:
        r22 = r21;
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02df, code lost:
        if (r3[r16].f263f.f261d == r6) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014d, code lost:
        if (r4[r2].f263f.f261d == r5) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x048e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0704 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0745 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0762 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(e.g.a.h.c r35, e.g.a.d r36, java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r37, int r38) {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.a(e.g.a.h.c, e.g.a.d, java.util.ArrayList, int):void");
    }

    public static n b(ConstraintWidget constraintWidget, int i2, ArrayList<n> arrayList, n nVar) {
        int i3;
        int i4;
        if (i2 == 0) {
            i3 = constraintWidget.p0;
        } else {
            i3 = constraintWidget.q0;
        }
        if (i3 != -1 && (nVar == null || i3 != nVar.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n nVar2 = arrayList.get(i5);
                if (nVar2.b == i3) {
                    if (nVar != null) {
                        nVar.d(i2, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                } else {
                    i5++;
                }
            }
        } else if (i3 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (constraintWidget instanceof f) {
                f fVar = (f) constraintWidget;
                int i6 = 0;
                while (true) {
                    if (i6 >= fVar.s0) {
                        i4 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = fVar.r0[i6];
                    if ((i2 == 0 && (i4 = constraintWidget2.p0) != -1) || (i2 == 1 && (i4 = constraintWidget2.q0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i4 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n nVar3 = arrayList.get(i7);
                        if (nVar3.b == i4) {
                            nVar = nVar3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (nVar == null) {
                nVar = new n(i2);
            }
            arrayList.add(nVar);
        }
        if (nVar.a(constraintWidget)) {
            if (constraintWidget instanceof d) {
                d dVar = (d) constraintWidget;
                dVar.u0.b(dVar.v0 == 0 ? 1 : 0, arrayList, nVar);
            }
            if (i2 == 0) {
                constraintWidget.p0 = nVar.b;
                constraintWidget.J.b(i2, arrayList, nVar);
                constraintWidget.L.b(i2, arrayList, nVar);
            } else {
                constraintWidget.q0 = nVar.b;
                constraintWidget.K.b(i2, arrayList, nVar);
                constraintWidget.N.b(i2, arrayList, nVar);
                constraintWidget.M.b(i2, arrayList, nVar);
            }
            constraintWidget.Q.b(i2, arrayList, nVar);
        }
        return nVar;
    }

    public static n c(ArrayList<n> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = arrayList.get(i3);
            if (i2 == nVar.b) {
                return nVar;
            }
        }
        return null;
    }

    public static String d(Context context, int i2) {
        if (i2 != -1) {
            try {
                return context.getResources().getResourceEntryName(i2);
            } catch (Exception unused) {
                return f.a.b.a.a.i("?", i2);
            }
        }
        return "UNKNOWN";
    }

    public static String e(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static boolean f(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        return (dimensionBehaviour3 == dimensionBehaviour7 || dimensionBehaviour3 == (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour != dimensionBehaviour6)) || (dimensionBehaviour4 == dimensionBehaviour7 || dimensionBehaviour4 == (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && dimensionBehaviour2 != dimensionBehaviour5));
    }
}

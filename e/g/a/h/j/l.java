package e.g.a.h.j;

import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public class l {
    public static int c;
    public o a;
    public ArrayList<o> b = new ArrayList<>();

    public l(o oVar, int i2) {
        this.a = null;
        c++;
        this.a = oVar;
    }

    public final long a(f fVar, long j2) {
        o oVar = fVar.f2069d;
        if (oVar instanceof j) {
            return j2;
        }
        int size = fVar.f2076k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2076k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2069d != oVar) {
                    j3 = Math.min(j3, a(fVar2, fVar2.f2071f + j2));
                }
            }
        }
        if (fVar == oVar.f2098i) {
            long j4 = j2 - oVar.j();
            return Math.min(Math.min(j3, a(oVar.f2097h, j4)), j4 - oVar.f2097h.f2071f);
        }
        return j3;
    }

    public final long b(f fVar, long j2) {
        o oVar = fVar.f2069d;
        if (oVar instanceof j) {
            return j2;
        }
        int size = fVar.f2076k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2076k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2069d != oVar) {
                    j3 = Math.max(j3, b(fVar2, fVar2.f2071f + j2));
                }
            }
        }
        if (fVar == oVar.f2097h) {
            long j4 = j2 + oVar.j();
            return Math.max(Math.max(j3, b(oVar.f2098i, j4)), j4 - oVar.f2098i.f2071f);
        }
        return j3;
    }
}

package f.h.b.c.y;

/* compiled from: CutCornerTreatment.java */
/* loaded from: classes.dex */
public class e extends d {
    @Override // f.h.b.c.y.d
    public void a(m mVar, float f2, float f3, float f4) {
        mVar.e(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d2 = f4;
        double d3 = f3;
        mVar.d((float) (Math.sin(Math.toRadians(f2)) * d2 * d3), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d2 * d3));
    }
}

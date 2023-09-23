package f.e.a.l.q.b0;

/* compiled from: IntegerArrayAdapter.java */
/* loaded from: classes.dex */
public final class h implements a<int[]> {
    @Override // f.e.a.l.q.b0.a
    public String a() {
        return "IntegerArrayPool";
    }

    @Override // f.e.a.l.q.b0.a
    public int b() {
        return 4;
    }

    @Override // f.e.a.l.q.b0.a
    public int c(int[] iArr) {
        return iArr.length;
    }

    @Override // f.e.a.l.q.b0.a
    public int[] newArray(int i2) {
        return new int[i2];
    }
}

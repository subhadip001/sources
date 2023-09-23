package e.i.c.d;

import java.util.List;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class i {
    public final int[] a;
    public final float[] b;

    public i(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.a[i2] = list.get(i2).intValue();
            this.b[i2] = list2.get(i2).floatValue();
        }
    }

    public i(int i2, int i3) {
        this.a = new int[]{i2, i3};
        this.b = new float[]{0.0f, 1.0f};
    }

    public i(int i2, int i3, int i4) {
        this.a = new int[]{i2, i3, i4};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }
}

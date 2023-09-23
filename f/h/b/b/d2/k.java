package f.h.b.b.d2;

import java.util.Arrays;

/* compiled from: TrackSelectionArray.java */
/* loaded from: classes.dex */
public final class k {
    public final int a;
    public final j[] b;
    public int c;

    public k(j... jVarArr) {
        this.b = jVarArr;
        this.a = jVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.b, ((k) obj).b);
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.b);
        }
        return this.c;
    }
}

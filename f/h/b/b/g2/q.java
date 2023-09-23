package f.h.b.b.g2;

import android.util.SparseBooleanArray;

/* compiled from: MutableFlags.java */
/* loaded from: classes.dex */
public class q {
    public final SparseBooleanArray a = new SparseBooleanArray();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.a.equals(((q) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

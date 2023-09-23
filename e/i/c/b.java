package e.i.c;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final LocusId b;

    public b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new LocusId(str);
                return;
            } else {
                this.b = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            String str = this.a;
            if (str == null) {
                return bVar.a == null;
            }
            return str.equals(bVar.a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("LocusIdCompat[");
        int length = this.a.length();
        A.append(length + "_chars");
        A.append("]");
        return A.toString();
    }
}

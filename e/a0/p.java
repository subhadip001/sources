package e.a0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public class p {
    public View b;
    public final Map<String, Object> a = new HashMap();
    public final ArrayList<h> c = new ArrayList<>();

    @Deprecated
    public p() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            p pVar = (p) obj;
            return this.b == pVar.b && this.a.equals(pVar.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder A = f.a.b.a.a.A("TransitionValues@");
        A.append(Integer.toHexString(hashCode()));
        A.append(":\n");
        StringBuilder D = f.a.b.a.a.D(A.toString(), "    view = ");
        D.append(this.b);
        D.append("\n");
        String p = f.a.b.a.a.p(D.toString(), "    values:");
        for (String str : this.a.keySet()) {
            p = p + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return p;
    }

    public p(View view) {
        this.b = view;
    }
}

package e.a0;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: classes.dex */
public class b0 implements c0 {
    public final WindowId a;

    public b0(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}

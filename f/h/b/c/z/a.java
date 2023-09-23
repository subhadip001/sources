package f.h.b.c.z;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Objects;

/* compiled from: BaseTransientBottomBar.java */
/* loaded from: classes.dex */
public class a implements SwipeDismissBehavior.b {
    public final /* synthetic */ BaseTransientBottomBar a;

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        Objects.requireNonNull(this.a);
        b a = b.a();
        synchronized (a.a) {
            a.b(null);
        }
    }
}

package e.i.j;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* compiled from: GestureDetectorCompat.java */
/* loaded from: classes.dex */
public final class h {
    public final a a;

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: GestureDetectorCompat.java */
    /* loaded from: classes.dex */
    public static class b implements a {
        public final GestureDetector a;

        public b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public h(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new b(context, onGestureListener, null);
    }
}

package e.i.j;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class g0 {
    public final e a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        public final Window a;
        public final View b;

        public a(Window window, View view) {
            this.a = window;
            this.b = view;
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        @Override // e.i.j.g0.e
        public void b(boolean z) {
            if (z) {
                this.a.clearFlags(67108864);
                this.a.addFlags(Integer.MIN_VALUE);
                View decorView = this.a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            View decorView2 = this.a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        @Override // e.i.j.g0.e
        public void a(boolean z) {
            if (z) {
                this.a.clearFlags(134217728);
                this.a.addFlags(Integer.MIN_VALUE);
                View decorView = this.a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            View decorView2 = this.a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public void a(boolean z) {
        }

        public void b(boolean z) {
        }
    }

    public g0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsController, this);
        } else {
            this.a = new e();
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {
        public final WindowInsetsController a;
        public Window b;

        public d(Window window, g0 g0Var) {
            this.a = window.getInsetsController();
            this.b = window;
        }

        @Override // e.i.j.g0.e
        public void a(boolean z) {
            if (z) {
                this.a.setSystemBarsAppearance(16, 16);
            } else {
                this.a.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // e.i.j.g0.e
        public void b(boolean z) {
            if (z) {
                Window window = this.b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                }
                this.a.setSystemBarsAppearance(8, 8);
                return;
            }
            this.a.setSystemBarsAppearance(0, 8);
        }

        public d(WindowInsetsController windowInsetsController, g0 g0Var) {
            this.a = windowInsetsController;
        }
    }

    public g0(Window window, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.a = new d(window, this);
        } else if (i2 >= 26) {
            this.a = new c(window, view);
        } else if (i2 >= 23) {
            this.a = new b(window, view);
        } else {
            this.a = new a(window, view);
        }
    }
}

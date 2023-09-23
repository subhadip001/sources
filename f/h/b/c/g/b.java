package f.h.b.c.g;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* loaded from: classes.dex */
public class b extends FloatingActionButton.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    /* compiled from: BottomAppBar.java */
    /* loaded from: classes.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.x(b.this.b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i2) {
        this.b = bottomAppBar;
        this.a = i2;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public void a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.b;
        int i2 = this.a;
        int i3 = BottomAppBar.j0;
        floatingActionButton.setTranslationX(bottomAppBar.F(i2));
        floatingActionButton.q(new a(), true);
    }
}

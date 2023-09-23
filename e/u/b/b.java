package e.u.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public class b {
    public final InterfaceC0057b a;
    public final a b = new a();
    public final List<View> c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        public long a = 0;
        public a b;

        public void a(int i2) {
            if (i2 >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i2 - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i2);
        }

        public int b(int i2) {
            a aVar = this.b;
            if (aVar == null) {
                if (i2 >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else if (i2 < 64) {
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else {
                return Long.bitCount(this.a) + aVar.b(i2 - 64);
            }
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            c();
            return this.b.d(i2 - 64);
        }

        public void e(int i2, boolean z) {
            if (i2 >= 64) {
                c();
                this.b.e(i2 - 64, z);
                return;
            }
            long j2 = this.a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z) {
                h(i2);
            } else {
                a(i2);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.a = j4;
            long j5 = j2 - 1;
            this.a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i2) {
            if (i2 >= 64) {
                c();
                this.b.h(i2 - 64);
                return;
            }
            this.a |= 1 << i2;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: e.u.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057b {
    }

    public b(InterfaceC0057b interfaceC0057b) {
        this.a = interfaceC0057b;
    }

    public void a(View view, int i2, boolean z) {
        int f2;
        if (i2 < 0) {
            f2 = ((y) this.a).b();
        } else {
            f2 = f(i2);
        }
        this.b.e(f2, z);
        if (z) {
            i(view);
        }
        y yVar = (y) this.a;
        yVar.a.addView(view, f2);
        RecyclerView recyclerView = yVar.a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.a0 M = RecyclerView.M(view);
        recyclerView.V();
        RecyclerView.e eVar = recyclerView.q;
        if (eVar != null && M != null) {
            eVar.onViewAttachedToWindow(M);
        }
        List<RecyclerView.o> list = recyclerView.H;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            recyclerView.H.get(size).d(view);
        }
    }

    public void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int f2;
        if (i2 < 0) {
            f2 = ((y) this.a).b();
        } else {
            f2 = f(i2);
        }
        this.b.e(f2, z);
        if (z) {
            i(view);
        }
        y yVar = (y) this.a;
        Objects.requireNonNull(yVar);
        RecyclerView.a0 M = RecyclerView.M(view);
        if (M != null) {
            if (!M.isTmpDetached() && !M.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(M);
                throw new IllegalArgumentException(f.a.b.a.a.h(yVar.a, sb));
            }
            M.clearTmpDetachFlag();
        }
        yVar.a.attachViewToParent(view, f2, layoutParams);
    }

    public void c(int i2) {
        RecyclerView.a0 M;
        int f2 = f(i2);
        this.b.f(f2);
        y yVar = (y) this.a;
        View childAt = yVar.a.getChildAt(f2);
        if (childAt != null && (M = RecyclerView.M(childAt)) != null) {
            if (M.isTmpDetached() && !M.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(M);
                throw new IllegalArgumentException(f.a.b.a.a.h(yVar.a, sb));
            }
            M.addFlags(256);
        }
        yVar.a.detachViewFromParent(f2);
    }

    public View d(int i2) {
        return ((y) this.a).a(f(i2));
    }

    public int e() {
        return ((y) this.a).b() - this.c.size();
    }

    public final int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int b = ((y) this.a).b();
        int i3 = i2;
        while (i3 < b) {
            int b2 = i2 - (i3 - this.b.b(i3));
            if (b2 == 0) {
                while (this.b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    public View g(int i2) {
        return ((y) this.a).a.getChildAt(i2);
    }

    public int h() {
        return ((y) this.a).b();
    }

    public final void i(View view) {
        this.c.add(view);
        y yVar = (y) this.a;
        Objects.requireNonNull(yVar);
        RecyclerView.a0 M = RecyclerView.M(view);
        if (M != null) {
            M.onEnteredHiddenState(yVar.a);
        }
    }

    public int j(View view) {
        int indexOfChild = ((y) this.a).a.indexOfChild(view);
        if (indexOfChild == -1 || this.b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.b.b(indexOfChild);
    }

    public boolean k(View view) {
        return this.c.contains(view);
    }

    public final boolean l(View view) {
        if (this.c.remove(view)) {
            y yVar = (y) this.a;
            Objects.requireNonNull(yVar);
            RecyclerView.a0 M = RecyclerView.M(view);
            if (M != null) {
                M.onLeftHiddenState(yVar.a);
                return true;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}

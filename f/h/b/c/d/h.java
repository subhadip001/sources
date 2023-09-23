package f.h.b.c.d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes.dex */
public class h<V extends View> extends CoordinatorLayout.c<V> {
    public i a;
    public int b;

    public h() {
        this.b = 0;
    }

    public int B() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.f5241d;
        }
        return 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.s(v, i2);
    }

    public boolean D(int i2) {
        i iVar = this.a;
        if (iVar != null) {
            if (iVar.f5241d != i2) {
                iVar.f5241d = i2;
                iVar.a();
                return true;
            }
            return false;
        }
        this.b = i2;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i2) {
        C(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new i(v);
        }
        i iVar = this.a;
        iVar.b = iVar.a.getTop();
        iVar.c = iVar.a.getLeft();
        this.a.a();
        int i3 = this.b;
        if (i3 != 0) {
            i iVar2 = this.a;
            if (iVar2.f5241d != i3) {
                iVar2.f5241d = i3;
                iVar2.a();
            }
            this.b = 0;
            return true;
        }
        return true;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}

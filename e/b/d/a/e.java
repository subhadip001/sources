package e.b.d.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import e.b.d.a.b;

/* compiled from: StateListDrawable.java */
/* loaded from: classes.dex */
public class e extends b {
    public a s;
    public boolean t;

    /* compiled from: StateListDrawable.java */
    /* loaded from: classes.dex */
    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f1558g.length];
            }
        }

        @Override // e.b.d.a.b.c
        public void e() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int g(int[] iArr) {
            int[][] iArr2 = this.J;
            int i2 = this.f1559h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // e.b.d.a.b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // e.b.d.a.b
    public void e(b.c cVar) {
        this.f1545f = cVar;
        int i2 = this.f1551l;
        if (i2 >= 0) {
            Drawable d2 = cVar.d(i2);
            this.f1547h = d2;
            if (d2 != null) {
                c(d2);
            }
        }
        this.f1548i = null;
        if (cVar instanceof a) {
            this.s = (a) cVar;
        }
    }

    @Override // e.b.d.a.b
    /* renamed from: f */
    public a b() {
        return new a(this.s, this, null);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // e.b.d.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.s.e();
                this.t = true;
            }
        }
        return this;
    }

    @Override // e.b.d.a.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g2 = this.s.g(iArr);
        if (g2 < 0) {
            g2 = this.s.g(StateSet.WILD_CARD);
        }
        return d(g2) || onStateChange;
    }

    public e(a aVar) {
    }
}

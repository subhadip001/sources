package e.b.d.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import e.b.d.a.b;
import e.b.d.a.e;
import e.f.i;

/* compiled from: AnimatedStateListDrawableCompat.java */
/* loaded from: classes.dex */
public class a extends e.b.d.a.e implements e.i.d.m.a {
    public c u;
    public g v;
    public int w;
    public int x;
    public boolean y;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends g {
        public final Animatable a;

        public b(Animatable animatable) {
            super(null);
            this.a = animatable;
        }

        @Override // e.b.d.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // e.b.d.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e.a {
        public e.f.e<Long> K;
        public i<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new e.f.e<>();
            this.L = new i<>();
        }

        public static long h(int i2, int i3) {
            return i3 | (i2 << 32);
        }

        @Override // e.b.d.a.e.a, e.b.d.a.b.c
        public void e() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int i(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.d(i2, 0).intValue();
        }

        @Override // e.b.d.a.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // e.b.d.a.e.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends g {
        public final e.b0.a.a.b a;

        public d(e.b0.a.a.b bVar) {
            super(null);
            this.a = bVar;
        }

        @Override // e.b.d.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // e.b.d.a.a.g
        public void d() {
            this.a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e extends g {
        public final ObjectAnimator a;
        public final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z ? numberOfFrames - 1 : 0;
            int i3 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i2, i3);
            e.b.e.a.a(ofInt, true);
            ofInt.setDuration(fVar.c);
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // e.b.d.a.a.g
        public boolean a() {
            return this.b;
        }

        @Override // e.b.d.a.a.g
        public void b() {
            this.a.reverse();
        }

        @Override // e.b.d.a.a.g
        public void c() {
            this.a.start();
        }

        @Override // e.b.d.a.a.g
        public void d() {
            this.a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {
        public int[] a;
        public int b;
        public int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.c = i2;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * this.c) + 0.5f);
            int i3 = this.b;
            int[] iArr = this.a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (i4 / i3) + (i4 < i3 ? i2 / this.c : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g {
        public g(C0024a c0024a) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01f8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(f.a.b.a.a.y(r21, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0216, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021d, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.b.d.a.a g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.a.a.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):e.b.d.a.a");
    }

    @Override // e.b.d.a.e, e.b.d.a.b
    public b.c b() {
        return new c(this.u, this, null);
    }

    @Override // e.b.d.a.e, e.b.d.a.b
    public void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof c) {
            this.u = (c) cVar;
        }
    }

    @Override // e.b.d.a.e
    public e.a f() {
        return new c(this.u, this, null);
    }

    @Override // e.b.d.a.e, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // e.b.d.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.v;
        if (gVar != null) {
            gVar.d();
            this.v = null;
            d(this.w);
            this.w = -1;
            this.x = -1;
        }
    }

    @Override // e.b.d.a.e, e.b.d.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.y) {
            super.mutate();
            if (this == this) {
                this.u.e();
                this.y = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    @Override // e.b.d.a.e, e.b.d.a.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.d.a.a.onStateChange(int[]):boolean");
    }

    @Override // e.b.d.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.v;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.w = -1;
        this.x = -1;
        c cVar2 = new c(cVar, this, resources);
        super.e(cVar2);
        this.u = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }
}

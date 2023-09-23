package e.b0.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class b extends e implements Animatable {

    /* renamed from: g  reason: collision with root package name */
    public C0028b f1880g;

    /* renamed from: h  reason: collision with root package name */
    public Context f1881h;

    /* renamed from: i  reason: collision with root package name */
    public ArgbEvaluator f1882i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable.Callback f1883j;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: e.b0.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0028b extends Drawable.ConstantState {
        public int a;
        public f b;
        public AnimatorSet c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f1885d;

        /* renamed from: e  reason: collision with root package name */
        public e.f.a<Animator, String> f1886e;

        public C0028b(C0028b c0028b, Drawable.Callback callback, Resources resources) {
            if (c0028b != null) {
                this.a = c0028b.a;
                f fVar = c0028b.b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.b = (f) constantState.newDrawable(resources);
                    } else {
                        this.b = (f) constantState.newDrawable();
                    }
                    f fVar2 = this.b;
                    fVar2.mutate();
                    this.b = fVar2;
                    fVar2.setCallback(callback);
                    this.b.setBounds(c0028b.b.getBounds());
                    this.b.f1892k = false;
                }
                ArrayList<Animator> arrayList = c0028b.f1885d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f1885d = new ArrayList<>(size);
                    this.f1886e = new e.f.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c0028b.f1885d.get(i2);
                        Animator clone = animator.clone();
                        String orDefault = c0028b.f1886e.getOrDefault(animator, null);
                        clone.setTarget(this.b.f1888g.b.p.getOrDefault(orDefault, null));
                        this.f1885d.add(clone);
                        this.f1886e.put(clone, orDefault);
                    }
                    if (this.c == null) {
                        this.c = new AnimatorSet();
                    }
                    this.c.playTogether(this.f1885d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this(null, null, null);
    }

    @Override // e.b0.a.a.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f1880g.b.draw(canvas);
        if (this.f1880g.c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f1880g.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f1880g.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f1880g.b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1887f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f1887f.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f1880g.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f1880g.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f1880g.b.getOpacity();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b0.a.a.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f1880g.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f1880g.c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f1880g.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1880g.b.setBounds(rect);
        }
    }

    @Override // e.b0.a.a.e, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        return this.f1880g.b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f1880g.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f1880g.b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        f fVar = this.f1880g.b;
        Drawable drawable2 = fVar.f1887f;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            fVar.f1888g.f1926e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        f fVar = this.f1880g.b;
        Drawable drawable2 = fVar.f1887f;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        fVar.f1890i = colorFilter;
        fVar.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            e.i.a.c0(drawable, i2);
        } else {
            this.f1880g.b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            e.i.a.d0(drawable, colorStateList);
        } else {
            this.f1880g.b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            e.i.a.e0(drawable, mode);
        } else {
            this.f1880g.b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f1880g.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f1880g.c.isStarted()) {
        } else {
            this.f1880g.c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f1887f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1880g.c.end();
        }
    }

    public b(Context context, C0028b c0028b, Resources resources) {
        this.f1882i = null;
        a aVar = new a();
        this.f1883j = aVar;
        this.f1881h = context;
        this.f1880g = new C0028b(null, aVar, null);
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b(null, null, null);
            Drawable newDrawable = this.a.newDrawable();
            bVar.f1887f = newDrawable;
            newDrawable.setCallback(bVar.f1883j);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b(null, null, null);
            Drawable newDrawable = this.a.newDrawable(resources);
            bVar.f1887f = newDrawable;
            newDrawable.setCallback(bVar.f1883j);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b(null, null, null);
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            bVar.f1887f = newDrawable;
            newDrawable.setCallback(bVar.f1883j);
            return bVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

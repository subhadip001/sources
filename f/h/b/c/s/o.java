package f.h.b.c.s;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Constructor;
import java.util.Objects;

/* compiled from: StaticLayoutBuilderCompat.java */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: m  reason: collision with root package name */
    public static final int f5430m;
    public static boolean n;
    public static Constructor<StaticLayout> o;
    public static Object p;
    public CharSequence a;
    public final TextPaint b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f5431d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5438k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f5432e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f5433f = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: g  reason: collision with root package name */
    public float f5434g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f5435h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f5436i = f5430m;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5437j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f5439l = null;

    /* compiled from: StaticLayoutBuilderCompat.java */
    /* loaded from: classes.dex */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = f.a.b.a.a.A(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.b.c.s.o.a.<init>(java.lang.Throwable):void");
        }
    }

    static {
        f5430m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public o(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i2;
        this.f5431d = charSequence.length();
    }

    public StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        if (this.f5433f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.b, max, this.f5439l);
        }
        int min = Math.min(charSequence.length(), this.f5431d);
        this.f5431d = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f5438k && this.f5433f == 1) {
                this.f5432e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.b, max);
            obtain.setAlignment(this.f5432e);
            obtain.setIncludePad(this.f5437j);
            if (this.f5438k) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.f5439l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f5433f);
            float f2 = this.f5434g;
            if (f2 != 0.0f || this.f5435h != 1.0f) {
                obtain.setLineSpacing(f2, this.f5435h);
            }
            if (this.f5433f > 1) {
                obtain.setHyphenationFrequency(this.f5436i);
            }
            return obtain.build();
        }
        if (!n) {
            try {
                p = this.f5438k && i2 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                n = true;
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        try {
            Constructor<StaticLayout> constructor = o;
            Objects.requireNonNull(constructor);
            Object obj = p;
            Objects.requireNonNull(obj);
            return constructor.newInstance(charSequence, 0, Integer.valueOf(this.f5431d), this.b, Integer.valueOf(max), this.f5432e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f5437j), null, Integer.valueOf(max), Integer.valueOf(this.f5433f));
        } catch (Exception e3) {
            throw new a(e3);
        }
    }
}

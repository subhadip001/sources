package f.h.b.c.s;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes.dex */
public class p {
    public float c;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f5441e;

    /* renamed from: f  reason: collision with root package name */
    public f.h.b.c.v.b f5442f;
    public final TextPaint a = new TextPaint(1);
    public final f.h.b.c.v.d b = new a();

    /* renamed from: d  reason: collision with root package name */
    public boolean f5440d = true;

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes.dex */
    public class a extends f.h.b.c.v.d {
        public a() {
        }

        @Override // f.h.b.c.v.d
        public void a(int i2) {
            p pVar = p.this;
            pVar.f5440d = true;
            b bVar = pVar.f5441e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // f.h.b.c.v.d
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            p pVar = p.this;
            pVar.f5440d = true;
            b bVar = pVar.f5441e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public p(b bVar) {
        this.f5441e = new WeakReference<>(null);
        this.f5441e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        if (!this.f5440d) {
            return this.c;
        }
        float measureText = str == null ? 0.0f : this.a.measureText((CharSequence) str, 0, str.length());
        this.c = measureText;
        this.f5440d = false;
        return measureText;
    }

    public void b(f.h.b.c.v.b bVar, Context context) {
        if (this.f5442f != bVar) {
            this.f5442f = bVar;
            if (bVar != null) {
                bVar.f(context, this.a, this.b);
                b bVar2 = this.f5441e.get();
                if (bVar2 != null) {
                    this.a.drawableState = bVar2.getState();
                }
                bVar.e(context, this.a, this.b);
                this.f5440d = true;
            }
            b bVar3 = this.f5441e.get();
            if (bVar3 != null) {
                bVar3.a();
                bVar3.onStateChange(bVar3.getState());
            }
        }
    }
}

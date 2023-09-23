package f.h.b.c.v;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: TextAppearance.java */
/* loaded from: classes.dex */
public class c extends d {
    public final /* synthetic */ Context a;
    public final /* synthetic */ TextPaint b;
    public final /* synthetic */ d c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f5461d;

    public c(b bVar, Context context, TextPaint textPaint, d dVar) {
        this.f5461d = bVar;
        this.a = context;
        this.b = textPaint;
        this.c = dVar;
    }

    @Override // f.h.b.c.v.d
    public void a(int i2) {
        this.c.a(i2);
    }

    @Override // f.h.b.c.v.d
    public void b(Typeface typeface, boolean z) {
        this.f5461d.g(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}

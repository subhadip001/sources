package f.h.b.c.v;

import android.graphics.Typeface;
import f.h.b.c.s.e;

/* compiled from: CancelableFontCallback.java */
/* loaded from: classes.dex */
public final class a extends d {
    public final Typeface a;
    public final InterfaceC0127a b;
    public boolean c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: f.h.b.c.v.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0127a {
    }

    public a(InterfaceC0127a interfaceC0127a, Typeface typeface) {
        this.a = typeface;
        this.b = interfaceC0127a;
    }

    @Override // f.h.b.c.v.d
    public void a(int i2) {
        c(this.a);
    }

    @Override // f.h.b.c.v.d
    public void b(Typeface typeface, boolean z) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (this.c) {
            return;
        }
        e eVar = ((f.h.b.c.s.d) this.b).a;
        if (eVar.o(typeface)) {
            eVar.k(false);
        }
    }
}

package e.e.c;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* compiled from: CardViewApi21Impl.java */
/* loaded from: classes.dex */
public class a implements c {
    @Override // e.e.c.c
    public void a(b bVar, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        d dVar = new d(colorStateList, f2);
        CardView.a aVar = (CardView.a) bVar;
        aVar.a = dVar;
        CardView.this.setBackgroundDrawable(dVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(f3);
        n(bVar, f4);
    }

    @Override // e.e.c.c
    public void b(b bVar, float f2) {
        d o = o(bVar);
        if (f2 == o.a) {
            return;
        }
        o.a = f2;
        o.c(null);
        o.invalidateSelf();
    }

    @Override // e.e.c.c
    public float c(b bVar) {
        return CardView.this.getElevation();
    }

    @Override // e.e.c.c
    public float d(b bVar) {
        return o(bVar).a;
    }

    @Override // e.e.c.c
    public void e(b bVar) {
        n(bVar, o(bVar).f1960e);
    }

    @Override // e.e.c.c
    public void f(b bVar, float f2) {
        CardView.this.setElevation(f2);
    }

    @Override // e.e.c.c
    public float g(b bVar) {
        return o(bVar).f1960e;
    }

    @Override // e.e.c.c
    public ColorStateList h(b bVar) {
        return o(bVar).f1963h;
    }

    @Override // e.e.c.c
    public void i(b bVar) {
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.b(0, 0, 0, 0);
            return;
        }
        float f2 = o(bVar).f1960e;
        float f3 = o(bVar).a;
        int ceil = (int) Math.ceil(e.a(f2, f3, aVar.a()));
        int ceil2 = (int) Math.ceil(e.b(f2, f3, aVar.a()));
        aVar.b(ceil, ceil2, ceil, ceil2);
    }

    @Override // e.e.c.c
    public float j(b bVar) {
        return o(bVar).a * 2.0f;
    }

    @Override // e.e.c.c
    public float k(b bVar) {
        return o(bVar).a * 2.0f;
    }

    @Override // e.e.c.c
    public void l(b bVar) {
        n(bVar, o(bVar).f1960e);
    }

    @Override // e.e.c.c
    public void m(b bVar, ColorStateList colorStateList) {
        d o = o(bVar);
        o.b(colorStateList);
        o.invalidateSelf();
    }

    @Override // e.e.c.c
    public void n(b bVar, float f2) {
        d o = o(bVar);
        CardView.a aVar = (CardView.a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean a = aVar.a();
        if (f2 != o.f1960e || o.f1961f != useCompatPadding || o.f1962g != a) {
            o.f1960e = f2;
            o.f1961f = useCompatPadding;
            o.f1962g = a;
            o.c(null);
            o.invalidateSelf();
        }
        i(bVar);
    }

    public final d o(b bVar) {
        return (d) ((CardView.a) bVar).a;
    }
}

package f.e.a.p.j;

import android.graphics.drawable.Drawable;
import f.e.a.r.l;

/* compiled from: CustomTarget.java */
/* loaded from: classes.dex */
public abstract class c<T> implements h<T> {
    private final int height;
    private f.e.a.p.d request;
    private final int width;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // f.e.a.p.j.h
    public final f.e.a.p.d getRequest() {
        return this.request;
    }

    @Override // f.e.a.p.j.h
    public final void getSize(g gVar) {
        gVar.b(this.width, this.height);
    }

    @Override // f.e.a.m.m
    public void onDestroy() {
    }

    @Override // f.e.a.p.j.h
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // f.e.a.p.j.h
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // f.e.a.m.m
    public void onStart() {
    }

    @Override // f.e.a.m.m
    public void onStop() {
    }

    @Override // f.e.a.p.j.h
    public final void removeCallback(g gVar) {
    }

    @Override // f.e.a.p.j.h
    public final void setRequest(f.e.a.p.d dVar) {
        this.request = dVar;
    }

    public c(int i2, int i3) {
        if (l.j(i2, i3)) {
            this.width = i2;
            this.height = i3;
            return;
        }
        throw new IllegalArgumentException(f.a.b.a.a.k("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", i2, " and height: ", i3));
    }
}

package f.e.a.p.j;

import android.graphics.drawable.Drawable;
import f.e.a.m.m;

/* compiled from: Target.java */
/* loaded from: classes.dex */
public interface h<R> extends m {
    f.e.a.p.d getRequest();

    void getSize(g gVar);

    void onLoadCleared(Drawable drawable);

    void onLoadFailed(Drawable drawable);

    void onLoadStarted(Drawable drawable);

    void onResourceReady(R r, f.e.a.p.k.b<? super R> bVar);

    void removeCallback(g gVar);

    void setRequest(f.e.a.p.d dVar);
}

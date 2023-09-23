package f.e.a.p;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;

/* compiled from: RequestListener.java */
/* loaded from: classes.dex */
public interface e<R> {
    boolean onLoadFailed(GlideException glideException, Object obj, f.e.a.p.j.h<R> hVar, boolean z);

    boolean onResourceReady(R r, Object obj, f.e.a.p.j.h<R> hVar, DataSource dataSource, boolean z);
}

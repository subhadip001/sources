package f.e.a;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Registry;
import f.e.a.b;
import f.e.a.l.q.l;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final i<?, ?> f3170k = new a();
    public final f.e.a.l.q.b0.b a;
    public final f.e.a.r.g<Registry> b;
    public final f.e.a.p.j.f c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f3171d;

    /* renamed from: e  reason: collision with root package name */
    public final List<f.e.a.p.e<Object>> f3172e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, i<?, ?>> f3173f;

    /* renamed from: g  reason: collision with root package name */
    public final l f3174g;

    /* renamed from: h  reason: collision with root package name */
    public final e f3175h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3176i;

    /* renamed from: j  reason: collision with root package name */
    public f.e.a.p.f f3177j;

    public d(Context context, f.e.a.l.q.b0.b bVar, f.e.a.r.g<Registry> gVar, f.e.a.p.j.f fVar, b.a aVar, Map<Class<?>, i<?, ?>> map, List<f.e.a.p.e<Object>> list, l lVar, e eVar, int i2) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.c = fVar;
        this.f3171d = aVar;
        this.f3172e = list;
        this.f3173f = map;
        this.f3174g = lVar;
        this.f3175h = eVar;
        this.f3176i = i2;
        this.b = new f.e.a.r.f(gVar);
    }

    public Registry a() {
        return this.b.get();
    }
}

package f.h.f.z.z;

import f.h.f.w;
import f.h.f.z.z.j;
import java.lang.reflect.Field;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes2.dex */
public class i extends j.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f6280d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f6281e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f6282f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f.h.f.j f6283g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f.h.f.a0.a f6284h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f6285i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, String str, boolean z, boolean z2, Field field, boolean z3, w wVar, f.h.f.j jVar2, f.h.f.a0.a aVar, boolean z4) {
        super(str, z, z2);
        this.f6280d = field;
        this.f6281e = z3;
        this.f6282f = wVar;
        this.f6283g = jVar2;
        this.f6284h = aVar;
        this.f6285i = z4;
    }

    @Override // f.h.f.z.z.j.b
    public void a(f.h.f.b0.a aVar, Object obj) {
        Object a = this.f6282f.a(aVar);
        if (a == null && this.f6285i) {
            return;
        }
        this.f6280d.set(obj, a);
    }

    @Override // f.h.f.z.z.j.b
    public void b(f.h.f.b0.b bVar, Object obj) {
        (this.f6281e ? this.f6282f : new n(this.f6283g, this.f6282f, this.f6284h.b)).b(bVar, this.f6280d.get(obj));
    }

    @Override // f.h.f.z.z.j.b
    public boolean c(Object obj) {
        return this.b && this.f6280d.get(obj) != obj;
    }
}

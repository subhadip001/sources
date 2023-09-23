package f.l.a.d.g.b;

import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import e.s.b0;
import e.s.s;
import f.l.a.d.d.e;
import f.l.a.d.d.f;
import f.n.a.n.i;
import i.j.d;
import i.j.j.a.h;
import i.l.a.p;
import j.a.c0;
import j.a.c1;
import j.a.l0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: OutputListViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends b0 {
    public final f.l.a.d.f.b.a c;

    /* renamed from: d  reason: collision with root package name */
    public c1 f6691d;

    /* renamed from: e  reason: collision with root package name */
    public final s<Boolean> f6692e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends e> f6693f;

    /* renamed from: g  reason: collision with root package name */
    public final s<List<e>> f6694g;

    /* renamed from: h  reason: collision with root package name */
    public final s<LayoutMode> f6695h;

    /* renamed from: i  reason: collision with root package name */
    public final s<SortMode> f6696i;

    /* renamed from: j  reason: collision with root package name */
    public final s<SortOrder> f6697j;

    /* renamed from: k  reason: collision with root package name */
    public final s<MediaType> f6698k;

    /* renamed from: l  reason: collision with root package name */
    public final List<f> f6699l;

    /* compiled from: OutputListViewModel.kt */
    @i.j.j.a.e(c = "com.nightcode.mediapicker.domain.viewModels.outputlist.OutputListViewModel$refresh$1", f = "OutputListViewModel.kt", l = {72}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h implements p<c0, d<? super i.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f6700j;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // i.j.j.a.a
        public final d<i.h> a(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, d<? super i.h> dVar) {
            return new a(dVar).l(i.h.a);
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f6700j;
            if (i2 == 0) {
                i.e0(obj);
                b bVar = b.this;
                this.f6700j = 1;
                Objects.requireNonNull(bVar);
                Object k0 = i.k0(l0.b, new f.l.a.d.g.b.a(bVar, null), this);
                if (k0 != obj2) {
                    k0 = i.h.a;
                }
                if (k0 == obj2) {
                    return obj2;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i.e0(obj);
            }
            return i.h.a;
        }
    }

    public b(f.l.a.d.f.b.a aVar) {
        i.l.b.i.e(aVar, "getImagesUseCase");
        this.c = aVar;
        this.f6692e = new s<>();
        this.f6693f = i.i.d.f8613f;
        this.f6694g = new s<>();
        f.l.a.d.a aVar2 = f.l.a.d.a.a;
        this.f6695h = new s<>(f.l.a.d.a.f6631d);
        this.f6696i = new s<>(f.l.a.d.a.b);
        this.f6697j = new s<>(f.l.a.d.a.c);
        this.f6698k = new s<>();
        this.f6699l = new ArrayList();
    }

    @Override // e.s.b0
    public void b() {
        c1 c1Var = this.f6691d;
        if (c1Var == null) {
            return;
        }
        i.j(c1Var, null, 1, null);
    }

    public final void d(boolean z) {
        Boolean d2 = this.f6692e.d();
        Boolean bool = Boolean.TRUE;
        if (!i.l.b.i.a(d2, bool) || z) {
            this.f6692e.i(bool);
            c1 c1Var = this.f6691d;
            if (c1Var != null) {
                i.j(c1Var, null, 1, null);
            }
            this.f6691d = i.D(e.p.a.h(this), null, null, new a(null), 3, null);
        }
    }
}

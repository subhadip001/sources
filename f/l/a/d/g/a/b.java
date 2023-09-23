package f.l.a.d.g.a;

import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import e.s.b0;
import e.s.s;
import f.l.a.d.d.e;
import f.n.a.n.i;
import i.j.j.a.h;
import i.l.a.p;
import j.a.c0;
import j.a.c1;
import j.a.l0;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: MediaListViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends b0 {
    public final f.l.a.d.f.a.b c;

    /* renamed from: d  reason: collision with root package name */
    public final f.l.a.d.f.d.b f6676d;

    /* renamed from: e  reason: collision with root package name */
    public final f.l.a.d.f.e.b f6677e;

    /* renamed from: f  reason: collision with root package name */
    public c1 f6678f;

    /* renamed from: g  reason: collision with root package name */
    public final s<Boolean> f6679g;

    /* renamed from: h  reason: collision with root package name */
    public List<? extends e> f6680h;

    /* renamed from: i  reason: collision with root package name */
    public final s<List<e>> f6681i;

    /* renamed from: j  reason: collision with root package name */
    public String f6682j;

    /* renamed from: k  reason: collision with root package name */
    public final s<LayoutMode> f6683k;

    /* renamed from: l  reason: collision with root package name */
    public final s<SortMode> f6684l;

    /* renamed from: m  reason: collision with root package name */
    public final s<SortOrder> f6685m;
    public final s<MediaType> n;

    /* compiled from: MediaListViewModel.kt */
    @i.j.j.a.e(c = "com.nightcode.mediapicker.domain.viewModels.mediaList.MediaListViewModel$refresh$1", f = "MediaListViewModel.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h implements p<c0, i.j.d<? super i.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f6686j;

        public a(i.j.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // i.j.j.a.a
        public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
            return new a(dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
            return new a(dVar).l(i.h.a);
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f6686j;
            if (i2 == 0) {
                i.e0(obj);
                b bVar = b.this;
                this.f6686j = 1;
                Objects.requireNonNull(bVar);
                Object k0 = i.k0(l0.b, new f.l.a.d.g.a.a(bVar, null), this);
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

    public b(f.l.a.d.f.a.b bVar, f.l.a.d.f.d.b bVar2, f.l.a.d.f.e.b bVar3) {
        i.l.b.i.e(bVar, "getAudiosUseCase");
        i.l.b.i.e(bVar2, "getImagesUseCase");
        i.l.b.i.e(bVar3, "getVideosUseCase");
        this.c = bVar;
        this.f6676d = bVar2;
        this.f6677e = bVar3;
        this.f6679g = new s<>();
        this.f6680h = i.i.d.f8613f;
        this.f6681i = new s<>();
        f.l.a.d.a aVar = f.l.a.d.a.a;
        this.f6683k = new s<>(f.l.a.d.a.f6631d);
        this.f6684l = new s<>(f.l.a.d.a.b);
        this.f6685m = new s<>(f.l.a.d.a.c);
        this.n = new s<>();
    }

    @Override // e.s.b0
    public void b() {
        c1 c1Var = this.f6678f;
        if (c1Var == null) {
            return;
        }
        i.j(c1Var, null, 1, null);
    }

    public final void d(boolean z) {
        Boolean d2 = this.f6679g.d();
        Boolean bool = Boolean.TRUE;
        if (!i.l.b.i.a(d2, bool) || z) {
            this.f6679g.i(bool);
            c1 c1Var = this.f6678f;
            if (c1Var != null) {
                i.j(c1Var, null, 1, null);
            }
            this.f6678f = i.D(e.p.a.h(this), null, null, new a(null), 3, null);
        }
    }
}

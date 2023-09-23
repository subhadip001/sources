package f.l.a.d.g.a;

import com.nightcode.mediapicker.domain.constants.MediaType;
import f.l.a.d.c.a;
import f.n.a.n.i;
import i.j.j.a.e;
import i.j.j.a.h;
import i.l.a.p;
import j.a.c0;
import java.util.List;

/* compiled from: MediaListViewModel.kt */
@e(c = "com.nightcode.mediapicker.domain.viewModels.mediaList.MediaListViewModel$loadMedias$2", f = "MediaListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends h implements p<c0, i.j.d<? super i.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f6675j;

    /* compiled from: MediaListViewModel.kt */
    /* renamed from: f.l.a.d.g.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0158a {
        public static final /* synthetic */ int[] a;

        static {
            MediaType.values();
            a = new int[]{2, 1};
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, i.j.d<? super a> dVar) {
        super(2, dVar);
        this.f6675j = bVar;
    }

    @Override // i.j.j.a.a
    public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
        return new a(this.f6675j, dVar);
    }

    @Override // i.l.a.p
    public Object k(c0 c0Var, i.j.d<? super i.h> dVar) {
        a aVar = new a(this.f6675j, dVar);
        i.h hVar = i.h.a;
        aVar.l(hVar);
        return hVar;
    }

    @Override // i.j.j.a.a
    public final Object l(Object obj) {
        Object a;
        i.e0(obj);
        if (this.f6675j.n.d() != null) {
            b bVar = this.f6675j;
            MediaType d2 = bVar.n.d();
            int i2 = d2 == null ? -1 : C0158a.a[d2.ordinal()];
            if (i2 == 1) {
                a = bVar.f6676d.a.a(new f.l.a.d.d.b(null, bVar.f6682j, bVar.f6684l.d(), bVar.f6685m.d(), 1));
            } else if (i2 != 2) {
                a = bVar.f6677e.a.c(new f.l.a.d.d.b(null, bVar.f6682j, bVar.f6684l.d(), bVar.f6685m.d(), 1));
            } else {
                a = bVar.c.a.e(new f.l.a.d.d.b(null, bVar.f6682j, bVar.f6684l.d(), bVar.f6685m.d(), 1));
            }
            if (a instanceof a.b) {
                List<f.l.a.d.d.e> list = (List) ((a.b) a).a;
                i.l.b.i.e(list, "<set-?>");
                bVar.f6680h = list;
                bVar.f6681i.i(list);
            }
        }
        this.f6675j.f6679g.i(Boolean.FALSE);
        return i.h.a;
    }
}

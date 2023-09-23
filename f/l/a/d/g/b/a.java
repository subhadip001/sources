package f.l.a.d.g.b;

import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import f.l.a.d.c.a;
import f.l.a.d.d.f;
import f.n.a.n.i;
import i.j.d;
import i.j.j.a.e;
import i.j.j.a.h;
import i.l.a.p;
import j.a.c0;
import java.util.List;
import java.util.Objects;

/* compiled from: OutputListViewModel.kt */
@e(c = "com.nightcode.mediapicker.domain.viewModels.outputlist.OutputListViewModel$loadMedias$2", f = "OutputListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends h implements p<c0, d<? super i.h>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f6690j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f6690j = bVar;
    }

    @Override // i.j.j.a.a
    public final d<i.h> a(Object obj, d<?> dVar) {
        return new a(this.f6690j, dVar);
    }

    @Override // i.l.a.p
    public Object k(c0 c0Var, d<? super i.h> dVar) {
        d<? super i.h> dVar2 = dVar;
        b bVar = this.f6690j;
        if (dVar2 != null) {
            dVar2.getContext();
        }
        i.h hVar = i.h.a;
        i.e0(hVar);
        if (bVar.f6698k.d() != null) {
            f.l.a.d.f.b.a aVar = bVar.c;
            List<f> list = bVar.f6699l;
            Objects.requireNonNull(aVar);
            i.l.b.i.e(list, CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY);
            f.l.a.d.c.a<List<f.l.a.d.d.e>> a = aVar.a.a(list);
            if (a instanceof a.b) {
                List<f.l.a.d.d.e> list2 = (List) ((a.b) a).a;
                i.l.b.i.e(list2, "<set-?>");
                bVar.f6693f = list2;
                bVar.f6694g.i(list2);
            }
        }
        bVar.f6692e.i(Boolean.FALSE);
        return hVar;
    }

    @Override // i.j.j.a.a
    public final Object l(Object obj) {
        i.e0(obj);
        if (this.f6690j.f6698k.d() != null) {
            b bVar = this.f6690j;
            f.l.a.d.f.b.a aVar = bVar.c;
            List<f> list = bVar.f6699l;
            Objects.requireNonNull(aVar);
            i.l.b.i.e(list, CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY);
            f.l.a.d.c.a<List<f.l.a.d.d.e>> a = aVar.a.a(list);
            if (a instanceof a.b) {
                List<f.l.a.d.d.e> list2 = (List) ((a.b) a).a;
                i.l.b.i.e(list2, "<set-?>");
                bVar.f6693f = list2;
                bVar.f6694g.i(list2);
            }
        }
        this.f6690j.f6692e.i(Boolean.FALSE);
        return i.h.a;
    }
}

package f.f.a;

import f.c.a.a.i;
import java.util.Comparator;

/* compiled from: CrossPromoFragment.java */
/* loaded from: classes.dex */
public class d implements Comparator<f> {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f3608f;

    public d(e eVar) {
        this.f3608f = eVar;
    }

    @Override // java.util.Comparator
    public int compare(f fVar, f fVar2) {
        int i2;
        int i3;
        f fVar3 = fVar;
        f fVar4 = fVar2;
        if (!i.t(this.f3608f.getActivity(), fVar3.f3617g) && !i.t(this.f3608f.getActivity(), fVar4.f3617g)) {
            i2 = fVar3.f3619i;
            i3 = fVar4.f3619i;
        } else if (!i.t(this.f3608f.getActivity(), fVar3.f3617g)) {
            return -1;
        } else {
            if (!i.t(this.f3608f.getActivity(), fVar4.f3617g)) {
                return 1;
            }
            i2 = fVar3.f3619i;
            i3 = fVar4.f3619i;
        }
        return i2 - i3;
    }
}

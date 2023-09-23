package e.u.b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public class x extends c0 {
    public v c;

    /* renamed from: d  reason: collision with root package name */
    public v f2932d;

    @Override // e.u.b.c0
    public int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.g()) {
            iArr[0] = e(view, g(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.h()) {
            iArr[1] = e(view, h(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // e.u.b.c0
    public View c(RecyclerView.m mVar) {
        if (mVar.h()) {
            return f(mVar, h(mVar));
        }
        if (mVar.g()) {
            return f(mVar, g(mVar));
        }
        return null;
    }

    public final int e(View view, v vVar) {
        return ((vVar.c(view) / 2) + vVar.e(view)) - ((vVar.l() / 2) + vVar.k());
    }

    public final View f(RecyclerView.m mVar, v vVar) {
        int A = mVar.A();
        View view = null;
        if (A == 0) {
            return null;
        }
        int l2 = (vVar.l() / 2) + vVar.k();
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i3 = 0; i3 < A; i3++) {
            View z = mVar.z(i3);
            int abs = Math.abs(((vVar.c(z) / 2) + vVar.e(z)) - l2);
            if (abs < i2) {
                view = z;
                i2 = abs;
            }
        }
        return view;
    }

    public final v g(RecyclerView.m mVar) {
        v vVar = this.f2932d;
        if (vVar == null || vVar.a != mVar) {
            this.f2932d = new t(mVar);
        }
        return this.f2932d;
    }

    public final v h(RecyclerView.m mVar) {
        v vVar = this.c;
        if (vVar == null || vVar.a != mVar) {
            this.c = new u(mVar);
        }
        return this.c;
    }
}

package f.l.a.d.g.b;

import android.content.Context;
import e.s.b0;
import e.s.e0;
import i.l.b.i;

/* compiled from: OutputListViewModelFactory.kt */
/* loaded from: classes2.dex */
public final class c implements e0 {
    public final Context a;

    public c(Context context) {
        i.e(context, "mApplication");
        this.a = context;
    }

    @Override // e.s.e0
    public <T extends b0> T a(Class<T> cls) {
        i.e(cls, "modelClass");
        if (cls.isAssignableFrom(b.class)) {
            return new b(new f.l.a.d.f.b.a(new f.l.a.e.a.b(this.a)));
        }
        throw new IllegalArgumentException("Please provide the way how this viewModel can be initialized in MediaListViewModelFactory class");
    }
}

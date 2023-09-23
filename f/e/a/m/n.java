package f.e.a.m;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bumptech.glide.manager.LifecycleLifecycle;
import f.e.a.m.q;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: classes.dex */
public final class n {
    public final Map<Lifecycle, f.e.a.h> a = new HashMap();
    public final q.b b;

    /* compiled from: LifecycleRequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public class a implements m {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Lifecycle f3524f;

        public a(Lifecycle lifecycle) {
            this.f3524f = lifecycle;
        }

        @Override // f.e.a.m.m
        public void onDestroy() {
            n.this.a.remove(this.f3524f);
        }

        @Override // f.e.a.m.m
        public void onStart() {
        }

        @Override // f.e.a.m.m
        public void onStop() {
        }
    }

    /* compiled from: LifecycleRequestManagerRetriever.java */
    /* loaded from: classes.dex */
    public final class b implements r {
        public final FragmentManager a;

        public b(FragmentManager fragmentManager) {
            this.a = fragmentManager;
        }
    }

    public n(q.b bVar) {
        this.b = bVar;
    }

    public f.e.a.h a(Context context, f.e.a.b bVar, Lifecycle lifecycle, FragmentManager fragmentManager, boolean z) {
        f.e.a.r.l.a();
        f.e.a.r.l.a();
        f.e.a.h hVar = this.a.get(lifecycle);
        if (hVar == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(lifecycle);
            q.b bVar2 = this.b;
            b bVar3 = new b(fragmentManager);
            Objects.requireNonNull((q.a) bVar2);
            f.e.a.h hVar2 = new f.e.a.h(bVar, lifecycleLifecycle, bVar3, context);
            this.a.put(lifecycle, hVar2);
            lifecycleLifecycle.c(new a(lifecycle));
            if (z) {
                hVar2.onStart();
            }
            return hVar2;
        }
        return hVar;
    }
}

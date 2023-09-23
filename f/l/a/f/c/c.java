package f.l.a.f.c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import e.d0.a;
import f.n.a.n.i;
import i.j.d;
import i.j.j.a.e;
import i.j.j.a.h;
import i.l.a.p;
import i.l.a.q;
import j.a.c0;
import j.a.l0;
import j.a.y1.n;
import j.a.z;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: BaseFragment.kt */
/* loaded from: classes2.dex */
public abstract class c<B extends e.d0.a> extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public final q<LayoutInflater, ViewGroup, Boolean, B> f6729f;

    /* renamed from: g  reason: collision with root package name */
    public B f6730g;

    /* compiled from: BaseFragment.kt */
    @e(c = "com.nightcode.mediapicker.presentation.fragments.BaseFragment$onViewCreated$1", f = "BaseFragment.kt", l = {52}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends h implements p<c0, d<? super i.h>, Object> {

        /* renamed from: j  reason: collision with root package name */
        public int f6731j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ long f6732k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ c<B> f6733l;

        /* compiled from: BaseFragment.kt */
        @e(c = "com.nightcode.mediapicker.presentation.fragments.BaseFragment$onViewCreated$1$1", f = "BaseFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: f.l.a.f.c.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0160a extends h implements p<c0, d<? super i.h>, Object> {

            /* renamed from: j  reason: collision with root package name */
            public final /* synthetic */ c<B> f6734j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0160a(c<B> cVar, d<? super C0160a> dVar) {
                super(2, dVar);
                this.f6734j = cVar;
            }

            @Override // i.j.j.a.a
            public final d<i.h> a(Object obj, d<?> dVar) {
                return new C0160a(this.f6734j, dVar);
            }

            @Override // i.l.a.p
            public Object k(c0 c0Var, d<? super i.h> dVar) {
                d<? super i.h> dVar2 = dVar;
                c<B> cVar = this.f6734j;
                if (dVar2 != null) {
                    dVar2.getContext();
                }
                i.h hVar = i.h.a;
                i.e0(hVar);
                new Handler(Looper.getMainLooper()).post(new b(cVar));
                return hVar;
            }

            @Override // i.j.j.a.a
            public final Object l(Object obj) {
                i.e0(obj);
                new Handler(Looper.getMainLooper()).post(new b(this.f6734j));
                return i.h.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j2, c<B> cVar, d<? super a> dVar) {
            super(2, dVar);
            this.f6732k = j2;
            this.f6733l = cVar;
        }

        @Override // i.j.j.a.a
        public final d<i.h> a(Object obj, d<?> dVar) {
            return new a(this.f6732k, this.f6733l, dVar);
        }

        @Override // i.l.a.p
        public Object k(c0 c0Var, d<? super i.h> dVar) {
            return new a(this.f6732k, this.f6733l, dVar).l(i.h.a);
        }

        @Override // i.j.j.a.a
        public final Object l(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.f6731j;
            if (i2 == 0) {
                i.e0(obj);
                long j2 = this.f6732k;
                this.f6731j = 1;
                if (i.q(j2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                i.e0(obj);
            }
            z zVar = l0.a;
            i.D(i.a(n.c), null, null, new C0160a(this.f6733l, null), 3, null);
            return i.h.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends B> qVar) {
        i.l.b.i.e(qVar, "inflater");
        this.f6729f = qVar;
    }

    public static void l(c cVar, View view, Fragment fragment, String str, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            z = true;
        }
        if ((i6 & 8) != 0) {
            z2 = true;
        }
        if ((i6 & 16) != 0) {
            i2 = 0;
        }
        if ((i6 & 32) != 0) {
            i3 = 0;
        }
        if ((i6 & 64) != 0) {
            i4 = 0;
        }
        if ((i6 & 128) != 0) {
            i5 = 0;
        }
        i.l.b.i.e(view, "<this>");
        i.l.b.i.e(fragment, "fragment");
        i.l.b.i.e(str, "tag");
        e.p.c.a aVar = new e.p.c.a(cVar.getChildFragmentManager());
        aVar.b = i2;
        aVar.c = i3;
        aVar.f2691d = i4;
        aVar.f2692e = i5;
        aVar.h(view.getId(), fragment, str);
        i.l.b.i.d(aVar, "childFragmentManager\n   …e(this.id, fragment, tag)");
        if (z2) {
            aVar.c(str);
        }
        if (!cVar.getChildFragmentManager().T()) {
            aVar.d();
        } else if (z) {
            aVar.e();
        }
    }

    public final B i() {
        B b = this.f6730g;
        if (b != null) {
            return b;
        }
        i.l.b.i.h("binding");
        throw null;
    }

    public abstract void k();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.l.b.i.e(layoutInflater, "lInflater");
        B f2 = this.f6729f.f(layoutInflater, viewGroup, Boolean.FALSE);
        i.l.b.i.e(f2, "<set-?>");
        this.f6730g = f2;
        Log.d("BaseFragment", i.l.b.i.g("onCreateView: ", getArguments()));
        return i().b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        i.l.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        long j2 = arguments == null ? 0L : arguments.getLong("INIT_DELAY");
        Log.d("BaseFragment", "onViewCreated: delay " + j2 + ' ' + getArguments());
        if (j2 > 0) {
            i.D(i.a(l0.b), null, null, new a(j2, this, null), 3, null);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: f.l.a.f.c.a
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = c.this;
                    i.l.b.i.e(cVar, "this$0");
                    cVar.k();
                }
            });
        }
    }
}

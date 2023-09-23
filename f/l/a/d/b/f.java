package f.l.a.d.b;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import e.d0.a;
import i.l.a.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: AbstractAdapter.kt */
/* loaded from: classes2.dex */
public abstract class f<T, B extends e.d0.a> extends RecyclerView.e<k<B>> {
    public final q<LayoutInflater, ViewGroup, Boolean, B> a;
    public LayoutInflater b;
    public final List<T> c;

    /* compiled from: AbstractAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.g {
        public final /* synthetic */ f<T, B> a;

        public a(f<T, B> fVar) {
            this.a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void a() {
            f<T, B> fVar = this.a;
            List<T> list = fVar.c;
            Objects.requireNonNull(fVar);
            i.l.b.i.e(list, "newItems");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(q<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends B> qVar) {
        i.l.b.i.e(qVar, "inflate");
        this.a = qVar;
        registerAdapterDataObserver(new a(this));
        this.c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return this.c.size();
    }

    public abstract void n(B b, T t);

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(RecyclerView.a0 a0Var, int i2) {
        k kVar = (k) a0Var;
        i.l.b.i.e(kVar, "holder");
        n(kVar.a, this.c.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.a0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        i.l.b.i.e(viewGroup, "parent");
        LayoutInflater layoutInflater = this.b;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(viewGroup.getContext());
        }
        this.b = layoutInflater;
        q<LayoutInflater, ViewGroup, Boolean, B> qVar = this.a;
        LayoutInflater layoutInflater2 = this.b;
        i.l.b.i.b(layoutInflater2);
        return new k(qVar.f(layoutInflater2, viewGroup, Boolean.FALSE));
    }
}

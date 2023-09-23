package e.s;

import androidx.lifecycle.LiveData;

/* compiled from: MutableLiveData.java */
/* loaded from: classes.dex */
public class s<T> extends LiveData<T> {
    public s(T t) {
        super(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void i(T t) {
        super.i(t);
    }

    @Override // androidx.lifecycle.LiveData
    public void k(T t) {
        LiveData.a("setValue");
        this.f436g++;
        this.f434e = t;
        c(null);
    }

    public s() {
    }
}

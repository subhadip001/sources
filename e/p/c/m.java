package e.p.c;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class m implements e.a.d.b {
    public final /* synthetic */ n a;

    public m(n nVar) {
        this.a = nVar;
    }

    @Override // e.a.d.b
    public void a(Context context) {
        w<?> wVar = this.a.n.a;
        wVar.f2802i.b(wVar, wVar, null);
        Bundle a = this.a.f41h.b.a("android:support:fragments");
        if (a != null) {
            Parcelable parcelable = a.getParcelable("android:support:fragments");
            w<?> wVar2 = this.a.n.a;
            if (wVar2 instanceof e.s.j0) {
                wVar2.f2802i.e0(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}

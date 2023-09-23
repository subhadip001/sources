package f.i.a;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import f.n.a.n.i;
import i.j.j.a.h;
import i.l.a.p;
import j.a.c0;

/* compiled from: InverseFCM.kt */
@i.j.j.a.e(c = "com.inverse.pushnotification.InverseFCM$Companion$subscribe$1", f = "InverseFCM.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends h implements p<c0, i.j.d<? super Object>, Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f6443j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, i.j.d<? super c> dVar) {
        super(2, dVar);
        this.f6443j = str;
    }

    @Override // i.j.j.a.a
    public final i.j.d<i.h> a(Object obj, i.j.d<?> dVar) {
        return new c(this.f6443j, dVar);
    }

    @Override // i.l.a.p
    public Object k(c0 c0Var, i.j.d<? super Object> dVar) {
        return new c(this.f6443j, dVar).l(i.h.a);
    }

    @Override // i.j.j.a.a
    public final Object l(Object obj) {
        i.e0(obj);
        try {
            Task<Void> subscribeToTopic = FirebaseMessaging.getInstance().subscribeToTopic(this.f6443j);
            i.l.b.i.d(subscribeToTopic, "{\n                    Fi…(topic)\n                }");
            return subscribeToTopic;
        } catch (Exception e2) {
            return new Integer(Log.e("InverseFCM", "subscribeFromTopic: ", e2));
        }
    }
}

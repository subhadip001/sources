package e.g0;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import e.g0.q;

/* compiled from: OneTimeWorkRequest.java */
/* loaded from: classes.dex */
public final class l extends q {

    /* compiled from: OneTimeWorkRequest.java */
    /* loaded from: classes.dex */
    public static final class a extends q.a<a, l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.b.f2336d = OverwritingInputMerger.class.getName();
        }
    }

    public l(a aVar) {
        super(aVar.a, aVar.b, aVar.c);
    }
}

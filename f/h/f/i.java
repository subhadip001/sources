package f.h.f;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson.java */
/* loaded from: classes2.dex */
public class i extends w<AtomicLongArray> {
    public final /* synthetic */ w a;

    public i(w wVar) {
        this.a = wVar;
    }

    @Override // f.h.f.w
    public AtomicLongArray a(f.h.f.b0.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.F()) {
            arrayList.add(Long.valueOf(((Number) this.a.a(aVar)).longValue()));
        }
        aVar.p();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
        }
        return atomicLongArray;
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bVar.f();
        int length = atomicLongArray2.length();
        for (int i2 = 0; i2 < length; i2++) {
            this.a.b(bVar, Long.valueOf(atomicLongArray2.get(i2)));
        }
        bVar.p();
    }
}

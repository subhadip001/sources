package androidx.work;

import e.g0.e;
import e.g0.h;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // e.g0.h
    public e a(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e eVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(eVar.a));
        }
        aVar.b(hashMap);
        return aVar.a();
    }
}

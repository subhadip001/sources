package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public final class zzab implements Continuation<Void, Task<List<Task<?>>>> {
    public final /* synthetic */ Collection zza;

    public zzab(Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ Task<List<Task<?>>> then(Task<Void> task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.zza);
        return Tasks.forResult(arrayList);
    }
}

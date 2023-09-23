package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public final class zzaa implements Continuation<Void, List> {
    public final /* synthetic */ Collection zza;

    public zzaa(Collection collection) {
        this.zza = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ List then(Task<Void> task) {
        ArrayList arrayList = new ArrayList();
        for (Task task2 : this.zza) {
            arrayList.add(task2.getResult());
        }
        return arrayList;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfpe {
    private final zzfof zza;
    private final zzfpd zzb;

    private zzfpe(zzfpd zzfpdVar) {
        zzfoe zzfoeVar = zzfoe.zza;
        this.zzb = zzfpdVar;
        this.zza = zzfoeVar;
    }

    public static zzfpe zzb(int i2) {
        return new zzfpe(new zzfpa(4000));
    }

    public static zzfpe zzc(zzfof zzfofVar) {
        return new zzfpe(new zzfoy(zzfofVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfpb(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

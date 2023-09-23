package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfsf extends zzfsj {
    public final /* synthetic */ Comparator zza;

    public zzfsf(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfsj
    public final Map zza() {
        return new TreeMap(this.zza);
    }
}

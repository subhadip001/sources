package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import e.f.f;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzff extends f {
    public final /* synthetic */ zzfi zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzff(zzfi zzfiVar, int i2) {
        super(20);
        this.zza = zzfiVar;
    }

    @Override // e.f.f
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfi.zzd(this.zza, str);
    }
}

package com.google.android.gms.internal.measurement;

import android.util.Log;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzhv extends zzib {
    public zzhv(zzhy zzhyVar, String str, Boolean bool, boolean z) {
        super(zzhyVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzha.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzha.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder E = a.E("Invalid boolean value for ", super.zzc(), ": ");
        E.append((String) obj);
        Log.e("PhenotypeFlag", E.toString());
        return null;
    }
}

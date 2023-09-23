package com.google.android.gms.internal.measurement;

import android.util.Log;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzhu extends zzib {
    public zzhu(zzhy zzhyVar, String str, Long l2, boolean z) {
        super(zzhyVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder E = a.E("Invalid long value for ", super.zzc(), ": ");
            E.append((String) obj);
            Log.e("PhenotypeFlag", E.toString());
            return null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepi implements zzetb {
    private final zzeyc zza;

    public zzepi(zzeyc zzeycVar) {
        this.zza = zzeycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        zzeyc zzeycVar = this.zza;
        zzeta zzetaVar = null;
        if (zzeycVar != null && zzeycVar.zza() != null && !zzeycVar.zza().isEmpty()) {
            zzetaVar = new zzeta() { // from class: com.google.android.gms.internal.ads.zzeph
                @Override // com.google.android.gms.internal.ads.zzeta
                public final void zzf(Object obj) {
                    zzepi.this.zzc((Bundle) obj);
                }
            };
        }
        return zzfva.zzi(zzetaVar);
    }

    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}

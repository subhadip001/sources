package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeem implements zzfuw {
    public final /* synthetic */ zzffh zza;

    public zzeem(zzeen zzeenVar, zzffh zzffhVar) {
        this.zza = zzffhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcfi.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e2) {
            zzcfi.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}

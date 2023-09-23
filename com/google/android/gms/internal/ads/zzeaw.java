package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeaw extends zzbzp {
    public final /* synthetic */ zzeax zza;

    public zzeaw(zzeax zzeaxVar) {
        this.zza = zzeaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(new com.google.android.gms.ads.internal.util.zzay(zzazVar.zza, zzazVar.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbzq
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}

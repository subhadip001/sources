package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzdjf;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzm {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdjf zzdjfVar = adOverlayInfoParcel.zzy;
            if (zzdjfVar != null) {
                zzdjfVar.zzq();
            }
            Activity zzk = adOverlayInfoParcel.zzd.zzk();
            zzc zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null && zzcVar.zzj && zzk != null) {
                context = zzk;
            }
            com.google.android.gms.ads.internal.zzt.zzi();
            zzc zzcVar2 = adOverlayInfoParcel.zza;
            zza.zzb(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.zzd);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzs.zzI(context, intent);
    }
}

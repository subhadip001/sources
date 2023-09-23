package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwk implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwm zza;

    public zzbwk(zzbwm zzbwmVar) {
        this.zza = zzbwmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Context context;
        Intent zzb = this.zza.zzb();
        com.google.android.gms.ads.internal.zzt.zzp();
        context = this.zza.zzb;
        com.google.android.gms.ads.internal.util.zzs.zzI(context, zzb);
    }
}

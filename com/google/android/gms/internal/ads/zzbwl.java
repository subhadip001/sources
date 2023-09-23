package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwl implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwm zza;

    public zzbwl(zzbwm zzbwmVar) {
        this.zza = zzbwmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzg("Operation denied by user.");
    }
}

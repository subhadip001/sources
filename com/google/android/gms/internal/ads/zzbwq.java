package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwq implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzbwr zza;

    public zzbwq(zzbwr zzbwrVar) {
        this.zza = zzbwrVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzg("User canceled the download.");
    }
}

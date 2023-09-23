package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzau implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzav zza;

    public zzau(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzP(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}

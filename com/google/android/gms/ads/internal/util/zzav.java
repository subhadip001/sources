package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzav implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ boolean zzd;

    public zzav(zzaw zzawVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zza);
        builder.setMessage(this.zzb);
        if (this.zzc) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.zzd) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzau(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}

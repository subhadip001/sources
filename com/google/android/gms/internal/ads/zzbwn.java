package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbwn implements View.OnClickListener {
    public final /* synthetic */ zzbwo zza;

    public zzbwn(zzbwo zzbwoVar) {
        this.zza = zzbwoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zza(true);
    }
}

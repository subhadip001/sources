package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgi implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ zzgk zza;
    private final Handler zzb;

    public zzgi(zzgk zzgkVar, Handler handler) {
        this.zza = zzgkVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i2) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgh
            @Override // java.lang.Runnable
            public final void run() {
                zzgi zzgiVar = zzgi.this;
                zzgk.zzc(zzgiVar.zza, i2);
            }
        });
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzepa implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzepa(zzfvk zzfvkVar, Context context) {
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepa.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzepb zzc() {
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        return new zzepb(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), com.google.android.gms.ads.internal.zzt.zzr().zza(), com.google.android.gms.ads.internal.zzt.zzr().zze());
    }
}

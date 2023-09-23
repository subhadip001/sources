package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzchv implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzchu zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzchv(Context context, zzchu zzchuVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzchuVar;
    }

    private final void zzf() {
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    this.zzc = audioManager.abandonAudioFocus(this) == 0;
                }
                this.zzb.zzn();
            }
        } else if (this.zzc) {
        } else {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                this.zzc = audioManager2.requestAudioFocus(this, 3, 2) == 1;
            }
            this.zzb.zzn();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        this.zzc = i2 > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        float f2 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f2;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z) {
        this.zze = z;
        zzf();
    }

    public final void zze(float f2) {
        this.zzf = f2;
        zzf();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import f.a.b.a.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgk {
    private final AudioManager zza;
    private final zzgi zzb;
    private zzgj zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzgk(Context context, Handler handler, zzgj zzgjVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.zza = audioManager;
        this.zzc = zzgjVar;
        this.zzb = new zzgi(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzgk zzgkVar, int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2) {
                zzgkVar.zzg(3);
                return;
            }
            zzgkVar.zzf(0);
            zzgkVar.zzg(2);
        } else if (i2 == -1) {
            zzgkVar.zzf(-1);
            zzgkVar.zze();
        } else if (i2 != 1) {
            a.O("Unknown focus change type: ", i2, "AudioFocusManager");
        } else {
            zzgkVar.zzg(1);
            zzgkVar.zzf(1);
        }
    }

    private final void zze() {
        if (this.zzd == 0) {
            return;
        }
        if (zzeg.zza < 26) {
            this.zza.abandonAudioFocus(this.zzb);
        }
        zzg(0);
    }

    private final void zzf(int i2) {
        int zzah;
        zzgj zzgjVar = this.zzc;
        if (zzgjVar != null) {
            zzij zzijVar = (zzij) zzgjVar;
            boolean zzq = zzijVar.zza.zzq();
            zzin zzinVar = zzijVar.zza;
            zzah = zzin.zzah(zzq, i2);
            zzinVar.zzau(zzq, i2, zzah);
        }
    }

    private final void zzg(int i2) {
        if (this.zzd == i2) {
            return;
        }
        this.zzd = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.zze == f2) {
            return;
        }
        this.zze = f2;
        zzgj zzgjVar = this.zzc;
        if (zzgjVar != null) {
            ((zzij) zzgjVar).zza.zzar();
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i2) {
        zze();
        return z ? 1 : -1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
    }
}

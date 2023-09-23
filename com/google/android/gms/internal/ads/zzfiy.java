package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfiy extends ContentObserver {
    private final Context zza;
    private final AudioManager zzb;
    private final zzfiw zzc;
    private float zzd;
    private final zzfjh zze;

    public zzfiy(Handler handler, Context context, zzfiw zzfiwVar, zzfjh zzfjhVar, byte[] bArr) {
        super(handler);
        this.zza = context;
        this.zzb = (AudioManager) context.getSystemService("audio");
        this.zzc = zzfiwVar;
        this.zze = zzfjhVar;
    }

    private final float zzc() {
        int streamVolume = this.zzb.getStreamVolume(3);
        int streamMaxVolume = this.zzb.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f2 = streamVolume / streamMaxVolume;
        if (f2 > 1.0f) {
            return 1.0f;
        }
        return f2;
    }

    private final void zzd() {
        this.zze.zzd(this.zzd);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float zzc = zzc();
        if (zzc != this.zzd) {
            this.zzd = zzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzd = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}

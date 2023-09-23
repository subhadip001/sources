package com.google.android.gms.ads;

import com.google.android.gms.ads.internal.client.zzfg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder, zzf zzfVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public VideoOptions(zzfg zzfgVar) {
        this.zza = zzfgVar.zza;
        this.zzb = zzfgVar.zzb;
        this.zzc = zzfgVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}

package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class VideoController {
    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;
    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;
    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;
    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object zza = new Object();
    private zzdk zzb;
    private VideoLifecycleCallbacks zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    @KeepForSdk
    public int getPlaybackState() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return 0;
            }
            try {
                return zzdkVar.zzh();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call getPlaybackState on video controller.", e2);
                return 0;
            }
        }
    }

    public VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzo();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call isClickToExpandEnabled.", e2);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return false;
            }
            try {
                return zzdkVar.zzp();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call isUsingCustomPlayerControls.", e2);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar == null) {
                return true;
            }
            try {
                return zzdkVar.zzq();
            } catch (RemoteException e2) {
                zzcfi.zzh("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzj(z);
                } catch (RemoteException e2) {
                    zzcfi.zzh("Unable to call mute on video controller.", e2);
                }
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzk();
                } catch (RemoteException e2) {
                    zzcfi.zzh("Unable to call pause on video controller.", e2);
                }
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzl();
                } catch (RemoteException e2) {
                    zzcfi.zzh("Unable to call play on video controller.", e2);
                }
            }
        }
    }

    public void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        zzff zzffVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                if (videoLifecycleCallbacks == null) {
                    zzffVar = null;
                } else {
                    try {
                        zzffVar = new zzff(videoLifecycleCallbacks);
                    } catch (RemoteException e2) {
                        zzcfi.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
                    }
                }
                zzdkVar.zzm(zzffVar);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            zzdk zzdkVar = this.zzb;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zzn();
                } catch (RemoteException e2) {
                    zzcfi.zzh("Unable to call stop on video controller.", e2);
                }
            }
        }
    }

    public final zzdk zza() {
        zzdk zzdkVar;
        synchronized (this.zza) {
            zzdkVar = this.zzb;
        }
        return zzdkVar;
    }

    public final void zzb(zzdk zzdkVar) {
        synchronized (this.zza) {
            this.zzb = zzdkVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }
}

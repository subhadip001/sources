package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.logging.type.LogSeverity;
import f.a.b.a.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcgv extends zzcgx implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map zzc;
    private final zzchr zzd;
    private final zzchs zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzchp zzn;
    private final boolean zzo;
    private int zzp;
    private zzcgw zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap hashMap = new HashMap();
        zzc = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(Integer.valueOf((int) LogSeverity.ALERT_VALUE), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(Integer.valueOf((int) LogSeverity.EMERGENCY_VALUE), "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcgv(Context context, zzchr zzchrVar, boolean z, boolean z2, zzchq zzchqVar, zzchs zzchsVar) {
        super(context);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        setSurfaceTextureListener(this);
        this.zzd = zzchrVar;
        this.zze = zzchsVar;
        this.zzo = z;
        this.zzf = z2;
        zzchsVar.zza(this);
    }

    private final void zzC() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzj == null || surfaceTexture == null) {
            return;
        }
        zzD(false);
        try {
            com.google.android.gms.ads.internal.zzt.zzk();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzi = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzi.setOnCompletionListener(this);
            this.zzi.setOnErrorListener(this);
            this.zzi.setOnInfoListener(this);
            this.zzi.setOnPreparedListener(this);
            this.zzi.setOnVideoSizeChangedListener(this);
            this.zzm = 0;
            if (this.zzo) {
                zzchp zzchpVar = new zzchp(getContext());
                this.zzn = zzchpVar;
                zzchpVar.zzd(surfaceTexture, getWidth(), getHeight());
                this.zzn.start();
                SurfaceTexture zzb = this.zzn.zzb();
                if (zzb != null) {
                    surfaceTexture = zzb;
                } else {
                    this.zzn.zze();
                    this.zzn = null;
                }
            }
            this.zzi.setDataSource(getContext(), this.zzj);
            com.google.android.gms.ads.internal.zzt.zzl();
            this.zzi.setSurface(new Surface(surfaceTexture));
            this.zzi.setAudioStreamType(3);
            this.zzi.setScreenOnWhilePlaying(true);
            this.zzi.prepareAsync();
            zzE(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            zzcfi.zzk("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.zzj)), e2);
            onError(this.zzi, 1, 0);
        }
    }

    private final void zzD(boolean z) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView release");
        zzchp zzchpVar = this.zzn;
        if (zzchpVar != null) {
            zzchpVar.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzi.release();
            this.zzi = null;
            zzE(0);
            if (z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzE(int i2) {
        if (i2 == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        } else if (this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = i2;
    }

    private final void zzF(float f2) {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer == null) {
            zzcfi.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            return;
        }
        try {
            mediaPlayer.setVolume(f2, f2);
        } catch (IllegalStateException unused) {
        }
    }

    private final boolean zzG() {
        int i2;
        return (this.zzi == null || (i2 = this.zzg) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzcgv zzcgvVar, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        MediaFormat format;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzcgvVar.zzd == null || mediaPlayer == null || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            zzcgvVar.zzs = valueOf;
                            hashMap.put("bitRate", String.valueOf(valueOf));
                        }
                        if (format2.containsKey(StreamInformation.KEY_WIDTH) && format2.containsKey(StreamInformation.KEY_HEIGHT)) {
                            hashMap.put("resolution", format2.getInteger(StreamInformation.KEY_WIDTH) + "x" + format2.getInteger(StreamInformation.KEY_HEIGHT));
                        }
                        if (format2.containsKey("mime")) {
                            hashMap.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            hashMap.put("videoCodec", format2.getString("codecs-string"));
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        hashMap.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        hashMap.put("audioCodec", format.getString("codecs-string"));
                    }
                }
            }
        }
        if (hashMap.isEmpty()) {
            return;
        }
        zzcgvVar.zzd.zzd("onMetadataEvent", hashMap);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.zzm = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView completion");
        zzE(5);
        this.zzh = 5;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgo(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Map map = zzc;
        String str = (String) map.get(Integer.valueOf(i2));
        String str2 = (String) map.get(Integer.valueOf(i3));
        zzcfi.zzj("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        zzE(-1);
        this.zzh = -1;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgp(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Map map = zzc;
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i2))) + ":" + ((String) map.get(Integer.valueOf(i3))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.zzk
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.zzl
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.zzk
            if (r2 <= 0) goto L7e
            int r2 = r5.zzl
            if (r2 <= 0) goto L7e
            com.google.android.gms.internal.ads.zzchp r2 = r5.zzn
            if (r2 != 0) goto L7e
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L43
            if (r1 != r2) goto L41
            int r0 = r5.zzk
            int r1 = r0 * r7
            int r2 = r5.zzl
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7e
        L3c:
            if (r1 <= r3) goto L63
            int r1 = r3 / r0
            goto L54
        L41:
            r0 = 1073741824(0x40000000, float:2.0)
        L43:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L56
            int r0 = r5.zzl
            int r0 = r0 * r6
            int r2 = r5.zzk
            int r0 = r0 / r2
            if (r1 != r3) goto L53
            if (r0 <= r7) goto L53
            goto L63
        L53:
            r1 = r0
        L54:
            r0 = r6
            goto L7e
        L56:
            if (r1 != r2) goto L67
            int r1 = r5.zzk
            int r1 = r1 * r7
            int r2 = r5.zzl
            int r1 = r1 / r2
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
        L63:
            r0 = r6
            goto L3a
        L65:
            r0 = r1
            goto L3a
        L67:
            int r2 = r5.zzk
            int r4 = r5.zzl
            if (r1 != r3) goto L73
            if (r4 <= r7) goto L73
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L75
        L73:
            r1 = r2
            r7 = r4
        L75:
            if (r0 != r3) goto L65
            if (r1 <= r6) goto L65
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L54
        L7e:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzchp r6 = r5.zzn
            if (r6 == 0) goto L88
            r6.zzc(r0, r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgv.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView prepared");
        zzE(2);
        this.zze.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgn(this, mediaPlayer));
        this.zzk = mediaPlayer.getVideoWidth();
        this.zzl = mediaPlayer.getVideoHeight();
        int i2 = this.zzp;
        if (i2 != 0) {
            zzq(i2);
        }
        if (this.zzf && zzG() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView nudging MediaPlayer");
            zzF(0.0f);
            this.zzi.start();
            int currentPosition = this.zzi.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            while (zzG() && this.zzi.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzi.pause();
            zzn();
        }
        int i3 = this.zzk;
        int i4 = this.zzl;
        zzcfi.zzi("AdMediaPlayerView stream dimensions: " + i3 + " x " + i4);
        if (this.zzh == 3) {
            zzp();
        }
        zzn();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface created");
        zzC();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgq(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null && this.zzp == 0) {
            this.zzp = mediaPlayer.getCurrentPosition();
        }
        zzchp zzchpVar = this.zzn;
        if (zzchpVar != null) {
            zzchpVar.zze();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgs(this));
        zzD(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView surface changed");
        int i4 = this.zzh;
        boolean z = false;
        if (this.zzk == i2 && this.zzl == i3) {
            z = true;
        }
        if (this.zzi != null && i4 == 3 && z) {
            int i5 = this.zzp;
            if (i5 != 0) {
                zzq(i5);
            }
            zzp();
        }
        zzchp zzchpVar = this.zzn;
        if (zzchpVar != null) {
            zzchpVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgr(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzq);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView size changed: " + i2 + " x " + i3);
        this.zzk = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzl = videoHeight;
        if (this.zzk == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView window visibility changed to " + i2);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
            @Override // java.lang.Runnable
            public final void run() {
                zzcgv.this.zzm(i2);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // android.view.View
    public final String toString() {
        return a.q(zzcgv.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zza() {
        if (zzG()) {
            return this.zzi.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zzb() {
        if (Build.VERSION.SDK_INT < 26 || !zzG()) {
            return -1;
        }
        return this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zzc() {
        if (zzG()) {
            return this.zzi.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zzd() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zze() {
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long zzg() {
        if (this.zzs != null) {
            return (zzh() * this.zzm) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long zzh() {
        if (this.zzs != null) {
            return zzc() * this.zzs.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String zzj() {
        return "MediaPlayer".concat(true != this.zzo ? "" : " spherical");
    }

    public final /* synthetic */ void zzm(int i2) {
        zzcgw zzcgwVar = this.zzq;
        if (zzcgwVar != null) {
            zzcgwVar.onWindowVisibilityChanged(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx, com.google.android.gms.internal.ads.zzchu
    public final void zzn() {
        zzF(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView pause");
        if (zzG() && this.zzi.isPlaying()) {
            this.zzi.pause();
            zzE(4);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgu(this));
        }
        this.zzh = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView play");
        if (zzG()) {
            this.zzi.start();
            zzE(3);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgt(this));
        }
        this.zzh = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzq(int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView seek " + i2);
        if (!zzG()) {
            this.zzp = i2;
            return;
        }
        this.zzi.seekTo(i2);
        this.zzp = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzr(zzcgw zzcgwVar) {
        this.zzq = zzcgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzs(String str) {
        Uri parse = Uri.parse(str);
        zzbcx zza = zzbcx.zza(parse);
        if (zza == null || zza.zza != null) {
            if (zza != null) {
                parse = Uri.parse(zza.zza);
            }
            this.zzj = parse;
            this.zzp = 0;
            zzC();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzi;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzi.release();
            this.zzi = null;
            zzE(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzu(float f2, float f3) {
        zzchp zzchpVar = this.zzn;
        if (zzchpVar != null) {
            zzchpVar.zzf(f2, f3);
        }
    }
}

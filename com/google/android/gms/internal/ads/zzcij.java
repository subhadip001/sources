package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import f.a.b.a.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcij extends zzcgx implements TextureView.SurfaceTextureListener, zzchh {
    private final zzchr zzc;
    private final zzchs zzd;
    private final zzchq zze;
    private zzcgw zzf;
    private Surface zzg;
    private zzchi zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzchp zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcij(Context context, zzchs zzchsVar, zzchr zzchrVar, boolean z, boolean z2, zzchq zzchqVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzchrVar;
        this.zzd = zzchsVar;
        this.zzn = z;
        this.zze = zzchqVar;
        setSurfaceTextureListener(this);
        zzchsVar.zza(this);
    }

    private static String zzS(String str, Exception exc) {
        return a.s(str, "/", exc.getClass().getCanonicalName(), ":", exc.getMessage());
    }

    private final void zzT() {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzM(true);
        }
    }

    private final void zzU() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzH();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzV(boolean z) {
        zzchi zzchiVar = this.zzh;
        if ((zzchiVar != null && !z) || this.zzi == null || this.zzg == null) {
            return;
        }
        if (z) {
            if (zzad()) {
                zzchiVar.zzQ();
                zzX();
            } else {
                zzcfi.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
        }
        if (this.zzi.startsWith("cache:")) {
            zzcju zzr = this.zzc.zzr(this.zzi);
            if (zzr instanceof zzckd) {
                zzchi zzj = ((zzckd) zzr).zzj();
                this.zzh = zzj;
                if (!zzj.zzR()) {
                    zzcfi.zzj("Precached video player has been released.");
                    return;
                }
            } else if (zzr instanceof zzcka) {
                zzcka zzckaVar = (zzcka) zzr;
                String zzE = zzE();
                ByteBuffer zzl = zzckaVar.zzl();
                boolean zzm = zzckaVar.zzm();
                String zzi = zzckaVar.zzi();
                if (zzi == null) {
                    zzcfi.zzj("Stream cache URL is null.");
                    return;
                }
                zzchi zzD = zzD();
                this.zzh = zzD;
                zzD.zzD(new Uri[]{Uri.parse(zzi)}, zzE, zzl, zzm);
            } else {
                zzcfi.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                return;
            }
        } else {
            this.zzh = zzD();
            String zzE2 = zzE();
            Uri[] uriArr = new Uri[this.zzj.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.zzj;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
            }
            this.zzh.zzC(uriArr, zzE2);
        }
        this.zzh.zzI(this);
        zzZ(this.zzg, false);
        if (this.zzh.zzR()) {
            int zzt = this.zzh.zzt();
            this.zzl = zzt;
            if (zzt == 3) {
                zzU();
            }
        }
    }

    private final void zzW() {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzM(false);
        }
    }

    private final void zzX() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzchi zzchiVar = this.zzh;
            if (zzchiVar != null) {
                zzchiVar.zzI(null);
                this.zzh.zzE();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzY(float f2, boolean z) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            try {
                zzchiVar.zzP(f2, false);
                return;
            } catch (IOException e2) {
                zzcfi.zzk("", e2);
                return;
            }
        }
        zzcfi.zzj("Trying to set volume before player is initialized.");
    }

    private final void zzZ(Surface surface, boolean z) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            try {
                zzchiVar.zzO(surface, z);
                return;
            } catch (IOException e2) {
                zzcfi.zzk("", e2);
                return;
            }
        }
        zzcfi.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i2, int i3) {
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.zzs != f2) {
            this.zzs = f2;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzchi zzchiVar = this.zzh;
        return (zzchiVar == null || !zzchiVar.zzR() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.zzs;
        if (f2 != 0.0f && this.zzm == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzchp zzchpVar = this.zzm;
        if (zzchpVar != null) {
            zzchpVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.zzn) {
            zzchp zzchpVar = new zzchp(getContext());
            this.zzm = zzchpVar;
            zzchpVar.zzd(surfaceTexture, i2, i3);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzV(false);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzT();
            }
        }
        if (this.zzq != 0 && this.zzr != 0) {
            zzaa();
        } else {
            zzab(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzL();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzchp zzchpVar = this.zzm;
        if (zzchpVar != null) {
            zzchpVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzW();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcih
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzM();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzchp zzchpVar = this.zzm;
        if (zzchpVar != null) {
            zzchpVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcig
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzN(i2, i3);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i2);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcif
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzP(i2);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzA(int i2) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzN(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzB(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        boolean z = true;
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        z = (!this.zze.zzn || str2 == null || str.equals(str2) || this.zzl != 4) ? false : false;
        this.zzi = str;
        zzV(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzC(int i2, int i3) {
        this.zzq = i2;
        this.zzr = i3;
        zzaa();
    }

    public final zzchi zzD() {
        if (this.zze.zzm) {
            return new zzckv(this.zzc.getContext(), this.zze, this.zzc);
        }
        return new zzciz(this.zzc.getContext(), this.zze, this.zzc);
    }

    public final String zzE() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzc.getContext(), this.zzc.zzp().zza);
    }

    public final /* synthetic */ void zzF(String str) {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzG() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zza();
        }
    }

    public final /* synthetic */ void zzH() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzf();
        }
    }

    public final /* synthetic */ void zzI(boolean z, long j2) {
        this.zzc.zzx(z, j2);
    }

    public final /* synthetic */ void zzJ(String str) {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzK() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzg();
        }
    }

    public final /* synthetic */ void zzL() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzh();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzi();
        }
    }

    public final /* synthetic */ void zzN(int i2, int i3) {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzj(i2, i3);
        }
    }

    public final /* synthetic */ void zzO() {
        zzY(this.zzb.zza(), false);
    }

    public final /* synthetic */ void zzP(int i2) {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.onWindowVisibilityChanged(i2);
        }
    }

    public final /* synthetic */ void zzQ() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zzd();
        }
    }

    public final /* synthetic */ void zzR() {
        zzcgw zzcgwVar = this.zzf;
        if (zzcgwVar != null) {
            zzcgwVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zzb() {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            return zzchiVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long zzf() {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            return zzchiVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long zzg() {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            return zzchiVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long zzh() {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            return zzchiVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzi(final boolean z, final long j2) {
        if (this.zzc != null) {
            zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcij.this.zzI(z, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String zzj() {
        return "ExoPlayer/3".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzk(String str, Exception exc) {
        final String zzS = zzS(str, exc);
        zzcfi.zzj("ExoPlayerAdapter error: ".concat(zzS));
        this.zzk = true;
        if (this.zze.zza) {
            zzW();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchz
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzF(zzS);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzl(String str, Exception exc) {
        final String zzS = zzS("onLoadException", exc);
        zzcfi.zzj("ExoPlayerAdapter exception: ".concat(zzS));
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchy
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzJ(zzS);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzm(int i2) {
        if (this.zzl != i2) {
            this.zzl = i2;
            if (i2 == 3) {
                zzU();
            } else if (i2 != 4) {
            } else {
                if (this.zze.zza) {
                    zzW();
                }
                this.zzd.zze();
                this.zzb.zzc();
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchx
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcij.this.zzG();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx, com.google.android.gms.internal.ads.zzchu
    public final void zzn() {
        if (this.zze.zzm) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcib
                @Override // java.lang.Runnable
                public final void run() {
                    zzcij.this.zzO();
                }
            });
        } else {
            zzY(this.zzb.zza(), false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzW();
            }
            this.zzh.zzL(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcic
                @Override // java.lang.Runnable
                public final void run() {
                    zzcij.this.zzQ();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzT();
        }
        this.zzh.zzL(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcii
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzR();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzq(int i2) {
        if (zzac()) {
            this.zzh.zzF(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzr(zzcgw zzcgwVar) {
        this.zzf = zzcgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzs(String str) {
        if (str != null) {
            zzB(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzQ();
            zzX();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzu(float f2, float f3) {
        zzchp zzchpVar = this.zzm;
        if (zzchpVar != null) {
            zzchpVar.zzf(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchh
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcia
            @Override // java.lang.Runnable
            public final void run() {
                zzcij.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzw(int i2) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzG(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzx(int i2) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzH(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzy(int i2) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzJ(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzz(int i2) {
        zzchi zzchiVar = this.zzh;
        if (zzchiVar != null) {
            zzchiVar.zzK(i2);
        }
    }
}

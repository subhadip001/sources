package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzij implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzxr, zznl, zzub, zzrb, zzgj, zzgf, zzkb, zzgv {
    public static final /* synthetic */ int zzb = 0;
    public final /* synthetic */ zzin zza;

    public /* synthetic */ zzij(zzin zzinVar, zzii zziiVar) {
        this.zza = zzinVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzin.zzN(this.zza, surfaceTexture);
        zzin.zzL(this.zza, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzin.zzO(this.zza, null);
        zzin.zzL(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzin.zzL(this.zza, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        zzin.zzL(this.zza, i3, i4);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzin.zzL(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final /* synthetic */ void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzb(boolean z) {
        zzin.zzQ(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzc(Exception exc) {
        zzin.zzC(this.zza).zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzd(String str, long j2, long j3) {
        zzin.zzC(this.zza).zzz(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zze(String str) {
        zzin.zzC(this.zza).zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzf(zzgm zzgmVar) {
        zzin.zzC(this.zza).zzB(zzgmVar);
        zzin.zzF(this.zza, null);
        zzin.zzE(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzg(zzgm zzgmVar) {
        zzin.zzE(this.zza, zzgmVar);
        zzin.zzC(this.zza).zzC(zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzh(zzad zzadVar, zzgn zzgnVar) {
        zzin.zzF(this.zza, zzadVar);
        zzin.zzC(this.zza).zzD(zzadVar, zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzi(long j2) {
        zzin.zzC(this.zza).zzE(j2);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzj(Exception exc) {
        zzin.zzC(this.zza).zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzk(int i2, long j2, long j3) {
        zzin.zzC(this.zza).zzG(i2, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzl(int i2, long j2) {
        zzin.zzC(this.zza).zzH(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzm(Object obj, long j2) {
        zzin.zzC(this.zza).zzI(obj, j2);
        zzin zzinVar = this.zza;
        if (zzin.zzD(zzinVar) == obj) {
            zzdm zzz = zzin.zzz(zzinVar);
            zzz.zzd(26, new zzdj() { // from class: com.google.android.gms.internal.ads.zzid
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj2) {
                    zzby zzbyVar = (zzby) obj2;
                }
            });
            zzz.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzn(final boolean z) {
        zzin zzinVar = this.zza;
        if (zzin.zzaf(zzinVar) == z) {
            return;
        }
        zzin.zzH(zzinVar, z);
        zzdm zzz = zzin.zzz(this.zza);
        zzz.zzd(23, new zzdj() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzq(z);
            }
        });
        zzz.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzo(Exception exc) {
        zzin.zzC(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzp(String str, long j2, long j3) {
        zzin.zzC(this.zza).zzK(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzq(String str) {
        zzin.zzC(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzr(zzgm zzgmVar) {
        zzin.zzC(this.zza).zzM(zzgmVar);
        zzin.zzJ(this.zza, null);
        zzin.zzI(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzs(zzgm zzgmVar) {
        zzin.zzI(this.zza, zzgmVar);
        zzin.zzC(this.zza).zzN(zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzt(long j2, int i2) {
        zzin.zzC(this.zza).zzO(j2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzu(zzad zzadVar, zzgn zzgnVar) {
        zzin.zzJ(this.zza, zzadVar);
        zzin.zzC(this.zza).zzP(zzadVar, zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzv(final zzcv zzcvVar) {
        zzin.zzK(this.zza, zzcvVar);
        zzdm zzz = zzin.zzz(this.zza);
        zzz.zzd(25, new zzdj() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzu(zzcv.this);
            }
        });
        zzz.zzc();
    }
}

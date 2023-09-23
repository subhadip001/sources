package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zznw implements zzmz {
    public zzmx zzb;
    public zzmx zzc;
    private zzmx zzd;
    private zzmx zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zznw() {
        ByteBuffer byteBuffer = zzmz.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzmx zzmxVar = zzmx.zza;
        this.zzd = zzmxVar;
        this.zze = zzmxVar;
        this.zzb = zzmxVar;
        this.zzc = zzmxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzmx zza(zzmx zzmxVar) {
        this.zzd = zzmxVar;
        this.zze = zzi(zzmxVar);
        return zzg() ? this.zze : zzmx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzmz.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzc() {
        this.zzg = zzmz.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzf() {
        zzc();
        this.zzf = zzmz.zza;
        zzmx zzmxVar = zzmx.zza;
        this.zzd = zzmxVar;
        this.zze = zzmxVar;
        this.zzb = zzmxVar;
        this.zzc = zzmxVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public boolean zzg() {
        return this.zze != zzmx.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public boolean zzh() {
        return this.zzh && this.zzg == zzmz.zza;
    }

    public zzmx zzi(zzmx zzmxVar) {
        throw null;
    }

    public final ByteBuffer zzj(int i2) {
        if (this.zzf.capacity() < i2) {
            this.zzf = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}

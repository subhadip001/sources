package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzox implements zzmz {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzmx zze;
    private zzmx zzf;
    private zzmx zzg;
    private zzmx zzh;
    private boolean zzi;
    private zzow zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzox() {
        zzmx zzmxVar = zzmx.zza;
        this.zze = zzmxVar;
        this.zzf = zzmxVar;
        this.zzg = zzmxVar;
        this.zzh = zzmxVar;
        ByteBuffer byteBuffer = zzmz.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzmx zza(zzmx zzmxVar) {
        if (zzmxVar.zzd == 2) {
            int i2 = this.zzb;
            if (i2 == -1) {
                i2 = zzmxVar.zzb;
            }
            this.zze = zzmxVar;
            zzmx zzmxVar2 = new zzmx(i2, zzmxVar.zzc, 2);
            this.zzf = zzmxVar2;
            this.zzi = true;
            return zzmxVar2;
        }
        throw new zzmy(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final ByteBuffer zzb() {
        int zza;
        zzow zzowVar = this.zzj;
        if (zzowVar != null && (zza = zzowVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzowVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzmz.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzc() {
        if (zzg()) {
            zzmx zzmxVar = this.zze;
            this.zzg = zzmxVar;
            zzmx zzmxVar2 = this.zzf;
            this.zzh = zzmxVar2;
            if (this.zzi) {
                this.zzj = new zzow(zzmxVar.zzb, zzmxVar.zzc, this.zzc, this.zzd, zzmxVar2.zzb);
            } else {
                zzow zzowVar = this.zzj;
                if (zzowVar != null) {
                    zzowVar.zzc();
                }
            }
        }
        this.zzm = zzmz.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzd() {
        zzow zzowVar = this.zzj;
        if (zzowVar != null) {
            zzowVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzow zzowVar = this.zzj;
            Objects.requireNonNull(zzowVar);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += remaining;
            zzowVar.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzmx zzmxVar = zzmx.zza;
        this.zze = zzmxVar;
        this.zzf = zzmxVar;
        this.zzg = zzmxVar;
        this.zzh = zzmxVar;
        ByteBuffer byteBuffer = zzmz.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzg() {
        if (this.zzf.zzb != -1) {
            return Math.abs(this.zzc + (-1.0f)) >= 1.0E-4f || Math.abs(this.zzd + (-1.0f)) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final boolean zzh() {
        zzow zzowVar;
        return this.zzp && ((zzowVar = this.zzj) == null || zzowVar.zza() == 0);
    }

    public final long zzi(long j2) {
        long j3 = this.zzo;
        if (j3 >= 1024) {
            long j4 = this.zzn;
            zzow zzowVar = this.zzj;
            Objects.requireNonNull(zzowVar);
            long zzb = j4 - zzowVar.zzb();
            int i2 = this.zzh.zzb;
            int i3 = this.zzg.zzb;
            if (i2 == i3) {
                return zzeg.zzw(j2, zzb, j3);
            }
            return zzeg.zzw(j2, zzb * i2, j3 * i3);
        }
        return (long) (this.zzc * j2);
    }

    public final void zzj(float f2) {
        if (this.zzd != f2) {
            this.zzd = f2;
            this.zzi = true;
        }
    }

    public final void zzk(float f2) {
        if (this.zzc != f2) {
            this.zzc = f2;
            this.zzi = true;
        }
    }
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzath implements zzash {
    private zzatg zzd;
    private ByteBuffer zzg;
    private ShortBuffer zzh;
    private ByteBuffer zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private float zze = 1.0f;
    private float zzf = 1.0f;
    private int zzb = -1;
    private int zzc = -1;

    public zzath() {
        ByteBuffer byteBuffer = zzash.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzi;
        this.zzi = zzash.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzd() {
        zzatg zzatgVar = new zzatg(this.zzc, this.zzb);
        this.zzd = zzatgVar;
        zzatgVar.zzf(this.zze);
        this.zzd.zze(this.zzf);
        this.zzi = zzash.zza;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zze() {
        this.zzd.zzc();
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzf(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzj += remaining;
            this.zzd.zzd(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int zza = this.zzd.zza() * this.zzb;
        int i2 = zza + zza;
        if (i2 > 0) {
            if (this.zzg.capacity() < i2) {
                ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
                this.zzg = order;
                this.zzh = order.asShortBuffer();
            } else {
                this.zzg.clear();
                this.zzh.clear();
            }
            this.zzd.zzb(this.zzh);
            this.zzk += i2;
            this.zzg.limit(i2);
            this.zzi = this.zzg;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zzg() {
        this.zzd = null;
        ByteBuffer byteBuffer = zzash.zza;
        this.zzg = byteBuffer;
        this.zzh = byteBuffer.asShortBuffer();
        this.zzi = byteBuffer;
        this.zzb = -1;
        this.zzc = -1;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzh(int i2, int i3, int i4) {
        if (i4 == 2) {
            if (this.zzc == i2 && this.zzb == i3) {
                return false;
            }
            this.zzc = i2;
            this.zzb = i3;
            return true;
        }
        throw new zzasg(i2, i3, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzi() {
        return Math.abs(this.zze + (-1.0f)) >= 0.01f || Math.abs(this.zzf + (-1.0f)) >= 0.01f;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final boolean zzj() {
        zzatg zzatgVar;
        return this.zzl && ((zzatgVar = this.zzd) == null || zzatgVar.zza() == 0);
    }

    public final float zzk(float f2) {
        this.zzf = zzazn.zza(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final float zzl(float f2) {
        float zza = zzazn.zza(f2, 0.1f, 8.0f);
        this.zze = zza;
        return zza;
    }

    public final long zzm() {
        return this.zzj;
    }

    public final long zzn() {
        return this.zzk;
    }
}

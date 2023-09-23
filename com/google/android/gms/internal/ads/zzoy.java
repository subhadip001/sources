package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzoy extends zznw {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = zzeg.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zznw, com.google.android.gms.internal.ads.zzmz
    public final ByteBuffer zzb() {
        int i2;
        if (super.zzh() && (i2 = this.zzi) > 0) {
            zzj(i2).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (i2 == 0) {
            return;
        }
        int min = Math.min(i2, this.zzg);
        this.zzj += min / this.zzb.zze;
        this.zzg -= min;
        byteBuffer.position(position + min);
        if (this.zzg > 0) {
            return;
        }
        int i3 = i2 - min;
        int length = (this.zzi + i3) - this.zzh.length;
        ByteBuffer zzj = zzj(length);
        int zzf = zzeg.zzf(length, 0, this.zzi);
        zzj.put(this.zzh, 0, zzf);
        int zzf2 = zzeg.zzf(length - zzf, 0, i3);
        byteBuffer.limit(byteBuffer.position() + zzf2);
        zzj.put(byteBuffer);
        byteBuffer.limit(limit);
        int i4 = i3 - zzf2;
        int i5 = this.zzi - zzf;
        this.zzi = i5;
        byte[] bArr = this.zzh;
        System.arraycopy(bArr, zzf, bArr, 0, i5);
        byteBuffer.get(this.zzh, this.zzi, i4);
        this.zzi += i4;
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznw, com.google.android.gms.internal.ads.zzmz
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final zzmx zzi(zzmx zzmxVar) {
        if (zzmxVar.zzd == 2) {
            this.zzf = true;
            return (this.zzd == 0 && this.zze == 0) ? zzmx.zza : zzmxVar;
        }
        throw new zzmy(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i2 = this.zze;
            int i3 = this.zzb.zze;
            this.zzh = new byte[i2 * i3];
            this.zzg = this.zzd * i3;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzl() {
        int i2;
        if (this.zzf) {
            if (this.zzi > 0) {
                this.zzj += i2 / this.zzb.zze;
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzm() {
        this.zzh = zzeg.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i2, int i3) {
        this.zzd = i2;
        this.zze = i3;
    }
}

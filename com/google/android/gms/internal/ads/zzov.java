package com.google.android.gms.internal.ads;

import com.google.firebase.inappmessaging.display.FirebaseInAppMessagingDisplay;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzov extends zznw {
    private int zzd;
    private boolean zze;
    private byte[] zzf;
    private byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private long zzl;

    public zzov() {
        byte[] bArr = zzeg.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    private final int zzq(long j2) {
        return (int) ((j2 * this.zzb.zzb) / 1000000);
    }

    private final int zzr(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i2 = this.zzd;
                return (position / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    private final void zzs(byte[] bArr, int i2) {
        zzj(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.zzk = true;
        }
    }

    private final void zzt(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.zzj);
        int i3 = this.zzj - min;
        System.arraycopy(bArr, i2 - i3, this.zzg, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.zzg, i3, min);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zze(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !zzn()) {
            int i2 = this.zzh;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.zzf.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                            int i3 = this.zzd;
                            position = ((limit2 / i3) * i3) + i3;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.zzh = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    zzj(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.zzk = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i2 != 1) {
                int limit3 = byteBuffer.limit();
                int zzr = zzr(byteBuffer);
                byteBuffer.limit(zzr);
                this.zzl += byteBuffer.remaining() / this.zzd;
                zzt(byteBuffer, this.zzg, this.zzj);
                if (zzr < limit3) {
                    zzs(this.zzg, this.zzj);
                    this.zzh = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int zzr2 = zzr(byteBuffer);
                int position2 = zzr2 - byteBuffer.position();
                byte[] bArr = this.zzf;
                int length = bArr.length;
                int i4 = this.zzi;
                int i5 = length - i4;
                if (zzr2 < limit4 && position2 < i5) {
                    zzs(bArr, i4);
                    this.zzi = 0;
                    this.zzh = 0;
                } else {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.zzf, this.zzi, min);
                    int i6 = this.zzi + min;
                    this.zzi = i6;
                    byte[] bArr2 = this.zzf;
                    if (i6 == bArr2.length) {
                        if (this.zzk) {
                            zzs(bArr2, this.zzj);
                            long j2 = this.zzl;
                            int i7 = this.zzi;
                            int i8 = this.zzj;
                            this.zzl = j2 + ((i7 - (i8 + i8)) / this.zzd);
                            i6 = i7;
                        } else {
                            this.zzl += (i6 - this.zzj) / this.zzd;
                        }
                        zzt(byteBuffer, this.zzf, i6);
                        this.zzi = 0;
                        this.zzh = 2;
                    }
                    byteBuffer.limit(limit4);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznw, com.google.android.gms.internal.ads.zzmz
    public final boolean zzg() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final zzmx zzi(zzmx zzmxVar) {
        if (zzmxVar.zzd == 2) {
            return this.zze ? zzmxVar : zzmx.zza;
        }
        throw new zzmy(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzk() {
        if (this.zze) {
            this.zzd = this.zzb.zze;
            int zzq = zzq(150000L) * this.zzd;
            if (this.zzf.length != zzq) {
                this.zzf = new byte[zzq];
            }
            int zzq2 = zzq(FirebaseInAppMessagingDisplay.DISMISS_THRESHOLD_MILLIS) * this.zzd;
            this.zzj = zzq2;
            if (this.zzg.length != zzq2) {
                this.zzg = new byte[zzq2];
            }
        }
        this.zzh = 0;
        this.zzl = 0L;
        this.zzi = 0;
        this.zzk = false;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzl() {
        int i2 = this.zzi;
        if (i2 > 0) {
            zzs(this.zzf, i2);
        }
        if (this.zzk) {
            return;
        }
        this.zzl += this.zzj / this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznw
    public final void zzm() {
        this.zze = false;
        this.zzj = 0;
        byte[] bArr = zzeg.zzf;
        this.zzf = bArr;
        this.zzg = bArr;
    }

    public final long zzo() {
        return this.zzl;
    }

    public final void zzp(boolean z) {
        this.zze = z;
    }
}

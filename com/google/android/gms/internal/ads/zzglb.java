package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglb extends InputStream {
    private Iterator zza;
    private ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    public zzglb(Iterable iterable) {
        this.zza = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.zzc++;
        }
        this.zzd = -1;
        if (zzb()) {
            return;
        }
        this.zzb = zzgky.zze;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final void zza(int i2) {
        int i3 = this.zze + i2;
        this.zze = i3;
        if (i3 == this.zzb.limit()) {
            zzb();
        }
    }

    private final boolean zzb() {
        this.zzd++;
        if (this.zza.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) this.zza.next();
            this.zzb = byteBuffer;
            this.zze = byteBuffer.position();
            if (this.zzb.hasArray()) {
                this.zzf = true;
                this.zzg = this.zzb.array();
                this.zzh = this.zzb.arrayOffset();
            } else {
                this.zzf = false;
                this.zzi = zzgns.zze(this.zzb);
                this.zzg = null;
            }
            return true;
        }
        return false;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte zza;
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            zza = this.zzg[this.zze + this.zzh];
            zza(1);
        } else {
            zza = zzgns.zza(this.zze + this.zzi);
            zza(1);
        }
        return zza & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int limit = this.zzb.limit();
        int i4 = this.zze;
        int i5 = limit - i4;
        if (i3 > i5) {
            i3 = i5;
        }
        if (this.zzf) {
            System.arraycopy(this.zzg, i4 + this.zzh, bArr, i2, i3);
            zza(i3);
        } else {
            int position = this.zzb.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.zzb.position(this.zze);
            this.zzb.get(bArr, i2, i3);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.zzb.position(position);
            zza(i3);
        }
        return i3;
    }
}

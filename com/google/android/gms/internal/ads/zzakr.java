package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzakr extends zzgpd {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgpn zzm;
    private long zzn;

    public zzakr() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgpn.zza;
    }

    public final String toString() {
        StringBuilder A = a.A("MovieHeaderBox[creationTime=");
        A.append(this.zza);
        A.append(";modificationTime=");
        A.append(this.zzh);
        A.append(";timescale=");
        A.append(this.zzi);
        A.append(";duration=");
        A.append(this.zzj);
        A.append(";rate=");
        A.append(this.zzk);
        A.append(";volume=");
        A.append(this.zzl);
        A.append(";matrix=");
        A.append(this.zzm);
        A.append(";nextTrackId=");
        A.append(this.zzn);
        A.append("]");
        return A.toString();
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgpb
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgpi.zza(zzakn.zzf(byteBuffer));
            this.zzh = zzgpi.zza(zzakn.zzf(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zzf(byteBuffer);
        } else {
            this.zza = zzgpi.zza(zzakn.zze(byteBuffer));
            this.zzh = zzgpi.zza(zzakn.zze(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zze(byteBuffer);
        }
        this.zzk = zzakn.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        zzakn.zzd(byteBuffer);
        zzakn.zze(byteBuffer);
        zzakn.zze(byteBuffer);
        double zzb = zzakn.zzb(byteBuffer);
        double zzb2 = zzakn.zzb(byteBuffer);
        double zza = zzakn.zza(byteBuffer);
        this.zzm = new zzgpn(zzb, zzb2, zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer), zza, zzakn.zza(byteBuffer), zzakn.zza(byteBuffer), zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzakn.zze(byteBuffer);
    }
}

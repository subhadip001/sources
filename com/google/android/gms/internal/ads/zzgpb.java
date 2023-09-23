package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgpb implements zzako {
    private static final zzgpm zza = zzgpm.zzb(zzgpb.class);
    public final String zzb;
    public long zze;
    public zzgpg zzg;
    private zzakp zzh;
    private ByteBuffer zzi;
    public long zzf = -1;
    private ByteBuffer zzj = null;
    public boolean zzd = true;
    public boolean zzc = true;

    public zzgpb(String str) {
        this.zzb = str;
    }

    private final synchronized void zzd() {
        if (this.zzd) {
            return;
        }
        try {
            zzgpm zzgpmVar = zza;
            String str = this.zzb;
            zzgpmVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzi = this.zzg.zzd(this.zze, this.zzf);
            this.zzd = true;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzb(zzgpg zzgpgVar, ByteBuffer byteBuffer, long j2, zzakl zzaklVar) {
        this.zze = zzgpgVar.zzb();
        byteBuffer.remaining();
        this.zzf = j2;
        this.zzg = zzgpgVar;
        zzgpgVar.zze(zzgpgVar.zzb() + j2);
        this.zzd = false;
        this.zzc = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzc(zzakp zzakpVar) {
        this.zzh = zzakpVar;
    }

    public abstract void zzf(ByteBuffer byteBuffer);

    public final synchronized void zzg() {
        String str;
        zzd();
        zzgpm zzgpmVar = zza;
        String str2 = this.zzb;
        if (str2.length() != 0) {
            str = "parsing details of ".concat(str2);
        } else {
            str = new String("parsing details of ");
        }
        zzgpmVar.zza(str);
        ByteBuffer byteBuffer = this.zzi;
        if (byteBuffer != null) {
            this.zzc = true;
            byteBuffer.rewind();
            zzf(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.zzj = byteBuffer.slice();
            }
            this.zzi = null;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzot extends zzqj implements zzjc {
    private final Context zzb;
    private final zznk zzc;
    private final zznr zzd;
    private int zze;
    private boolean zzf;
    private zzad zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzjt zzl;

    public zzot(Context context, zzqd zzqdVar, zzql zzqlVar, boolean z, Handler handler, zznl zznlVar, zznr zznrVar) {
        super(1, zzqdVar, zzqlVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznrVar;
        this.zzc = new zznk(handler, zznlVar);
        zznrVar.zzn(new zzos(this, null));
    }

    private final int zzaw(zzqg zzqgVar, zzad zzadVar) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(zzqgVar.zza) || (i2 = zzeg.zza) >= 24 || (i2 == 23 && zzeg.zzW(this.zzb))) {
            return zzadVar.zzn;
        }
        return -1;
    }

    private static List zzax(zzql zzqlVar, zzad zzadVar, boolean z, zznr zznrVar) {
        zzqg zzd;
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrh.zzo();
        }
        if (zznrVar.zzv(zzadVar) && (zzd = zzqy.zzd()) != null) {
            return zzfrh.zzp(zzd);
        }
        List zzf = zzqy.zzf(str, false, false);
        String zze = zzqy.zze(zzadVar);
        if (zze == null) {
            return zzfrh.zzm(zzf);
        }
        List zzf2 = zzqy.zzf(zze, false, false);
        zzfre zzi = zzfrh.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzay() {
        long zzb = this.zzd.zzb(zzM());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzh, zzb);
            }
            this.zzh = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzju, com.google.android.gms.internal.ads.zzjv
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzju
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzju
    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final float zzP(float f2, zzad zzadVar, zzad[] zzadVarArr) {
        int i2 = -1;
        for (zzad zzadVar2 : zzadVarArr) {
            int i3 = zzadVar2.zzA;
            if (i3 != -1) {
                i2 = Math.max(i2, i3);
            }
        }
        if (i2 == -1) {
            return -1.0f;
        }
        return i2 * f2;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final int zzQ(zzql zzqlVar, zzad zzadVar) {
        boolean z;
        if (zzbo.zzg(zzadVar.zzm)) {
            int i2 = zzeg.zza >= 21 ? 32 : 0;
            int i3 = zzadVar.zzF;
            boolean zzav = zzqj.zzav(zzadVar);
            if (zzav && this.zzd.zzv(zzadVar) && (i3 == 0 || zzqy.zzd() != null)) {
                return i2 | 140;
            }
            if ((!"audio/raw".equals(zzadVar.zzm) || this.zzd.zzv(zzadVar)) && this.zzd.zzv(zzeg.zzE(2, zzadVar.zzz, zzadVar.zzA))) {
                List zzax = zzax(zzqlVar, zzadVar, false, this.zzd);
                if (zzax.isEmpty()) {
                    return 129;
                }
                if (zzav) {
                    zzqg zzqgVar = (zzqg) zzax.get(0);
                    boolean zzd = zzqgVar.zzd(zzadVar);
                    if (!zzd) {
                        for (int i4 = 1; i4 < zzax.size(); i4++) {
                            zzqg zzqgVar2 = (zzqg) zzax.get(i4);
                            if (zzqgVar2.zzd(zzadVar)) {
                                zzqgVar = zzqgVar2;
                                z = false;
                                zzd = true;
                                break;
                            }
                        }
                    }
                    z = true;
                    int i5 = true != zzd ? 3 : 4;
                    int i6 = 8;
                    if (zzd && zzqgVar.zze(zzadVar)) {
                        i6 = 16;
                    }
                    return i5 | i6 | i2 | (true != zzqgVar.zzg ? 0 : 64) | (true != z ? 0 : 128);
                }
                return 130;
            }
            return 129;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzgn zzR(zzqg zzqgVar, zzad zzadVar, zzad zzadVar2) {
        int i2;
        int i3;
        zzgn zzb = zzqgVar.zzb(zzadVar, zzadVar2);
        int i4 = zzb.zze;
        if (zzaw(zzqgVar, zzadVar2) > this.zze) {
            i4 |= 64;
        }
        String str = zzqgVar.zza;
        if (i4 != 0) {
            i3 = i4;
            i2 = 0;
        } else {
            i2 = zzb.zzd;
            i3 = 0;
        }
        return new zzgn(str, zzadVar, zzadVar2, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final zzgn zzS(zzja zzjaVar) {
        zzgn zzS = super.zzS(zzjaVar);
        this.zzc.zzg(zzjaVar.zza, zzS);
        return zzS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzqc zzV(com.google.android.gms.internal.ads.zzqg r8, com.google.android.gms.internal.ads.zzad r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzot.zzV(com.google.android.gms.internal.ads.zzqg, com.google.android.gms.internal.ads.zzad, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqc");
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final List zzW(zzql zzqlVar, zzad zzadVar, boolean z) {
        return zzqy.zzg(zzax(zzqlVar, zzadVar, false, this.zzd), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzX(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzY(String str, zzqc zzqcVar, long j2, long j3) {
        this.zzc.zzc(str, j2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzaa(zzad zzadVar, MediaFormat mediaFormat) {
        int zzn;
        int i2;
        zzad zzadVar2 = this.zzg;
        int[] iArr = null;
        if (zzadVar2 != null) {
            zzadVar = zzadVar2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzadVar.zzm)) {
                zzn = zzadVar.zzB;
            } else if (zzeg.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                zzn = mediaFormat.getInteger("pcm-encoding");
            } else {
                zzn = mediaFormat.containsKey("v-bits-per-sample") ? zzeg.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/raw");
            zzabVar.zzN(zzn);
            zzabVar.zzC(zzadVar.zzC);
            zzabVar.zzD(zzadVar.zzD);
            zzabVar.zzw(mediaFormat.getInteger("channel-count"));
            zzabVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzad zzY = zzabVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i2 = zzadVar.zzz) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < zzadVar.zzz; i3++) {
                    iArr[i3] = i3;
                }
            }
            zzadVar = zzY;
        }
        try {
            this.zzd.zzd(zzadVar, 0, iArr);
        } catch (zznm e2) {
            throw zzbg(e2, e2.zza, false, 5001);
        }
    }

    public final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzad(zzgc zzgcVar) {
        if (!this.zzi || zzgcVar.zzf()) {
            return;
        }
        if (Math.abs(zzgcVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgcVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final void zzae() {
        try {
            this.zzd.zzi();
        } catch (zznq e2) {
            throw zzbg(e2, e2.zzc, e2.zzb, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final boolean zzaf(long j2, long j3, zzqe zzqeVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, zzad zzadVar) {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i3 & 2) != 0) {
            Objects.requireNonNull(zzqeVar);
            zzqeVar.zzn(i2, false);
            return true;
        } else if (z) {
            if (zzqeVar != null) {
                zzqeVar.zzn(i2, false);
            }
            ((zzqj) this).zza.zzf += i4;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (this.zzd.zzs(byteBuffer, j4, i4)) {
                    if (zzqeVar != null) {
                        zzqeVar.zzn(i2, false);
                    }
                    ((zzqj) this).zza.zze += i4;
                    return true;
                }
                return false;
            } catch (zznn e2) {
                throw zzbg(e2, e2.zzc, e2.zzb, 5001);
            } catch (zznq e3) {
                throw zzbg(e3, zzadVar, e3.zzb, 5002);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj
    public final boolean zzag(zzad zzadVar) {
        return this.zzd.zzv(zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final zzbt zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjc
    public final void zzg(zzbt zzbtVar) {
        this.zzd.zzo(zzbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzju
    public final zzjc zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgl, com.google.android.gms.internal.ads.zzjq
    public final void zzp(int i2, Object obj) {
        if (i2 == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i2 == 3) {
            this.zzd.zzk((zzi) obj);
        } else if (i2 != 6) {
            switch (i2) {
                case 9:
                    this.zzd.zzq(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzjt) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzj) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzs();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzt(boolean z, boolean z2) {
        super.zzt(z, z2);
        this.zzc.zzf(((zzqj) this).zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzu(long j2, boolean z) {
        super.zzu(j2, z);
        this.zzd.zze();
        this.zzh = j2;
        this.zzi = true;
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqj, com.google.android.gms.internal.ads.zzgl
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgl
    public final void zzx() {
        zzay();
        this.zzd.zzg();
    }
}

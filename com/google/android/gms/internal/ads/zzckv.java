package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzckv extends zzchi implements zzft, zzkl {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzckg zze;
    private final zzvf zzf;
    private final zzchq zzg;
    private final WeakReference zzh;
    private final zztg zzi;
    private zzjz zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private zzchh zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private final String zzq;
    private final int zzr;
    private final ArrayList zzt;
    private volatile zzcki zzu;
    private final Object zzs = new Object();
    private final Set zzv = new HashSet();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhy.zzbB)).booleanValue() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f9, code lost:
        if (r7.zzj == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fe, code lost:
        if (r7.zzo == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0100, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
        if (r7.zzi <= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
        r8 = new com.google.android.gms.internal.ads.zzckn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0110, code lost:
        r8 = new com.google.android.gms.internal.ads.zzcko();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0117, code lost:
        if (r7.zzj == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0119, code lost:
        r7 = new com.google.android.gms.internal.ads.zzckp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0120, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0121, code lost:
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0129, code lost:
        if (r6.limit() <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012b, code lost:
        r6 = new byte[r5.zzk.limit()];
        r5.zzk.get(r6);
        r7 = new com.google.android.gms.internal.ads.zzckq();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzckv(android.content.Context r6, com.google.android.gms.internal.ads.zzchq r7, com.google.android.gms.internal.ads.zzchr r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckv.<init>(android.content.Context, com.google.android.gms.internal.ads.zzchq, com.google.android.gms.internal.ads.zzchr):void");
    }

    private final boolean zzZ() {
        return this.zzu != null && this.zzu.zzq();
    }

    public final void finalize() {
        zzchi.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("OfficialSimpleExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzZ()) {
            return 0L;
        }
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (!zzZ()) {
            synchronized (this.zzs) {
                while (!this.zzt.isEmpty()) {
                    long j2 = this.zzp;
                    Map zze = ((zzfo) this.zzt.remove(0)).zze();
                    long j3 = 0;
                    if (zze != null) {
                        Iterator it = zze.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry entry = (Map.Entry) it.next();
                            if (entry != null) {
                                try {
                                    if (entry.getKey() != null && zzfoa.zzc("content-length", (CharSequence) entry.getKey()) && entry.getValue() != null && ((List) entry.getValue()).get(0) != null) {
                                        j3 = Long.parseLong((String) ((List) entry.getValue()).get(0));
                                        break;
                                    }
                                } catch (NumberFormatException unused) {
                                    continue;
                                }
                            }
                        }
                    }
                    this.zzp = j2 + j3;
                }
            }
            return this.zzp;
        }
        return this.zzu.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzsd zzstVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzstVar = zzW(uriArr[0]);
        } else {
            zzsd[] zzsdVarArr = new zzsd[length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                zzsdVarArr[i2] = zzW(uriArr[i2]);
            }
            zzstVar = new zzst(false, false, zzsdVarArr);
        }
        this.zzj.zzB(zzstVar);
        this.zzj.zzy();
        zzchi.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzjz zzjzVar = this.zzj;
        if (zzjzVar != null) {
            zzjzVar.zzA(this);
            this.zzj.zzz();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j2) {
        zzjz zzjzVar = this.zzj;
        zzjzVar.zzp(zzjzVar.zzf(), j2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i2) {
        this.zze.zzk(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i2) {
        this.zze.zzl(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzm = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i2) {
        this.zze.zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i2) {
        this.zze.zzn(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.zzj.zzC(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if (this.zzj == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            this.zzj.zzt();
            if (i2 >= 2) {
                return;
            }
            zzvf zzvfVar = this.zzf;
            zzuw zzd = zzvfVar.zzc().zzd();
            zzd.zzo(i2, !z);
            zzvfVar.zzg(zzd);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i2) {
        for (WeakReference weakReference : this.zzv) {
            zzckf zzckfVar = (zzckf) weakReference.get();
            if (zzckfVar != null) {
                zzckfVar.zzm(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z) {
        zzjz zzjzVar = this.zzj;
        if (zzjzVar == null) {
            return;
        }
        zzjzVar.zzE(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f2, boolean z) {
        zzjz zzjzVar = this.zzj;
        if (zzjzVar == null) {
            return;
        }
        zzjzVar.zzF(f2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    public final /* synthetic */ zzer zzS(String str, boolean z) {
        zzckv zzckvVar = true != z ? null : this;
        zzchq zzchqVar = this.zzg;
        return new zzcky(str, zzckvVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    public final /* synthetic */ zzer zzT(String str, boolean z) {
        zzckv zzckvVar = true != z ? null : this;
        zzchq zzchqVar = this.zzg;
        zzckf zzckfVar = new zzckf(str, zzckvVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzv.add(new WeakReference(zzckfVar));
        return zzckfVar;
    }

    public final /* synthetic */ zzer zzU(String str, boolean z) {
        zzez zzezVar = new zzez();
        zzezVar.zzf(str);
        zzezVar.zze(true != z ? null : this);
        zzezVar.zzc(this.zzg.zzd);
        zzezVar.zzd(this.zzg.zzf);
        zzezVar.zzb(true);
        return zzezVar.zza();
    }

    public final /* synthetic */ zzer zzV(zzeq zzeqVar) {
        return new zzcki(this.zzd, zzeqVar.zza(), this.zzq, this.zzr, this, new zzckl(this), null);
    }

    @VisibleForTesting
    public final zzsd zzW(Uri uri) {
        zzah zzahVar = new zzah();
        zzahVar.zzb(uri);
        zzbb zzc2 = zzahVar.zzc();
        zztg zztgVar = this.zzi;
        zztgVar.zza(this.zzg.zzg);
        return zztgVar.zzb(zzc2);
    }

    public final /* synthetic */ void zzX(boolean z, long j2) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzi(z, j2);
        }
    }

    public final /* synthetic */ zzju[] zzY(Handler handler, zzxr zzxrVar, zznl zznlVar, zzub zzubVar, zzrb zzrbVar) {
        Context context = this.zzd;
        zzql zzqlVar = zzql.zzb;
        zzmw zzmwVar = zzmw.zza;
        zzmz[] zzmzVarArr = new zzmz[0];
        zzob zzobVar = new zzob();
        if (zzmwVar == null) {
            Objects.requireNonNull(zzmwVar, "Both parameters are null");
        }
        zzobVar.zzb(zzmwVar);
        zzobVar.zzc(zzmzVarArr);
        zzon zzd = zzobVar.zzd();
        zzqd zzqdVar = zzqd.zza;
        return new zzju[]{new zzot(context, zzqdVar, zzqlVar, false, handler, zznlVar, zzd), new zzwx(this.zzd, zzqdVar, zzqlVar, 0L, false, handler, zzxrVar, -1, 30.0f)};
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zza(zzer zzerVar, zzew zzewVar, boolean z, int i2) {
        this.zzn += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zzb(zzer zzerVar, zzew zzewVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zzc(zzer zzerVar, zzew zzewVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzft
    public final void zzd(zzer zzerVar, zzew zzewVar, boolean z) {
        if (zzerVar instanceof zzfo) {
            synchronized (this.zzs) {
                this.zzt.add((zzfo) zzerVar);
            }
        } else if (zzerVar instanceof zzcki) {
            this.zzu = (zzcki) zzerVar;
            final zzchr zzchrVar = (zzchr) this.zzh.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchrVar != null && this.zzu.zzn()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzp()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzo()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcks
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i2 = zzckv.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zze(zzkj zzkjVar, zzad zzadVar, zzgn zzgnVar) {
        zzchr zzchrVar = (zzchr) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzchrVar == null || zzadVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzadVar.zzl);
        hashMap.put("audioSampleMime", zzadVar.zzm);
        hashMap.put("audioCodec", zzadVar.zzj);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzf(zzkj zzkjVar, int i2, long j2, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzg(zzkj zzkjVar, zzrx zzrxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzh(zzkj zzkjVar, int i2, long j2) {
        this.zzo += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzi(zzcb zzcbVar, zzkk zzkkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzj(zzkj zzkjVar, zzrs zzrsVar, zzrx zzrxVar, IOException iOException, boolean z) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            if (this.zzg.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzk(zzkj zzkjVar, int i2) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzm(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzl(zzkj zzkjVar, zzbr zzbrVar) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzbrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzm(zzkj zzkjVar, zzca zzcaVar, zzca zzcaVar2, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzn(zzkj zzkjVar, Object obj, long j2) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final /* synthetic */ void zzo(zzkj zzkjVar, zzgm zzgmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzp(zzkj zzkjVar, zzad zzadVar, zzgn zzgnVar) {
        zzchr zzchrVar = (zzchr) this.zzh.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzchrVar == null || zzadVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzadVar.zzt));
        hashMap.put("bitRate", String.valueOf(zzadVar.zzi));
        int i2 = zzadVar.zzr;
        int i3 = zzadVar.zzs;
        hashMap.put("resolution", i2 + "x" + i3);
        hashMap.put("videoMime", zzadVar.zzl);
        hashMap.put("videoSampleMime", zzadVar.zzm);
        hashMap.put("videoCodec", zzadVar.zzj);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzkl
    public final void zzq(zzkj zzkjVar, zzcv zzcvVar) {
        zzchh zzchhVar = this.zzm;
        if (zzchhVar != null) {
            zzchhVar.zzC(zzcvVar.zzc, zzcvVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzZ() && this.zzu.zzp()) {
            return Math.min(this.zzn, this.zzu.zzk());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzv();
    }
}

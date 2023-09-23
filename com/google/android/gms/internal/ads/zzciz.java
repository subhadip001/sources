package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzciz extends zzchi implements zzayx, zzawv, zzbah, zzasp, zzarf {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcio zze;
    private final zzarx zzf;
    private final zzarx zzg;
    private final zzaxz zzh;
    private final zzchq zzi;
    private zzari zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference zzm;
    private zzchh zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList zzu;
    private volatile zzcin zzv;
    private final Object zzt = new Object();
    private final Set zzw = new HashSet();

    public zzciz(Context context, zzchq zzchqVar, zzchr zzchrVar) {
        this.zzd = context;
        this.zzi = zzchqVar;
        this.zzm = new WeakReference(zzchrVar);
        zzcio zzcioVar = new zzcio();
        this.zze = zzcioVar;
        zzavs zzavsVar = zzavs.zza;
        zzfnu zzfnuVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzazw zzazwVar = new zzazw(context, zzavsVar, 0L, zzfnuVar, this, -1);
        this.zzf = zzazwVar;
        zzate zzateVar = new zzate(zzavsVar, null, true, zzfnuVar, this);
        this.zzg = zzateVar;
        zzaxv zzaxvVar = new zzaxv(null);
        this.zzh = zzaxvVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter initialize ".concat(toString()));
        }
        zzchi.zza.incrementAndGet();
        zzari zza = zzarj.zza(new zzarx[]{zzateVar, zzazwVar}, zzaxvVar, zzcioVar);
        this.zzj = zza;
        zza.zze(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzu = new ArrayList();
        this.zzv = null;
        this.zzr = (zzchrVar == null || zzchrVar.zzt() == null) ? "" : zzchrVar.zzt();
        this.zzs = zzchrVar != null ? zzchrVar.zzh() : 0;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzn)).booleanValue()) {
            this.zzj.zzg();
        }
        if (zzchrVar != null && zzchrVar.zzg() > 0) {
            this.zzj.zzp(zzchrVar.zzg());
        }
        if (zzchrVar != null && zzchrVar.zzf() > 0) {
            this.zzj.zzo(zzchrVar.zzf());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzp)).booleanValue()) {
            this.zzj.zzi();
            this.zzj.zzh(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzq)).intValue());
        }
    }

    private final boolean zzY() {
        return this.zzv != null && this.zzv.zzk();
    }

    public final void finalize() {
        zzchi.zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("ForkedExoPlayerAdapter finalize ".concat(toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzA() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzB() {
        if (!zzY()) {
            synchronized (this.zzt) {
                while (!this.zzu.isEmpty()) {
                    long j2 = this.zzq;
                    Map zze = ((zzayr) this.zzu.remove(0)).zze();
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
                    this.zzq = j2 + j3;
                }
            }
            return this.zzq;
        }
        return this.zzv.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzC(Uri[] uriArr, String str) {
        zzD(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzD(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaxa zzaxeVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzaxeVar = zzp(uriArr[0], str);
        } else {
            zzaxa[] zzaxaVarArr = new zzaxa[length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                zzaxaVarArr[i2] = zzp(uriArr[i2], str);
            }
            zzaxeVar = new zzaxe(zzaxaVarArr);
        }
        this.zzj.zzj(zzaxeVar);
        zzchi.zzb.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzE() {
        zzari zzariVar = this.zzj;
        if (zzariVar != null) {
            zzariVar.zzl(this);
            this.zzj.zzk();
            this.zzj = null;
            zzchi.zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzF(long j2) {
        this.zzj.zzm(j2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzG(int i2) {
        this.zze.zzf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzH(int i2) {
        this.zze.zzg(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzI(zzchh zzchhVar) {
        this.zzn = zzchhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzJ(int i2) {
        this.zze.zzh(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzK(int i2) {
        this.zze.zzi(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzL(boolean z) {
        this.zzj.zzq(z);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.zzh.zze(i2, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzN(int i2) {
        for (WeakReference weakReference : this.zzw) {
            zzcil zzcilVar = (zzcil) weakReference.get();
            if (zzcilVar != null) {
                zzcilVar.zzh(i2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzO(Surface surface, boolean z) {
        zzari zzariVar = this.zzj;
        if (zzariVar == null) {
            return;
        }
        zzarh zzarhVar = new zzarh(this.zzf, 1, surface);
        if (z) {
            zzariVar.zzf(zzarhVar);
        } else {
            zzariVar.zzn(zzarhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzP(float f2, boolean z) {
        if (this.zzj == null) {
            return;
        }
        this.zzj.zzn(new zzarh(this.zzg, 2, Float.valueOf(f2)));
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final void zzQ() {
        this.zzj.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final boolean zzR() {
        return this.zzj != null;
    }

    public final /* synthetic */ zzayi zzS(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        zzcil zzcilVar = new zzcil(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzi);
        this.zzw.add(new WeakReference(zzcilVar));
        return zzcilVar;
    }

    public final /* synthetic */ zzayi zzT(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzaym(str, null, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, true, null);
    }

    public final /* synthetic */ zzayi zzU(zzayh zzayhVar) {
        return new zzcin(this.zzd, zzayhVar.zza(), this.zzr, this.zzs, this, new zzciv(this), null);
    }

    public final /* synthetic */ void zzV(boolean z, long j2) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzi(z, j2);
        }
    }

    public final void zzW(zzayi zzayiVar, int i2) {
        this.zzo += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzayx
    /* renamed from: zzX */
    public final void zzk(zzayi zzayiVar, zzayk zzaykVar) {
        if (zzayiVar instanceof zzayr) {
            synchronized (this.zzt) {
                this.zzu.add((zzayr) zzayiVar);
            }
        } else if (zzayiVar instanceof zzcin) {
            this.zzv = (zzcin) zzayiVar;
            final zzchr zzchrVar = (zzchr) this.zzm.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() && zzchrVar != null && this.zzv.zzh()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzj()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzi()));
                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchr zzchrVar2 = zzchr.this;
                        Map map = hashMap;
                        int i2 = zzciz.zzc;
                        zzchrVar2.zzd("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzb(zzarw zzarwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzc(zzare zzareVar) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzk("onPlayerError", zzareVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzd(boolean z, int i2) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzm(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzf(zzasd zzasdVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzarf
    public final void zzg(zzaxp zzaxpVar, zzayb zzaybVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasp
    public final void zzh(zzars zzarsVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzchrVar == null || zzarsVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzarsVar.zze);
        hashMap.put("audioSampleMime", zzarsVar.zzf);
        hashMap.put("audioCodec", zzarsVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzi(IOException iOException) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            if (this.zzi.zzl) {
                zzchhVar.zzl("onLoadException", iOException);
            } else {
                zzchhVar.zzk("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayx
    public final /* synthetic */ void zzj(Object obj, int i2) {
        this.zzo += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzl(int i2, long j2) {
        this.zzp += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzm(Surface surface) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzn(zzars zzarsVar) {
        zzchr zzchrVar = (zzchr) this.zzm.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue() || zzchrVar == null || zzarsVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzarsVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzarsVar.zzb));
        int i2 = zzarsVar.zzj;
        int i3 = zzarsVar.zzk;
        hashMap.put("resolution", i2 + "x" + i3);
        hashMap.put("videoMime", zzarsVar.zze);
        hashMap.put("videoSampleMime", zzarsVar.zzf);
        hashMap.put("videoCodec", zzarsVar.zzc);
        zzchrVar.zzd("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbah
    public final void zzo(int i2, int i3, int i4, float f2) {
        zzchh zzchhVar = this.zzn;
        if (zzchhVar != null) {
            zzchhVar.zzC(i2, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(com.google.android.gms.internal.ads.zzbhy.zzbB)).booleanValue() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    @com.google.android.gms.common.util.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzaxa zzp(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzaww r9 = new com.google.android.gms.internal.ads.zzaww
            boolean r0 = r10.zzl
            if (r0 == 0) goto L23
            java.nio.ByteBuffer r0 = r10.zzk
            int r0 = r0.limit()
            if (r0 <= 0) goto L23
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.zzk
            r0.get(r12)
            com.google.android.gms.internal.ads.zzcip r0 = new com.google.android.gms.internal.ads.zzcip
            r0.<init>()
        L20:
            r2 = r0
            goto L94
        L23:
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzbK
            com.google.android.gms.internal.ads.zzbhw r1 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzbhq r0 = com.google.android.gms.internal.ads.zzbhy.zzbB
            com.google.android.gms.internal.ads.zzbhw r2 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L50
        L48:
            com.google.android.gms.internal.ads.zzchq r0 = r10.zzi
            boolean r0 = r0.zzj
            if (r0 != 0) goto L4f
            goto L50
        L4f:
            r1 = 0
        L50:
            com.google.android.gms.internal.ads.zzchq r0 = r10.zzi
            boolean r2 = r0.zzo
            if (r2 == 0) goto L5c
            com.google.android.gms.internal.ads.zzciq r0 = new com.google.android.gms.internal.ads.zzciq
            r0.<init>()
            goto L6b
        L5c:
            int r0 = r0.zzi
            if (r0 <= 0) goto L66
            com.google.android.gms.internal.ads.zzcir r0 = new com.google.android.gms.internal.ads.zzcir
            r0.<init>()
            goto L6b
        L66:
            com.google.android.gms.internal.ads.zzcis r0 = new com.google.android.gms.internal.ads.zzcis
            r0.<init>()
        L6b:
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            boolean r12 = r12.zzj
            if (r12 == 0) goto L77
            com.google.android.gms.internal.ads.zzcit r12 = new com.google.android.gms.internal.ads.zzcit
            r12.<init>()
            r0 = r12
        L77:
            java.nio.ByteBuffer r12 = r10.zzk
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.zzk
            r1.get(r12)
            com.google.android.gms.internal.ads.zzciu r1 = new com.google.android.gms.internal.ads.zzciu
            r1.<init>()
            r2 = r1
        L94:
            com.google.android.gms.internal.ads.zzbhq r12 = com.google.android.gms.internal.ads.zzbhy.zzm
            com.google.android.gms.internal.ads.zzbhw r0 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La9
            com.google.android.gms.internal.ads.zzcix r12 = new com.google.android.gms.internal.ads.zzatx() { // from class: com.google.android.gms.internal.ads.zzcix
                static {
                    /*
                        com.google.android.gms.internal.ads.zzcix r0 = new com.google.android.gms.internal.ads.zzcix
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.ads.zzcix) com.google.android.gms.internal.ads.zzcix.zza com.google.android.gms.internal.ads.zzcix
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzatx
                public final com.google.android.gms.internal.ads.zzatv[] zza() {
                    /*
                        r4 = this;
                        int r0 = com.google.android.gms.internal.ads.zzciz.zzc
                        r0 = 3
                        com.google.android.gms.internal.ads.zzatv[] r0 = new com.google.android.gms.internal.ads.zzatv[r0]
                        com.google.android.gms.internal.ads.zzavi r1 = new com.google.android.gms.internal.ads.zzavi
                        r1.<init>()
                        r2 = 0
                        r0[r2] = r1
                        com.google.android.gms.internal.ads.zzaun r1 = new com.google.android.gms.internal.ads.zzaun
                        r1.<init>(r2)
                        r3 = 1
                        r0[r3] = r1
                        com.google.android.gms.internal.ads.zzave r1 = new com.google.android.gms.internal.ads.zzave
                        r3 = 0
                        r1.<init>(r2, r3, r3)
                        r2 = 2
                        r0[r2] = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcix.zza():com.google.android.gms.internal.ads.zzatv[]");
                }
            }
            goto Lab
        La9:
            com.google.android.gms.internal.ads.zzciy r12 = new com.google.android.gms.internal.ads.zzatx() { // from class: com.google.android.gms.internal.ads.zzciy
                static {
                    /*
                        com.google.android.gms.internal.ads.zzciy r0 = new com.google.android.gms.internal.ads.zzciy
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.ads.zzciy) com.google.android.gms.internal.ads.zzciy.zza com.google.android.gms.internal.ads.zzciy
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciy.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciy.<init>():void");
                }

                @Override // com.google.android.gms.internal.ads.zzatx
                public final com.google.android.gms.internal.ads.zzatv[] zza() {
                    /*
                        r3 = this;
                        int r0 = com.google.android.gms.internal.ads.zzciz.zzc
                        r0 = 2
                        com.google.android.gms.internal.ads.zzatv[] r0 = new com.google.android.gms.internal.ads.zzatv[r0]
                        com.google.android.gms.internal.ads.zzavi r1 = new com.google.android.gms.internal.ads.zzavi
                        r1.<init>()
                        r2 = 0
                        r0[r2] = r1
                        com.google.android.gms.internal.ads.zzaun r1 = new com.google.android.gms.internal.ads.zzaun
                        r1.<init>(r2)
                        r2 = 1
                        r0[r2] = r1
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciy.zza():com.google.android.gms.internal.ads.zzatv[]");
                }
            }
        Lab:
            r3 = r12
            com.google.android.gms.internal.ads.zzchq r12 = r10.zzi
            int r4 = r12.zzk
            com.google.android.gms.internal.ads.zzfnu r5 = com.google.android.gms.ads.internal.util.zzs.zza
            r7 = 0
            int r8 = r12.zzg
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzciz.zzp(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzaxa");
    }

    public final /* synthetic */ zzayi zzq(String str, boolean z) {
        zzciz zzcizVar = true != z ? null : this;
        zzchq zzchqVar = this.zzi;
        return new zzcjd(str, zzcizVar, zzchqVar.zzd, zzchqVar.zzf, zzchqVar.zzp, zzchqVar.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzr() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final int zzt() {
        return this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzv() {
        return this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzw() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzx() {
        if (zzY() && this.zzv.zzj()) {
            return Math.min(this.zzo, this.zzv.zze());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzy() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzchi
    public final long zzz() {
        return this.zzj.zzd();
    }
}

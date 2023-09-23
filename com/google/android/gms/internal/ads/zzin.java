package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import com.google.firebase.inappmessaging.display.internal.FiamWindowManager;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzin extends zzk implements zzhf {
    public static final /* synthetic */ int zzd = 0;
    private final zzkg zzA;
    private final zzkh zzB;
    private final long zzC;
    private int zzD;
    private int zzE;
    private boolean zzF;
    private int zzG;
    private zzjx zzH;
    private zzbx zzI;
    private zzbh zzJ;
    private zzbh zzK;
    private zzad zzL;
    private zzad zzM;
    private AudioTrack zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private zzgm zzT;
    private zzgm zzU;
    private int zzV;
    private zzi zzW;
    private float zzX;
    private boolean zzY;
    private List zzZ;
    private boolean zzaa;
    private boolean zzab;
    private zzr zzac;
    private zzcv zzad;
    private zzbh zzae;
    private zzjo zzaf;
    private int zzag;
    private long zzah;
    private final zzhq zzai;
    private zztu zzaj;
    public final zzvo zzb;
    public final zzbx zzc;
    private final zzcz zze;
    private final Context zzf;
    private final zzcb zzg;
    private final zzju[] zzh;
    private final zzvn zzi;
    private final zzdg zzj;
    private final zzix zzk;
    private final zzdm zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzcf zzn;
    private final List zzo;
    private final boolean zzp;
    private final zzsa zzq;
    private final zzki zzr;
    private final Looper zzs;
    private final zzvv zzt;
    private final zzcx zzu;
    private final zzij zzv;
    private final zzil zzw;
    private final zzgg zzx;
    private final zzgk zzy;
    private final zzkf zzz;

    static {
        zzbc.zzb("media3.exoplayer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.google.android.gms.internal.ads.zzvu, com.google.android.gms.internal.ads.zzki, java.lang.Object] */
    public zzin(zzhe zzheVar, zzcb zzcbVar) {
        zzmv zza;
        Object obj;
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zze = zzczVar;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzeg.zze;
            Log.i("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.0.0-alpha03] [" + str + "]");
            Context applicationContext = zzheVar.zza.getApplicationContext();
            this.zzf = applicationContext;
            ?? apply = zzheVar.zzh.apply(zzheVar.zzb);
            this.zzr = apply;
            this.zzW = zzheVar.zzj;
            this.zzQ = 1;
            this.zzY = false;
            this.zzC = 2000L;
            zzij zzijVar = new zzij(this, null);
            this.zzv = zzijVar;
            zzil zzilVar = new zzil(null);
            this.zzw = zzilVar;
            Handler handler = new Handler(zzheVar.zzi);
            zzju[] zza2 = ((zzgy) zzheVar.zzc).zza.zza(handler, zzijVar, zzijVar, zzijVar, zzijVar);
            this.zzh = zza2;
            int length = zza2.length;
            zzvn zzvnVar = (zzvn) zzheVar.zze.zza();
            this.zzi = zzvnVar;
            this.zzq = zzhe.zza(((zzgz) zzheVar.zzd).zza);
            zzvz zzg = zzvz.zzg(((zzhc) zzheVar.zzg).zza);
            this.zzt = zzg;
            this.zzp = true;
            this.zzH = zzheVar.zzk;
            Looper looper = zzheVar.zzi;
            this.zzs = looper;
            zzcx zzcxVar = zzheVar.zzb;
            this.zzu = zzcxVar;
            this.zzg = zzcbVar;
            zzdm zzdmVar = new zzdm(looper, zzcxVar, new zzdk() { // from class: com.google.android.gms.internal.ads.zzhp
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj2, zzy zzyVar) {
                    zzby zzbyVar = (zzby) obj2;
                }
            });
            this.zzl = zzdmVar;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            this.zzaj = new zztu(0);
            int length2 = zza2.length;
            zzvo zzvoVar = new zzvo(new zzjw[2], new zzvh[2], zzct.zza, null);
            this.zzb = zzvoVar;
            this.zzn = new zzcf();
            zzbv zzbvVar = new zzbv();
            zzbvVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28);
            zzvnVar.zzh();
            zzbvVar.zzd(29, true);
            zzbx zze = zzbvVar.zze();
            this.zzc = zze;
            zzbv zzbvVar2 = new zzbv();
            zzbvVar2.zzb(zze);
            zzbvVar2.zza(4);
            zzbvVar2.zza(10);
            this.zzI = zzbvVar2.zze();
            this.zzj = zzcxVar.zzb(looper, null);
            zzhq zzhqVar = new zzhq(this);
            this.zzai = zzhqVar;
            this.zzaf = zzjo.zzh(zzvoVar);
            apply.zzS(zzcbVar, looper);
            int i2 = zzeg.zza;
            if (i2 < 31) {
                zza = new zzmv();
            } else {
                zza = zzic.zza(applicationContext, this, true);
            }
            this.zzk = new zzix(zza2, zzvnVar, zzvoVar, (zzjb) zzheVar.zzf.zza(), zzg, 0, false, apply, this.zzH, zzheVar.zzm, 500L, false, looper, zzcxVar, zzhqVar, zza, null);
            this.zzX = 1.0f;
            zzbh zzbhVar = zzbh.zza;
            this.zzJ = zzbhVar;
            this.zzK = zzbhVar;
            this.zzae = zzbhVar;
            this.zzag = -1;
            if (i2 < 21) {
                AudioTrack audioTrack = this.zzN;
                if (audioTrack == null || audioTrack.getAudioSessionId() == 0) {
                    obj = null;
                } else {
                    this.zzN.release();
                    obj = null;
                    this.zzN = null;
                }
                if (this.zzN == null) {
                    this.zzN = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.zzV = this.zzN.getAudioSessionId();
            } else {
                obj = null;
                this.zzV = zzeg.zzi(applicationContext);
            }
            this.zzZ = zzfrh.zzo();
            this.zzaa = true;
            Objects.requireNonNull(apply);
            zzdmVar.zzb(apply);
            zzg.zze(new Handler(looper), apply);
            copyOnWriteArraySet.add(zzijVar);
            this.zzx = new zzgg(zzheVar.zza, handler, zzijVar);
            this.zzy = new zzgk(zzheVar.zza, handler, zzijVar);
            zzeg.zzS(obj, obj);
            zzkf zzkfVar = new zzkf(zzheVar.zza, handler, zzijVar);
            this.zzz = zzkfVar;
            int i3 = this.zzW.zzc;
            zzkfVar.zzf(3);
            this.zzA = new zzkg(zzheVar.zza);
            this.zzB = new zzkh(zzheVar.zza);
            this.zzac = zzam(zzkfVar);
            this.zzad = zzcv.zza;
            zzaq(1, 10, Integer.valueOf(this.zzV));
            zzaq(2, 10, Integer.valueOf(this.zzV));
            zzaq(1, 3, this.zzW);
            zzaq(2, 4, Integer.valueOf(this.zzQ));
            zzaq(2, 5, 0);
            zzaq(1, 9, Boolean.valueOf(this.zzY));
            zzaq(2, 7, zzilVar);
            zzaq(6, 8, zzilVar);
            zzczVar.zze();
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ void zzN(zzin zzinVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzinVar.zzas(surface);
        zzinVar.zzP = surface;
    }

    private final int zzag() {
        if (this.zzaf.zza.zzo()) {
            return this.zzag;
        }
        zzjo zzjoVar = this.zzaf;
        return zzjoVar.zza.zzn(zzjoVar.zzb.zza, this.zzn).zzd;
    }

    public static int zzah(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    private final long zzai(zzjo zzjoVar) {
        if (zzjoVar.zza.zzo()) {
            return zzeg.zzv(this.zzah);
        }
        if (zzjoVar.zzb.zzb()) {
            return zzjoVar.zzs;
        }
        zzci zzciVar = zzjoVar.zza;
        zzsb zzsbVar = zzjoVar.zzb;
        long j2 = zzjoVar.zzs;
        zzak(zzciVar, zzsbVar, j2);
        return j2;
    }

    private static long zzaj(zzjo zzjoVar) {
        zzch zzchVar = new zzch();
        zzcf zzcfVar = new zzcf();
        zzjoVar.zza.zzn(zzjoVar.zzb.zza, zzcfVar);
        long j2 = zzjoVar.zzc;
        if (j2 == -9223372036854775807L) {
            long j3 = zzjoVar.zza.zze(zzcfVar.zzd, zzchVar, 0L).zzm;
            return 0L;
        }
        return j2;
    }

    private final long zzak(zzci zzciVar, zzsb zzsbVar, long j2) {
        zzciVar.zzn(zzsbVar.zza, this.zzn);
        return j2;
    }

    private final Pair zzal(zzci zzciVar, int i2, long j2) {
        if (zzciVar.zzo()) {
            this.zzag = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.zzah = j2;
            return null;
        }
        if (i2 == -1 || i2 >= zzciVar.zzc()) {
            i2 = zzciVar.zzg(false);
            long j3 = zzciVar.zze(i2, this.zza, 0L).zzm;
            j2 = zzeg.zzz(0L);
        }
        return zzciVar.zzl(this.zza, this.zzn, i2, zzeg.zzv(j2));
    }

    public static zzr zzam(zzkf zzkfVar) {
        return new zzr(0, zzkfVar.zzb(), zzkfVar.zza());
    }

    private final zzjo zzan(zzjo zzjoVar, zzci zzciVar, Pair pair) {
        zzsb zzsbVar;
        zztz zztzVar;
        zzsb zzsbVar2;
        zzvo zzvoVar;
        List list;
        int i2;
        zzjo zzb;
        long j2;
        zzcw.zzd(zzciVar.zzo() || pair != null);
        zzci zzciVar2 = zzjoVar.zza;
        zzjo zzg = zzjoVar.zzg(zzciVar);
        if (zzciVar.zzo()) {
            zzsb zzi = zzjo.zzi();
            long zzv = zzeg.zzv(this.zzah);
            zzjo zza = zzg.zzb(zzi, zzv, zzv, zzv, 0L, zztz.zza, this.zzb, zzfrh.zzo()).zza(zzi);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzg.zzb.zza;
        int i3 = zzeg.zza;
        boolean z = !obj.equals(pair.first);
        if (z) {
            zzsbVar = new zzsb(pair.first);
        } else {
            zzsbVar = zzg.zzb;
        }
        zzsb zzsbVar3 = zzsbVar;
        long longValue = ((Long) pair.second).longValue();
        long zzv2 = zzeg.zzv(zzk());
        if (!zzciVar2.zzo()) {
            zzciVar2.zzn(obj, this.zzn);
        }
        if (z || longValue < zzv2) {
            zzcw.zzf(!zzsbVar3.zzb());
            if (z) {
                zztzVar = zztz.zza;
            } else {
                zztzVar = zzg.zzh;
            }
            zztz zztzVar2 = zztzVar;
            if (z) {
                zzsbVar2 = zzsbVar3;
                zzvoVar = this.zzb;
            } else {
                zzsbVar2 = zzsbVar3;
                zzvoVar = zzg.zzi;
            }
            zzvo zzvoVar2 = zzvoVar;
            if (z) {
                list = zzfrh.zzo();
            } else {
                list = zzg.zzj;
            }
            zzjo zza2 = zzg.zzb(zzsbVar2, longValue, longValue, longValue, 0L, zztzVar2, zzvoVar2, list).zza(zzsbVar2);
            zza2.zzq = longValue;
            return zza2;
        }
        if (i2 == 0) {
            int zza3 = zzciVar.zza(zzg.zzk.zza);
            if (zza3 != -1 && zzciVar.zzd(zza3, this.zzn, false).zzd == zzciVar.zzn(zzsbVar3.zza, this.zzn).zzd) {
                return zzg;
            }
            zzciVar.zzn(zzsbVar3.zza, this.zzn);
            if (zzsbVar3.zzb()) {
                j2 = this.zzn.zzg(zzsbVar3.zzb, zzsbVar3.zzc);
            } else {
                j2 = this.zzn.zze;
            }
            zzb = zzg.zzb(zzsbVar3, zzg.zzs, zzg.zzs, zzg.zzd, j2 - zzg.zzs, zzg.zzh, zzg.zzi, zzg.zzj).zza(zzsbVar3);
            zzb.zzq = j2;
        } else {
            zzcw.zzf(!zzsbVar3.zzb());
            long max = Math.max(0L, zzg.zzr - (longValue - zzv2));
            long j3 = zzg.zzq;
            if (zzg.zzk.equals(zzg.zzb)) {
                j3 = longValue + max;
            }
            zzb = zzg.zzb(zzsbVar3, longValue, longValue, longValue, max, zzg.zzh, zzg.zzi, zzg.zzj);
            zzb.zzq = j3;
        }
        return zzb;
    }

    private final zzjr zzao(zzjq zzjqVar) {
        int zzag = zzag();
        zzix zzixVar = this.zzk;
        return new zzjr(zzixVar, zzjqVar, this.zzaf.zza, zzag == -1 ? 0 : zzag, this.zzu, zzixVar.zzb());
    }

    public final void zzap(final int i2, final int i3) {
        if (i2 == this.zzR && i3 == this.zzS) {
            return;
        }
        this.zzR = i2;
        this.zzS = i3;
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(24, new zzdj() { // from class: com.google.android.gms.internal.ads.zzht
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                int i4 = i2;
                int i5 = i3;
                int i6 = zzin.zzd;
                ((zzby) obj).zzr(i4, i5);
            }
        });
        zzdmVar.zzc();
    }

    private final void zzaq(int i2, int i3, Object obj) {
        zzju[] zzjuVarArr = this.zzh;
        int length = zzjuVarArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzju zzjuVar = zzjuVarArr[i4];
            if (zzjuVar.zzb() == i2) {
                zzjr zzao = zzao(zzjuVar);
                zzao.zzf(i3);
                zzao.zze(obj);
                zzao.zzd();
            }
        }
    }

    public final void zzar() {
        zzaq(1, 2, Float.valueOf(this.zzy.zza() * this.zzX));
    }

    public final void zzas(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        zzju[] zzjuVarArr = this.zzh;
        int length = zzjuVarArr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= 2) {
                break;
            }
            zzju zzjuVar = zzjuVarArr[i2];
            if (zzjuVar.zzb() == 2) {
                zzjr zzao = zzao(zzjuVar);
                zzao.zzf(1);
                zzao.zze(obj);
                zzao.zzd();
                arrayList.add(zzao);
            }
            i2++;
        }
        Object obj2 = this.zzO;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((zzjr) it.next()).zzi(this.zzC);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (z) {
            zzat(false, zzgu.zzd(new zziz(3), FiamWindowManager.DEFAULT_TYPE));
        }
    }

    private final void zzat(boolean z, zzgu zzguVar) {
        zzjo zzjoVar = this.zzaf;
        zzjo zza = zzjoVar.zza(zzjoVar.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0L;
        zzjo zzf = zza.zzf(1);
        if (zzguVar != null) {
            zzf = zzf.zze(zzguVar);
        }
        zzjo zzjoVar2 = zzf;
        this.zzD++;
        this.zzk.zzo();
        zzav(zzjoVar2, 0, 1, false, zzjoVar2.zza.zzo() && !this.zzaf.zza.zzo(), 4, zzai(zzjoVar2), -1);
    }

    public final void zzau(boolean z, int i2, int i3) {
        int i4 = 0;
        boolean z2 = z && i2 != -1;
        if (z2 && i2 != 1) {
            i4 = 1;
        }
        zzjo zzjoVar = this.zzaf;
        if (zzjoVar.zzl == z2 && zzjoVar.zzm == i4) {
            return;
        }
        this.zzD++;
        zzjo zzd2 = zzjoVar.zzd(z2, i4);
        this.zzk.zzn(z2, i4);
        zzav(zzd2, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzav(final com.google.android.gms.internal.ads.zzjo r44, final int r45, final int r46, boolean r47, boolean r48, final int r49, long r50, int r52) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzin.zzav(com.google.android.gms.internal.ads.zzjo, int, int, boolean, boolean, int, long, int):void");
    }

    public final void zzaw() {
        int zzh = zzh();
        if (zzh == 2 || zzh == 3) {
            zzax();
            boolean z = this.zzaf.zzp;
            zzq();
            zzq();
        }
    }

    private final void zzax() {
        this.zze.zzb();
        if (Thread.currentThread() != this.zzs.getThread()) {
            String zzH = zzeg.zzH("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.zzs.getThread().getName());
            if (!this.zzaa) {
                zzdn.zzb("ExoPlayerImpl", zzH, this.zzab ? null : new IllegalStateException());
                this.zzab = true;
                return;
            }
            throw new IllegalStateException(zzH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzay(zzjo zzjoVar) {
        return zzjoVar.zze == 3 && zzjoVar.zzl && zzjoVar.zzm == 0;
    }

    public final zzgu zzA() {
        zzax();
        return this.zzaf.zzf;
    }

    public final void zzR(zzkl zzklVar) {
        Objects.requireNonNull(zzklVar);
        this.zzr.zzw(zzklVar);
    }

    public final /* synthetic */ void zzS(zziv zzivVar) {
        long j2;
        boolean z;
        long j3;
        int i2 = this.zzD - zzivVar.zzb;
        this.zzD = i2;
        boolean z2 = true;
        if (zzivVar.zzc) {
            this.zzE = zzivVar.zzd;
            this.zzF = true;
        }
        if (zzivVar.zze) {
            this.zzG = zzivVar.zzf;
        }
        if (i2 == 0) {
            zzci zzciVar = zzivVar.zza.zza;
            if (!this.zzaf.zza.zzo() && zzciVar.zzo()) {
                this.zzag = -1;
                this.zzah = 0L;
            }
            if (!zzciVar.zzo()) {
                List zzw = ((zzjs) zzciVar).zzw();
                zzcw.zzf(zzw.size() == this.zzo.size());
                for (int i3 = 0; i3 < zzw.size(); i3++) {
                    ((zzim) this.zzo.get(i3)).zzb = (zzci) zzw.get(i3);
                }
            }
            if (this.zzF) {
                if (zzivVar.zza.zzb.equals(this.zzaf.zzb) && zzivVar.zza.zzd == this.zzaf.zzs) {
                    z2 = false;
                }
                if (z2) {
                    if (!zzciVar.zzo() && !zzivVar.zza.zzb.zzb()) {
                        zzjo zzjoVar = zzivVar.zza;
                        zzsb zzsbVar = zzjoVar.zzb;
                        j3 = zzjoVar.zzd;
                        zzak(zzciVar, zzsbVar, j3);
                    } else {
                        j3 = zzivVar.zza.zzd;
                    }
                    z = z2;
                    j2 = j3;
                } else {
                    j2 = -9223372036854775807L;
                    z = z2;
                }
            } else {
                j2 = -9223372036854775807L;
                z = false;
            }
            this.zzF = false;
            zzav(zzivVar.zza, 1, this.zzG, false, z, this.zzE, j2, -1);
        }
    }

    public final /* synthetic */ void zzT(final zziv zzivVar) {
        this.zzj.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhr
            @Override // java.lang.Runnable
            public final void run() {
                zzin.this.zzS(zzivVar);
            }
        });
    }

    public final /* synthetic */ void zzU(zzby zzbyVar) {
        zzbyVar.zza(this.zzI);
    }

    public final void zzW() {
        zzax();
        boolean zzq = zzq();
        int zzb = this.zzy.zzb(zzq, 2);
        zzau(zzq, zzb, zzah(zzq, zzb));
        zzjo zzjoVar = this.zzaf;
        if (zzjoVar.zze != 1) {
            return;
        }
        zzjo zze = zzjoVar.zze(null);
        zzjo zzf = zze.zzf(true == zze.zza.zzo() ? 4 : 2);
        this.zzD++;
        this.zzk.zzk();
        zzav(zzf, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final void zzX() {
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzeg.zze;
        String zza = zzbc.zza();
        StringBuilder F = a.F("Release ", hexString, " [AndroidXMedia3/1.0.0-alpha03] [", str, "] [");
        F.append(zza);
        F.append("]");
        Log.i("ExoPlayerImpl", F.toString());
        zzax();
        if (zzeg.zza < 21 && (audioTrack = this.zzN) != null) {
            audioTrack.release();
            this.zzN = null;
        }
        this.zzz.zze();
        this.zzy.zzd();
        if (!this.zzk.zzp()) {
            zzdm zzdmVar = this.zzl;
            zzdmVar.zzd(10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhs
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj) {
                    ((zzby) obj).zzl(zzgu.zzd(new zziz(1), FiamWindowManager.DEFAULT_TYPE));
                }
            });
            zzdmVar.zzc();
        }
        this.zzl.zze();
        this.zzj.zzd(null);
        this.zzt.zzf(this.zzr);
        zzjo zzf = this.zzaf.zzf(1);
        this.zzaf = zzf;
        zzjo zza2 = zzf.zza(zzf.zzb);
        this.zzaf = zza2;
        zza2.zzq = zza2.zzs;
        this.zzaf.zzr = 0L;
        this.zzr.zzQ();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        this.zzZ = zzfrh.zzo();
    }

    public final void zzY(zzkl zzklVar) {
        this.zzr.zzR(zzklVar);
    }

    public final void zzZ(zzsd zzsdVar) {
        zzax();
        List singletonList = Collections.singletonList(zzsdVar);
        zzax();
        zzax();
        zzag();
        zzl();
        this.zzD++;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                this.zzo.remove(i2);
            }
            this.zzaj = this.zzaj.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < singletonList.size(); i3++) {
            zzjl zzjlVar = new zzjl((zzsd) singletonList.get(i3), this.zzp);
            arrayList.add(zzjlVar);
            this.zzo.add(i3, new zzim(zzjlVar.zzb, zzjlVar.zza.zzA()));
        }
        this.zzaj = this.zzaj.zzg(0, arrayList.size());
        zzjs zzjsVar = new zzjs(this.zzo, this.zzaj, null);
        if (!zzjsVar.zzo() && zzjsVar.zzc() < 0) {
            throw new zzae(zzjsVar, -1, -9223372036854775807L);
        }
        int zzg = zzjsVar.zzg(false);
        zzjo zzan = zzan(this.zzaf, zzjsVar, zzal(zzjsVar, zzg, -9223372036854775807L));
        int i4 = zzan.zze;
        if (zzg != -1 && i4 != 1) {
            i4 = (zzjsVar.zzo() || zzg >= zzjsVar.zzc()) ? 4 : 2;
        }
        zzjo zzf = zzan.zzf(i4);
        this.zzk.zzq(arrayList, zzg, zzeg.zzv(-9223372036854775807L), this.zzaj);
        zzav(zzf, 0, 1, false, (this.zzaf.zzb.zza.equals(zzf.zzb.zza) || this.zzaf.zza.zzo()) ? false : true, 4, zzai(zzf), -1);
    }

    public final void zzaa(boolean z) {
        zzax();
        int zzb = this.zzy.zzb(z, zzh());
        zzau(z, zzb, zzah(z, zzb));
    }

    public final void zzab(boolean z) {
        this.zzaa = false;
    }

    public final void zzac(Surface surface) {
        zzax();
        zzas(surface);
        int i2 = surface == null ? 0 : -1;
        zzap(i2, i2);
    }

    public final void zzad(float f2) {
        zzax();
        final float zza = zzeg.zza(f2, 0.0f, 1.0f);
        if (this.zzX == zza) {
            return;
        }
        this.zzX = zza;
        zzar();
        zzdm zzdmVar = this.zzl;
        zzdmVar.zzd(22, new zzdj() { // from class: com.google.android.gms.internal.ads.zzhu
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                float f3 = zza;
                int i2 = zzin.zzd;
                ((zzby) obj).zzv(f3);
            }
        });
        zzdmVar.zzc();
    }

    public final void zzae() {
        zzax();
        zzax();
        this.zzy.zzb(zzq(), 1);
        zzat(false, null);
        this.zzZ = zzfrh.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzd() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zze() {
        zzax();
        if (zzs()) {
            return this.zzaf.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzf() {
        zzax();
        int zzag = zzag();
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzg() {
        zzax();
        if (this.zzaf.zza.zzo()) {
            return 0;
        }
        zzjo zzjoVar = this.zzaf;
        return zzjoVar.zza.zza(zzjoVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzh() {
        zzax();
        return this.zzaf.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzi() {
        zzax();
        return this.zzaf.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final int zzj() {
        zzax();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzk() {
        zzax();
        if (zzs()) {
            zzjo zzjoVar = this.zzaf;
            zzjoVar.zza.zzn(zzjoVar.zzb.zza, this.zzn);
            zzjo zzjoVar2 = this.zzaf;
            if (zzjoVar2.zzc == -9223372036854775807L) {
                long j2 = zzjoVar2.zza.zze(zzf(), this.zza, 0L).zzm;
                return zzeg.zzz(0L);
            }
            return zzeg.zzz(0L) + zzeg.zzz(this.zzaf.zzc);
        }
        return zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzl() {
        zzax();
        return zzeg.zzz(zzai(this.zzaf));
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final long zzm() {
        zzax();
        return zzeg.zzz(this.zzaf.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzci zzn() {
        zzax();
        return this.zzaf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final zzct zzo() {
        zzax();
        return this.zzaf.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final void zzp(int i2, long j2) {
        zzax();
        this.zzr.zzx();
        zzci zzciVar = this.zzaf.zza;
        if (i2 >= 0 && (zzciVar.zzo() || i2 < zzciVar.zzc())) {
            this.zzD++;
            if (zzs()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zziv zzivVar = new zziv(this.zzaf);
                zzivVar.zza(1);
                this.zzai.zza.zzT(zzivVar);
                return;
            }
            int i3 = zzh() != 1 ? 2 : 1;
            int zzf = zzf();
            zzjo zzan = zzan(this.zzaf.zzf(i3), zzciVar, zzal(zzciVar, i2, j2));
            this.zzk.zzl(zzciVar, i2, zzeg.zzv(j2));
            zzav(zzan, 0, 1, true, true, 1, zzai(zzan), zzf);
            return;
        }
        throw new zzae(zzciVar, i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzq() {
        zzax();
        return this.zzaf.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzr() {
        zzax();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcb
    public final boolean zzs() {
        zzax();
        return this.zzaf.zzb.zzb();
    }

    public final int zzu() {
        zzax();
        int length = this.zzh.length;
        return 2;
    }

    public final long zzv() {
        zzax();
        if (zzs()) {
            zzjo zzjoVar = this.zzaf;
            if (zzjoVar.zzk.equals(zzjoVar.zzb)) {
                return zzeg.zzz(this.zzaf.zzq);
            }
            return zzw();
        }
        zzax();
        if (this.zzaf.zza.zzo()) {
            return this.zzah;
        }
        zzjo zzjoVar2 = this.zzaf;
        long j2 = 0;
        if (zzjoVar2.zzk.zzd != zzjoVar2.zzb.zzd) {
            return zzeg.zzz(zzjoVar2.zza.zze(zzf(), this.zza, 0L).zzn);
        }
        long j3 = zzjoVar2.zzq;
        if (this.zzaf.zzk.zzb()) {
            zzjo zzjoVar3 = this.zzaf;
            zzjoVar3.zza.zzn(zzjoVar3.zzk.zza, this.zzn).zzh(this.zzaf.zzk.zzb);
        } else {
            j2 = j3;
        }
        zzjo zzjoVar4 = this.zzaf;
        zzak(zzjoVar4.zza, zzjoVar4.zzk, j2);
        return zzeg.zzz(j2);
    }

    public final long zzw() {
        zzax();
        if (!zzs()) {
            zzci zzn = zzn();
            if (zzn.zzo()) {
                return -9223372036854775807L;
            }
            return zzeg.zzz(zzn.zze(zzf(), this.zza, 0L).zzn);
        }
        zzjo zzjoVar = this.zzaf;
        zzsb zzsbVar = zzjoVar.zzb;
        zzjoVar.zza.zzn(zzsbVar.zza, this.zzn);
        return zzeg.zzz(this.zzn.zzg(zzsbVar.zzb, zzsbVar.zzc));
    }
}

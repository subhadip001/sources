package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.ads.internal.util.zzaa;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzaw;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzcg;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbct;
import com.google.android.gms.internal.ads.zzbdi;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzcjn;
import com.google.android.gms.internal.ads.zzclu;
import com.google.android.gms.internal.ads.zzeex;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzt {
    private static final zzt zza = new zzt();
    private final zzcg zzA;
    private final zzcjn zzB;
    private final zzcgi zzC;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzs zzd;
    private final zzclu zze;
    private final zzaa zzf;
    private final zzbbg zzg;
    private final zzcer zzh;
    private final zzab zzi;
    private final zzbct zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbie zzm;
    private final zzaw zzn;
    private final zzcac zzo;
    private final zzbrf zzp;
    private final zzcgb zzq;
    private final zzbsq zzr;
    private final zzbv zzs;
    private final zzx zzt;
    private final zzy zzu;
    private final zzbtv zzv;
    private final zzbw zzw;
    private final zzbxo zzx;
    private final zzbdi zzy;
    private final zzcdn zzz;

    public zzt() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzs zzsVar = new com.google.android.gms.ads.internal.util.zzs();
        zzclu zzcluVar = new zzclu();
        zzaa zzl = zzaa.zzl(Build.VERSION.SDK_INT);
        zzbbg zzbbgVar = new zzbbg();
        zzcer zzcerVar = new zzcer();
        zzab zzabVar = new zzab();
        zzbct zzbctVar = new zzbct();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbie zzbieVar = new zzbie();
        zzaw zzawVar = new zzaw();
        zzcac zzcacVar = new zzcac();
        zzbrf zzbrfVar = new zzbrf();
        zzcgb zzcgbVar = new zzcgb();
        zzbsq zzbsqVar = new zzbsq();
        zzbv zzbvVar = new zzbv();
        zzx zzxVar = new zzx();
        zzy zzyVar = new zzy();
        zzbtv zzbtvVar = new zzbtv();
        zzbw zzbwVar = new zzbw();
        zzeex zzeexVar = new zzeex();
        zzbdi zzbdiVar = new zzbdi();
        zzcdn zzcdnVar = new zzcdn();
        zzcg zzcgVar = new zzcg();
        zzcjn zzcjnVar = new zzcjn();
        zzcgi zzcgiVar = new zzcgi();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = zzcluVar;
        this.zzf = zzl;
        this.zzg = zzbbgVar;
        this.zzh = zzcerVar;
        this.zzi = zzabVar;
        this.zzj = zzbctVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbieVar;
        this.zzn = zzawVar;
        this.zzo = zzcacVar;
        this.zzp = zzbrfVar;
        this.zzq = zzcgbVar;
        this.zzr = zzbsqVar;
        this.zzs = zzbvVar;
        this.zzt = zzxVar;
        this.zzu = zzyVar;
        this.zzv = zzbtvVar;
        this.zzw = zzbwVar;
        this.zzx = zzeexVar;
        this.zzy = zzbdiVar;
        this.zzz = zzcdnVar;
        this.zzA = zzcgVar;
        this.zzB = zzcjnVar;
        this.zzC = zzcgiVar;
    }

    public static Clock zzA() {
        return zza.zzk;
    }

    public static zze zza() {
        return zza.zzl;
    }

    public static zzbbg zzb() {
        return zza.zzg;
    }

    public static zzbct zzc() {
        return zza.zzj;
    }

    public static zzbdi zzd() {
        return zza.zzy;
    }

    public static zzbie zze() {
        return zza.zzm;
    }

    public static zzbsq zzf() {
        return zza.zzr;
    }

    public static zzbtv zzg() {
        return zza.zzv;
    }

    public static zzbxo zzh() {
        return zza.zzx;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zzi() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzj() {
        return zza.zzc;
    }

    public static zzx zzk() {
        return zza.zzt;
    }

    public static zzy zzl() {
        return zza.zzu;
    }

    public static zzcac zzm() {
        return zza.zzo;
    }

    public static zzcdn zzn() {
        return zza.zzz;
    }

    public static zzcer zzo() {
        return zza.zzh;
    }

    public static com.google.android.gms.ads.internal.util.zzs zzp() {
        return zza.zzd;
    }

    public static zzaa zzq() {
        return zza.zzf;
    }

    public static zzab zzr() {
        return zza.zzi;
    }

    public static zzaw zzs() {
        return zza.zzn;
    }

    public static zzbv zzt() {
        return zza.zzs;
    }

    public static zzbw zzu() {
        return zza.zzw;
    }

    public static zzcg zzv() {
        return zza.zzA;
    }

    public static zzcgb zzw() {
        return zza.zzq;
    }

    public static zzcgi zzx() {
        return zza.zzC;
    }

    public static zzcjn zzy() {
        return zza.zzB;
    }

    public static zzclu zzz() {
        return zza.zze;
    }
}

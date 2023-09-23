package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbw {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfg zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbko zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzbz zzl;
    private zzbqr zzn;
    private zzemc zzq;
    private com.google.android.gms.ads.internal.client.zzcd zzs;
    private int zzm = 1;
    private final zzfbm zzo = new zzfbm();
    private boolean zzp = false;
    private boolean zzr = false;

    public static /* bridge */ /* synthetic */ String zzH(zzfbw zzfbwVar) {
        return zzfbwVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzJ(zzfbw zzfbwVar) {
        return zzfbwVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzK(zzfbw zzfbwVar) {
        return zzfbwVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzfbw zzfbwVar) {
        return zzfbwVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzfbw zzfbwVar) {
        return zzfbwVar.zzr;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzfbw zzfbwVar) {
        return zzfbwVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcd zzP(zzfbw zzfbwVar) {
        return zzfbwVar.zzs;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfbw zzfbwVar) {
        return zzfbwVar.zzm;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzb(zzfbw zzfbwVar) {
        return zzfbwVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzc(zzfbw zzfbwVar) {
        return zzfbwVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zzd(zzfbw zzfbwVar) {
        return zzfbwVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzf(zzfbw zzfbwVar) {
        return zzfbwVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzh(zzfbw zzfbwVar) {
        return zzfbwVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzbz zzi(zzfbw zzfbwVar) {
        return zzfbwVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzfg zzj(zzfbw zzfbwVar) {
        return zzfbwVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbko zzk(zzfbw zzfbwVar) {
        return zzfbwVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbqr zzl(zzfbw zzfbwVar) {
        return zzfbwVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzemc zzm(zzfbw zzfbwVar) {
        return zzfbwVar.zzq;
    }

    public static /* bridge */ /* synthetic */ zzfbm zzn(zzfbw zzfbwVar) {
        return zzfbwVar.zzo;
    }

    public final zzfbw zzA(zzbko zzbkoVar) {
        this.zzh = zzbkoVar;
        return this;
    }

    public final zzfbw zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfbw zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfbw zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfbw zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfbw zzF(com.google.android.gms.ads.internal.client.zzfg zzfgVar) {
        this.zzd = zzfgVar;
        return this;
    }

    public final zzfby zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfby(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfbw zzQ(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.zzs = zzcdVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzfbm zzo() {
        return this.zzo;
    }

    public final zzfbw zzp(zzfby zzfbyVar) {
        this.zzo.zza(zzfbyVar.zzo.zza);
        this.zza = zzfbyVar.zzd;
        this.zzb = zzfbyVar.zze;
        this.zzs = zzfbyVar.zzr;
        this.zzc = zzfbyVar.zzf;
        this.zzd = zzfbyVar.zza;
        this.zzf = zzfbyVar.zzg;
        this.zzg = zzfbyVar.zzh;
        this.zzh = zzfbyVar.zzi;
        this.zzi = zzfbyVar.zzj;
        zzq(zzfbyVar.zzl);
        zzD(zzfbyVar.zzm);
        this.zzp = zzfbyVar.zzp;
        this.zzq = zzfbyVar.zzc;
        this.zzr = zzfbyVar.zzq;
        return this;
    }

    public final zzfbw zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfbw zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfbw zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfbw zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfbw zzu(zzemc zzemcVar) {
        this.zzq = zzemcVar;
        return this;
    }

    public final zzfbw zzv(zzbqr zzbqrVar) {
        this.zzn = zzbqrVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfg(false, true, false);
        return this;
    }

    public final zzfbw zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfbw zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfbw zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfbw zzz(int i2) {
        this.zzm = i2;
        return this;
    }
}

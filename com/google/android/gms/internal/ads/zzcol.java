package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcol extends zzett {
    private final zzevf zza;
    private final zzcrb zzb;
    private final zzcol zzc = this;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;
    private final zzgqh zzk;
    private final zzgqh zzl;
    private final zzgqh zzm;
    private final zzgqh zzn;
    private final zzgqh zzo;
    private final zzgqh zzp;
    private final zzgqh zzq;
    private final zzgqh zzr;
    private final zzgqh zzs;
    private final zzgqh zzt;
    private final zzgqh zzu;
    private final zzgqh zzv;
    private final zzgqh zzw;
    private final zzgqh zzx;
    private final zzgqh zzy;
    private final zzgqh zzz;

    public /* synthetic */ zzcol(zzcrb zzcrbVar, zzevf zzevfVar, zzcok zzcokVar) {
        zzgqh zzgqhVar;
        zzcsh zzcshVar;
        zzgqh zzgqhVar2;
        zzgqh zzgqhVar3;
        zzcnx zzcnxVar;
        zzgqh zzgqhVar4;
        zzcsh zzcshVar2;
        zzgqh zzgqhVar5;
        zzgqh zzgqhVar6;
        zzgqh zzgqhVar7;
        zzcsb zzcsbVar;
        zzgqh zzgqhVar8;
        zzcsd zzcsdVar;
        zzcsf zzcsfVar;
        zzgqh zzgqhVar9;
        zzgqh zzgqhVar10;
        zzgqh zzgqhVar11;
        zzcsj zzcsjVar;
        zzgqh zzgqhVar12;
        zzcrz zzcrzVar;
        zzgqh zzgqhVar13;
        zzgqh zzgqhVar14;
        zzgqh zzgqhVar15;
        zzgqh zzgqhVar16;
        this.zzb = zzcrbVar;
        this.zza = zzevfVar;
        zzgqhVar = zzcrbVar.zzF;
        this.zzd = zzgpt.zzc(new zzfhr(zzgqhVar));
        zzevh zzevhVar = new zzevh(zzevfVar);
        this.zze = zzevhVar;
        zzcshVar = zzcsg.zza;
        zzgqhVar2 = zzcrbVar.zzh;
        zzgqhVar3 = zzcrbVar.zzn;
        this.zzf = new zzets(zzcshVar, zzgqhVar2, zzgqhVar3, zzfez.zza(), zzevhVar);
        zzevg zzevgVar = new zzevg(zzevfVar);
        this.zzg = zzevgVar;
        zzcnxVar = zzcnw.zza;
        zzgqhVar4 = zzcrbVar.zzh;
        this.zzh = new zzeub(zzcnxVar, zzgqhVar4, zzevgVar, zzfez.zza());
        zzcshVar2 = zzcsg.zza;
        zzgqhVar5 = zzcrbVar.zzh;
        zzgqhVar6 = zzcrbVar.zzac;
        zzgqhVar7 = zzcrbVar.zzn;
        this.zzi = new zzeum(zzcshVar2, zzevhVar, zzgqhVar5, zzgqhVar6, zzgqhVar7, zzfez.zza(), zzevgVar);
        zzcsbVar = zzcsa.zza;
        zzfez zza = zzfez.zza();
        zzgqhVar8 = zzcrbVar.zzh;
        this.zzj = new zzeuq(zzcsbVar, zza, zzgqhVar8);
        zzcsdVar = zzcsc.zza;
        this.zzk = new zzeux(zzcsdVar, zzfez.zza(), zzevgVar);
        zzcsfVar = zzcse.zza;
        zzgqhVar9 = zzcrbVar.zzn;
        zzgqhVar10 = zzcrbVar.zzh;
        this.zzl = new zzeve(zzcsfVar, zzgqhVar9, zzgqhVar10);
        this.zzm = new zzevv(zzfez.zza());
        zzevi zzeviVar = new zzevi(zzevfVar);
        this.zzn = zzeviVar;
        zzgqhVar11 = zzcrbVar.zzac;
        zzcsjVar = zzcsi.zza;
        zzfez zza2 = zzfez.zza();
        zzgqhVar12 = zzcrbVar.zzn;
        this.zzo = new zzevr(zzgqhVar11, zzeviVar, zzcsjVar, zza2, zzevgVar, zzgqhVar12);
        zzcrzVar = zzcry.zza;
        zzgqhVar13 = zzcrbVar.zzac;
        zzgqhVar14 = zzcrbVar.zzn;
        this.zzp = new zzeug(zzevgVar, zzcrzVar, zzgqhVar13, zzgqhVar14, zzfez.zza());
        zzevj zzevjVar = new zzevj(zzevfVar);
        this.zzq = zzevjVar;
        zzgqh zzc = zzgpt.zzc(zzdvf.zza());
        this.zzr = zzc;
        zzgqh zzc2 = zzgpt.zzc(zzdvd.zza());
        this.zzs = zzc2;
        zzgqh zzc3 = zzgpt.zzc(zzdvh.zza());
        this.zzt = zzc3;
        zzgqh zzc4 = zzgpt.zzc(zzdvj.zza());
        this.zzu = zzc4;
        zzgpx zzc5 = zzgpy.zzc(4);
        zzc5.zzb(zzffy.GMS_SIGNALS, zzc);
        zzc5.zzb(zzffy.BUILD_URL, zzc2);
        zzc5.zzb(zzffy.HTTP, zzc3);
        zzc5.zzb(zzffy.PRE_PROCESS, zzc4);
        zzgpy zzc6 = zzc5.zzc();
        this.zzv = zzc6;
        zzgqhVar15 = zzcrbVar.zzh;
        zzgqh zzc7 = zzgpt.zzc(new zzdvk(zzevjVar, zzgqhVar15, zzfez.zza(), zzc6));
        this.zzw = zzc7;
        zzgqe zza3 = zzgqf.zza(0, 1);
        zza3.zza(zzc7);
        zzgqf zzc8 = zza3.zzc();
        this.zzx = zzc8;
        zzfgh zzfghVar = new zzfgh(zzc8);
        this.zzy = zzfghVar;
        zzfez zza4 = zzfez.zza();
        zzgqhVar16 = zzcrbVar.zzn;
        this.zzz = zzgpt.zzc(new zzfgg(zza4, zzgqhVar16, zzfghVar));
    }

    private final zzetw zze() {
        zzcei zzceiVar = new zzcei();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        String zzd = this.zza.zzd();
        zzgqc.zzb(zzd);
        return new zzetw(zzceiVar, zzfvkVar, zzd, this.zza.zzb(), this.zza.zza(), null);
    }

    private final zzeuz zzf() {
        zzbhj zzbhjVar = new zzbhj();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        List zzf = this.zza.zzf();
        zzgqc.zzb(zzf);
        return new zzeuz(zzbhjVar, zzfvkVar, zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final zzete zza() {
        zzcni zzcniVar;
        zzgqh zzgqhVar;
        zzgqh zzgqhVar2;
        zzcniVar = this.zzb.zza;
        Context zza = zzcniVar.zza();
        zzgqc.zzb(zza);
        zzcef zzcefVar = new zzcef();
        zzceg zzcegVar = new zzceg();
        zzgqhVar = this.zzb.zzaA;
        Object zzb = zzgqhVar.zzb();
        zzetw zze = zze();
        zzeuz zzf = zzf();
        zzgpo zza2 = zzgpt.zza(this.zzf);
        zzgpo zza3 = zzgpt.zza(this.zzh);
        zzgpo zza4 = zzgpt.zza(this.zzi);
        zzgpo zza5 = zzgpt.zza(this.zzj);
        zzgpo zza6 = zzgpt.zza(this.zzk);
        zzgpo zza7 = zzgpt.zza(this.zzl);
        zzgpo zza8 = zzgpt.zza(this.zzm);
        zzgpo zza9 = zzgpt.zza(this.zzo);
        zzgpo zza10 = zzgpt.zza(this.zzp);
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        zzfhq zzfhqVar = (zzfhq) this.zzd.zzb();
        zzgqhVar2 = this.zzb.zzV;
        return zzevm.zza(zza, zzcefVar, zzcegVar, zzb, zze, zzf, zza2, zza3, zza4, zza5, zza6, zza7, zza8, zza9, zza10, zzfvkVar, zzfhqVar, (zzdwg) zzgqhVar2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final zzete zzb() {
        zzcni zzcniVar;
        zzgqh zzgqhVar;
        zzgqh zzgqhVar2;
        zzcni zzcniVar2;
        zzgqh zzgqhVar3;
        zzcni zzcniVar3;
        zzgqh zzgqhVar4;
        zzgqh zzgqhVar5;
        zzgqh zzgqhVar6;
        zzcni zzcniVar4;
        zzcni zzcniVar5;
        zzcni zzcniVar6;
        zzgqh zzgqhVar7;
        zzgqh zzgqhVar8;
        zzgqh zzgqhVar9;
        zzgqh zzgqhVar10;
        zzgqh zzgqhVar11;
        zzgqh zzgqhVar12;
        zzcniVar = this.zzb.zza;
        Context zza = zzcniVar.zza();
        zzgqc.zzb(zza);
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        zzcef zzcefVar = new zzcef();
        zzgqc.zzb(zzfvkVar);
        String zzc = this.zza.zzc();
        zzgqc.zzb(zzc);
        zzeuv zzeuvVar = new zzeuv(zzcefVar, zzfvkVar, zzc, null);
        zzgqhVar = this.zzb.zzn;
        zzerm zzermVar = new zzerm(zzeuvVar, 0L, (ScheduledExecutorService) zzgqhVar.zzb());
        zzbxy zzbxyVar = new zzbxy();
        zzgqhVar2 = this.zzb.zzn;
        zzcniVar2 = this.zzb.zza;
        Context zza2 = zzcniVar2.zza();
        zzgqc.zzb(zza2);
        zzevc zzevcVar = new zzevc(zzbxyVar, (ScheduledExecutorService) zzgqhVar2.zzb(), zza2, null);
        zzgqhVar3 = this.zzb.zzn;
        zzerm zzermVar2 = new zzerm(zzevcVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzde)).longValue(), (ScheduledExecutorService) zzgqhVar3.zzb());
        zzcei zzceiVar = new zzcei();
        zzcniVar3 = this.zzb.zza;
        Context zza3 = zzcniVar3.zza();
        zzgqc.zzb(zza3);
        zzgqhVar4 = this.zzb.zzn;
        zzgqc.zzb(zzfvkVar);
        zzetq zzetqVar = new zzetq(zzceiVar, zza3, (ScheduledExecutorService) zzgqhVar4.zzb(), zzfvkVar, this.zza.zza(), null);
        zzgqhVar5 = this.zzb.zzn;
        zzerm zzermVar3 = new zzerm(zzetqVar, 0L, (ScheduledExecutorService) zzgqhVar5.zzb());
        zzgqc.zzb(zzfvkVar);
        zzevt zzevtVar = new zzevt(zzfvkVar);
        zzgqhVar6 = this.zzb.zzn;
        zzerm zzermVar4 = new zzerm(zzevtVar, 0L, (ScheduledExecutorService) zzgqhVar6.zzb());
        zzevk zzevkVar = new zzetb() { // from class: com.google.android.gms.internal.ads.zzevk
            @Override // com.google.android.gms.internal.ads.zzetb
            public final /* synthetic */ int zza() {
                return 0;
            }

            @Override // com.google.android.gms.internal.ads.zzetb
            public final zzfvj zzb() {
                return zzfva.zzi(new zzeta() { // from class: com.google.android.gms.internal.ads.zzevl
                    @Override // com.google.android.gms.internal.ads.zzeta
                    public final void zzf(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
        zzcniVar4 = this.zzb.zza;
        Context zza4 = zzcniVar4.zza();
        zzgqc.zzb(zza4);
        String zzc2 = this.zza.zzc();
        zzgqc.zzb(zzc2);
        zzgqc.zzb(zzfvkVar);
        zzetz zzetzVar = new zzetz(null, zza4, zzc2, zzfvkVar);
        zzbda zzbdaVar = new zzbda();
        zzgqc.zzb(zzfvkVar);
        zzcniVar5 = this.zzb.zza;
        Context zza5 = zzcniVar5.zza();
        zzgqc.zzb(zza5);
        zzcei zzceiVar2 = new zzcei();
        int zza6 = this.zza.zza();
        zzcniVar6 = this.zzb.zza;
        Context zza7 = zzcniVar6.zza();
        zzgqc.zzb(zza7);
        zzgqhVar7 = this.zzb.zzac;
        zzcer zzcerVar = (zzcer) zzgqhVar7.zzb();
        zzgqhVar8 = this.zzb.zzn;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzgqhVar8.zzb();
        zzgqc.zzb(zzfvkVar);
        String zzc3 = this.zza.zzc();
        zzgqc.zzb(zzc3);
        zzgqhVar9 = this.zzb.zzaA;
        String zzc4 = this.zza.zzc();
        zzgqc.zzb(zzc4);
        zzbco zzbcoVar = new zzbco();
        zzgqhVar10 = this.zzb.zzac;
        zzgqhVar11 = this.zzb.zzn;
        zzgqc.zzb(zzfvkVar);
        zzfrm zzm = zzfrm.zzm(zzermVar, zzermVar2, zzermVar3, zzermVar4, zzevkVar, zzetzVar, new zzeuo(zzbdaVar, zzfvkVar, zza5, null), zzf(), zze(), new zzeuk(zzceiVar2, zza6, zza7, zzcerVar, scheduledExecutorService, zzfvkVar, zzc3, null), (zzetb) zzgqhVar9.zzb(), zzeug.zza(zzc4, zzbcoVar, (zzcer) zzgqhVar10.zzb(), (ScheduledExecutorService) zzgqhVar11.zzb(), zzfvkVar));
        zzfhq zzfhqVar = (zzfhq) this.zzd.zzb();
        zzgqhVar12 = this.zzb.zzV;
        return new zzete(zza, zzfvkVar, zzm, zzfhqVar, (zzdwg) zzgqhVar12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final zzfge zzc() {
        return (zzfge) this.zzz.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final zzfhq zzd() {
        return (zzfhq) this.zzd.zzb();
    }
}

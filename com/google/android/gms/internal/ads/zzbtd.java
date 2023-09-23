package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.Chapter;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtd implements zzbsp {
    private final zzbsr zza;
    private final zzbss zzb;
    private final zzbsl zzc;
    private final String zzd;

    public zzbtd(zzbsl zzbslVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzc = zzbslVar;
        this.zzd = str;
        this.zzb = zzbssVar;
        this.zza = zzbsrVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbtd zzbtdVar, zzbsf zzbsfVar, zzbsm zzbsmVar, Object obj, zzcga zzcgaVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbok.zzo.zzc(uuid, new zzbtc(zzbtdVar, zzbsfVar, zzcgaVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Chapter.KEY_ID, uuid);
            jSONObject.put("args", zzbtdVar.zzb.zzb(obj));
            zzbsmVar.zzl(zzbtdVar.zzd, jSONObject);
        } catch (Exception e2) {
            try {
                zzcgaVar.zze(e2);
                zzcfi.zzh("Unable to invokeJavascript", e2);
            } finally {
                zzbsfVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final zzfvj zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final zzfvj zzb(Object obj) {
        zzcga zzcgaVar = new zzcga();
        zzbsf zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbta(this, zzb, obj, zzcgaVar), new zzbtb(this, zzcgaVar, zzb));
        return zzcgaVar;
    }
}

package com.google.android.gms.internal.ads;

import com.arthenica.ffmpegkit.Chapter;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbtl implements zzfuh {
    private final zzbsr zza;
    private final zzbss zzb;
    private final String zzc = "google.afma.activeView.handleUpdate";
    private final zzfvj zzd;

    public zzbtl(zzfvj zzfvjVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzd = zzfvjVar;
        this.zzb = zzbssVar;
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final zzfvj zza(Object obj) {
        return zzb(obj);
    }

    public final zzfvj zzb(final Object obj) {
        return zzfva.zzn(this.zzd, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzbtj
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj2) {
                return zzbtl.this.zzc(obj, (zzbsm) obj2);
            }
        }, zzcfv.zzf);
    }

    public final /* synthetic */ zzfvj zzc(Object obj, zzbsm zzbsmVar) {
        zzcga zzcgaVar = new zzcga();
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzbok.zzo.zzc(uuid, new zzbtk(this, zzcgaVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Chapter.KEY_ID, uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzl(this.zzc, jSONObject);
        return zzcgaVar;
    }
}

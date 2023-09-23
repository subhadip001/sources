package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaj implements zzfuh {
    private final Executor zza;
    private final zzeai zzb;

    public zzaj(Executor executor, zzeai zzeaiVar) {
        this.zza = executor;
        this.zzb = zzeaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final /* bridge */ /* synthetic */ zzfvj zza(Object obj) {
        final zzbzu zzbzuVar = (zzbzu) obj;
        return zzfva.zzn(this.zzb.zzb(zzbzuVar), new zzfuh() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj2) {
                zzbzu zzbzuVar2 = zzbzu.this;
                zzal zzalVar = new zzal(new JsonReader(new InputStreamReader((InputStream) obj2)));
                try {
                    zzalVar.zzb = zzaw.zzb().zzg(zzbzuVar2.zza).toString();
                } catch (JSONException unused) {
                    zzalVar.zzb = "{}";
                }
                return zzfva.zzi(zzalVar);
            }
        }, this.zza);
    }
}

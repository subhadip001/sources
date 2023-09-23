package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdqx {
    private final Executor zza;
    private final zzcum zzb;
    private final zzdja zzc;

    public zzdqx(Executor executor, zzcum zzcumVar, zzdja zzdjaVar) {
        this.zza = executor;
        this.zzc = zzdjaVar;
        this.zzb = zzcumVar;
    }

    public final void zza(final zzcli zzcliVar) {
        if (zzcliVar == null) {
            return;
        }
        this.zzc.zza(zzcliVar.zzH());
        this.zzc.zzj(new zzbam() { // from class: com.google.android.gms.internal.ads.zzdqt
            @Override // com.google.android.gms.internal.ads.zzbam
            public final void zzc(zzbal zzbalVar) {
                zzcmv zzP = zzcli.this.zzP();
                Rect rect = zzbalVar.zzd;
                zzP.zzo(rect.left, rect.top, false);
            }
        }, this.zza);
        this.zzc.zzj(new zzbam() { // from class: com.google.android.gms.internal.ads.zzdqu
            @Override // com.google.android.gms.internal.ads.zzbam
            public final void zzc(zzbal zzbalVar) {
                zzcli zzcliVar2 = zzcli.this;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzbalVar.zzj ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
                zzcliVar2.zzd("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzj(this.zzb, this.zza);
        this.zzb.zzf(zzcliVar);
        zzcliVar.zzaf("/trackActiveViewUnit", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdqv
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdqx.this.zzb((zzcli) obj, map);
            }
        });
        zzcliVar.zzaf("/untrackActiveViewUnit", new zzbol() { // from class: com.google.android.gms.internal.ads.zzdqw
            @Override // com.google.android.gms.internal.ads.zzbol
            public final void zza(Object obj, Map map) {
                zzdqx.this.zzc((zzcli) obj, map);
            }
        });
    }

    public final /* synthetic */ void zzb(zzcli zzcliVar, Map map) {
        this.zzb.zzb();
    }

    public final /* synthetic */ void zzc(zzcli zzcliVar, Map map) {
        this.zzb.zza();
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdyv {
    private final zzdyi zza;
    private final zzdty zzb;
    private final Object zzc = new Object();
    private final List zzd = new ArrayList();
    private boolean zze;

    public zzdyv(zzdyi zzdyiVar, zzdty zzdtyVar) {
        this.zza = zzdyiVar;
        this.zzb = zzdtyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbqf zzbqfVar = (zzbqf) it.next();
                List list2 = this.zzd;
                String str = zzbqfVar.zza;
                String zzc = this.zzb.zzc(str);
                boolean z = zzbqfVar.zzb;
                list2.add(new zzdyu(str, zzc, z ? 1 : 0, zzbqfVar.zzd, zzbqfVar.zzc));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                    return jSONArray;
                }
            }
            for (zzdyu zzdyuVar : this.zzd) {
                jSONArray.put(zzdyuVar.zza());
            }
            return jSONArray;
        }
    }

    public final void zzc() {
        this.zza.zzs(new zzdyt(this));
    }
}

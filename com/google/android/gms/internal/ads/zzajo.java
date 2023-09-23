package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzajo implements zzaja {
    private final Map zza = new HashMap();
    private final zzain zzb;
    private final BlockingQueue zzc;
    private final zzais zzd;

    public zzajo(zzain zzainVar, BlockingQueue blockingQueue, zzais zzaisVar, byte[] bArr) {
        this.zzd = zzaisVar;
        this.zzb = zzainVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final synchronized void zza(zzajb zzajbVar) {
        String zzj = zzajbVar.zzj();
        List list = (List) this.zza.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzajn.zzb) {
            zzajn.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzajb zzajbVar2 = (zzajb) list.remove(0);
        this.zza.put(zzj, list);
        zzajbVar2.zzu(this);
        try {
            this.zzc.put(zzajbVar2);
        } catch (InterruptedException e2) {
            zzajn.zzb("Couldn't add request to queue. %s", e2.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaja
    public final void zzb(zzajb zzajbVar, zzajh zzajhVar) {
        List<zzajb> list;
        zzaik zzaikVar = zzajhVar.zzb;
        if (zzaikVar != null && !zzaikVar.zza(System.currentTimeMillis())) {
            String zzj = zzajbVar.zzj();
            synchronized (this) {
                list = (List) this.zza.remove(zzj);
            }
            if (list != null) {
                if (zzajn.zzb) {
                    zzajn.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
                }
                for (zzajb zzajbVar2 : list) {
                    this.zzd.zzb(zzajbVar2, zzajhVar, null);
                }
                return;
            }
            return;
        }
        zza(zzajbVar);
    }

    public final synchronized boolean zzc(zzajb zzajbVar) {
        String zzj = zzajbVar.zzj();
        if (this.zza.containsKey(zzj)) {
            List list = (List) this.zza.get(zzj);
            if (list == null) {
                list = new ArrayList();
            }
            zzajbVar.zzm("waiting-for-response");
            list.add(zzajbVar);
            this.zza.put(zzj, list);
            if (zzajn.zzb) {
                zzajn.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
            }
            return true;
        }
        this.zza.put(zzj, null);
        zzajbVar.zzu(this);
        if (zzajn.zzb) {
            zzajn.zza("new request, sending to network %s", zzj);
        }
        return false;
    }
}

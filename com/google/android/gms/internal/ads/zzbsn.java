package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsn implements zzbre, zzbsm {
    private final zzbsm zza;
    private final HashSet zzb = new HashSet();

    public zzbsn(zzbsm zzbsmVar) {
        this.zza = zzbsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrp
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbrd.zzc(this, str, str2);
    }

    public final void zzc() {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbol) simpleEntry.getValue()).toString())));
            this.zza.zzr((String) simpleEntry.getKey(), (zzbol) simpleEntry.getValue());
        }
        this.zzb.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbrc
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbrd.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbre, com.google.android.gms.internal.ads.zzbrc
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbrd.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbrd.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzq(String str, zzbol zzbolVar) {
        this.zza.zzq(str, zzbolVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbolVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void zzr(String str, zzbol zzbolVar) {
        this.zza.zzr(str, zzbolVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbolVar));
    }
}

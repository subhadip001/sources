package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzfke extends zzfkf {
    public final HashSet zza;
    public final JSONObject zzb;
    public final long zzc;

    public zzfke(zzfjx zzfjxVar, HashSet hashSet, JSONObject jSONObject, long j2, byte[] bArr) {
        super(zzfjxVar, null);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j2;
    }
}

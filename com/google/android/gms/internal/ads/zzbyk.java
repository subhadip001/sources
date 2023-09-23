package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbyk extends zzcdv {
    public final /* synthetic */ QueryInfoGenerationCallback zza;

    public zzbyk(zzbyl zzbylVar, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcdw
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new QueryInfo(new com.google.android.gms.ads.internal.client.zzeh(str, bundle, str2)));
    }
}

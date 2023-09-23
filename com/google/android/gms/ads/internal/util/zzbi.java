package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajg;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzcfh;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbi extends zzakg {
    public final /* synthetic */ byte[] zza;
    public final /* synthetic */ Map zzb;
    public final /* synthetic */ zzcfh zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i2, String str, zzajg zzajgVar, zzajf zzajfVar, byte[] bArr, Map map, zzcfh zzcfhVar) {
        super(i2, str, zzajgVar, zzajfVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzcfhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final Map zzl() {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzajb
    public final byte[] zzx() {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzakg, com.google.android.gms.internal.ads.zzajb
    /* renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}

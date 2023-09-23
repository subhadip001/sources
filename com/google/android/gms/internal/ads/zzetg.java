package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzetg implements zzeta {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;

    public zzetg(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, String str3, String str4, String str5, boolean z6, String str6, long j2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z6;
        this.zzm = str6;
        this.zzn = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putBoolean("is_sidewinder", this.zzf);
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle zza = zzfcj.zza(bundle, "device");
        bundle.putBundle("device", zza);
        zza.putString("build", this.zzk);
        zza.putLong("remaining_data_partition_space", this.zzn);
        Bundle zza2 = zzfcj.zza(zza, "browser");
        zza.putBundle("browser", zza2);
        zza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (TextUtils.isEmpty(this.zzj)) {
            return;
        }
        Bundle zza3 = zzfcj.zza(zza, "play_store");
        zza.putBundle("play_store", zza3);
        zza3.putString("package_version", this.zzj);
    }
}

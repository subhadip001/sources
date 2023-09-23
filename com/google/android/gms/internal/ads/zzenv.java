package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.arthenica.ffmpegkit.MediaInformation;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzenv implements zzeta {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzenv(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z, String str2, float f2, int i2, int i3, String str3, boolean z2) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f2;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str3;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        zzfcj.zzg(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfcj.zzg(bundle, "smart_h", "auto", this.zza.zzb == -2);
        Boolean bool = Boolean.TRUE;
        zzfcj.zze(bundle, "ene", bool, this.zza.zzj);
        zzfcj.zzg(bundle, "rafmt", "102", this.zza.zzm);
        zzfcj.zzg(bundle, "rafmt", "103", this.zza.zzn);
        zzfcj.zzg(bundle, "rafmt", "105", this.zza.zzo);
        zzfcj.zze(bundle, "inline_adaptive_slot", bool, this.zzi);
        zzfcj.zze(bundle, "interscroller_slot", bool, this.zza.zzo);
        zzfcj.zzc(bundle, MediaInformation.KEY_FORMAT_PROPERTIES, this.zzb);
        zzfcj.zzg(bundle, "fluid", StreamInformation.KEY_HEIGHT, this.zzc);
        zzfcj.zzg(bundle, "sz", this.zzd, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt("sh", this.zzg);
        String str2 = this.zzh;
        zzfcj.zzg(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(StreamInformation.KEY_HEIGHT, this.zza.zzb);
            bundle2.putInt(StreamInformation.KEY_WIDTH, this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt(StreamInformation.KEY_HEIGHT, zzqVar.zzb);
                bundle3.putInt(StreamInformation.KEY_WIDTH, zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}

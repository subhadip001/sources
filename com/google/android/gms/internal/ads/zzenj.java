package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzenj implements zzeta {
    public final zzfby zza;
    private final long zzb;

    public zzenj(zzfby zzfbyVar, long j2) {
        Preconditions.checkNotNull(zzfbyVar, "the targeting must not be null");
        this.zza = zzfbyVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzeta
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzlVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i2 = this.zza.zzo.zza;
        int i3 = i2 - 1;
        if (i2 != 0) {
            if (i3 == 1) {
                bundle.putBoolean("is_new_rewarded", true);
            } else if (i3 == 2) {
                bundle.putBoolean("is_rewarded_interstitial", true);
            }
            bundle.putLong("start_signals_timestamp", this.zzb);
            zzfcj.zzg(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzlVar.zzb)), zzlVar.zzb != -1);
            zzfcj.zzb(bundle, NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, zzlVar.zzc);
            zzfcj.zzf(bundle, "cust_gender", Integer.valueOf(zzlVar.zzd), zzlVar.zzd != -1);
            zzfcj.zzd(bundle, "kw", zzlVar.zze);
            zzfcj.zzf(bundle, "tag_for_child_directed_treatment", Integer.valueOf(zzlVar.zzg), zzlVar.zzg != -1);
            if (zzlVar.zzf) {
                bundle.putBoolean("test_request", true);
            }
            zzfcj.zzf(bundle, "d_imp_hdr", 1, zzlVar.zza >= 2 && zzlVar.zzh);
            String str = zzlVar.zzi;
            zzfcj.zzg(bundle, "ppid", str, zzlVar.zza >= 2 && !TextUtils.isEmpty(str));
            Location location = zzlVar.zzk;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle2 = new Bundle();
                bundle2.putFloat("radius", valueOf.floatValue());
                bundle2.putLong("lat", valueOf3.longValue());
                bundle2.putLong("long", valueOf4.longValue());
                bundle2.putLong(NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP, valueOf2.longValue());
                bundle.putBundle("uule", bundle2);
            }
            zzfcj.zzc(bundle, ImagesContract.URL, zzlVar.zzl);
            zzfcj.zzd(bundle, "neighboring_content_urls", zzlVar.zzv);
            zzfcj.zzb(bundle, "custom_targeting", zzlVar.zzn);
            zzfcj.zzd(bundle, "category_exclusions", zzlVar.zzo);
            zzfcj.zzc(bundle, "request_agent", zzlVar.zzp);
            zzfcj.zzc(bundle, "request_pkg", zzlVar.zzq);
            zzfcj.zze(bundle, "is_designed_for_families", Boolean.valueOf(zzlVar.zzr), zzlVar.zza >= 7);
            if (zzlVar.zza >= 8) {
                zzfcj.zzf(bundle, "tag_for_under_age_of_consent", Integer.valueOf(zzlVar.zzt), zzlVar.zzt != -1);
                zzfcj.zzc(bundle, "max_ad_content_rating", zzlVar.zzu);
                return;
            }
            return;
        }
        throw null;
    }
}

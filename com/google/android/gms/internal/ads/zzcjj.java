package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.arthenica.ffmpegkit.MediaInformation;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzcjj implements zzbol {
    @Override // com.google.android.gms.internal.ads.zzbol
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchr zzchrVar = (zzchr) obj;
        zzcme zzs = zzchrVar.zzs();
        if (zzs == null) {
            try {
                zzcme zzcmeVar = new zzcme(zzchrVar, Float.parseFloat((String) map.get(MediaInformation.KEY_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzchrVar.zzE(zzcmeVar);
                zzs = zzcmeVar;
            } catch (NullPointerException e2) {
                e = e2;
                zzcfi.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e3) {
                e = e3;
                zzcfi.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(MediaInformation.KEY_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i2 = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i2 = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzcfi.zzm(3)) {
            zzcfi.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + i2 + " , aspectRatio : " + str);
        }
        zzs.zzc(parseFloat2, parseFloat, i2, equals, parseFloat3);
    }
}

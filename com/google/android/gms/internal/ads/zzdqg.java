package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdqg {
    private final Context zza;
    private final zzdpp zzb;
    private final zzaoc zzc;
    private final zzcfo zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbdl zzf;
    private final Executor zzg;
    private final zzbko zzh;
    private final zzdqy zzi;
    private final zzdto zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsj zzl;
    private final zzdwg zzm;
    private final zzfgo zzn;
    private final zzfig zzo;
    private final zzeen zzp;

    public zzdqg(Context context, zzdpp zzdppVar, zzaoc zzaocVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzbdl zzbdlVar, Executor executor, zzfby zzfbyVar, zzdqy zzdqyVar, zzdto zzdtoVar, ScheduledExecutorService scheduledExecutorService, zzdwg zzdwgVar, zzfgo zzfgoVar, zzfig zzfigVar, zzeen zzeenVar, zzdsj zzdsjVar) {
        this.zza = context;
        this.zzb = zzdppVar;
        this.zzc = zzaocVar;
        this.zzd = zzcfoVar;
        this.zze = zzaVar;
        this.zzf = zzbdlVar;
        this.zzg = executor;
        this.zzh = zzfbyVar.zzi;
        this.zzi = zzdqyVar;
        this.zzj = zzdtoVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdwgVar;
        this.zzn = zzfgoVar;
        this.zzo = zzfigVar;
        this.zzp = zzeenVar;
        this.zzl = zzdsjVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzeg zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfrh.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                com.google.android.gms.ads.internal.client.zzeg zzr = zzr(optJSONArray.optJSONObject(i2));
                if (zzr != null) {
                    arrayList.add(zzr);
                }
            }
            return zzfrh.zzm(arrayList);
        }
        return zzfrh.zzo();
    }

    private final com.google.android.gms.ads.internal.client.zzq zzk(int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return com.google.android.gms.ads.internal.client.zzq.zzc();
            }
            i2 = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzq(this.zza, new AdSize(i2, i3));
    }

    private static zzfvj zzl(zzfvj zzfvjVar, Object obj) {
        return zzfva.zzg(zzfvjVar, Exception.class, new zzfuh(null) { // from class: com.google.android.gms.internal.ads.zzdqd
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj2);
                return zzfva.zzi(null);
            }
        }, zzcfv.zzf);
    }

    private static zzfvj zzm(boolean z, final zzfvj zzfvjVar, Object obj) {
        if (z) {
            return zzfva.zzn(zzfvjVar, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdqb
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj2) {
                    return obj2 != null ? zzfvj.this : zzfva.zzh(new zzeio(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcfv.zzf);
        }
        return zzl(zzfvjVar, null);
    }

    private final zzfvj zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfva.zzi(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzfva.zzi(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt(StreamInformation.KEY_WIDTH, -1);
        final int optInt2 = jSONObject.optInt(StreamInformation.KEY_HEIGHT, -1);
        if (z) {
            return zzfva.zzi(new zzbkm(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfva.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                String str = optString;
                return new zzbkm(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), optDouble, optInt, optInt2);
            }
        }, this.zzg), null);
    }

    private final zzfvj zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray != null && jSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = z2 ? jSONArray.length() : 1;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(zzn(jSONArray.optJSONObject(i2), z));
            }
            return zzfva.zzm(zzfva.zze(arrayList), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdqc
                @Override // com.google.android.gms.internal.ads.zzfoi
                public final Object apply(Object obj) {
                    ArrayList arrayList2 = new ArrayList();
                    for (zzbkm zzbkmVar : (List) obj) {
                        if (zzbkmVar != null) {
                            arrayList2.add(zzbkmVar);
                        }
                    }
                    return arrayList2;
                }
            }, this.zzg);
        }
        return zzfva.zzi(Collections.emptyList());
    }

    private final zzfvj zzp(JSONObject jSONObject, zzfbg zzfbgVar, zzfbj zzfbjVar) {
        final zzfvj zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbgVar, zzfbjVar, zzk(jSONObject.optInt(StreamInformation.KEY_WIDTH, 0), jSONObject.optInt(StreamInformation.KEY_HEIGHT, 0)));
        return zzfva.zzn(zzb, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final zzfvj zza(Object obj) {
                zzfvj zzfvjVar = zzfvj.this;
                zzcli zzcliVar = (zzcli) obj;
                if (zzcliVar == null || zzcliVar.zzs() == null) {
                    throw new zzeio(1, "Retrieve video view in html5 ad response failed.");
                }
                return zzfvjVar;
            }
        }, zzcfv.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final com.google.android.gms.ads.internal.client.zzeg zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzeg(optString, optString2);
    }

    public final /* synthetic */ zzbkj zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString(NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbkj(optString, list, zzq, zzq2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ zzfvj zzb(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbg zzfbgVar, zzfbj zzfbjVar, String str, String str2, Object obj) {
        zzcli zza = this.zzj.zza(zzqVar, zzfbgVar, zzfbjVar);
        final zzcfz zza2 = zzcfz.zza(zza);
        zzdsg zzb = this.zzl.zzb();
        zza.zzP().zzL(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzp, this.zzo, this.zzm, this.zzn, null, zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcO)).booleanValue()) {
            zza.zzaf("/getNativeAdViewSignals", zzbok.zzs);
        }
        zza.zzaf("/getNativeClickMeta", zzbok.zzt);
        zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdqa
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzcfz zzcfzVar = zzcfz.this;
                if (z) {
                    zzcfzVar.zzb();
                } else {
                    zzcfzVar.zze(new zzeio(1, "Image Web View failed to load."));
                }
            }
        });
        zza.zzad(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzfvj zzc(String str, Object obj) {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcli zza = zzclu.zza(this.zza, zzcmx.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null);
        final zzcfz zza2 = zzcfz.zza(zza);
        zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdpw
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z) {
                zzcfz.this.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzed)).booleanValue()) {
            zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza.loadData(str, "text/html", "UTF-8");
        }
        return zza2;
    }

    public final zzfvj zzd(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfva.zzi(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfva.zzm(zzo(optJSONArray, false, true), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return zzdqg.this.zza(optJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final zzfvj zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfvj zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbko zzbkoVar = this.zzh;
        return zzo(optJSONArray, zzbkoVar.zzb, zzbkoVar.zzd);
    }

    public final zzfvj zzg(JSONObject jSONObject, String str, final zzfbg zzfbgVar, final zzfbj zzfbjVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhT)).booleanValue()) {
            return zzfva.zzi(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(0);
            if (optJSONObject == null) {
                return zzfva.zzi(null);
            }
            final String optString = optJSONObject.optString("base_url");
            final String optString2 = optJSONObject.optString("html");
            final com.google.android.gms.ads.internal.client.zzq zzk = zzk(optJSONObject.optInt(StreamInformation.KEY_WIDTH, 0), optJSONObject.optInt(StreamInformation.KEY_HEIGHT, 0));
            if (TextUtils.isEmpty(optString2)) {
                return zzfva.zzi(null);
            }
            final zzfvj zzn = zzfva.zzn(zzfva.zzi(null), new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdpy
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    return zzdqg.this.zzb(zzk, zzfbgVar, zzfbjVar, optString, optString2, obj);
                }
            }, zzcfv.zze);
            return zzfva.zzn(zzn, new zzfuh() { // from class: com.google.android.gms.internal.ads.zzdpz
                @Override // com.google.android.gms.internal.ads.zzfuh
                public final zzfvj zza(Object obj) {
                    zzfvj zzfvjVar = zzfvj.this;
                    if (((zzcli) obj) != null) {
                        return zzfvjVar;
                    }
                    throw new zzeio(1, "Retrieve Web View from image ad response failed.");
                }
            }, zzcfv.zzf);
        }
        return zzfva.zzi(null);
    }

    public final zzfvj zzh(JSONObject jSONObject, zzfbg zzfbgVar, zzfbj zzfbjVar) {
        zzfvj zza;
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzfva.zzi(null);
            }
            String optString = optJSONObject.optString("vast_xml");
            boolean z = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhS)).booleanValue() && optJSONObject.has("html")) {
                z = true;
            }
            if (TextUtils.isEmpty(optString)) {
                if (!z) {
                    zzcfi.zzj("Required field 'vast_xml' or 'html' is missing");
                    return zzfva.zzi(null);
                }
            } else if (!z) {
                zza = this.zzi.zza(optJSONObject);
                return zzl(zzfva.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcP)).intValue(), TimeUnit.SECONDS, this.zzk), null);
            }
            zza = zzp(optJSONObject, zzfbgVar, zzfbjVar);
            return zzl(zzfva.zzo(zza, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcP)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        return zzp(zzg, zzfbgVar, zzfbjVar);
    }
}

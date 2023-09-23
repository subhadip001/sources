package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbsw {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbst zza = new zzbsv();
    public static final zzbsr zzb = new zzbsr() { // from class: com.google.android.gms.internal.ads.zzbsu
        @Override // com.google.android.gms.internal.ads.zzbsr
        public final Object zza(JSONObject jSONObject) {
            return zzbsw.zza(jSONObject);
        }
    };

    public static /* synthetic */ InputStream zza(JSONObject jSONObject) {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}

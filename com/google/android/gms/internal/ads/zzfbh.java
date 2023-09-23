package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.arthenica.ffmpegkit.StreamInformation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbh {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfbh(int i2, int i3, boolean z) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = z;
    }

    public static List zza(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (StreamInformation.KEY_WIDTH.equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if (StreamInformation.KEY_HEIGHT.equals(nextName)) {
                    i3 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new zzfbh(i2, i3, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}

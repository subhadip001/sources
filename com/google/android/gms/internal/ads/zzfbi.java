package com.google.android.gms.internal.ads;

import android.util.JsonReader;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfbi {
    private String zza;

    public zzfbi(JsonReader jsonReader) {
        char c;
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            if (hashCode != -1724546052) {
                if (hashCode == 3059181 && nextName.equals("code")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (nextName.equals("description")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                jsonReader.nextInt();
            } else if (c != 1) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        this.zza = str;
    }

    public final String zza() {
        return this.zza;
    }
}

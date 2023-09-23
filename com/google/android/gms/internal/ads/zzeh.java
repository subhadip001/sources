package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeh {
    public static String zza(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static boolean zzb(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean zzc(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str);
    }
}

package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfdy implements zzfdx {
    private final Object[] zza;

    public zzfdy(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, int i2, String str2, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzlVar.zzb));
        }
        if (hashSet.contains(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE)) {
            arrayList.add(zza(zzlVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzlVar.zzc.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzlVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = zzlVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzlVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzlVar.zzi);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            Location location = zzlVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzlVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzlVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzlVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzlVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzlVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzlVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzlVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzlVar.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzwVar != null) {
                arrayList.add(Integer.valueOf(zzwVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = zza((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb.append(obj);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfdx
    public final boolean equals(Object obj) {
        if (obj instanceof zzfdy) {
            return Arrays.equals(this.zza, ((zzfdy) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfdx
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.zza);
        String arrays = Arrays.toString(this.zza);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}

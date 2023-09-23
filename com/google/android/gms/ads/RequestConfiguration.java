package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzcfi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public class RequestConfiguration {
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final List zze;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, MAX_AD_CONTENT_RATING_T, MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    /* loaded from: classes.dex */
    public static class Builder {
        private int zza = -1;
        private int zzb = -1;
        private String zzc = null;
        private final List zzd = new ArrayList();

        public RequestConfiguration build() {
            return new RequestConfiguration(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder setMaxAdContentRating(String str) {
            if (str != null && !"".equals(str)) {
                if (!RequestConfiguration.MAX_AD_CONTENT_RATING_G.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_PG.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_T.equals(str) && !RequestConfiguration.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                    zzcfi.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
                } else {
                    this.zzc = str;
                }
            } else {
                this.zzc = null;
            }
            return this;
        }

        public Builder setTagForChildDirectedTreatment(int i2) {
            if (i2 == -1 || i2 == 0 || i2 == 1) {
                this.zza = i2;
            } else {
                zzcfi.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i2);
            }
            return this;
        }

        public Builder setTagForUnderAgeOfConsent(int i2) {
            if (i2 == -1 || i2 == 0 || i2 == 1) {
                this.zzb = i2;
            } else {
                zzcfi.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i2);
            }
            return this;
        }

        public Builder setTestDeviceIds(List<String> list) {
            this.zzd.clear();
            if (list != null) {
                this.zzd.addAll(list);
            }
            return this;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface MaxAdContentRating {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForChildDirectedTreatment {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface TagForUnderAgeOfConsent {
    }

    public /* synthetic */ RequestConfiguration(int i2, int i3, String str, List list, zze zzeVar) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = str;
        this.zze = list;
    }

    public String getMaxAdContentRating() {
        String str = this.zzd;
        return str == null ? "" : str;
    }

    public int getTagForChildDirectedTreatment() {
        return this.zzb;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.zzc;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.zze);
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setTagForChildDirectedTreatment(this.zzb);
        builder.setTagForUnderAgeOfConsent(this.zzc);
        builder.setMaxAdContentRating(this.zzd);
        builder.setTestDeviceIds(this.zze);
        return builder;
    }
}

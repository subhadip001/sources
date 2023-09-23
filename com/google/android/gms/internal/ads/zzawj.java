package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzawj implements zzawc {
    public final String zze;

    public zzawj(String str) {
        Objects.requireNonNull(str);
        this.zze = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}

package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final class zza extends ReviewInfo {

    /* renamed from: f  reason: collision with root package name */
    public final PendingIntent f1267f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1268g;

    public zza(PendingIntent pendingIntent, boolean z) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.f1267f = pendingIntent;
        this.f1268g = z;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent b() {
        return this.f1267f;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean c() {
        return this.f1268g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f1267f.equals(reviewInfo.b()) && this.f1268g == reviewInfo.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f1267f.hashCode() ^ 1000003) * 1000003) ^ (true != this.f1268g ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f1267f.toString();
        boolean z = this.f1268g;
        StringBuilder sb = new StringBuilder(obj.length() + 40);
        sb.append("ReviewInfo{pendingIntent=");
        sb.append(obj);
        sb.append(", isNoOp=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}

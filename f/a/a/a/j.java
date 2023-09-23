package f.a.a.a;

import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class j {
    public int a;
    public String b;

    public String toString() {
        String zzk = zzb.zzk(this.a);
        String str = this.b;
        return f.a.b.a.a.w(new StringBuilder(String.valueOf(zzk).length() + 32 + String.valueOf(str).length()), "Response Code: ", zzk, ", Debug Message: ", str);
    }
}

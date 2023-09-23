package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqe extends zzaqm {
    private final StackTraceElement[] zzi;

    public zzaqe(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzapcVar, "kMXyn5TCo9Bebr+VtNQhQbsedp0AgYXwXzhxSBLRAfdMLXXtz9tGq6347jNKG6EM", "Ltrx5Q9/za/YLPniDoPXToLTIAd9/kkkFMmYpsE8Gx0=", zzaliVar, i2, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzaou zzaouVar = new zzaou((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzC(zzaouVar.zza.longValue());
                if (zzaouVar.zzb.booleanValue()) {
                    this.zze.zzZ(true != zzaouVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzZ(3);
                }
            }
        }
    }
}

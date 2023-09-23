package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzlw implements zzlj {
    private final zzlm zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzlw(zzlm zzlmVar, String str, Object[] objArr) {
        this.zza = zzlmVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.zzd = i2 | (charAt2 << i3);
                return;
            }
            i2 |= (charAt2 & 8191) << i3;
            i3 += 13;
            i4 = i5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final zzlm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlj
    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}

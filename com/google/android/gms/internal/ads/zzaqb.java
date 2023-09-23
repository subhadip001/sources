package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzaqb extends zzaqm {
    public zzaqb(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "v5TMaM3BNNU2Gsu0TzQsNfceDLIy/IB8059Kr/DXJTJFRNwA+BBaEnm0xJDjetlP", "18t2+sVmBFWOR34FTgk9oqx1qcZI0NwZV8Dtcvfe5eY=", zzaliVar, i2, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        try {
            int i2 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzali zzaliVar = this.zze;
            if (true == booleanValue) {
                i2 = 2;
            }
            zzaliVar.zzab(i2);
        } catch (InvocationTargetException unused) {
            this.zze.zzab(3);
        }
    }
}

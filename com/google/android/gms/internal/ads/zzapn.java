package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapn extends zzaqm {
    public zzapn(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3) {
        super(zzapcVar, "SsRJwzlVc/FD7Gcgkfy2usB8pnbNBUiAfm++VXDvOVBbBVhgo4O90KdNPi86tLTu", "ZZzuwfIygL/edqNYv6TIjIHmhzUDfuWz7Uf43FouJ1g=", zzaliVar, i2, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        this.zze.zzX(3);
        try {
            int i2 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzali zzaliVar = this.zze;
            if (true == booleanValue) {
                i2 = 2;
            }
            zzaliVar.zzX(i2);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfny {
    public static final int zza;
    public static final ClipData zzb;

    static {
        zza = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        zzb = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent zza(Context context, int i2, Intent intent, int i3, int i4) {
        boolean z = true;
        zzfos.zzf((i3 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfos.zzf(intent.getComponent() != null, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzfos.zzf(!zzb(i3, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzb(i3, 67108864)) {
                z = false;
            }
            zzfos.zzf(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzb(i3, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i3);
    }

    private static boolean zzb(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}

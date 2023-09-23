package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzg {
    public static void zza(AudioAttributes.Builder builder, int i2) {
        try {
            builder.getClass().getMethod("setSpatializationBehavior", Integer.TYPE).invoke(builder, Integer.valueOf(i2));
        } catch (Exception unused) {
        }
    }
}

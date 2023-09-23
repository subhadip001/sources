package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import f.a.b.a.a;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzdpp {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdpp(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            long j2 = elapsedRealtime2 - elapsedRealtime;
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder C = a.C("Decoded image w: ", width, " h:", height, " bytes: ");
            C.append(allocationByteCount);
            C.append(" time: ");
            C.append(j2);
            C.append(" on ui thread: ");
            C.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(C.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d2, boolean z, zzaix zzaixVar) {
        byte[] bArr = zzaixVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d2 * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfc)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i2 = options.outWidth * options.outHeight;
            if (i2 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i2 - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzfd)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfvj zzb(String str, final double d2, final boolean z) {
        return zzfva.zzm(this.zza.zza(str), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // com.google.android.gms.internal.ads.zzfoi
            public final Object apply(Object obj) {
                return zzdpp.this.zza(d2, z, (zzaix) obj);
            }
        }, this.zzc);
    }
}

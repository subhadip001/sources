package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfr extends zzek {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzfr(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse("rawresource:///" + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zzf;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e2) {
                    throw new zzfq(null, e2, 2000);
                }
            }
            InputStream inputStream = this.zze;
            int i4 = zzeg.zza;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                if (this.zzf == -1) {
                    return -1;
                }
                throw new zzfq("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j3 = this.zzf;
            if (j3 != -1) {
                this.zzf = j3 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    @Override // com.google.android.gms.internal.ads.zzer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzew r18) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfr.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new zzfq(null, e2, 2000);
                    }
                } finally {
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    throw new zzfq(null, e3, 2000);
                }
            }
        } catch (IOException e4) {
            throw new zzfq(null, e4, 2000);
        }
    }
}

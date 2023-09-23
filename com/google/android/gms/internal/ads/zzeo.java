package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeo extends zzek {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzeo(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zze;
        if (j2 != 0) {
            if (j2 != -1) {
                try {
                    i3 = (int) Math.min(j2, i3);
                } catch (IOException e2) {
                    throw new zzen(e2, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i4 = zzeg.zza;
            int read = fileInputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            long j3 = this.zze;
            if (j3 != -1) {
                this.zze = j3 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final long zzb(zzew zzewVar) {
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long j2;
        try {
            try {
                Uri uri = zzewVar.zza;
                this.zzb = uri;
                zzi(zzewVar);
                if (FirebaseAnalytics.Param.CONTENT.equals(zzewVar.zza.getScheme())) {
                    Bundle bundle = new Bundle();
                    if (zzeg.zza >= 31) {
                        zzem.zza(bundle);
                    }
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i3 != 0 && zzewVar.zzf > length) {
                        throw new zzen(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzewVar.zzf + startOffset) - startOffset;
                    if (skip == zzewVar.zzf) {
                        if (i3 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j2 = -1;
                            } else {
                                j2 = size - channel.position();
                                this.zze = j2;
                                if (j2 < 0) {
                                    throw new zzen(null, 2008);
                                }
                            }
                        } else {
                            j2 = length - skip;
                            this.zze = j2;
                            if (j2 < 0) {
                                throw new zzen(null, 2008);
                            }
                        }
                        long j3 = zzewVar.zzg;
                        if (j3 != -1) {
                            if (j2 != -1) {
                                j3 = Math.min(j2, j3);
                            }
                            this.zze = j3;
                        }
                        this.zzf = true;
                        zzj(zzewVar);
                        long j4 = zzewVar.zzg;
                        return j4 != -1 ? j4 : this.zze;
                    }
                    throw new zzen(null, 2008);
                }
                i2 = 2000;
                try {
                    throw new zzen(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
                } catch (IOException e2) {
                    e = e2;
                    if (true == (e instanceof FileNotFoundException)) {
                        i2 = 2005;
                    }
                    throw new zzen(e, i2);
                }
            } catch (zzen e3) {
                throw e3;
            }
        } catch (IOException e4) {
            e = e4;
            i2 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new zzen(e2, 2000);
                    }
                } finally {
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e3) {
                    throw new zzen(e3, 2000);
                }
            }
        } catch (IOException e4) {
            throw new zzen(e4, 2000);
        }
    }
}

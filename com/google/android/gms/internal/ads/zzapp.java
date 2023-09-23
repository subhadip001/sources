package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapp extends zzaqm {
    private static final zzaqn zzi = new zzaqn();
    private final Context zzj;

    public zzapp(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i2, int i3, Context context, zzalb zzalbVar) {
        super(zzapcVar, "6KajZmcYwPk97o69y3/8CosRO2vflLPmhfB/7uFZZjZTcDZPA4m8Z0FbsMb3ZORr", "ebsUU9Ppqfz4PifIRFfiICzwWhwX2B63IgcdBHgXQC8=", zzaliVar, i2, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaly zzc = this.zzb.zzc();
            if (zzc == null || !zzc.zzag()) {
                return null;
            }
            return zzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqm
    public final void zza() {
        Boolean bool;
        int i2;
        zzamo zzamoVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzamo zzamoVar2 = (zzamo) zza.get();
            if (zzamoVar2 == null || zzapf.zzg(zzamoVar2.zza) || zzamoVar2.zza.equals("E") || zzamoVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzapf.zzg(null)) {
                    if (!zzapf.zzg(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i2 = (bool.booleanValue() && this.zzb.zzp()) ? 4 : 3;
                } else {
                    i2 = 5;
                }
                Boolean valueOf = Boolean.valueOf(i2 == 3);
                Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbW);
                String zzb = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbV)).booleanValue() ? zzb() : null;
                if (bool2.booleanValue() && this.zzb.zzp() && zzapf.zzg(zzb)) {
                    zzb = zzc();
                }
                zzamo zzamoVar3 = new zzamo((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzapf.zzg(zzamoVar3.zza) || zzamoVar3.zza.equals("E")) {
                    int i3 = i2 - 1;
                    if (i3 == 3) {
                        String zzc = zzc();
                        if (!zzapf.zzg(zzc)) {
                            zzamoVar3.zza = zzc;
                        }
                    } else if (i3 == 4) {
                        throw null;
                    }
                }
                zza.set(zzamoVar3);
            }
            zzamoVar = (zzamo) zza.get();
        }
        synchronized (this.zze) {
            if (zzamoVar != null) {
                this.zze.zzu(zzamoVar.zza);
                this.zze.zzU(zzamoVar.zzb);
                this.zze.zzW(zzamoVar.zzc);
                this.zze.zzh(zzamoVar.zzd);
                this.zze.zzt(zzamoVar.zze);
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzapf.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbX));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzapf.zzi((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbY)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
                final zzfvr zzf = zzfvr.zzf();
                context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzaqo
                    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                    public final void onChecksumsReady(List list) {
                        zzfvr zzfvrVar = zzfvr.this;
                        if (list == null) {
                            zzfvrVar.zzd(null);
                            return;
                        }
                        try {
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ApkChecksum apkChecksum = (ApkChecksum) list.get(i2);
                                if (apkChecksum.getType() == 8) {
                                    zzfvrVar.zzd(zzapf.zzc(apkChecksum.getValue()));
                                    return;
                                }
                            }
                            zzfvrVar.zzd(null);
                        } catch (Throwable unused) {
                            zzfvrVar.zzd(null);
                        }
                    }
                });
                return (String) zzf.get();
            }
            return null;
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}

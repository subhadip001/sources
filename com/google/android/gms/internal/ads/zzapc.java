package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzapc {
    private static final String zzd = "zzapc";
    public final Context zza;
    private ExecutorService zze;
    private DexClassLoader zzf;
    private zzaoi zzg;
    private byte[] zzh;
    private final boolean zzl;
    private zzanx zzo;
    private final Map zzp;
    private zzaov zzr;
    private volatile AdvertisingIdClient zzi = null;
    private volatile boolean zzj = false;
    private Future zzk = null;
    private volatile zzaly zzm = null;
    private Future zzn = null;
    public boolean zzb = false;
    public boolean zzc = false;
    private boolean zzq = false;

    private zzapc(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.zzl = applicationContext != null;
        context = applicationContext != null ? applicationContext : context;
        this.zza = context;
        this.zzp = new HashMap();
        if (this.zzr != null) {
            return;
        }
        this.zzr = new zzaov(context);
    }

    public static zzapc zzg(Context context, String str, String str2, boolean z) {
        zzaoi zzaoiVar;
        byte[] zzb;
        zzapc zzapcVar = new zzapc(context);
        try {
            zzapcVar.zze = Executors.newCachedThreadPool(new zzaoy());
            zzapcVar.zzj = z;
            if (z) {
                zzapcVar.zzk = zzapcVar.zze.submit(new zzaoz(zzapcVar));
            }
            zzapcVar.zze.execute(new zzapb(zzapcVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzapcVar.zzb = googleApiAvailabilityLight.getApkVersion(zzapcVar.zza) > 0;
                zzapcVar.zzc = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzapcVar.zza) == 0;
            } catch (Throwable unused) {
            }
            zzapcVar.zzo(0, true);
            if (zzapf.zzf() && ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcu)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzaoiVar = new zzaoi(null);
            zzapcVar.zzg = zzaoiVar;
            try {
                try {
                    zzb = zzamn.zzb("RP5LQuE/2876zTvAb2rVm25QfjxwoRyidjQTLjf0RRc=", false);
                } catch (IllegalArgumentException e2) {
                    throw new zzaoh(zzaoiVar, e2);
                }
            } catch (zzaoh e3) {
                throw new zzaot(e3);
            }
        } catch (zzaot unused2) {
        }
        if (zzb.length == 32) {
            byte[] bArr = new byte[16];
            ByteBuffer.wrap(zzb, 4, 16).get(bArr);
            for (int i2 = 0; i2 < 16; i2++) {
                bArr[i2] = (byte) (bArr[i2] ^ 68);
            }
            zzapcVar.zzh = bArr;
            try {
                try {
                    File cacheDir = zzapcVar.zza.getCacheDir();
                    if (cacheDir == null && (cacheDir = zzapcVar.zza.getDir("dex", 0)) == null) {
                        throw new zzaot();
                    }
                    File file = new File(String.format("%s/%s.jar", cacheDir, "1644353911296"));
                    if (!file.exists()) {
                        byte[] zzb2 = zzapcVar.zzg.zzb(zzapcVar.zzh, "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");
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        fileOutputStream.write(zzb2, 0, zzb2.length);
                        fileOutputStream.close();
                    }
                    zzapcVar.zzx(cacheDir, "1644353911296");
                    try {
                        zzapcVar.zzf = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzapcVar.zza.getClassLoader());
                        zzy(file);
                        zzapcVar.zzw(cacheDir, "1644353911296");
                        zzz(String.format("%s/%s.dex", cacheDir, "1644353911296"));
                        zzapcVar.zzo = new zzanx(zzapcVar);
                        zzapcVar.zzq = true;
                        return zzapcVar;
                    } catch (Throwable th) {
                        zzy(file);
                        zzapcVar.zzw(cacheDir, "1644353911296");
                        zzz(String.format("%s/%s.dex", cacheDir, "1644353911296"));
                        throw th;
                    }
                } catch (FileNotFoundException e4) {
                    throw new zzaot(e4);
                } catch (NullPointerException e5) {
                    throw new zzaot(e5);
                }
            } catch (zzaoh e6) {
                throw new zzaot(e6);
            } catch (IOException e7) {
                throw new zzaot(e7);
            }
        }
        throw new zzaoh(zzaoiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        try {
            if (this.zzi == null && this.zzl) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zza);
                advertisingIdClient.start();
                this.zzi = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzi = null;
        }
    }

    private final void zzw(File file, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1644353911296"));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, "1644353911296"));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    zzy(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                zzamb zza = zzamc.zza();
                zza.zzc(zzgjg.zzv(Build.VERSION.SDK.getBytes()));
                zza.zzd(zzgjg.zzv("1644353911296".getBytes()));
                byte[] bytes = this.zzg.zza(this.zzh, bArr).getBytes();
                zza.zza(zzgjg.zzv(bytes));
                zza.zzb(zzgjg.zzv(zzamr.zze(bytes)));
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] zzau = ((zzamc) zza.zzaj()).zzau();
                    fileOutputStream.write(zzau, 0, zzau.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    zzy(file3);
                } catch (zzaoh | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    zzy(file3);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    zzy(file3);
                    throw th;
                }
            } catch (zzaoh | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (zzaoh | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    private final boolean zzx(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, "1644353911296"));
        if (file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", file, "1644353911296"));
            if (!file3.exists()) {
                FileInputStream fileInputStream = null;
                try {
                    long length = file2.length();
                    if (length <= 0) {
                        zzy(file2);
                        return false;
                    }
                    byte[] bArr = new byte[(int) length];
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                Log.d(zzd, "Cannot read the cache data.");
                                zzy(file2);
                                try {
                                    fileInputStream2.close();
                                } catch (IOException unused) {
                                }
                                return false;
                            }
                            try {
                                try {
                                    zzamc zzd2 = zzamc.zzd(bArr, zzgka.zza());
                                    if ("1644353911296".equals(new String(zzd2.zzh().zzE())) && Arrays.equals(zzd2.zzf().zzE(), zzamr.zze(zzd2.zze().zzE())) && Arrays.equals(zzd2.zzg().zzE(), Build.VERSION.SDK.getBytes())) {
                                        byte[] zzb = this.zzg.zzb(this.zzh, new String(zzd2.zze().zzE()));
                                        file3.createNewFile();
                                        fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            fileOutputStream.write(zzb, 0, zzb.length);
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException unused2) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException unused3) {
                                            }
                                            return true;
                                        } catch (zzaoh | IOException | NoSuchAlgorithmException unused4) {
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException unused5) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused6) {
                                                }
                                            }
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileInputStream = fileInputStream2;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException unused7) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException unused8) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    zzy(file2);
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException unused9) {
                                    }
                                    return false;
                                } catch (IOException unused10) {
                                    return false;
                                }
                            } catch (NullPointerException unused11) {
                                fileInputStream2.close();
                                return false;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = null;
                        }
                    } catch (zzaoh | IOException | NoSuchAlgorithmException unused12) {
                        fileOutputStream = null;
                    }
                } catch (zzaoh | IOException | NoSuchAlgorithmException unused13) {
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            }
            return false;
        }
        return false;
    }

    private static final void zzy(File file) {
        if (file.exists()) {
            file.delete();
        } else {
            Log.d(zzd, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        }
    }

    private static final void zzz(String str) {
        zzy(new File(str));
    }

    public final int zza() {
        if (this.zzo != null) {
            return zzanx.zzd();
        }
        return Integer.MIN_VALUE;
    }

    public final Context zzb() {
        return this.zza;
    }

    public final zzaly zzc() {
        return this.zzm;
    }

    public final zzanx zzd() {
        return this.zzo;
    }

    public final zzaoi zze() {
        return this.zzg;
    }

    public final zzaov zzf() {
        return this.zzr;
    }

    public final AdvertisingIdClient zzh() {
        if (this.zzj) {
            if (this.zzi != null) {
                return this.zzi;
            }
            Future future = this.zzk;
            if (future != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    this.zzk = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.zzk.cancel(true);
                }
            }
            return this.zzi;
        }
        return null;
    }

    public final DexClassLoader zzi() {
        return this.zzf;
    }

    public final Method zzj(String str, String str2) {
        zzaql zzaqlVar = (zzaql) this.zzp.get(new Pair(str, str2));
        if (zzaqlVar == null) {
            return null;
        }
        return zzaqlVar.zza();
    }

    public final ExecutorService zzk() {
        return this.zze;
    }

    public final Future zzl() {
        return this.zzn;
    }

    public final void zzo(int i2, boolean z) {
        if (this.zzc) {
            Future<?> submit = this.zze.submit(new zzapa(this, i2, true));
            if (i2 == 0) {
                this.zzn = submit;
            }
        }
    }

    public final boolean zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzb;
    }

    public final boolean zzr() {
        return this.zzq;
    }

    public final boolean zzs() {
        return this.zzr.zza();
    }

    public final boolean zzt(String str, String str2, Class... clsArr) {
        if (this.zzp.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzp.put(new Pair(str, str2), new zzaql(this, str, str2, clsArr));
        return true;
    }

    public final byte[] zzu() {
        return this.zzh;
    }
}

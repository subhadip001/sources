package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import e.d.a.a;
import e.d.a.b;
import e.d.a.d;
import e.d.a.e;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzbiw {
    private e zza;
    private b zzb;
    private d zzc;
    private zzbiu zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, LogFileManager.MAX_LOG_SIZE);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i2 = 0; i2 < queryIntentActivities.size(); i2++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgqi.zza(context));
                }
            }
        }
        return false;
    }

    public final e zza() {
        b bVar = this.zzb;
        e eVar = null;
        if (bVar != null) {
            if (this.zza == null) {
                a aVar = new a(bVar);
                try {
                    if (bVar.a.i(aVar)) {
                        eVar = new e(bVar.a, aVar, bVar.b);
                    }
                } catch (RemoteException unused) {
                }
            }
            return this.zza;
        }
        this.zza = eVar;
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzgqi.zza(activity)) != null) {
            zzgqj zzgqjVar = new zzgqj(this, null);
            this.zzc = zzgqjVar;
            Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
            if (!TextUtils.isEmpty(zza)) {
                intent.setPackage(zza);
            }
            activity.bindService(intent, zzgqjVar, 33);
        }
    }

    public final void zzc(b bVar) {
        this.zzb = bVar;
        Objects.requireNonNull(bVar);
        try {
            bVar.a.e(0L);
        } catch (RemoteException unused) {
        }
        zzbiu zzbiuVar = this.zzd;
        if (zzbiuVar != null) {
            zzbiuVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbiu zzbiuVar) {
        this.zzd = zzbiuVar;
    }

    public final void zzf(Activity activity) {
        d dVar = this.zzc;
        if (dVar == null) {
            return;
        }
        activity.unbindService(dVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}

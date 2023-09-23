package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbov {
    public static final Intent zza(Uri uri, Context context, zzaoc zzaocVar, View view) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final Intent zzb(Intent intent, ResolveInfo resolveInfo, Context context, zzaoc zzaocVar, View view) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    @VisibleForTesting
    public static final ResolveInfo zzc(Intent intent, Context context, zzaoc zzaocVar, View view) {
        return zzd(intent, new ArrayList(), context, zzaocVar, view);
    }

    @VisibleForTesting
    public static final ResolveInfo zzd(Intent intent, ArrayList arrayList, Context context, zzaoc zzaocVar, View view) {
        PackageManager packageManager;
        ResolveInfo resolveInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
        if (packageManager == null) {
            return null;
        }
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, LogFileManager.MAX_LOG_SIZE);
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, LogFileManager.MAX_LOG_SIZE);
        if (queryIntentActivities != null && resolveActivity != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= queryIntentActivities.size()) {
                    break;
                } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                    resolveInfo = resolveActivity;
                    break;
                } else {
                    i2++;
                }
            }
        }
        arrayList.addAll(queryIntentActivities);
        return resolveInfo;
    }
}

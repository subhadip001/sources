package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.NetworkType;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcfi;
import e.g0.b;
import e.g0.c;
import e.g0.e;
import e.g0.l;
import e.g0.t.l;
import e.g0.t.s.p;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    private static void zzb(Context context) {
        try {
            l.c(context.getApplicationContext(), new b(new b.a()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            l b = l.b(context);
            Objects.requireNonNull(b);
            ((e.g0.t.t.t.b) b.f2228d).a.execute(new e.g0.t.t.b(b, "offline_ping_sender_work"));
            c.a aVar = new c.a();
            aVar.a = NetworkType.CONNECTED;
            c cVar = new c(aVar);
            l.a aVar2 = new l.a(OfflinePingSender.class);
            aVar2.b.f2342j = cVar;
            aVar2.c.add("offline_ping_sender_work");
            b.a(aVar2.a());
        } catch (IllegalStateException e2) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e2);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        c.a aVar = new c.a();
        aVar.a = NetworkType.CONNECTED;
        c cVar = new c(aVar);
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, str);
        hashMap.put("gws_query_id", str2);
        e eVar = new e(hashMap);
        e.c(eVar);
        l.a aVar2 = new l.a(OfflineNotificationPoster.class);
        p pVar = aVar2.b;
        pVar.f2342j = cVar;
        pVar.f2337e = eVar;
        aVar2.c.add("offline_notification_work");
        try {
            e.g0.t.l.b(context).a(aVar2.a());
            return true;
        } catch (IllegalStateException e2) {
            zzcfi.zzk("Failed to instantiate WorkManager.", e2);
            return false;
        }
    }
}

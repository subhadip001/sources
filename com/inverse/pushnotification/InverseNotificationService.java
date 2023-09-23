package com.inverse.pushnotification;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.inverse.pushnotification.InverseNotificationService;
import f.i.a.f;
import i.l.b.i;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: InverseNotificationService.kt */
/* loaded from: classes2.dex */
public final class InverseNotificationService extends FirebaseMessagingService {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicInteger f1305f = new AtomicInteger(0);

    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(f.i.a.f r22) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inverse.pushnotification.InverseNotificationService.b(f.i.a.f):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent) {
        i.e(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            i.e(extras, "remoteData");
            i.e(extras, "remoteBundle");
            String string = extras.getString("icon");
            String string2 = extras.getString("title");
            String string3 = extras.getString("short_desc");
            String string4 = extras.getString("long_desc");
            String string5 = extras.getString("feature");
            String string6 = extras.getString("package");
            String string7 = extras.getString("channel_id");
            if (string7 == null) {
                string7 = "push_notification";
            }
            String str = string7;
            String string8 = extras.getString("channel_name");
            if (string8 == null) {
                string8 = "Push Notification";
            }
            String str2 = string8;
            String string9 = extras.getString("channel_description");
            if (string9 == null) {
                string9 = "Shows important notification from server.";
            }
            String str3 = string9;
            String string10 = extras.getString("priority");
            if (string10 == null) {
                string10 = "3";
            }
            String str4 = string10;
            String string11 = extras.getString("campaign");
            if (string11 == null) {
                string11 = "push-notification";
            }
            final f fVar = new f(string2, string3, string4, string, string5, string6, extras.getString("deep_link_url"), extras.getString("minimum_app_version_code"), str, str2, str3, str4, string11);
            new Handler(getMainLooper()).post(new Runnable() { // from class: f.i.a.b
                @Override // java.lang.Runnable
                public final void run() {
                    InverseNotificationService inverseNotificationService = InverseNotificationService.this;
                    f fVar2 = fVar;
                    AtomicInteger atomicInteger = InverseNotificationService.f1305f;
                    i.e(inverseNotificationService, "this$0");
                    i.e(fVar2, "$pushNotification");
                    inverseNotificationService.b(fVar2);
                }
            });
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        i.e(remoteMessage, "remoteMessage");
        i.e(remoteMessage, "remoteMessage");
        Map<String, String> data = remoteMessage.getData();
        i.d(data, "remoteMessage.data");
        if (!data.isEmpty()) {
            i.e(remoteMessage, "remoteData");
            i.e(remoteMessage, "remoteMessage");
            String str = remoteMessage.getData().get("icon");
            String str2 = remoteMessage.getData().get("title");
            String str3 = remoteMessage.getData().get("short_desc");
            String str4 = remoteMessage.getData().get("long_desc");
            String str5 = remoteMessage.getData().get("feature");
            String str6 = remoteMessage.getData().get("package");
            String str7 = remoteMessage.getData().get("channel_id");
            if (str7 == null) {
                str7 = "push_notification";
            }
            String str8 = str7;
            String str9 = remoteMessage.getData().get("channel_name");
            if (str9 == null) {
                str9 = "Push Notification";
            }
            String str10 = str9;
            String str11 = remoteMessage.getData().get("channel_description");
            if (str11 == null) {
                str11 = "Shows important notification from server.";
            }
            String str12 = str11;
            String str13 = remoteMessage.getData().get("priority");
            if (str13 == null) {
                str13 = "3";
            }
            String str14 = str13;
            String str15 = remoteMessage.getData().get("campaign");
            if (str15 == null) {
                str15 = "push-notification";
            }
            final f fVar = new f(str2, str3, str4, str, str5, str6, remoteMessage.getData().get("deep_link_url"), remoteMessage.getData().get("minimum_app_version_code"), str8, str10, str12, str14, str15);
            new Handler(getMainLooper()).post(new Runnable() { // from class: f.i.a.a
                @Override // java.lang.Runnable
                public final void run() {
                    InverseNotificationService inverseNotificationService = InverseNotificationService.this;
                    f fVar2 = fVar;
                    AtomicInteger atomicInteger = InverseNotificationService.f1305f;
                    i.e(inverseNotificationService, "this$0");
                    i.e(fVar2, "$pushNotification");
                    inverseNotificationService.b(fVar2);
                }
            });
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        i.e(str, FirebaseMessagingService.EXTRA_TOKEN);
        super.onNewToken(str);
    }
}

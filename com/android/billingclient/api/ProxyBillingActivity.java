package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: f  reason: collision with root package name */
    public ResultReceiver f672f;

    /* renamed from: g  reason: collision with root package name */
    public ResultReceiver f673g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f674h;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r7 != r3) goto L60
            f.a.a.a.j r7 = com.google.android.gms.internal.play_billing.zzb.zzh(r9, r2)
            int r7 = r7.a
            r3 = -1
            if (r8 != r3) goto L1a
            if (r7 == 0) goto L18
            r8 = -1
            goto L1a
        L18:
            r7 = 0
            goto L27
        L1a:
            r3 = 85
            java.lang.String r4 = "Activity finished with resultCode "
            java.lang.String r5 = " and billing's responseCode: "
            java.lang.String r8 = f.a.b.a.a.e(r3, r4, r8, r5, r7)
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r8)
        L27:
            android.os.ResultReceiver r8 = r6.f672f
            if (r8 == 0) goto L36
            if (r9 != 0) goto L2e
            goto L32
        L2e:
            android.os.Bundle r0 = r9.getExtras()
        L32:
            r8.send(r7, r0)
            goto L92
        L36:
            android.content.Intent r7 = r6.a()
            if (r9 == 0) goto L5c
            android.os.Bundle r8 = r9.getExtras()
            if (r8 == 0) goto L4a
            android.os.Bundle r8 = r9.getExtras()
            r7.putExtras(r8)
            goto L5c
        L4a:
            java.lang.String r8 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r8)
            r8 = 6
            java.lang.String r9 = "RESPONSE_CODE"
            r7.putExtra(r9, r8)
            java.lang.String r8 = "DEBUG_MESSAGE"
            java.lang.String r9 = "An internal error occurred."
            r7.putExtra(r8, r9)
        L5c:
            r6.sendBroadcast(r7)
            goto L92
        L60:
            r8 = 101(0x65, float:1.42E-43)
            if (r7 != r8) goto L77
            int r7 = com.google.android.gms.internal.play_billing.zzb.zza(r9, r2)
            android.os.ResultReceiver r8 = r6.f673g
            if (r8 == 0) goto L92
            if (r9 != 0) goto L6f
            goto L73
        L6f:
            android.os.Bundle r0 = r9.getExtras()
        L73:
            r8.send(r7, r0)
            goto L92
        L77:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 69
            r8.<init>(r9)
            java.lang.String r9 = "Got onActivityResult with wrong requestCode: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = "; skipping..."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.google.android.gms.internal.play_billing.zzb.zzn(r2, r7)
        L92:
            r6.f674h = r1
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzm("ProxyBillingActivity", "Launching Play Store billing flow");
            try {
                if (getIntent().hasExtra("BUY_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f672f = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f673g = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i2 = 101;
                    this.f674h = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
                    return;
                } else {
                    pendingIntent = null;
                }
                this.f674h = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i2, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e2) {
                zzb.zzo("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e2);
                ResultReceiver resultReceiver = this.f672f;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f673g;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a = a();
                        a.putExtra("RESPONSE_CODE", 6);
                        a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a);
                    }
                }
                this.f674h = false;
                finish();
                return;
            }
            i2 = 100;
        } else {
            zzb.zzm("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f674h = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f672f = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f673g = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f674h) {
            Intent a = a();
            a.putExtra("RESPONSE_CODE", 1);
            a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(a);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f672f;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f673g;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f674h);
    }
}

package com.video_converter.video_compressor.adControllers;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.inverseai.adhelper.util.AdType;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.RewardedAdManager;
import e.p.c.k;
import e.p.c.n;
import e.s.e;
import e.s.m;
import f.a.b.a.a;
import f.j.a.m.b;
import f.j.a.m.c;
import f.n.a.v.a.j;
import i.l.b.i;
import org.inverseai.cross_promo.activity.RewardedAdActivity;

/* compiled from: RewardedAdManager.kt */
/* loaded from: classes2.dex */
public final class RewardedAdManager implements b, e {

    /* renamed from: f  reason: collision with root package name */
    public boolean f1355f;

    /* renamed from: g  reason: collision with root package name */
    public Handler f1356g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    public boolean f1357h;

    /* renamed from: i  reason: collision with root package name */
    public Runnable f1358i;

    /* renamed from: j  reason: collision with root package name */
    public e.a.e.b<Intent> f1359j;

    /* renamed from: k  reason: collision with root package name */
    public ProgressDialog f1360k;

    @Override // e.s.g
    public void a(m mVar) {
        i.e(mVar, "owner");
        this.f1355f = true;
    }

    @Override // e.s.g
    public void b(m mVar) {
        i.e(mVar, "owner");
    }

    @Override // f.j.a.m.a
    public void c(AdType adType) {
        i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
    }

    @Override // e.s.g
    public void e(m mVar) {
        ProgressDialog progressDialog;
        i.e(mVar, "owner");
        boolean z = false;
        this.f1355f = false;
        ProgressDialog progressDialog2 = this.f1360k;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            z = true;
        }
        if (z && (progressDialog = this.f1360k) != null) {
            progressDialog.dismiss();
        }
        this.f1356g.removeCallbacksAndMessages(null);
    }

    @Override // f.j.a.m.a
    public void f(Context context, AdType adType) {
        i.e(context, "context");
        i.e(adType, "message");
        if (this.f1355f) {
            m(c.a.b(context));
        }
    }

    @Override // f.j.a.m.a
    public void g(Context context, AdType adType) {
        i.e(context, "context");
        i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        if (this.f1357h) {
            FirebaseAnalytics.getInstance(context).logEvent("REWARDED_AD_STATUS", a.S("SUCCEED", "ADMOB"));
            l();
            return;
        }
        o(null);
    }

    @Override // f.j.a.m.a
    public void h(Context context, AdType adType) {
        i.e(context, "context");
        i.e(adType, "message");
    }

    @Override // f.j.a.m.b
    public void i() {
        this.f1357h = true;
        String str = f.n.a.i.b.a;
    }

    @Override // f.j.a.m.a
    public void j(Context context, AdType adType) {
        i.e(context, "context");
        i.e(adType, NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
        Bundle bundle = new Bundle();
        bundle.putString("STARTED", "ADMOB");
        FirebaseAnalytics.getInstance(context).logEvent("REWARDED_AD_STATUS", bundle);
    }

    public final void k(final Context context) {
        i.e(context, "context");
        Log.d("RewardedAdManager", i.g("checkNetworkAndShowRewardedAd: ", Boolean.valueOf(this.f1358i == null)));
        this.f1357h = false;
        this.f1360k = j.j(context, context.getResources().getString(R.string.loading_ad));
        boolean i2 = f.l.b.c.i(context);
        FirebaseAnalytics.getInstance(context).logEvent("REWARDED_AD_STATUS", a.S("REQUESTED", i2 ? "has_internet" : "no_internet"));
        if (i2 && this.f1355f) {
            FirebaseRemoteConfig firebaseRemoteConfig = f.n.a.u.a.e().a;
            if (firebaseRemoteConfig == null ? true : firebaseRemoteConfig.getBoolean("can_show_cross_rewarded_ad")) {
                m(c.a.b(context));
                return;
            }
        }
        k kVar = null;
        if (i2 && this.f1355f) {
            if (f.n.a.c.i.f6918k == null) {
                f.n.a.c.i.f6918k = new f.n.a.c.i(null);
            }
            f.n.a.c.i iVar = f.n.a.c.i.f6918k;
            i.b(iVar);
            if (iVar.a()) {
                if (f.n.a.c.i.f6918k == null) {
                    f.n.a.c.i.f6918k = new f.n.a.c.i(null);
                }
                f.n.a.c.i iVar2 = f.n.a.c.i.f6918k;
                i.b(iVar2);
                iVar2.d(c.a.b(context), this);
                return;
            }
        }
        if (i2 && this.f1355f) {
            if (f.n.a.c.i.f6918k == null) {
                f.n.a.c.i.f6918k = new f.n.a.c.i(null);
            }
            f.n.a.c.i iVar3 = f.n.a.c.i.f6918k;
            i.b(iVar3);
            if (!iVar3.a()) {
                ProgressDialog progressDialog = this.f1360k;
                if (progressDialog != null) {
                    progressDialog.show();
                }
                this.f1356g.postDelayed(new Runnable() { // from class: f.n.a.c.a
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
                        if (r2.isDestroyed() == false) goto L20;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
                    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            r5 = this;
                            com.video_converter.video_compressor.adControllers.RewardedAdManager r0 = com.video_converter.video_compressor.adControllers.RewardedAdManager.this
                            android.content.Context r1 = r2
                            java.lang.String r2 = "this$0"
                            i.l.b.i.e(r0, r2)
                            java.lang.String r2 = "$context"
                            i.l.b.i.e(r1, r2)
                            boolean r2 = r0.f1355f
                            if (r2 == 0) goto L4c
                            boolean r2 = r1 instanceof android.app.Activity
                            r3 = 0
                            if (r2 == 0) goto L27
                            r2 = r1
                            android.app.Activity r2 = (android.app.Activity) r2
                            boolean r4 = r2.isFinishing()
                            if (r4 != 0) goto L28
                            boolean r2 = r2.isDestroyed()
                            if (r2 == 0) goto L27
                            goto L28
                        L27:
                            r3 = 1
                        L28:
                            if (r3 == 0) goto L4c
                            android.app.ProgressDialog r2 = r0.f1360k
                            if (r2 != 0) goto L2f
                            goto L32
                        L2f:
                            r2.dismiss()
                        L32:
                            f.n.a.c.i r2 = f.n.a.c.i.f6918k
                            if (r2 != 0) goto L3e
                            f.n.a.c.i r2 = new f.n.a.c.i
                            r3 = 0
                            r2.<init>(r3)
                            f.n.a.c.i.f6918k = r2
                        L3e:
                            f.n.a.c.i r2 = f.n.a.c.i.f6918k
                            i.l.b.i.b(r2)
                            f.j.a.m.c r3 = f.j.a.m.c.a
                            android.app.Activity r1 = r3.b(r1)
                            r2.d(r1, r0)
                        L4c:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: f.n.a.c.a.run():void");
                    }
                }, 3000L);
                return;
            }
        }
        if (i2) {
            return;
        }
        Activity activity = (Activity) context;
        f.n.a.k.e.a m2 = f.n.a.k.e.a.m(activity.getString(R.string.network_unavailable_msg), activity.getString(R.string.ok));
        i.d(m2, "dialogFactory.networkUnavailableDialog");
        FragmentManager H = ((n) activity).H();
        if (H != null) {
            String string = activity.getResources().getString(R.string.no_internet_connection_error);
            Fragment I = H.I("com.techyourchance.dialoghelper.DIALOG_TAG");
            if (I != null && k.class.isAssignableFrom(I.getClass())) {
                kVar = (k) I;
            }
            if (kVar != null) {
                kVar.dismissAllowingStateLoss();
            }
            Bundle arguments = m2.getArguments() != null ? m2.getArguments() : new Bundle(1);
            arguments.putString("com.techyourchance.dialoghelper.ARGUMENT_DIALOG_ID", string);
            m2.setArguments(arguments);
            e.p.c.a aVar = new e.p.c.a(H);
            aVar.g(0, m2, "com.techyourchance.dialoghelper.DIALOG_TAG", 1);
            aVar.e();
            return;
        }
        throw new IllegalArgumentException("FragmentManager mustn't be null");
    }

    public final void l() {
        Log.d("RewardedAdManager", i.g("executePendingTask: ", Boolean.valueOf(this.f1358i == null)));
        Runnable runnable = this.f1358i;
        if (runnable != null) {
            Handler handler = this.f1356g;
            i.b(runnable);
            handler.post(runnable);
            o(null);
        }
    }

    public final void m(Activity activity) {
        e.a.e.b<Intent> bVar = this.f1359j;
        if (bVar == null) {
            return;
        }
        FirebaseAnalytics.getInstance(activity).logEvent("REWARDED_AD_STATUS", a.S("STARTED", "CROSS_PROMO"));
        bVar.a(new Intent(activity, RewardedAdActivity.class), null);
    }

    public final void n(Context context, Fragment fragment, m mVar) {
        i.e(context, "context");
        i.e(mVar, "lifecycleOwner");
        mVar.getLifecycle().a(this);
        final e.b.c.k kVar = (e.b.c.k) c.a.b(context);
        if (fragment == null) {
            this.f1359j = kVar.f46m.d("rewarded_ad", mVar, new m.b.a.f.a(), new e.a.e.a() { // from class: f.n.a.c.b
                @Override // e.a.e.a
                public final void a(Object obj) {
                    e.b.c.k kVar2 = e.b.c.k.this;
                    RewardedAdManager rewardedAdManager = this;
                    Boolean bool = (Boolean) obj;
                    i.l.b.i.e(kVar2, "$activity");
                    i.l.b.i.e(rewardedAdManager, "this$0");
                    Log.d("RewardedAdManager", i.l.b.i.g("initLauncher: activity ", bool));
                    i.l.b.i.d(bool, "isRewarded");
                    if (bool.booleanValue()) {
                        FirebaseAnalytics.getInstance(kVar2).logEvent("REWARDED_AD_STATUS", f.a.b.a.a.S("SUCCEED", "CROSS_PROMO"));
                        String str = f.n.a.i.b.a;
                        rewardedAdManager.l();
                        return;
                    }
                    rewardedAdManager.o(null);
                }
            });
        } else {
            this.f1359j = fragment.registerForActivityResult(new m.b.a.f.a(), new e.a.e.a() { // from class: f.n.a.c.c
                @Override // e.a.e.a
                public final void a(Object obj) {
                    e.b.c.k kVar2 = e.b.c.k.this;
                    RewardedAdManager rewardedAdManager = this;
                    Boolean bool = (Boolean) obj;
                    i.l.b.i.e(kVar2, "$activity");
                    i.l.b.i.e(rewardedAdManager, "this$0");
                    Log.d("RewardedAdManager", i.l.b.i.g("initLauncher: fragment ", bool));
                    i.l.b.i.d(bool, "isRewarded");
                    if (bool.booleanValue()) {
                        FirebaseAnalytics.getInstance(kVar2).logEvent("REWARDED_AD_STATUS", f.a.b.a.a.S("SUCCEED", "CROSS_PROMO"));
                        String str = f.n.a.i.b.a;
                        rewardedAdManager.l();
                        return;
                    }
                    rewardedAdManager.o(null);
                }
            });
        }
    }

    public final void o(Runnable runnable) {
        Log.d("RewardedAdManager", i.g("setPendingTask: ", Boolean.valueOf(runnable == null)));
        this.f1358i = runnable;
    }

    @Override // e.s.g
    public void onDestroy(m mVar) {
        i.e(mVar, "owner");
    }

    @Override // e.s.g
    public void onStart(m mVar) {
        i.e(mVar, "owner");
        if (f.n.a.c.i.f6918k == null) {
            f.n.a.c.i.f6918k = new f.n.a.c.i(null);
        }
        f.n.a.c.i iVar = f.n.a.c.i.f6918k;
        i.b(iVar);
        i.e(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        iVar.f6923j.add(this);
    }

    @Override // e.s.g
    public void onStop(m mVar) {
        i.e(mVar, "owner");
        if (f.n.a.c.i.f6918k == null) {
            f.n.a.c.i.f6918k = new f.n.a.c.i(null);
        }
        f.n.a.c.i iVar = f.n.a.c.i.f6918k;
        i.b(iVar);
        i.e(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        iVar.f6923j.remove(this);
    }

    public final void p(m mVar) {
        i.e(mVar, "lifecycleOwner");
        e.s.n nVar = (e.s.n) mVar.getLifecycle();
        nVar.d("removeObserver");
        nVar.a.e(this);
    }
}

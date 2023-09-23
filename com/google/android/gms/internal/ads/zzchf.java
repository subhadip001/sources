package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import com.google.firebase.messaging.Constants;
import f.a.b.a.a;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzchf extends FrameLayout implements zzcgw {
    @VisibleForTesting
    public final zzcht zza;
    private final zzchr zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbin zze;
    private final long zzf;
    private final zzcgx zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzchf(Context context, zzchr zzchrVar, int i2, boolean z, zzbin zzbinVar, zzchq zzchqVar) {
        super(context);
        zzcgx zzcgvVar;
        this.zzb = zzchrVar;
        this.zze = zzbinVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzchrVar.zzm());
        zzcgy zzcgyVar = zzchrVar.zzm().zza;
        zzchs zzchsVar = new zzchs(context, zzchrVar.zzp(), zzchrVar.zzu(), zzbinVar, zzchrVar.zzn());
        if (i2 == 2) {
            zzcgvVar = new zzcij(context, zzchsVar, zzchrVar, z, zzcgy.zza(zzchrVar), zzchqVar);
        } else {
            zzcgvVar = new zzcgv(context, zzchrVar, z, zzcgy.zza(zzchrVar), zzchqVar, new zzchs(context, zzchrVar.zzp(), zzchrVar.zzu(), zzbinVar, zzchrVar.zzn()));
        }
        this.zzg = zzcgvVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        if (zzcgvVar != null) {
            frameLayout.addView(zzcgvVar, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzD)).booleanValue()) {
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.bringChildToFront(view);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzA)).booleanValue()) {
                zzm();
            }
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzF)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzC)).booleanValue();
        this.zzk = booleanValue;
        if (zzbinVar != null) {
            zzbinVar.zzd("spinner_used", true != booleanValue ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1");
        }
        this.zza = new zzcht(this);
        if (zzcgvVar != null) {
            zzcgvVar.zzr(this);
        }
        if (zzcgvVar == null) {
            zzb("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private final void zzI() {
        if (this.zzb.zzk() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzk().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzJ(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzK() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() {
        try {
            this.zza.zza();
            final zzcgx zzcgxVar = this.zzg;
            if (zzcgxVar != null) {
                zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcgx.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcha
            @Override // java.lang.Runnable
            public final void run() {
                zzchf.this.zzp(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgw
    public final void onWindowVisibilityChanged(int i2) {
        boolean z;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzche(this, z));
    }

    public final void zzA(int i2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzz(i2);
    }

    public final void zzB(int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzD)).booleanValue()) {
            this.zzc.setBackgroundColor(i2);
            this.zzd.setBackgroundColor(i2);
        }
    }

    public final void zzC(int i2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzA(i2);
    }

    public final void zzD(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzE(int i2, int i3, int i4, int i5) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder C = a.C("Set video bounds to x:", i2, ";y:", i3, ";w:");
            C.append(i4);
            C.append(";h:");
            C.append(i5);
            com.google.android.gms.ads.internal.util.zze.zza(C.toString());
        }
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzF(float f2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzb.zze(f2);
        zzcgxVar.zzn();
    }

    public final void zzG(float f2, float f3) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar != null) {
            zzcgxVar.zzu(f2, f3);
        }
    }

    public final void zzH() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzb.zzd(false);
        zzcgxVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbE)).booleanValue()) {
            this.zza.zza();
        }
        zzJ("ended", new String[0]);
        zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzb(String str, String str2) {
        zzJ(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzc(String str, String str2) {
        zzJ("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzd() {
        zzJ("pause", new String[0]);
        zzI();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbE)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzk() != null && !this.zzi) {
            boolean z = (this.zzb.zzk().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzk().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzf() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar != null && this.zzm == 0) {
            zzJ("canplaythrough", MediaInformation.KEY_DURATION, String.valueOf(zzcgxVar.zzc() / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchb
            @Override // java.lang.Runnable
            public final void run() {
                zzchf.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzK()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzchd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzj(int i2, int i3) {
        if (this.zzk) {
            zzbhq zzbhqVar = zzbhy.zzE;
            int max = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhqVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgw
    public final void zzk() {
        if (this.zzh && zzK()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
        }
        if (elapsedRealtime2 > this.zzf) {
            zzcfi.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbin zzbinVar = this.zze;
            if (zzbinVar != null) {
                zzbinVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    public final void zzm() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        TextView textView = new TextView(zzcgxVar.getContext());
        textView.setText("AdMob - ".concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzn() {
        this.zza.zza();
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar != null) {
            zzcgxVar.zzt();
        }
        zzI();
    }

    public final /* synthetic */ void zzo() {
        zzJ("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzp(boolean z) {
        zzJ("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzq() {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzB(this.zzn, this.zzo);
        } else {
            zzJ("no_src", new String[0]);
        }
    }

    public final void zzr() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzb.zzd(true);
        zzcgxVar.zzn();
    }

    public final void zzs() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        long zza = zzcgxVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f2 = ((float) zza) / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzbB)).booleanValue()) {
            zzJ("timeupdate", NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP, String.valueOf(f2), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
        } else {
            zzJ("timeupdate", NotificationCompat.MessagingStyle.Message.KEY_TIMESTAMP, String.valueOf(f2));
        }
        this.zzl = zza;
    }

    public final void zzt() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzo();
    }

    public final void zzu() {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzp();
    }

    public final void zzv(int i2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzq(i2);
    }

    public final void zzw(MotionEvent motionEvent) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzx(int i2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzw(i2);
    }

    public final void zzy(int i2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzx(i2);
    }

    public final void zzz(int i2) {
        zzcgx zzcgxVar = this.zzg;
        if (zzcgxVar == null) {
            return;
        }
        zzcgxVar.zzy(i2);
    }
}

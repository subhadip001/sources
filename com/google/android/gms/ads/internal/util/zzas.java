package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdyw;
import com.google.android.gms.internal.ads.zzdza;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzas {
    private final Context zza;
    private final zzdza zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzas(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // java.lang.Runnable
            public final void run() {
                zzas.this.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzt().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzt.zzt().zza();
        this.zzb = com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    private final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        zzdyw zzdywVar = zzdyw.NONE;
        int ordinal = this.zzb.zza().ordinal();
        final int i2 = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        AlertDialog.Builder builder = new AlertDialog.Builder(context, com.google.android.gms.ads.internal.zzt.zzq().zza());
        final AtomicInteger atomicInteger = new AtomicInteger(i2);
        builder.setTitle("Setup gesture");
        builder.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i2, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                atomicInteger.set(i3);
            }
        });
        builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                zzas.this.zzr();
            }
        });
        builder.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                zzas.this.zzh(atomicInteger, i2, zzu2, zzu3, dialogInterface, i3);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzas.this.zzr();
            }
        });
        builder.create().show();
    }

    private final boolean zzt(float f2, float f3, float f4, float f5) {
        return Math.abs(this.zzi.x - f2) < ((float) this.zzh) && Math.abs(this.zzi.y - f3) < ((float) this.zzh) && Math.abs(this.zzj.x - f4) < ((float) this.zzh) && Math.abs(this.zzj.y - f5) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z) {
        if (z) {
            list.add(str);
            return list.size() - 1;
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        return a.u(sb, this.zzd, "}");
    }

    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzb() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzc(zzfvk zzfvkVar) {
        if (!com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.zza, this.zzd, this.zze);
        } else {
            zzfvkVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    zzas.this.zzb();
                }
            });
        }
    }

    public final /* synthetic */ void zzd(zzfvk zzfvkVar) {
        if (!com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzt.zzs().zzd(this.zza, this.zzd, this.zze);
        } else {
            zzfvkVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    zzas.this.zzf();
                }
            });
        }
    }

    public final /* synthetic */ void zze() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i2, int i3, int i4, DialogInterface dialogInterface, int i5) {
        if (atomicInteger.get() != i2) {
            if (atomicInteger.get() == i3) {
                this.zzb.zzj(zzdyw.SHAKE);
            } else if (atomicInteger.get() == i4) {
                this.zzb.zzj(zzdyw.FLICK);
            } else {
                this.zzb.zzj(zzdyw.NONE);
            }
        }
        zzr();
    }

    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        zzs.zzI(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzj(int i2, int i3, int i4, int i5, int i6, DialogInterface dialogInterface, int i7) {
        if (i7 != i2) {
            if (i7 == i3) {
                zzcfi.zze("Debug mode [Creative Preview] selected.");
                zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzac
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzas.this.zzl();
                    }
                });
            } else if (i7 == i4) {
                zzcfi.zze("Debug mode [Troubleshooting] selected.");
                zzcfv.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzas.this.zzk();
                    }
                });
            } else if (i7 == i5) {
                final zzfvk zzfvkVar = zzcfv.zze;
                zzfvk zzfvkVar2 = zzcfv.zza;
                if (this.zzb.zzm()) {
                    zzfvkVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.zze();
                        }
                    });
                } else {
                    zzfvkVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzao
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.zzd(zzfvkVar);
                        }
                    });
                }
            } else if (i7 == i6) {
                final zzfvk zzfvkVar3 = zzcfv.zze;
                zzfvk zzfvkVar4 = zzcfv.zza;
                if (this.zzb.zzm()) {
                    zzfvkVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.zza();
                        }
                    });
                } else {
                    zzfvkVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzas.this.zzc(zzfvkVar3);
                        }
                    });
                }
            }
        } else if (!(this.zza instanceof Activity)) {
            zzcfi.zzi("Can not create dialog without Activity Context");
        } else {
            String str = this.zzc;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb = new StringBuilder();
                com.google.android.gms.ads.internal.zzt.zzp();
                Map zzK = zzs.zzK(build);
                for (String str3 : zzK.keySet()) {
                    sb.append(str3);
                    sb.append(" = ");
                    sb.append((String) zzK.get(str3));
                    sb.append("\n\n");
                }
                String trim = sb.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza);
            builder.setMessage(str2);
            builder.setTitle("Ad Information");
            builder.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i8) {
                    zzas.this.zzi(str2, dialogInterface2, i8);
                }
            });
            builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzae
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i8) {
                }
            });
            builder.create().show();
        }
    }

    public final /* synthetic */ void zzk() {
        zzaw zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzs.zzm();
        zzs.zzh(zzs.zzj(context, str, str2));
        if (zzs.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzs.zze(context, str2, str3, str);
            }
            zzcfi.zze("Device is linked for debug signals.");
            zzs.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzs.zzd(context, str, str2);
    }

    public final /* synthetic */ void zzl() {
        zzaw zzs = com.google.android.gms.ads.internal.zzt.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzs.zzk(context, str, str2)) {
            zzs.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(zzs.zza)) {
            zzcfi.zze("Creative is not pushed for this device.");
            zzs.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzs.zza)) {
            zzcfi.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if (CrashlyticsReportDataCapture.SIGNAL_DEFAULT.equals(zzs.zza)) {
            zzcfi.zze("Device is linked for in app preview.");
            zzs.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.zzg;
        if (i2 == -1) {
            return;
        }
        if (i2 == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzdI)).longValue());
            }
        } else if (i2 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i3 = 0; i3 < historySize; i3++) {
                    z |= !zzt(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3));
                }
                if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                zzcfi.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhG)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zza, com.google.android.gms.ads.internal.zzt.zzq().zza());
            builder.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    zzas.this.zzj(zzu, zzu2, zzu3, zzu4, zzu5, dialogInterface, i2);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zze.zzb("", e2);
        }
    }

    public zzas(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}

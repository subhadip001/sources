package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportDataCapture;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfic {
    private final zzeil zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfbt zzf;
    private final Clock zzg;
    private final zzaoc zzh;

    public zzfic(zzeil zzeilVar, zzcfo zzcfoVar, String str, String str2, Context context, zzfbt zzfbtVar, Clock clock, zzaoc zzaocVar) {
        this.zza = zzeilVar;
        this.zzb = zzcfoVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfbtVar;
        this.zzg = clock;
        this.zzh = zzaocVar;
    }

    public static final List zzd(int i2, int i3, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzf((String) it.next(), "@gw_mpe@", a.i("2.", i3)));
        }
        return arrayList;
    }

    private static String zze(String str) {
        return (TextUtils.isEmpty(str) || !zzcfh.zzl()) ? str : "fakeForAdDebugLog";
    }

    private static String zzf(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zza(zzfbs zzfbsVar, zzfbg zzfbgVar, List list) {
        return zzb(zzfbsVar, zzfbgVar, false, "", "", list);
    }

    public final List zzb(zzfbs zzfbsVar, zzfbg zzfbgVar, boolean z, String str, String str2, List list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? CrashlyticsReportDataCapture.SIGNAL_DEFAULT : "1";
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String zzf = zzf(zzf(zzf((String) it.next(), "@gw_adlocid@", zzfbsVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzfbgVar != null) {
                zzf = zzcdp.zzc(zzf(zzf(zzf(zzf, "@gw_qdata@", zzfbgVar.zzz), "@gw_adnetid@", zzfbgVar.zzy), "@gw_allocid@", zzfbgVar.zzx), this.zze, zzfbgVar.zzX);
            }
            String zzf2 = zzf(zzf(zzf(zzf, "@gw_adnetstatus@", this.zza.zzf()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzcE)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zzf2);
                }
            }
            if (this.zzh.zzf(Uri.parse(zzf2))) {
                Uri.Builder buildUpon = Uri.parse(zzf2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zzf2 = buildUpon.build().toString();
            }
            arrayList.add(zzf2);
        }
        return arrayList;
    }

    public final List zzc(zzfbg zzfbgVar, List list, zzcak zzcakVar) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzg.currentTimeMillis();
        try {
            String zzc = zzcakVar.zzc();
            String num = Integer.toString(zzcakVar.zzb());
            zzfbt zzfbtVar = this.zzf;
            String zze = zzfbtVar == null ? "" : zze(zzfbtVar.zza);
            zzfbt zzfbtVar2 = this.zzf;
            String zze2 = zzfbtVar2 != null ? zze(zzfbtVar2.zzb) : "";
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzcdp.zzc(zzf(zzf(zzf(zzf(zzf(zzf((String) it.next(), "@gw_rwd_userid@", Uri.encode(zze)), "@gw_rwd_custom_data@", Uri.encode(zze2)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzc)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzfbgVar.zzX));
            }
            return arrayList;
        } catch (RemoteException e2) {
            zzcfi.zzh("Unable to determine award type and amount.", e2);
            return arrayList;
        }
    }
}

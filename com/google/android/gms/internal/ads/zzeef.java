package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeef {
    private final zzbdl zza;
    private final Context zzb;
    private final zzedn zzc;
    private final zzcfo zzd;
    private final String zze;
    private final zzfgo zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzeef(Context context, zzcfo zzcfoVar, zzbdl zzbdlVar, zzedn zzednVar, String str, zzfgo zzfgoVar) {
        this.zzb = context;
        this.zzd = zzcfoVar;
        this.zza = zzbdlVar;
        this.zzc = zzednVar;
        this.zze = str;
        this.zzf = zzfgoVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzbfu zzbfuVar = (zzbfu) arrayList.get(i2);
            if (zzbfuVar.zzv() == 2 && zzbfuVar.zze() > j2) {
                j2 = zzbfuVar.zze();
            }
        }
        if (j2 != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j2));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
            zzfgn zzb = zzfgn.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzeea.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzeea.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzeea.zzb(sQLiteDatabase, 2)));
            zzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzeea.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzbfu zzbfuVar = (zzbfu) zzc.get(i2);
                zzfgn zzb2 = zzfgn.zzb("oa_signals");
                zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                zzbfp zzf = zzbfuVar.zzf();
                String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                String obj = zzfrv.zzb(zzbfuVar.zzk(), new zzfoi() { // from class: com.google.android.gms.internal.ads.zzeee
                    @Override // com.google.android.gms.internal.ads.zzfoi
                    public final Object apply(Object obj2) {
                        return ((zzbej) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzbfuVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzbfuVar.zzv() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzbfuVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzbfuVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", valueOf);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzbfuVar.zzw() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzbfuVar.zzs() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzbfuVar.zzt() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzbfuVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzbfuVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzbfuVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzeea.zzc(sQLiteDatabase);
            zzbfv zza = zzbfz.zza();
            zza.zzb(this.zzb.getPackageName());
            zza.zzc(Build.MODEL);
            zza.zzd(zzeea.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzf(zzeea.zza(sQLiteDatabase, 1));
            zza.zzg(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
            zza.zze(zzeea.zzb(sQLiteDatabase, 2));
            final zzbfz zzbfzVar = (zzbfz) zza.zzaj();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzeec
                @Override // com.google.android.gms.internal.ads.zzbdk
                public final void zza(zzbfa zzbfaVar) {
                    zzbfaVar.zzi(zzbfz.this);
                }
            });
            zzbgk zza2 = zzbgl.zza();
            zza2.zza(this.zzd.zzb);
            zza2.zzc(this.zzd.zzc);
            zza2.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzbgl zzbglVar = (zzbgl) zza2.zzaj();
            this.zza.zzb(new zzbdk() { // from class: com.google.android.gms.internal.ads.zzeed
                @Override // com.google.android.gms.internal.ads.zzbdk
                public final void zza(zzbfa zzbfaVar) {
                    zzbgl zzbglVar2 = zzbgl.this;
                    zzbes zzbesVar = (zzbes) zzbfaVar.zzb().zzax();
                    zzbesVar.zzb(zzbglVar2);
                    zzbfaVar.zzg(zzbesVar);
                }
            });
            this.zza.zzc(10004);
        }
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        return null;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzffh() { // from class: com.google.android.gms.internal.ads.zzeeb
                @Override // com.google.android.gms.internal.ads.zzffh
                public final Object zza(Object obj) {
                    zzeef.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e2) {
            zzcfi.zzg("Error in offline signals database startup: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}

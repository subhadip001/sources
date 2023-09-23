package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.util.VisibleForTesting;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class zzea extends zzf {
    private final zzdz zza;
    private boolean zzb;

    public zzea(zzfr zzfrVar) {
        super(zzfrVar);
        Context zzau = this.zzt.zzau();
        this.zzt.zzf();
        this.zza = new zzdz(this, zzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzq(int r14, byte[] r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzea.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x024a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x024a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzi(int r23) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzea.zzi(int):java.util.List");
    }

    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            this.zzt.zzay().zzd().zzb("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context zzau = this.zzt.zzau();
        this.zzt.zzf();
        return zzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        int i2;
        zzg();
        if (!this.zzb && zzl()) {
            int i3 = 5;
            while (i2 < 5) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase zzh = zzh();
                        if (zzh == null) {
                            this.zzb = true;
                            return false;
                        }
                        zzh.beginTransaction();
                        zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        zzh.setTransactionSuccessful();
                        zzh.endTransaction();
                        zzh.close();
                        return true;
                    } catch (SQLiteFullException e2) {
                        this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e2);
                        this.zzb = true;
                        i2 = 0 == 0 ? i2 + 1 : 0;
                        sQLiteDatabase.close();
                    } catch (SQLiteException e3) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzt.zzay().zzd().zzb("Error deleting app launch break from local database", e3);
                        this.zzb = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i3);
                    i3 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            a.L(this.zzt, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzan = this.zzt.zzv().zzan(zzacVar);
        if (zzan.length > 131072) {
            this.zzt.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(2, zzan);
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        zzax.zza(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzq(0, marshall);
    }

    public final boolean zzp(zzkw zzkwVar) {
        Parcel obtain = Parcel.obtain();
        zzkx.zza(zzkwVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzay().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(1, marshall);
    }
}

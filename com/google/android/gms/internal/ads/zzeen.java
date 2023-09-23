package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeen extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfvk zzb;

    public zzeen(Context context, zzfvk zzfvkVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgW)).intValue());
        this.zza = context;
        this.zzb = zzfvkVar;
    }

    public static /* synthetic */ Void zzb(zzcfn zzcfnVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, zzcfnVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzcfn zzcfnVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzcfnVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzcfn zzcfnVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ImagesContract.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i2 = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr[i2] = query.getString(columnIndex);
                }
                i2++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i3 = 0; i3 < count; i3++) {
                zzcfnVar.zza(strArr[i3]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzeep zzeepVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeepVar.zza));
        contentValues.put("gws_query_id", zzeepVar.zzb);
        contentValues.put(ImagesContract.URL, zzeepVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeepVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzw = com.google.android.gms.ads.internal.util.zzs.zzw(this.zza);
        if (zzw != null) {
            try {
                zzw.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzeek
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzeen.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzeep zzeepVar) {
        zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzeen.this.zza(zzeepVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzffh zzffhVar) {
        zzfva.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeeg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeen.this.getWritableDatabase();
            }
        }), new zzeem(this, zzffhVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzcfn zzcfnVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeh
            @Override // java.lang.Runnable
            public final void run() {
                zzeen.zzf(sQLiteDatabase, str, zzcfnVar);
            }
        });
    }

    public final void zzh(final zzcfn zzcfnVar, final String str) {
        zze(new zzffh() { // from class: com.google.android.gms.internal.ads.zzeel
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                zzeen.this.zzg((SQLiteDatabase) obj, zzcfnVar, str);
                return null;
            }
        });
    }
}

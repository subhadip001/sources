package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzsy implements zzwg, zzrq {
    public final /* synthetic */ zztd zza;
    private final Uri zzc;
    private final zzfs zzd;
    private final zzsu zze;
    private final zzyv zzf;
    private final zzcz zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzzz zzn;
    private boolean zzo;
    private final zzzs zzh = new zzzs();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzrs.zza();
    private zzew zzl = zzj(0);

    public zzsy(zztd zztdVar, Uri uri, zzer zzerVar, zzsu zzsuVar, zzyv zzyvVar, zzcz zzczVar) {
        this.zza = zztdVar;
        this.zzc = uri;
        this.zzd = new zzfs(zzerVar);
        this.zze = zzsuVar;
        this.zzf = zzyvVar;
        this.zzg = zzczVar;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzsy zzsyVar) {
        return zzsyVar.zzm;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzsy zzsyVar) {
        return zzsyVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzd(zzsy zzsyVar) {
        return zzsyVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzew zze(zzsy zzsyVar) {
        return zzsyVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfs zzf(zzsy zzsyVar) {
        return zzsyVar.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzsy zzsyVar, long j2, long j3) {
        zzsyVar.zzh.zza = j2;
        zzsyVar.zzk = j3;
        zzsyVar.zzj = true;
        zzsyVar.zzo = false;
    }

    private final zzew zzj(long j2) {
        Map map;
        zzeu zzeuVar = new zzeu();
        zzeuVar.zzd(this.zzc);
        zzeuVar.zzc(j2);
        zzeuVar.zza(6);
        map = zztd.zzb;
        zzeuVar.zzb(map);
        return zzeuVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrq
    public final void zza(zzdy zzdyVar) {
        long zzO;
        long max;
        if (this.zzo) {
            zzO = this.zza.zzO();
            max = Math.max(zzO, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzdyVar.zza();
        zzzz zzzzVar = this.zzn;
        Objects.requireNonNull(zzzzVar);
        zzzx.zzb(zzzzVar, zzdyVar, zza);
        zzzzVar.zzs(max, 1, zza, 0, null);
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0083 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0099 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00af A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00c5 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00e1 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0116 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0129 A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x016c A[Catch: all -> 0x01e3, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0175 A[Catch: all -> 0x01e3, TRY_LEAVE, TryCatch #3 {all -> 0x01e3, blocks: (B:126:0x000c, B:128:0x0022, B:129:0x0025, B:132:0x003a, B:133:0x0040, B:143:0x0078, B:145:0x0083, B:147:0x008f, B:149:0x0099, B:151:0x00a5, B:153:0x00af, B:155:0x00bb, B:157:0x00c5, B:159:0x00d7, B:161:0x00e1, B:162:0x00e7, B:172:0x0116, B:173:0x011c, B:175:0x0129, B:177:0x0131, B:179:0x014d, B:181:0x016c, B:182:0x0171, B:184:0x0175, B:165:0x00ef, B:169:0x0106, B:137:0x004a, B:141:0x0064), top: B:223:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01c3 A[EDGE_INSN: B:233:0x01c3->B:198:0x01c3 ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi() {
        /*
            Method dump skipped, instructions count: 513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsy.zzi():void");
    }
}

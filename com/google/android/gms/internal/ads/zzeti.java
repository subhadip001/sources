package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeti implements zzetb {
    private final zzfvk zza;
    private final Context zzb;

    public zzeti(zzfvk zzfvkVar, Context context) {
        this.zza = zzfvkVar;
        this.zzb = context;
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), LogFileManager.MAX_LOG_SIZE);
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetb
    public final zzfvj zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeti.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(1:3)(1:54)|4|(1:6)(1:53)|7|(3:9|(2:12|10)|13)|14|(3:46|47|(12:49|50|17|18|19|(7:21|22|23|(2:29|(3:32|(3:35|(2:38|39)(1:37)|33)|40))|25|26|27)|42|23|(0)|25|26|27))|16|17|18|19|(0)|42|23|(0)|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[Catch: Exception -> 0x00c5, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c5, blocks: (B:27:0x009e, B:29:0x00ac), top: B:51:0x009e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzetg zzc() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeti.zzc():com.google.android.gms.internal.ads.zzetg");
    }
}

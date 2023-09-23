package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.BundleCompat;
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzgqi;
import d.a.a.a;
import e.d.a.c;
import e.d.a.e;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzn implements zzbiu {
    public final /* synthetic */ zzbiw zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ Uri zzc;

    public zzn(zzs zzsVar, zzbiw zzbiwVar, Context context, Uri uri) {
        this.zza = zzbiwVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbiu
    public final void zza() {
        a.AbstractBinderC0012a abstractBinderC0012a;
        e zza = this.zza.zza();
        Intent intent = new Intent("android.intent.action.VIEW");
        if (zza != null) {
            intent.setPackage(zza.c.getPackageName());
        }
        Bundle bundle = new Bundle();
        if (zza == null) {
            abstractBinderC0012a = null;
        } else {
            abstractBinderC0012a = (a.AbstractBinderC0012a) zza.b;
            Objects.requireNonNull(abstractBinderC0012a);
        }
        BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", abstractBinderC0012a);
        intent.putExtras(bundle);
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        c cVar = new c(intent, null);
        cVar.a.setPackage(zzgqi.zza(this.zzb));
        cVar.a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}

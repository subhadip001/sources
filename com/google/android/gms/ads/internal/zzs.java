package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzfg;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzaod;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbit;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbyd;
import com.google.android.gms.internal.ads.zzbyg;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import f.a.b.a.a;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzs extends zzbr {
    private final zzcfo zza;
    private final com.google.android.gms.ads.internal.client.zzq zzb;
    private final Future zzc = zzcfv.zza.zzb(new zzo(this));
    private final Context zzd;
    private final zzr zze;
    private WebView zzf;
    private zzbf zzg;
    private zzaoc zzh;
    private AsyncTask zzi;

    public zzs(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzcfo zzcfoVar) {
        this.zzd = context;
        this.zza = zzcfoVar;
        this.zzb = zzqVar;
        this.zzf = new WebView(context);
        this.zze = new zzr(context, str);
        zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzm(this));
        this.zzf.setOnTouchListener(new zzn(this));
    }

    public static /* bridge */ /* synthetic */ String zzo(zzs zzsVar, String str) {
        if (zzsVar.zzh == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = zzsVar.zzh.zza(parse, zzsVar.zzd, null, null);
        } catch (zzaod e2) {
            zzcfi.zzk("Unable to process ad data", e2);
        }
        return parse.toString();
    }

    public static /* bridge */ /* synthetic */ void zzw(zzs zzsVar, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        zzsVar.zzd.startActivity(intent);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbcVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbfVar) {
        this.zzg = zzbfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbzVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbci zzbciVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzwVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdoVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbyd zzbydVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbit zzbitVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyg zzbygVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcaq zzcaqVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzfg zzfgVar) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    public final void zzV(int i2) {
        if (this.zzf == null) {
            return;
        }
        this.zzf.setLayoutParams(new ViewGroup.LayoutParams(-1, i2));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzlVar, this.zza);
        this.zzi = new zzq(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcdVar) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    public final int zzb(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter(StreamInformation.KEY_HEIGHT);
        if (TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            zzaw.zzb();
            return zzcfb.zzv(this.zzd, Integer.parseInt(queryParameter));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    @VisibleForTesting
    public final String zzp() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath((String) zzbjc.zzd.zze());
        builder.appendQueryParameter(SearchIntents.EXTRA_QUERY, this.zze.zzd());
        builder.appendQueryParameter("pubId", this.zze.zzc());
        builder.appendQueryParameter("mappver", this.zze.zza());
        Map zze = this.zze.zze();
        for (String str : zze.keySet()) {
            builder.appendQueryParameter(str, (String) zze.get(str));
        }
        Uri build = builder.build();
        zzaoc zzaocVar = this.zzh;
        if (zzaocVar != null) {
            try {
                build = zzaocVar.zzb(build, this.zzd);
            } catch (zzaod e2) {
                zzcfi.zzk("Unable to process ad data", e2);
            }
        }
        return a.q(zzq(), "#", build.getEncodedQuery());
    }

    @VisibleForTesting
    public final String zzq() {
        String zzb = this.zze.zzb();
        if (true == TextUtils.isEmpty(zzb)) {
            zzb = "www.google.com";
        }
        return a.q("https://", zzb, (String) zzbjc.zzd.zze());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(true);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}

package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfnp extends zzfnd {
    private zzfph<Integer> zza;
    private zzfph<Integer> zzb;
    private zzfno zzc;
    private HttpURLConnection zzd;

    public zzfnp() {
        this(new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzf();
            }
        }, new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnn
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzg();
            }
        }, null);
    }

    public zzfnp(zzfph<Integer> zzfphVar, zzfph<Integer> zzfphVar2, zzfno zzfnoVar) {
        this.zza = zzfphVar;
        this.zzb = zzfphVar2;
        this.zzc = zzfnoVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static /* synthetic */ Integer zzh(int i2) {
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ Integer zzi(int i2) {
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ Integer zzj(int i2) {
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ Integer zzk(int i2) {
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ Integer zzl(int i2) {
        return Integer.valueOf(i2);
    }

    public static /* synthetic */ URLConnection zzp(URL url) {
        return url.openConnection();
    }

    public static /* synthetic */ URLConnection zzq(Network network, URL url) {
        return network.openConnection(url);
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfne.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() {
        zzfne.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfno zzfnoVar = this.zzc;
        Objects.requireNonNull(zzfnoVar);
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfnoVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfno zzfnoVar, final int i2, final int i3) {
        this.zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnf
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzk(i2);
            }
        };
        this.zzb = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfng
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzl(i3);
            }
        };
        this.zzc = zzfnoVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i2, final int i3) {
        this.zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnh
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzi(i2);
            }
        };
        this.zzb = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfni
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzj(i3);
            }
        };
        this.zzc = new zzfno() { // from class: com.google.android.gms.internal.ads.zzfnj
            @Override // com.google.android.gms.internal.ads.zzfno
            public final URLConnection zza() {
                return zzfnp.zzq(network, url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i2) {
        this.zza = new zzfph() { // from class: com.google.android.gms.internal.ads.zzfnk
            @Override // com.google.android.gms.internal.ads.zzfph
            public final Object zza() {
                return zzfnp.zzh(i2);
            }
        };
        this.zzc = new zzfno() { // from class: com.google.android.gms.internal.ads.zzfnl
            @Override // com.google.android.gms.internal.ads.zzfno
            public final URLConnection zza() {
                return zzfnp.zzp(url);
            }
        };
        return zzm();
    }
}

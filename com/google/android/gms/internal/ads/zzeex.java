package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzeex implements zzbxo {
    private static zzfiq zzf(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return zzfiq.VIDEO;
            }
            return zzfiq.NATIVE_DISPLAY;
        }
        return zzfiq.HTML_DISPLAY;
    }

    private static zzfis zzg(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return zzfis.UNSPECIFIED;
                }
                return zzfis.ONE_PIXEL;
            }
            return zzfis.DEFINED_BY_JAVASCRIPT;
        }
        return zzfis.BEGIN_TO_RENDER;
    }

    private static zzfit zzh(String str) {
        if ("native".equals(str)) {
            return zzfit.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfit.JAVASCRIPT;
        }
        return zzfit.NONE;
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzbxq zzbxqVar, zzbxp zzbxpVar, String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            zzfiu zza = zzfiu.zza("Google", str);
            zzfit zzh = zzh("javascript");
            zzfiq zzf = zzf(zzbxpVar.toString());
            zzfit zzfitVar = zzfit.NONE;
            if (zzh == zzfitVar) {
                zzcfi.zzj("Omid html session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzf == null) {
                zzcfi.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzbxpVar)));
                return null;
            } else {
                zzfit zzh2 = zzh(str4);
                if (zzf == zzfiq.VIDEO && zzh2 == zzfitVar) {
                    zzcfi.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                    return null;
                }
                return ObjectWrapper.wrap(zzfil.zza(zzfim.zza(zzf, zzg(zzbxqVar.toString()), zzh, zzh2, true), zzfin.zzb(zza, webView, str5, "")));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzbxq zzbxqVar, zzbxp zzbxpVar, String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            zzfiu zza = zzfiu.zza(str5, str);
            zzfit zzh = zzh("javascript");
            zzfit zzh2 = zzh(str4);
            zzfiq zzf = zzf(zzbxpVar.toString());
            zzfit zzfitVar = zzfit.NONE;
            if (zzh == zzfitVar) {
                zzcfi.zzj("Omid js session error; Unable to parse impression owner: javascript");
                return null;
            } else if (zzf == null) {
                zzcfi.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzbxpVar)));
                return null;
            } else if (zzf == zzfiq.VIDEO && zzh2 == zzfitVar) {
                zzcfi.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            } else {
                return ObjectWrapper.wrap(zzfil.zza(zzfim.zza(zzf, zzg(zzbxqVar.toString()), zzh, zzh2, true), zzfin.zzc(zza, webView, str6, "")));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfil) {
                ((zzfil) unwrap).zzd(view);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue() && zzfij.zzb()) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (unwrap instanceof zzfil) {
                ((zzfil) unwrap).zze();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxo
    public final boolean zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzea)).booleanValue()) {
            zzcfi.zzj("Omid flag is disabled");
            return false;
        } else if (zzfij.zzb()) {
            return true;
        } else {
            zzfij.zza(context);
            return zzfij.zzb();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfjw {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private boolean zzh;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfjv zzb(View view) {
        zzfjv zzfjvVar = (zzfjv) this.zzb.get(view);
        if (zzfjvVar != null) {
            this.zzb.remove(view);
        }
        return zzfjvVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzh = false;
    }

    public final void zzh() {
        this.zzh = true;
    }

    public final void zzi() {
        zzfja zza = zzfja.zza();
        if (zza != null) {
            for (zzfip zzfipVar : zza.zzb()) {
                View zzf = zzfipVar.zzf();
                if (zzfipVar.zzj()) {
                    String zzh = zzfipVar.zzh();
                    if (zzf != null) {
                        String str = null;
                        if (zzf.hasWindowFocus()) {
                            HashSet hashSet = new HashSet();
                            View view = zzf;
                            while (true) {
                                if (view != null) {
                                    String zzb = zzfju.zzb(view);
                                    if (zzb != null) {
                                        str = zzb;
                                        break;
                                    }
                                    hashSet.add(view);
                                    ViewParent parent = view.getParent();
                                    view = parent instanceof View ? (View) parent : null;
                                } else {
                                    this.zzd.addAll(hashSet);
                                    break;
                                }
                            }
                        } else {
                            str = "noWindowFocus";
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfjd zzfjdVar : zzfipVar.zzi()) {
                                View view2 = (View) zzfjdVar.zzb().get();
                                if (view2 != null) {
                                    zzfjv zzfjvVar = (zzfjv) this.zzb.get(view2);
                                    if (zzfjvVar != null) {
                                        zzfjvVar.zzc(zzfipVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfjv(zzfjdVar, zzfipVar.zzh()));
                                    }
                                }
                            }
                        } else {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final int zzj(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzh ? 2 : 3;
    }
}

package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzfip extends zzfil {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzfin zzb;
    private final zzfim zzc;
    private zzfkk zze;
    private zzfjn zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    public zzfip(zzfim zzfimVar, zzfin zzfinVar) {
        this.zzc = zzfimVar;
        this.zzb = zzfinVar;
        zzk(null);
        if (zzfinVar.zzd() != zzfio.HTML && zzfinVar.zzd() != zzfio.JAVASCRIPT) {
            this.zzf = new zzfjq(zzfinVar.zzi(), null);
        } else {
            this.zzf = new zzfjo(zzfinVar.zza());
        }
        this.zzf.zzj();
        zzfja.zza().zzd(this);
        zzfjg.zza().zzd(this.zzf.zza(), zzfimVar.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfkk(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final void zzb(View view, zzfir zzfirVar, String str) {
        zzfjd zzfjdVar;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfjdVar = null;
                    break;
                }
                zzfjdVar = (zzfjd) it.next();
                if (zzfjdVar.zzb().get() == view) {
                    break;
                }
            }
            if (zzfjdVar == null) {
                this.zzd.add(new zzfjd(view, zzfirVar, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        if (!this.zzh) {
            this.zzd.clear();
        }
        this.zzh = true;
        zzfjg.zza().zzc(this.zzf.zza());
        zzfja.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final void zzd(View view) {
        if (this.zzh || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzf.zzb();
        Collection<zzfip> zzc = zzfja.zza().zzc();
        if (zzc == null || zzc.size() <= 0) {
            return;
        }
        for (zzfip zzfipVar : zzc) {
            if (zzfipVar != this && zzfipVar.zzf() == view) {
                zzfipVar.zze.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfil
    public final void zze() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzfja.zza().zzf(this);
        this.zzf.zzh(zzfjh.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfjn zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}

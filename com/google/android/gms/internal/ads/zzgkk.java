package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgko;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public class zzgkk<MessageType extends zzgko<MessageType, BuilderType>, BuilderType extends zzgkk<MessageType, BuilderType>> extends zzgio<MessageType, BuilderType> {
    public zzgko zza;
    public boolean zzb = false;
    private final zzgko zzc;

    public zzgkk(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzgko) messagetype.zzb(4, null, null);
    }

    private static final void zza(zzgko zzgkoVar, zzgko zzgkoVar2) {
        zzgmg.zza().zzb(zzgkoVar.getClass()).zzg(zzgkoVar, zzgkoVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    public final /* synthetic */ zzgio zzae(zzgip zzgipVar) {
        zzah((zzgko) zzgipVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgio
    /* renamed from: zzag */
    public final zzgkk zzad() {
        zzgkk zzgkkVar = (zzgkk) this.zzc.zzb(5, null, null);
        zzgkkVar.zzah(zzal());
        return zzgkkVar;
    }

    public final zzgkk zzah(zzgko zzgkoVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zza(this.zza, zzgkoVar);
        return this;
    }

    public final zzgkk zzai(byte[] bArr, int i2, int i3, zzgka zzgkaVar) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        try {
            zzgmg.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i3, new zzgis(zzgkaVar));
            return this;
        } catch (zzgla e2) {
            throw e2;
        } catch (IOException e3) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgla.zzj();
        }
    }

    public final MessageType zzaj() {
        MessageType zzal = zzal();
        if (zzal.zzaP()) {
            return zzal;
        }
        throw new zzgnh(zzal);
    }

    @Override // com.google.android.gms.internal.ads.zzglx
    /* renamed from: zzak */
    public MessageType zzal() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzgko zzgkoVar = this.zza;
        zzgmg.zza().zzb(zzgkoVar.getClass()).zzf(zzgkoVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    public void zzan() {
        zzgko zzgkoVar = (zzgko) this.zza.zzb(4, null, null);
        zza(zzgkoVar, this.zza);
        this.zza = zzgkoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final /* synthetic */ zzgly zzbh() {
        return this.zzc;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgio;
import com.google.android.gms.internal.ads.zzgip;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgio<MessageType extends zzgip<MessageType, BuilderType>, BuilderType extends zzgio<MessageType, BuilderType>> implements zzglx {
    @Override // 
    /* renamed from: zzad */
    public abstract zzgio clone();

    public abstract zzgio zzae(zzgip zzgipVar);

    @Override // com.google.android.gms.internal.ads.zzglx
    public final /* bridge */ /* synthetic */ zzglx zzaf(zzgly zzglyVar) {
        if (zzbh().getClass().isInstance(zzglyVar)) {
            return zzae((zzgip) zzglyVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}

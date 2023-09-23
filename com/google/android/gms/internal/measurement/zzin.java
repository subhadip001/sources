package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzin;
import com.google.android.gms.internal.measurement.zzio;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class zzin<MessageType extends zzio<MessageType, BuilderType>, BuilderType extends zzin<MessageType, BuilderType>> implements zzll {
    @Override // 
    /* renamed from: zzau */
    public abstract zzin clone();

    public zzin zzav(byte[] bArr, int i2, int i3) {
        throw null;
    }

    public zzin zzaw(byte[] bArr, int i2, int i3, zzjr zzjrVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzll zzax(byte[] bArr) {
        return zzav(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzll zzay(byte[] bArr, zzjr zzjrVar) {
        return zzaw(bArr, 0, bArr.length, zzjrVar);
    }
}

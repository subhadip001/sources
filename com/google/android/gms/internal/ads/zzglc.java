package com.google.android.gms.internal.ads;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzglc {
    public static final zzglc zza;
    public static final zzglc zzb;
    public static final zzglc zzc;
    public static final zzglc zzd;
    public static final zzglc zze;
    public static final zzglc zzf;
    public static final zzglc zzg;
    public static final zzglc zzh;
    public static final zzglc zzi;
    public static final zzglc zzj;
    private static final /* synthetic */ zzglc[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzglc zzglcVar = new zzglc("VOID", 0, Void.class, Void.class, null);
        zza = zzglcVar;
        Class cls = Integer.TYPE;
        zzglc zzglcVar2 = new zzglc("INT", 1, cls, Integer.class, 0);
        zzb = zzglcVar2;
        zzglc zzglcVar3 = new zzglc("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzglcVar3;
        zzglc zzglcVar4 = new zzglc("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzglcVar4;
        zzglc zzglcVar5 = new zzglc("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE));
        zze = zzglcVar5;
        zzglc zzglcVar6 = new zzglc("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzglcVar6;
        zzglc zzglcVar7 = new zzglc("STRING", 6, String.class, String.class, "");
        zzg = zzglcVar7;
        zzglc zzglcVar8 = new zzglc("BYTE_STRING", 7, zzgjg.class, zzgjg.class, zzgjg.zzb);
        zzh = zzglcVar8;
        zzglc zzglcVar9 = new zzglc("ENUM", 8, cls, Integer.class, null);
        zzi = zzglcVar9;
        zzglc zzglcVar10 = new zzglc("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzglcVar10;
        zzk = new zzglc[]{zzglcVar, zzglcVar2, zzglcVar3, zzglcVar4, zzglcVar5, zzglcVar6, zzglcVar7, zzglcVar8, zzglcVar9, zzglcVar10};
    }

    private zzglc(String str, int i2, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzglc[] values() {
        return (zzglc[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}

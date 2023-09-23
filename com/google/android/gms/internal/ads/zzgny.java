package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
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
public final class zzgny {
    public static final zzgny zza;
    public static final zzgny zzb;
    public static final zzgny zzc;
    public static final zzgny zzd;
    public static final zzgny zze;
    public static final zzgny zzf;
    public static final zzgny zzg;
    public static final zzgny zzh;
    public static final zzgny zzi;
    public static final zzgny zzj;
    public static final zzgny zzk;
    public static final zzgny zzl;
    public static final zzgny zzm;
    public static final zzgny zzn;
    public static final zzgny zzo;
    public static final zzgny zzp;
    public static final zzgny zzq;
    public static final zzgny zzr;
    private static final /* synthetic */ zzgny[] zzs;
    private final zzgnz zzt;

    static {
        zzgny zzgnyVar = new zzgny("DOUBLE", 0, zzgnz.DOUBLE, 1);
        zza = zzgnyVar;
        zzgny zzgnyVar2 = new zzgny("FLOAT", 1, zzgnz.FLOAT, 5);
        zzb = zzgnyVar2;
        zzgnz zzgnzVar = zzgnz.LONG;
        zzgny zzgnyVar3 = new zzgny("INT64", 2, zzgnzVar, 0);
        zzc = zzgnyVar3;
        zzgny zzgnyVar4 = new zzgny("UINT64", 3, zzgnzVar, 0);
        zzd = zzgnyVar4;
        zzgnz zzgnzVar2 = zzgnz.INT;
        zzgny zzgnyVar5 = new zzgny("INT32", 4, zzgnzVar2, 0);
        zze = zzgnyVar5;
        zzgny zzgnyVar6 = new zzgny("FIXED64", 5, zzgnzVar, 1);
        zzf = zzgnyVar6;
        zzgny zzgnyVar7 = new zzgny("FIXED32", 6, zzgnzVar2, 5);
        zzg = zzgnyVar7;
        zzgny zzgnyVar8 = new zzgny("BOOL", 7, zzgnz.BOOLEAN, 0);
        zzh = zzgnyVar8;
        zzgny zzgnyVar9 = new zzgny("STRING", 8, zzgnz.STRING, 2);
        zzi = zzgnyVar9;
        zzgnz zzgnzVar3 = zzgnz.MESSAGE;
        zzgny zzgnyVar10 = new zzgny("GROUP", 9, zzgnzVar3, 3);
        zzj = zzgnyVar10;
        zzgny zzgnyVar11 = new zzgny("MESSAGE", 10, zzgnzVar3, 2);
        zzk = zzgnyVar11;
        zzgny zzgnyVar12 = new zzgny("BYTES", 11, zzgnz.BYTE_STRING, 2);
        zzl = zzgnyVar12;
        zzgny zzgnyVar13 = new zzgny("UINT32", 12, zzgnzVar2, 0);
        zzm = zzgnyVar13;
        zzgny zzgnyVar14 = new zzgny("ENUM", 13, zzgnz.ENUM, 0);
        zzn = zzgnyVar14;
        zzgny zzgnyVar15 = new zzgny("SFIXED32", 14, zzgnzVar2, 5);
        zzo = zzgnyVar15;
        zzgny zzgnyVar16 = new zzgny("SFIXED64", 15, zzgnzVar, 1);
        zzp = zzgnyVar16;
        zzgny zzgnyVar17 = new zzgny("SINT32", 16, zzgnzVar2, 0);
        zzq = zzgnyVar17;
        zzgny zzgnyVar18 = new zzgny("SINT64", 17, zzgnzVar, 0);
        zzr = zzgnyVar18;
        zzs = new zzgny[]{zzgnyVar, zzgnyVar2, zzgnyVar3, zzgnyVar4, zzgnyVar5, zzgnyVar6, zzgnyVar7, zzgnyVar8, zzgnyVar9, zzgnyVar10, zzgnyVar11, zzgnyVar12, zzgnyVar13, zzgnyVar14, zzgnyVar15, zzgnyVar16, zzgnyVar17, zzgnyVar18};
    }

    private zzgny(String str, int i2, zzgnz zzgnzVar, int i3) {
        this.zzt = zzgnzVar;
    }

    public static zzgny[] values() {
        return (zzgny[]) zzs.clone();
    }

    public final zzgnz zza() {
        return this.zzt;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkk;
import com.google.android.gms.internal.ads.zzgko;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public abstract class zzgko<MessageType extends zzgko<MessageType, BuilderType>, BuilderType extends zzgkk<MessageType, BuilderType>> extends zzgip<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zzgnj zzc = zzgnj.zzc();
    public int zzd = -1;

    private static zzgko zza(zzgko zzgkoVar) {
        if (zzgkoVar == null || zzgkoVar.zzaP()) {
            return zzgkoVar;
        }
        zzgla zza = new zzgnh(zzgkoVar).zza();
        zza.zzh(zzgkoVar);
        throw zza;
    }

    public static zzgko zzaA(zzgko zzgkoVar, byte[] bArr) {
        zzgko zzc = zzc(zzgkoVar, bArr, 0, bArr.length, zzgka.zza());
        zza(zzc);
        return zzc;
    }

    public static zzgko zzaB(zzgko zzgkoVar, zzgjg zzgjgVar, zzgka zzgkaVar) {
        zzgjo zzl = zzgjgVar.zzl();
        zzgko zzgkoVar2 = (zzgko) zzgkoVar.zzb(4, null, null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgkoVar2.getClass());
            zzb2.zzh(zzgkoVar2, zzgjp.zzq(zzl), zzgkaVar);
            zzb2.zzf(zzgkoVar2);
            try {
                zzl.zzz(0);
                zza(zzgkoVar2);
                return zzgkoVar2;
            } catch (zzgla e2) {
                e2.zzh(zzgkoVar2);
                throw e2;
            }
        } catch (zzgla e3) {
            e = e3;
            if (e.zzl()) {
                e = new zzgla(e);
            }
            e.zzh(zzgkoVar2);
            throw e;
        } catch (zzgnh e4) {
            zzgla zza = e4.zza();
            zza.zzh(zzgkoVar2);
            throw zza;
        } catch (IOException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            zzgla zzglaVar = new zzgla(e5);
            zzglaVar.zzh(zzgkoVar2);
            throw zzglaVar;
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof zzgla) {
                throw ((zzgla) e6.getCause());
            }
            throw e6;
        }
    }

    public static zzgko zzaC(zzgko zzgkoVar, InputStream inputStream, zzgka zzgkaVar) {
        zzgjo zzH = zzgjo.zzH(inputStream, 4096);
        zzgko zzgkoVar2 = (zzgko) zzgkoVar.zzb(4, null, null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgkoVar2.getClass());
            zzb2.zzh(zzgkoVar2, zzgjp.zzq(zzH), zzgkaVar);
            zzb2.zzf(zzgkoVar2);
            zza(zzgkoVar2);
            return zzgkoVar2;
        } catch (zzgla e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgla(e);
            }
            e.zzh(zzgkoVar2);
            throw e;
        } catch (zzgnh e3) {
            zzgla zza = e3.zza();
            zza.zzh(zzgkoVar2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            zzgla zzglaVar = new zzgla(e4);
            zzglaVar.zzh(zzgkoVar2);
            throw zzglaVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgko zzaD(zzgko zzgkoVar, byte[] bArr, zzgka zzgkaVar) {
        zzgko zzc = zzc(zzgkoVar, bArr, 0, bArr.length, zzgkaVar);
        zza(zzc);
        return zzc;
    }

    public static zzgkt zzaE() {
        return zzgkp.zzf();
    }

    public static zzgkt zzaF(zzgkt zzgktVar) {
        int size = zzgktVar.size();
        return zzgktVar.zzg(size == 0 ? 10 : size + size);
    }

    public static zzgkw zzaG() {
        return zzgln.zzf();
    }

    public static zzgkx zzaH() {
        return zzgmh.zze();
    }

    public static zzgkx zzaI(zzgkx zzgkxVar) {
        int size = zzgkxVar.size();
        return zzgkxVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaL(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzaM(zzgly zzglyVar, String str, Object[] objArr) {
        return new zzgmi(zzglyVar, str, objArr);
    }

    public static void zzaN(Class cls, zzgko zzgkoVar) {
        zzb.put(cls, zzgkoVar);
    }

    public static zzgko zzay(Class cls) {
        Map map = zzb;
        zzgko zzgkoVar = (zzgko) map.get(cls);
        if (zzgkoVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgkoVar = (zzgko) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (zzgkoVar == null) {
            zzgkoVar = (zzgko) ((zzgko) zzgns.zzg(cls)).zzb(6, null, null);
            if (zzgkoVar != null) {
                map.put(cls, zzgkoVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgkoVar;
    }

    public static zzgko zzaz(zzgko zzgkoVar, zzgjg zzgjgVar) {
        zzgka zza = zzgka.zza();
        zzgjo zzl = zzgjgVar.zzl();
        zzgko zzgkoVar2 = (zzgko) zzgkoVar.zzb(4, null, null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgkoVar2.getClass());
            zzb2.zzh(zzgkoVar2, zzgjp.zzq(zzl), zza);
            zzb2.zzf(zzgkoVar2);
            try {
                zzl.zzz(0);
                zza(zzgkoVar2);
                zza(zzgkoVar2);
                return zzgkoVar2;
            } catch (zzgla e2) {
                e2.zzh(zzgkoVar2);
                throw e2;
            }
        } catch (zzgla e3) {
            e = e3;
            if (e.zzl()) {
                e = new zzgla(e);
            }
            e.zzh(zzgkoVar2);
            throw e;
        } catch (zzgnh e4) {
            zzgla zza2 = e4.zza();
            zza2.zzh(zzgkoVar2);
            throw zza2;
        } catch (IOException e5) {
            if (e5.getCause() instanceof zzgla) {
                throw ((zzgla) e5.getCause());
            }
            zzgla zzglaVar = new zzgla(e5);
            zzglaVar.zzh(zzgkoVar2);
            throw zzglaVar;
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof zzgla) {
                throw ((zzgla) e6.getCause());
            }
            throw e6;
        }
    }

    private static zzgko zzc(zzgko zzgkoVar, byte[] bArr, int i2, int i3, zzgka zzgkaVar) {
        zzgko zzgkoVar2 = (zzgko) zzgkoVar.zzb(4, null, null);
        try {
            zzgmr zzb2 = zzgmg.zza().zzb(zzgkoVar2.getClass());
            zzb2.zzi(zzgkoVar2, bArr, 0, i3, new zzgis(zzgkaVar));
            zzb2.zzf(zzgkoVar2);
            if (zzgkoVar2.zza == 0) {
                return zzgkoVar2;
            }
            throw new RuntimeException();
        } catch (zzgla e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzgla(e);
            }
            e.zzh(zzgkoVar2);
            throw e;
        } catch (zzgnh e3) {
            zzgla zza = e3.zza();
            zza.zzh(zzgkoVar2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzgla) {
                throw ((zzgla) e4.getCause());
            }
            zzgla zzglaVar = new zzgla(e4);
            zzglaVar.zzh(zzgkoVar2);
            throw zzglaVar;
        } catch (IndexOutOfBoundsException unused) {
            zzgla zzj = zzgla.zzj();
            zzj.zzh(zzgkoVar2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgmg.zza().zzb(getClass()).zzj(this, (zzgko) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int zzb2 = zzgmg.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgma.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final /* synthetic */ zzglx zzaJ() {
        return (zzgkk) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final /* synthetic */ zzglx zzaK() {
        zzgkk zzgkkVar = (zzgkk) zzb(5, null, null);
        zzgkkVar.zzah(this);
        return zzgkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final void zzaO(zzgjv zzgjvVar) {
        zzgmg.zza().zzb(getClass()).zzn(this, zzgjw.zza(zzgjvVar));
    }

    public final boolean zzaP() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgmg.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgip
    public final int zzap() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgip
    public final void zzas(int i2) {
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final int zzav() {
        int i2 = this.zzd;
        if (i2 == -1) {
            int zza = zzgmg.zza().zzb(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i2;
    }

    public final zzgkk zzaw() {
        return (zzgkk) zzb(5, null, null);
    }

    public final zzgkk zzax() {
        zzgkk zzgkkVar = (zzgkk) zzb(5, null, null);
        zzgkkVar.zzah(this);
        return zzgkkVar;
    }

    public abstract Object zzb(int i2, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzglz
    public final /* synthetic */ zzgly zzbh() {
        return (zzgko) zzb(6, null, null);
    }
}

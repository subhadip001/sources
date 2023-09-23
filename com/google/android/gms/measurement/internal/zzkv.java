package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzpd;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import f.a.b.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class zzkv extends zzkh {
    public zzkv(zzkt zzktVar) {
        super(zzktVar);
    }

    public static final boolean zzA(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfx zzB(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    public static final Object zzC(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        com.google.android.gms.internal.measurement.zzfx zzB = zzB(zzftVar, str);
        if (zzB != null) {
            if (zzB.zzy()) {
                return zzB.zzh();
            }
            if (zzB.zzw()) {
                return Long.valueOf(zzB.zzd());
            }
            if (zzB.zzu()) {
                return Double.valueOf(zzB.zza());
            }
            if (zzB.zzc() > 0) {
                List<com.google.android.gms.internal.measurement.zzfx> zzi = zzB.zzi();
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzi) {
                    if (zzfxVar != null) {
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar2 : zzfxVar.zzi()) {
                            if (zzfxVar2.zzy()) {
                                bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                            } else if (zzfxVar2.zzw()) {
                                bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                            } else if (zzfxVar2.zzu()) {
                                bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
        return null;
    }

    private final void zzD(StringBuilder sb, int i2, List list) {
        if (list == null) {
            return;
        }
        int i3 = i2 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it.next();
            if (zzfxVar != null) {
                zzF(sb, i3);
                sb.append("param {\n");
                zzI(sb, i3, "name", zzfxVar.zzx() ? this.zzt.zzj().zze(zzfxVar.zzg()) : null);
                zzI(sb, i3, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                zzI(sb, i3, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                zzI(sb, i3, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    zzD(sb, i3, zzfxVar.zzi());
                }
                zzF(sb, i3);
                sb.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb, int i2, com.google.android.gms.internal.measurement.zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        zzF(sb, i2);
        sb.append("filter {\n");
        if (zzemVar.zzh()) {
            zzI(sb, i2, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            zzI(sb, i2, "param_name", this.zzt.zzj().zze(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i3 = i2 + 1;
            com.google.android.gms.internal.measurement.zzey zzd = zzemVar.zzd();
            if (zzd != null) {
                zzF(sb, i3);
                sb.append("string_filter {\n");
                if (zzd.zzi()) {
                    switch (zzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb, i3, "match_type", str);
                }
                if (zzd.zzh()) {
                    zzI(sb, i3, "expression", zzd.zzd());
                }
                if (zzd.zzg()) {
                    zzI(sb, i3, "case_sensitive", Boolean.valueOf(zzd.zzf()));
                }
                if (zzd.zza() > 0) {
                    zzF(sb, i3 + 1);
                    sb.append("expression_list {\n");
                    for (String str2 : zzd.zze()) {
                        zzF(sb, i3 + 2);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                zzF(sb, i3);
                sb.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            zzJ(sb, i2 + 1, "number_filter", zzemVar.zzc());
        }
        zzF(sb, i2);
        sb.append("}\n");
    }

    private static final void zzF(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    private static final String zzG(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzH(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        zzF(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            zzF(sb, 4);
            sb.append("results: ");
            int i3 = 0;
            for (Long l2 : zzgiVar.zzk()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            zzF(sb, 4);
            sb.append("status: ");
            int i5 = 0;
            for (Long l3 : zzgiVar.zzn()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l3);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            zzF(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i7 = 0;
            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzj()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(":");
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i7 = i8;
            }
            sb.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            zzF(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i9 = 0;
            for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzm()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(": [");
                int i11 = 0;
                for (Long l4 : zzgkVar.zzf()) {
                    long longValue = l4.longValue();
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i11 = i12;
                }
                sb.append("]");
                i9 = i10;
            }
            sb.append("}\n");
        }
        zzF(sb, 3);
        sb.append("}\n");
    }

    private static final void zzI(StringBuilder sb, int i2, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb, i2 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzJ(StringBuilder sb, int i2, String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        if (zzerVar == null) {
            return;
        }
        zzF(sb, i2);
        sb.append(str);
        sb.append(" {\n");
        if (zzerVar.zzg()) {
            int zzm = zzerVar.zzm();
            zzI(sb, i2, "comparison_type", zzm != 1 ? zzm != 2 ? zzm != 3 ? zzm != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (zzerVar.zzi()) {
            zzI(sb, i2, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            zzI(sb, i2, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            zzI(sb, i2, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            zzI(sb, i2, "max_comparison_value", zzerVar.zzd());
        }
        zzF(sb, i2);
        sb.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzgc zzgcVar, String str) {
        for (int i2 = 0; i2 < zzgcVar.zzb(); i2++) {
            if (str.equals(zzgcVar.zzao(i2).zzf())) {
                return i2;
            }
        }
        return -1;
    }

    public static zzll zzl(zzll zzllVar, byte[] bArr) {
        com.google.android.gms.internal.measurement.zzjr zza = com.google.android.gms.internal.measurement.zzjr.zza();
        if (zza != null) {
            return zzllVar.zzay(bArr, zza);
        }
        return zzllVar.zzax(bArr);
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 * 64) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i2) {
        if (i2 < list.size() * 64) {
            return ((1 << (i2 % 64)) & ((Long) list.get(i2 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str, Object obj) {
        List zzp = zzfsVar.zzp();
        int i2 = 0;
        while (true) {
            if (i2 >= zzp.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i2)).zzg())) {
                break;
            } else {
                i2++;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj(str);
        if (obj instanceof Long) {
            zze.zzi(((Long) obj).longValue());
        }
        if (i2 >= 0) {
            zzfsVar.zzj(i2, zze);
        } else {
            zzfsVar.zze(zze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }

    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzt.zzv().zzg();
        MessageDigest zzF = zzlb.zzF();
        if (zzF == null) {
            a.J(this.zzt, "Failed to get MD5");
            return 0L;
        }
        return zzlb.zzp(zzF.digest(bArr));
    }

    public final Bundle zzf(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(zzf((Map) arrayList.get(i2), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzt.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzaw zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle zzf = zzf(zzaaVar.zze(), true);
        String obj2 = (!zzf.containsKey(CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY) || (obj = zzf.get(CrashlyticsAnalyticsListener.EVENT_ORIGIN_KEY)) == null) ? "app" : obj.toString();
        String zzb = zzgo.zzb(zzaaVar.zzd());
        if (zzb == null) {
            zzb = zzaaVar.zzd();
        }
        return new zzaw(zzb, new zzau(zzf), obj2, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzft zzj(zzar zzarVar) {
        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
        zze.zzl(zzarVar.zze);
        zzat zzatVar = new zzat(zzarVar.zzf);
        while (zzatVar.hasNext()) {
            String next = zzatVar.next();
            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
            zze2.zzj(next);
            Object zzf = zzarVar.zzf.zzf(next);
            Preconditions.checkNotNull(zzf);
            zzt(zze2, zzf);
            zze.zze(zze2);
        }
        return (com.google.android.gms.internal.measurement.zzft) zze.zzaC();
    }

    public final String zzm(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder A = a.A("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                zzF(A, 1);
                A.append("bundle {\n");
                if (zzgdVar.zzbj()) {
                    zzI(A, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzpd.zzc();
                if (this.zzt.zzf().zzs(null, zzdu.zzal) && this.zzt.zzf().zzs(zzgdVar.zzx(), zzdu.zzan) && zzgdVar.zzbm()) {
                    zzI(A, 1, "session_stitching_token", zzgdVar.zzK());
                }
                zzI(A, 1, "platform", zzgdVar.zzI());
                if (zzgdVar.zzbf()) {
                    zzI(A, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbq()) {
                    zzI(A, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbd()) {
                    zzI(A, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzba()) {
                    zzI(A, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                zzI(A, 1, "gmp_app_id", zzgdVar.zzF());
                zzI(A, 1, "admob_app_id", zzgdVar.zzw());
                zzI(A, 1, "app_id", zzgdVar.zzx());
                zzI(A, 1, "app_version", zzgdVar.zzA());
                if (zzgdVar.zzaY()) {
                    zzI(A, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                zzI(A, 1, "firebase_instance_id", zzgdVar.zzE());
                if (zzgdVar.zzbc()) {
                    zzI(A, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                zzI(A, 1, "app_store", zzgdVar.zzz());
                if (zzgdVar.zzbp()) {
                    zzI(A, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzq()));
                }
                if (zzgdVar.zzbn()) {
                    zzI(A, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbe()) {
                    zzI(A, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbi()) {
                    zzI(A, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbh()) {
                    zzI(A, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                zzI(A, 1, "app_instance_id", zzgdVar.zzy());
                zzI(A, 1, "resettable_device_id", zzgdVar.zzJ());
                zzI(A, 1, "ds_id", zzgdVar.zzD());
                if (zzgdVar.zzbg()) {
                    zzI(A, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaW()));
                }
                zzI(A, 1, "os_version", zzgdVar.zzH());
                zzI(A, 1, "device_model", zzgdVar.zzC());
                zzI(A, 1, "user_default_language", zzgdVar.zzL());
                if (zzgdVar.zzbo()) {
                    zzI(A, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzaZ()) {
                    zzI(A, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbl()) {
                    zzI(A, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaX()));
                }
                zzI(A, 1, "health_monitor", zzgdVar.zzG());
                if (zzgdVar.zzbk()) {
                    zzI(A, 1, "retry_counter", Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbb()) {
                    zzI(A, 1, "consent_signals", zzgdVar.zzB());
                }
                List<com.google.android.gms.internal.measurement.zzgm> zzO = zzgdVar.zzO();
                if (zzO != null) {
                    for (com.google.android.gms.internal.measurement.zzgm zzgmVar : zzO) {
                        if (zzgmVar != null) {
                            zzF(A, 2);
                            A.append("user_property {\n");
                            zzI(A, 2, "set_timestamp_millis", zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            zzI(A, 2, "name", this.zzt.zzj().zzf(zzgmVar.zzf()));
                            zzI(A, 2, "string_value", zzgmVar.zzg());
                            zzI(A, 2, "int_value", zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            zzI(A, 2, "double_value", zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            zzF(A, 2);
                            A.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> zzM = zzgdVar.zzM();
                if (zzM != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : zzM) {
                        if (zzfpVar != null) {
                            zzF(A, 2);
                            A.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                zzI(A, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                zzI(A, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            zzH(A, 2, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                zzH(A, 2, "previous_data", zzfpVar.zze());
                            }
                            zzF(A, 2);
                            A.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzft> zzN = zzgdVar.zzN();
                if (zzN != null) {
                    for (com.google.android.gms.internal.measurement.zzft zzftVar : zzN) {
                        if (zzftVar != null) {
                            zzF(A, 2);
                            A.append("event {\n");
                            zzI(A, 2, "name", this.zzt.zzj().zzd(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                zzI(A, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                zzI(A, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                zzI(A, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                zzD(A, 2, zzftVar.zzi());
                            }
                            zzF(A, 2);
                            A.append("}\n");
                        }
                    }
                }
                zzF(A, 1);
                A.append("}\n");
            }
        }
        A.append("}\n");
        return A.toString();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzek zzekVar) {
        if (zzekVar == null) {
            return "null";
        }
        StringBuilder A = a.A("\nevent_filter {\n");
        if (zzekVar.zzp()) {
            zzI(A, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
        }
        zzI(A, 0, "event_name", this.zzt.zzj().zzd(zzekVar.zzg()));
        String zzG = zzG(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
        if (!zzG.isEmpty()) {
            zzI(A, 0, "filter_type", zzG);
        }
        if (zzekVar.zzo()) {
            zzJ(A, 1, "event_count_filter", zzekVar.zzf());
        }
        if (zzekVar.zza() > 0) {
            A.append("  filters {\n");
            for (com.google.android.gms.internal.measurement.zzem zzemVar : zzekVar.zzh()) {
                zzE(A, 2, zzemVar);
            }
        }
        zzF(A, 1);
        A.append("}\n}\n");
        return A.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzet zzetVar) {
        if (zzetVar == null) {
            return "null";
        }
        StringBuilder A = a.A("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            zzI(A, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        zzI(A, 0, "property_name", this.zzt.zzj().zzf(zzetVar.zze()));
        String zzG = zzG(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!zzG.isEmpty()) {
            zzI(A, 0, "filter_type", zzG);
        }
        zzE(A, 1, zzetVar.zzb());
        A.append("}\n");
        return A.toString();
    }

    public final List zzq(List list, List list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzt.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.zzt.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r7 >= r4) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        r5.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if ((r3 instanceof java.util.ArrayList) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        if (r7 >= r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
        if ((r8 instanceof android.os.Bundle) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        r5.add(zzs((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if ((r3 instanceof android.os.Bundle) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        r5.add(zzs((android.os.Bundle) r3, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
        r0.put(r2, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map zzs(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzs(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L70
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.zzs(r8, r6)
            r5.add(r8)
        L70:
            int r7 = r7 + 1
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.zzs(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkv.zzs(android.os.Bundle, boolean):java.util.Map");
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzfw zzfwVar, Object obj) {
        Bundle[] bundleArr;
        Preconditions.checkNotNull(obj);
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
        } else if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
                    for (String str : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                        zze2.zzj(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zze2.zzi(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zze2.zzk((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zze2.zzh(((Double) obj2).doubleValue());
                        }
                        zze.zzc(zze2);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((com.google.android.gms.internal.measurement.zzfx) zze.zzaC());
                    }
                }
            }
            zzfwVar.zzb(arrayList);
        } else {
            this.zzt.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
        }
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzgl zzglVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
        } else if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzglVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzt.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzw(long j2, long j3) {
        return j2 == 0 || j3 <= 0 || Math.abs(this.zzt.zzav().currentTimeMillis() - j2) > j3;
    }

    public final byte[] zzy(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            this.zzt.zzay().zzd().zzb("Failed to gzip content", e2);
            throw e2;
        }
    }
}

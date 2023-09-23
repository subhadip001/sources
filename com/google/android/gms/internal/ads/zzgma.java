package com.google.android.gms.internal.ads;

import f.a.b.a.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzgma {
    public static String zza(zzgly zzglyVar, String str) {
        StringBuilder D = a.D("# ", str);
        zzd(zzglyVar, D, 0);
        return D.toString();
    }

    public static final void zzb(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                zzb(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzb(sb, i2, str, entry);
            }
        } else {
            sb.append('\n');
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzgng.zza(zzgjg.zzx((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzgjg) {
                sb.append(": \"");
                sb.append(zzgng.zza((zzgjg) obj));
                sb.append('\"');
            } else if (obj instanceof zzgko) {
                sb.append(" {");
                zzd((zzgko) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i5 = i2 + 2;
                zzb(sb, i5, "key", entry2.getKey());
                zzb(sb, i5, "value", entry2.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static final String zzc(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    private static void zzd(zzgly zzglyVar, StringBuilder sb, int i2) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzglyVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb, i2, zzc(concat), zzgko.zzaL(method2, zzglyVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb, i2, zzc(concat2), zzgko.zzaL(method3, zzglyVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaL = zzgko.zzaL(method4, zzglyVar, new Object[0]);
                    if (method5 == null) {
                        if (zzaL instanceof Boolean) {
                            if (((Boolean) zzaL).booleanValue()) {
                                zzb(sb, i2, zzc(concat3), zzaL);
                            }
                        } else if (zzaL instanceof Integer) {
                            if (((Integer) zzaL).intValue() != 0) {
                                zzb(sb, i2, zzc(concat3), zzaL);
                            }
                        } else if (zzaL instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaL).floatValue()) != 0) {
                                zzb(sb, i2, zzc(concat3), zzaL);
                            }
                        } else if (zzaL instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzaL).doubleValue()) != 0) {
                                zzb(sb, i2, zzc(concat3), zzaL);
                            }
                        } else {
                            if (zzaL instanceof String) {
                                equals = zzaL.equals("");
                            } else if (zzaL instanceof zzgjg) {
                                equals = zzaL.equals(zzgjg.zzb);
                            } else if (zzaL instanceof zzgly) {
                                if (zzaL != ((zzgly) zzaL).zzbh()) {
                                    zzb(sb, i2, zzc(concat3), zzaL);
                                }
                            } else {
                                if ((zzaL instanceof Enum) && ((Enum) zzaL).ordinal() == 0) {
                                }
                                zzb(sb, i2, zzc(concat3), zzaL);
                            }
                            if (!equals) {
                                zzb(sb, i2, zzc(concat3), zzaL);
                            }
                        }
                    } else if (((Boolean) zzgko.zzaL(method5, zzglyVar, new Object[0])).booleanValue()) {
                        zzb(sb, i2, zzc(concat3), zzaL);
                    }
                }
            }
        }
        if (!(zzglyVar instanceof zzgkl)) {
            zzgnj zzgnjVar = ((zzgko) zzglyVar).zzc;
            if (zzgnjVar != null) {
                zzgnjVar.zzg(sb, i2);
                return;
            }
            return;
        }
        zzgkl zzgklVar = (zzgkl) zzglyVar;
        throw null;
    }
}

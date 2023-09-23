package com.google.android.gms.internal.measurement;

import f.a.b.a.a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class zzlo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlm zzlmVar, String str) {
        StringBuilder D = a.D("# ", str);
        zzd(zzlmVar, D, 0);
        return D.toString();
    }

    public static void zzb(StringBuilder sb, int i2, String str, Object obj) {
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
            zzc(i2, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i3 = 1; i3 < str.length(); i3++) {
                    char charAt = str.charAt(i3);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(zzmm.zza(zzje.zzm((String) obj)));
                sb.append('\"');
            } else if (obj instanceof zzje) {
                sb.append(": \"");
                sb.append(zzmm.zza((zzje) obj));
                sb.append('\"');
            } else if (obj instanceof zzkf) {
                sb.append(" {");
                zzd((zzkf) obj, sb, i2 + 2);
                sb.append("\n");
                zzc(i2, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i2 + 2;
                zzb(sb, i4, "key", entry2.getKey());
                zzb(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                zzc(i2, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    private static void zzc(int i2, StringBuilder sb) {
        while (i2 > 0) {
            int i3 = 80;
            if (i2 <= 80) {
                i3 = i2;
            }
            sb.append(zza, 0, i3);
            i2 -= i3;
        }
    }

    private static void zzd(zzlm zzlmVar, StringBuilder sb, int i2) {
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzlmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i3 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i3);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i2, substring.substring(0, substring.length() - 4), zzkf.zzbH(method2, zzlmVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i2, substring.substring(0, substring.length() - 3), zzkf.zzbH(method, zzlmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzbH = zzkf.zzbH(method4, zzlmVar, new Object[0]);
                    if (method5 == null) {
                        if (zzbH instanceof Boolean) {
                            if (!((Boolean) zzbH).booleanValue()) {
                            }
                            zzb(sb, i2, substring, zzbH);
                        } else if (zzbH instanceof Integer) {
                            if (((Integer) zzbH).intValue() == 0) {
                            }
                            zzb(sb, i2, substring, zzbH);
                        } else if (zzbH instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzbH).floatValue()) == 0) {
                            }
                            zzb(sb, i2, substring, zzbH);
                        } else if (zzbH instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) zzbH).doubleValue()) == 0) {
                            }
                            zzb(sb, i2, substring, zzbH);
                        } else {
                            if (zzbH instanceof String) {
                                equals = zzbH.equals("");
                            } else if (zzbH instanceof zzje) {
                                equals = zzbH.equals(zzje.zzb);
                            } else if (zzbH instanceof zzlm) {
                                if (zzbH == ((zzlm) zzbH).zzbS()) {
                                }
                                zzb(sb, i2, substring, zzbH);
                            } else {
                                if ((zzbH instanceof Enum) && ((Enum) zzbH).ordinal() == 0) {
                                }
                                zzb(sb, i2, substring, zzbH);
                            }
                            if (equals) {
                            }
                            zzb(sb, i2, substring, zzbH);
                        }
                    } else {
                        if (!((Boolean) zzkf.zzbH(method5, zzlmVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb, i2, substring, zzbH);
                    }
                }
            }
            i3 = 3;
        }
        if (!(zzlmVar instanceof zzkc)) {
            zzmp zzmpVar = ((zzkf) zzlmVar).zzc;
            if (zzmpVar != null) {
                zzmpVar.zzi(sb, i2);
                return;
            }
            return;
        }
        zzkc zzkcVar = (zzkc) zzlmVar;
        throw null;
    }
}

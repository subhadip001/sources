package e.g0;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Data.java */
/* loaded from: classes.dex */
public final class e {
    public static final String b = k.e("Data");
    public static final e c;
    public Map<String, Object> a;

    /* compiled from: Data.java */
    /* loaded from: classes.dex */
    public static final class a {
        public Map<String, Object> a = new HashMap();

        public e a() {
            e eVar = new e(this.a);
            e.c(eVar);
            return eVar;
        }

        public a b(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.a.put(key, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
                        int i2 = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.a;
                            boolean[] zArr = (boolean[]) value;
                            String str = e.b;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i2 < zArr.length) {
                                boolArr[i2] = Boolean.valueOf(zArr[i2]);
                                i2++;
                            }
                            map2.put(key, boolArr);
                        } else if (cls == byte[].class) {
                            Map<String, Object> map3 = this.a;
                            byte[] bArr = (byte[]) value;
                            String str2 = e.b;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i2 < bArr.length) {
                                bArr2[i2] = Byte.valueOf(bArr[i2]);
                                i2++;
                            }
                            map3.put(key, bArr2);
                        } else if (cls == int[].class) {
                            Map<String, Object> map4 = this.a;
                            int[] iArr = (int[]) value;
                            String str3 = e.b;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i2 < iArr.length) {
                                numArr[i2] = Integer.valueOf(iArr[i2]);
                                i2++;
                            }
                            map4.put(key, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map5 = this.a;
                            long[] jArr = (long[]) value;
                            String str4 = e.b;
                            Long[] lArr = new Long[jArr.length];
                            while (i2 < jArr.length) {
                                lArr[i2] = Long.valueOf(jArr[i2]);
                                i2++;
                            }
                            map5.put(key, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map6 = this.a;
                            float[] fArr = (float[]) value;
                            String str5 = e.b;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i2 < fArr.length) {
                                fArr2[i2] = Float.valueOf(fArr[i2]);
                                i2++;
                            }
                            map6.put(key, fArr2);
                        } else if (cls == double[].class) {
                            Map<String, Object> map7 = this.a;
                            double[] dArr = (double[]) value;
                            String str6 = e.b;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i2 < dArr.length) {
                                dArr2[i2] = Double.valueOf(dArr[i2]);
                                i2++;
                            }
                            map7.put(key, dArr2);
                        } else {
                            throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                        }
                    } else {
                        this.a.put(key, value);
                    }
                }
            }
            return this;
        }
    }

    static {
        e eVar = new e(new HashMap());
        c(eVar);
        c = eVar;
    }

    public e() {
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e.g0.e a(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L7f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L41 java.lang.ClassNotFoundException -> L43 java.io.IOException -> L45
            int r7 = r3.readInt()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
        L1b:
            if (r7 <= 0) goto L2b
            java.lang.String r4 = r3.readUTF()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            java.lang.Object r5 = r3.readObject()     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L3b java.lang.ClassNotFoundException -> L3d java.io.IOException -> L3f
            int r7 = r7 + (-1)
            goto L1b
        L2b:
            r3.close()     // Catch: java.io.IOException -> L2f
            goto L35
        L2f:
            r7 = move-exception
            java.lang.String r3 = e.g0.e.b
            android.util.Log.e(r3, r0, r7)
        L35:
            r2.close()     // Catch: java.io.IOException -> L39
            goto L60
        L39:
            r7 = move-exception
            goto L5b
        L3b:
            r7 = move-exception
            goto L66
        L3d:
            r7 = move-exception
            goto L49
        L3f:
            r7 = move-exception
            goto L49
        L41:
            r1 = move-exception
            goto L68
        L43:
            r3 = move-exception
            goto L46
        L45:
            r3 = move-exception
        L46:
            r6 = r3
            r3 = r7
            r7 = r6
        L49:
            java.lang.String r4 = e.g0.e.b     // Catch: java.lang.Throwable -> L3b
            android.util.Log.e(r4, r0, r7)     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L54
            goto L35
        L54:
            r7 = move-exception
            java.lang.String r3 = e.g0.e.b
            android.util.Log.e(r3, r0, r7)
            goto L35
        L5b:
            java.lang.String r2 = e.g0.e.b
            android.util.Log.e(r2, r0, r7)
        L60:
            e.g0.e r7 = new e.g0.e
            r7.<init>(r1)
            return r7
        L66:
            r1 = r7
            r7 = r3
        L68:
            if (r7 == 0) goto L74
            r7.close()     // Catch: java.io.IOException -> L6e
            goto L74
        L6e:
            r7 = move-exception
            java.lang.String r3 = e.g0.e.b
            android.util.Log.e(r3, r0, r7)
        L74:
            r2.close()     // Catch: java.io.IOException -> L78
            goto L7e
        L78:
            r7 = move-exception
            java.lang.String r2 = e.g0.e.b
            android.util.Log.e(r2, r0, r7)
        L7e:
            throw r1
        L7f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g0.e.a(byte[]):e.g0.e");
    }

    public static byte[] c(e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(eVar.a.size());
                    for (Map.Entry<String, Object> entry : eVar.a.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e2) {
                        Log.e(b, "Error in Data#toByteArray: ", e2);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        Log.e(b, "Error in Data#toByteArray: ", e3);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e4) {
                    e = e4;
                    objectOutputStream = objectOutputStream2;
                    Log.e(b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e5) {
                            Log.e(b, "Error in Data#toByteArray: ", e5);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e6) {
                        Log.e(b, "Error in Data#toByteArray: ", e6);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e7) {
                            Log.e(b, "Error in Data#toByteArray: ", e7);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        Log.e(b, "Error in Data#toByteArray: ", e8);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    public String b(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set<String> keySet = this.a.keySet();
        if (keySet.equals(eVar.a.keySet())) {
            for (String str : keySet) {
                Object obj2 = this.a.get(str);
                Object obj3 = eVar.a.get(str);
                if (obj2 == null || obj3 == null) {
                    if (obj2 == obj3) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } else if ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) {
                    z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                    continue;
                } else {
                    z = obj2.equals(obj3);
                    continue;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String str : this.a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public e(e eVar) {
        this.a = new HashMap(eVar.a);
    }

    public e(Map<String, ?> map) {
        this.a = new HashMap(map);
    }
}

package f.h.f.z.z;

import com.google.gson.stream.JsonToken;
import f.h.f.z.s;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class e extends f.h.f.b0.a {
    public Object[] v;
    public int w;
    public String[] x;
    public int[] y;
    public static final Reader z = new a();
    public static final Object A = new Object();

    /* compiled from: JsonTreeReader.java */
    /* loaded from: classes2.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public e(f.h.f.p pVar) {
        super(z);
        this.v = new Object[32];
        this.w = 0;
        this.x = new String[32];
        this.y = new int[32];
        C0(pVar);
    }

    private String N() {
        StringBuilder A2 = f.a.b.a.a.A(" at path ");
        A2.append(C());
        return A2.toString();
    }

    public final Object A0() {
        return this.v[this.w - 1];
    }

    public final Object B0() {
        Object[] objArr = this.v;
        int i2 = this.w - 1;
        this.w = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    @Override // f.h.f.b0.a
    public String C() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.w) {
            Object[] objArr = this.v;
            if (objArr[i2] instanceof f.h.f.m) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.y[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof f.h.f.r) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.x;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    public final void C0(Object obj) {
        int i2 = this.w;
        Object[] objArr = this.v;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.v = Arrays.copyOf(objArr, i3);
            this.y = Arrays.copyOf(this.y, i3);
            this.x = (String[]) Arrays.copyOf(this.x, i3);
        }
        Object[] objArr2 = this.v;
        int i4 = this.w;
        this.w = i4 + 1;
        objArr2[i4] = obj;
    }

    @Override // f.h.f.b0.a
    public boolean F() {
        JsonToken s0 = s0();
        return (s0 == JsonToken.END_OBJECT || s0 == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // f.h.f.b0.a
    public boolean O() {
        z0(JsonToken.BOOLEAN);
        boolean d2 = ((f.h.f.s) B0()).d();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return d2;
    }

    @Override // f.h.f.b0.a
    public double T() {
        JsonToken s0 = s0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (s0 != jsonToken && s0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + s0 + N());
        }
        f.h.f.s sVar = (f.h.f.s) A0();
        double doubleValue = sVar.a instanceof Number ? sVar.e().doubleValue() : Double.parseDouble(sVar.c());
        if (!this.f6207g && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + doubleValue);
        }
        B0();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return doubleValue;
    }

    @Override // f.h.f.b0.a
    public int W() {
        JsonToken s0 = s0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (s0 != jsonToken && s0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + s0 + N());
        }
        f.h.f.s sVar = (f.h.f.s) A0();
        int intValue = sVar.a instanceof Number ? sVar.e().intValue() : Integer.parseInt(sVar.c());
        B0();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return intValue;
    }

    @Override // f.h.f.b0.a
    public long X() {
        JsonToken s0 = s0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (s0 != jsonToken && s0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + s0 + N());
        }
        f.h.f.s sVar = (f.h.f.s) A0();
        long longValue = sVar.a instanceof Number ? sVar.e().longValue() : Long.parseLong(sVar.c());
        B0();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return longValue;
    }

    @Override // f.h.f.b0.a
    public void a() {
        z0(JsonToken.BEGIN_ARRAY);
        C0(((f.h.f.m) A0()).iterator());
        this.y[this.w - 1] = 0;
    }

    @Override // f.h.f.b0.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.v = new Object[]{A};
        this.w = 1;
    }

    @Override // f.h.f.b0.a
    public String d0() {
        z0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) A0()).next();
        String str = (String) entry.getKey();
        this.x[this.w - 1] = str;
        C0(entry.getValue());
        return str;
    }

    @Override // f.h.f.b0.a
    public void f() {
        z0(JsonToken.BEGIN_OBJECT);
        C0(new s.b.a((s.b) ((f.h.f.r) A0()).a.entrySet()));
    }

    @Override // f.h.f.b0.a
    public void i0() {
        z0(JsonToken.NULL);
        B0();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // f.h.f.b0.a
    public void p() {
        z0(JsonToken.END_ARRAY);
        B0();
        B0();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // f.h.f.b0.a
    public void q() {
        z0(JsonToken.END_OBJECT);
        B0();
        B0();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // f.h.f.b0.a
    public String q0() {
        JsonToken s0 = s0();
        JsonToken jsonToken = JsonToken.STRING;
        if (s0 != jsonToken && s0 != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + s0 + N());
        }
        String c = ((f.h.f.s) B0()).c();
        int i2 = this.w;
        if (i2 > 0) {
            int[] iArr = this.y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return c;
    }

    @Override // f.h.f.b0.a
    public JsonToken s0() {
        if (this.w == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object A0 = A0();
        if (A0 instanceof Iterator) {
            boolean z2 = this.v[this.w - 2] instanceof f.h.f.r;
            Iterator it = (Iterator) A0;
            if (!it.hasNext()) {
                return z2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            } else if (z2) {
                return JsonToken.NAME;
            } else {
                C0(it.next());
                return s0();
            }
        } else if (A0 instanceof f.h.f.r) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (A0 instanceof f.h.f.m) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (A0 instanceof f.h.f.s) {
                Object obj = ((f.h.f.s) A0).a;
                if (obj instanceof String) {
                    return JsonToken.STRING;
                }
                if (obj instanceof Boolean) {
                    return JsonToken.BOOLEAN;
                }
                if (obj instanceof Number) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (A0 instanceof f.h.f.q) {
                return JsonToken.NULL;
            } else {
                if (A0 == A) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // f.h.f.b0.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // f.h.f.b0.a
    public void x0() {
        if (s0() == JsonToken.NAME) {
            d0();
            this.x[this.w - 2] = "null";
        } else {
            B0();
            int i2 = this.w;
            if (i2 > 0) {
                this.x[i2 - 1] = "null";
            }
        }
        int i3 = this.w;
        if (i3 > 0) {
            int[] iArr = this.y;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    public final void z0(JsonToken jsonToken) {
        if (s0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + s0() + N());
    }
}

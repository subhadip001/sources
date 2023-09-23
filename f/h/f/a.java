package f.h.f;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes2.dex */
public final class a extends w<Date> {
    public final Class<? extends Date> a;
    public final List<DateFormat> b;

    public a(Class<? extends Date> cls, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        c(cls);
        this.a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (f.h.f.z.p.a >= 9) {
            arrayList.add(f.h.b.c.a.s0(i2, i3));
        }
    }

    public static Class<? extends Date> c(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        r4 = f.h.f.z.z.u.a.b(r4, new java.text.ParsePosition(0));
     */
    @Override // f.h.f.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Date a(f.h.f.b0.a r4) {
        /*
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r4.s0()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r4.i0()
            r4 = 0
            goto L5b
        Ld:
            java.lang.String r4 = r4.q0()
            java.util.List<java.text.DateFormat> r0 = r3.b
            monitor-enter(r0)
            java.util.List<java.text.DateFormat> r1 = r3.b     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L69
        L1a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L69
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L69
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L1a java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            goto L37
        L2c:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L62 java.lang.Throwable -> L69
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L62 java.lang.Throwable -> L69
            java.util.Date r4 = f.h.f.z.z.u.a.b(r4, r1)     // Catch: java.text.ParseException -> L62 java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
        L37:
            java.lang.Class<? extends java.util.Date> r0 = r3.a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L3e
            goto L5b
        L3e:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L4d
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L4b:
            r4 = r0
            goto L5b
        L4d:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L5c
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L4b
        L5b:
            return r4
        L5c:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L62:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L69
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L69
            throw r2     // Catch: java.lang.Throwable -> L69
        L69:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.h.f.a.a(f.h.f.b0.a):java.lang.Object");
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Date date) {
        Date date2 = date;
        if (date2 == null) {
            bVar.F();
            return;
        }
        synchronized (this.b) {
            bVar.g0(this.b.get(0).format(date2));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder A = f.a.b.a.a.A("DefaultDateTypeAdapter(");
            A.append(((SimpleDateFormat) dateFormat).toPattern());
            A.append(')');
            return A.toString();
        }
        StringBuilder A2 = f.a.b.a.a.A("DefaultDateTypeAdapter(");
        A2.append(dateFormat.getClass().getSimpleName());
        A2.append(')');
        return A2.toString();
    }
}

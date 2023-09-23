package f.h.f.z.z;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import f.h.f.w;
import f.h.f.x;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* compiled from: DateTypeAdapter.java */
/* loaded from: classes2.dex */
public final class c extends w<Date> {
    public static final x b = new a();
    public final List<DateFormat> a;

    /* compiled from: DateTypeAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements x {
        @Override // f.h.f.x
        public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new c();
            }
            return null;
        }
    }

    public c() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (f.h.f.z.p.a >= 9) {
            arrayList.add(f.h.b.c.a.s0(2, 2));
        }
    }

    @Override // f.h.f.w
    public Date a(f.h.f.b0.a aVar) {
        if (aVar.s0() == JsonToken.NULL) {
            aVar.i0();
            return null;
        }
        String q0 = aVar.q0();
        synchronized (this) {
            for (DateFormat dateFormat : this.a) {
                try {
                    return dateFormat.parse(q0);
                } catch (ParseException unused) {
                }
            }
            try {
                return f.h.f.z.z.u.a.b(q0, new ParsePosition(0));
            } catch (ParseException e2) {
                throw new JsonSyntaxException(q0, e2);
            }
        }
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                bVar.F();
                return;
            }
            bVar.g0(this.a.get(0).format(date2));
        }
    }
}

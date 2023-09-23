package f.h.f.z.z;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import f.h.f.w;
import f.h.f.x;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* loaded from: classes2.dex */
public final class k extends w<Date> {
    public static final x b = new a();
    public final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements x {
        @Override // f.h.f.x
        public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            if (aVar.a == Date.class) {
                return new k();
            }
            return null;
        }
    }

    @Override // f.h.f.w
    public Date a(f.h.f.b0.a aVar) {
        Date date;
        synchronized (this) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                date = null;
            } else {
                try {
                    date = new Date(this.a.parse(aVar.q0()).getTime());
                } catch (ParseException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
        }
        return date;
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Date date) {
        Date date2 = date;
        synchronized (this) {
            bVar.g0(date2 == null ? null : this.a.format((java.util.Date) date2));
        }
    }
}

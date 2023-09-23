package f.h.f.z.z;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import f.h.f.w;
import f.h.f.x;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* loaded from: classes2.dex */
public final class l extends w<Time> {
    public static final x b = new a();
    public final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements x {
        @Override // f.h.f.x
        public <T> w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            if (aVar.a == Time.class) {
                return new l();
            }
            return null;
        }
    }

    @Override // f.h.f.w
    public Time a(f.h.f.b0.a aVar) {
        synchronized (this) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return new Time(this.a.parse(aVar.q0()).getTime());
            } catch (ParseException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
    }

    @Override // f.h.f.w
    public void b(f.h.f.b0.b bVar, Time time) {
        Time time2 = time;
        synchronized (this) {
            bVar.g0(time2 == null ? null : this.a.format((Date) time2));
        }
    }
}

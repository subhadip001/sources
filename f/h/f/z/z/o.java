package f.h.f.z.z;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import f.h.f.z.s;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* compiled from: TypeAdapters.java */
/* loaded from: classes2.dex */
public final class o {
    public static final f.h.f.w<String> A;
    public static final f.h.f.w<BigDecimal> B;
    public static final f.h.f.w<BigInteger> C;
    public static final f.h.f.x D;
    public static final f.h.f.w<StringBuilder> E;
    public static final f.h.f.x F;
    public static final f.h.f.w<StringBuffer> G;
    public static final f.h.f.x H;
    public static final f.h.f.w<URL> I;
    public static final f.h.f.x J;
    public static final f.h.f.w<URI> K;
    public static final f.h.f.x L;
    public static final f.h.f.w<InetAddress> M;
    public static final f.h.f.x N;
    public static final f.h.f.w<UUID> O;
    public static final f.h.f.x P;
    public static final f.h.f.w<Currency> Q;
    public static final f.h.f.x R;
    public static final f.h.f.x S;
    public static final f.h.f.w<Calendar> T;
    public static final f.h.f.x U;
    public static final f.h.f.w<Locale> V;
    public static final f.h.f.x W;
    public static final f.h.f.w<f.h.f.p> X;
    public static final f.h.f.x Y;
    public static final f.h.f.x Z;
    public static final f.h.f.w<Class> a;
    public static final f.h.f.x b;
    public static final f.h.f.w<BitSet> c;

    /* renamed from: d  reason: collision with root package name */
    public static final f.h.f.x f6300d;

    /* renamed from: e  reason: collision with root package name */
    public static final f.h.f.w<Boolean> f6301e;

    /* renamed from: f  reason: collision with root package name */
    public static final f.h.f.w<Boolean> f6302f;

    /* renamed from: g  reason: collision with root package name */
    public static final f.h.f.x f6303g;

    /* renamed from: h  reason: collision with root package name */
    public static final f.h.f.w<Number> f6304h;

    /* renamed from: i  reason: collision with root package name */
    public static final f.h.f.x f6305i;

    /* renamed from: j  reason: collision with root package name */
    public static final f.h.f.w<Number> f6306j;

    /* renamed from: k  reason: collision with root package name */
    public static final f.h.f.x f6307k;

    /* renamed from: l  reason: collision with root package name */
    public static final f.h.f.w<Number> f6308l;

    /* renamed from: m  reason: collision with root package name */
    public static final f.h.f.x f6309m;
    public static final f.h.f.w<AtomicInteger> n;
    public static final f.h.f.x o;
    public static final f.h.f.w<AtomicBoolean> p;
    public static final f.h.f.x q;
    public static final f.h.f.w<AtomicIntegerArray> r;
    public static final f.h.f.x s;
    public static final f.h.f.w<Number> t;
    public static final f.h.f.w<Number> u;
    public static final f.h.f.w<Number> v;
    public static final f.h.f.w<Number> w;
    public static final f.h.f.x x;
    public static final f.h.f.w<Character> y;
    public static final f.h.f.x z;

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class a extends f.h.f.w<AtomicIntegerArray> {
        @Override // f.h.f.w
        public AtomicIntegerArray a(f.h.f.b0.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.F()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.W()));
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }
            aVar.p();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, AtomicIntegerArray atomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray2 = atomicIntegerArray;
            bVar.f();
            int length = atomicIntegerArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                bVar.W(atomicIntegerArray2.get(i2));
            }
            bVar.p();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class a0 extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.W());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class b extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return Long.valueOf(aVar.X());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class b0 extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return Integer.valueOf(aVar.W());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class c extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return Float.valueOf((float) aVar.T());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class c0 extends f.h.f.w<AtomicInteger> {
        @Override // f.h.f.w
        public AtomicInteger a(f.h.f.b0.a aVar) {
            try {
                return new AtomicInteger(aVar.W());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, AtomicInteger atomicInteger) {
            bVar.W(atomicInteger.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class d extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return Double.valueOf(aVar.T());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class d0 extends f.h.f.w<AtomicBoolean> {
        @Override // f.h.f.w
        public AtomicBoolean a(f.h.f.b0.a aVar) {
            return new AtomicBoolean(aVar.O());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, AtomicBoolean atomicBoolean) {
            bVar.i0(atomicBoolean.get());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class e extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            JsonToken s0 = aVar.s0();
            int ordinal = s0.ordinal();
            if (ordinal == 5 || ordinal == 6) {
                return new f.h.f.z.r(aVar.q0());
            }
            if (ordinal == 8) {
                aVar.i0();
                return null;
            }
            throw new JsonSyntaxException("Expecting number, got: " + s0);
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public static final class e0<T extends Enum<T>> extends f.h.f.w<T> {
        public final Map<String, T> a = new HashMap();
        public final Map<T, String> b = new HashMap();

        public e0(Class<T> cls) {
            T[] enumConstants;
            try {
                for (T t : cls.getEnumConstants()) {
                    String name = t.name();
                    f.h.f.y.b bVar = (f.h.f.y.b) cls.getField(name).getAnnotation(f.h.f.y.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String str : bVar.alternate()) {
                            this.a.put(str, t);
                        }
                    }
                    this.a.put(name, t);
                    this.b.put(t, name);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // f.h.f.w
        public Object a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return this.a.get(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Object obj) {
            Enum r3 = (Enum) obj;
            bVar.g0(r3 == null ? null : this.b.get(r3));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class f extends f.h.f.w<Character> {
        @Override // f.h.f.w
        public Character a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            String q0 = aVar.q0();
            if (q0.length() == 1) {
                return Character.valueOf(q0.charAt(0));
            }
            throw new JsonSyntaxException(f.a.b.a.a.p("Expecting character, got: ", q0));
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Character ch) {
            Character ch2 = ch;
            bVar.g0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class g extends f.h.f.w<String> {
        @Override // f.h.f.w
        public String a(f.h.f.b0.a aVar) {
            JsonToken s0 = aVar.s0();
            if (s0 == JsonToken.NULL) {
                aVar.i0();
                return null;
            } else if (s0 == JsonToken.BOOLEAN) {
                return Boolean.toString(aVar.O());
            } else {
                return aVar.q0();
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, String str) {
            bVar.g0(str);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class h extends f.h.f.w<BigDecimal> {
        @Override // f.h.f.w
        public BigDecimal a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return new BigDecimal(aVar.q0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, BigDecimal bigDecimal) {
            bVar.d0(bigDecimal);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class i extends f.h.f.w<BigInteger> {
        @Override // f.h.f.w
        public BigInteger a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return new BigInteger(aVar.q0());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, BigInteger bigInteger) {
            bVar.d0(bigInteger);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class j extends f.h.f.w<StringBuilder> {
        @Override // f.h.f.w
        public StringBuilder a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return new StringBuilder(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, StringBuilder sb) {
            StringBuilder sb2 = sb;
            bVar.g0(sb2 == null ? null : sb2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class k extends f.h.f.w<Class> {
        @Override // f.h.f.w
        public Class a(f.h.f.b0.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Class cls) {
            StringBuilder A = f.a.b.a.a.A("Attempted to serialize java.lang.Class: ");
            A.append(cls.getName());
            A.append(". Forgot to register a type adapter?");
            throw new UnsupportedOperationException(A.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class l extends f.h.f.w<StringBuffer> {
        @Override // f.h.f.w
        public StringBuffer a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return new StringBuffer(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, StringBuffer stringBuffer) {
            StringBuffer stringBuffer2 = stringBuffer;
            bVar.g0(stringBuffer2 == null ? null : stringBuffer2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class m extends f.h.f.w<URL> {
        @Override // f.h.f.w
        public URL a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            String q0 = aVar.q0();
            if ("null".equals(q0)) {
                return null;
            }
            return new URL(q0);
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, URL url) {
            URL url2 = url;
            bVar.g0(url2 == null ? null : url2.toExternalForm());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class n extends f.h.f.w<URI> {
        @Override // f.h.f.w
        public URI a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                String q0 = aVar.q0();
                if ("null".equals(q0)) {
                    return null;
                }
                return new URI(q0);
            } catch (URISyntaxException e2) {
                throw new JsonIOException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, URI uri) {
            URI uri2 = uri;
            bVar.g0(uri2 == null ? null : uri2.toASCIIString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* renamed from: f.h.f.z.z.o$o  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0145o extends f.h.f.w<InetAddress> {
        @Override // f.h.f.w
        public InetAddress a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return InetAddress.getByName(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, InetAddress inetAddress) {
            InetAddress inetAddress2 = inetAddress;
            bVar.g0(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class p extends f.h.f.w<UUID> {
        @Override // f.h.f.w
        public UUID a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return UUID.fromString(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, UUID uuid) {
            UUID uuid2 = uuid;
            bVar.g0(uuid2 == null ? null : uuid2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class q extends f.h.f.w<Currency> {
        @Override // f.h.f.w
        public Currency a(f.h.f.b0.a aVar) {
            return Currency.getInstance(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Currency currency) {
            bVar.g0(currency.getCurrencyCode());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class r implements f.h.f.x {

        /* compiled from: TypeAdapters.java */
        /* loaded from: classes2.dex */
        public class a extends f.h.f.w<Timestamp> {
            public final /* synthetic */ f.h.f.w a;

            public a(r rVar, f.h.f.w wVar) {
                this.a = wVar;
            }

            @Override // f.h.f.w
            public Timestamp a(f.h.f.b0.a aVar) {
                Date date = (Date) this.a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // f.h.f.w
            public void b(f.h.f.b0.b bVar, Timestamp timestamp) {
                this.a.b(bVar, timestamp);
            }
        }

        @Override // f.h.f.x
        public <T> f.h.f.w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            if (aVar.a != Timestamp.class) {
                return null;
            }
            Objects.requireNonNull(jVar);
            return new a(this, jVar.e(new f.h.f.a0.a<>(Date.class)));
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class s extends f.h.f.w<Calendar> {
        @Override // f.h.f.w
        public Calendar a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            aVar.f();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (aVar.s0() != JsonToken.END_OBJECT) {
                String d0 = aVar.d0();
                int W = aVar.W();
                if ("year".equals(d0)) {
                    i2 = W;
                } else if ("month".equals(d0)) {
                    i3 = W;
                } else if ("dayOfMonth".equals(d0)) {
                    i4 = W;
                } else if ("hourOfDay".equals(d0)) {
                    i5 = W;
                } else if ("minute".equals(d0)) {
                    i6 = W;
                } else if ("second".equals(d0)) {
                    i7 = W;
                }
            }
            aVar.q();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Calendar calendar) {
            Calendar calendar2 = calendar;
            if (calendar2 == null) {
                bVar.F();
                return;
            }
            bVar.g();
            bVar.v("year");
            bVar.W(calendar2.get(1));
            bVar.v("month");
            bVar.W(calendar2.get(2));
            bVar.v("dayOfMonth");
            bVar.W(calendar2.get(5));
            bVar.v("hourOfDay");
            bVar.W(calendar2.get(11));
            bVar.v("minute");
            bVar.W(calendar2.get(12));
            bVar.v("second");
            bVar.W(calendar2.get(13));
            bVar.q();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class t extends f.h.f.w<Locale> {
        @Override // f.h.f.w
        public Locale a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.q0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            if (nextToken2 == null && nextToken3 == null) {
                return new Locale(nextToken);
            }
            if (nextToken3 == null) {
                return new Locale(nextToken, nextToken2);
            }
            return new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Locale locale) {
            Locale locale2 = locale;
            bVar.g0(locale2 == null ? null : locale2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class u extends f.h.f.w<f.h.f.p> {
        @Override // f.h.f.w
        /* renamed from: c */
        public f.h.f.p a(f.h.f.b0.a aVar) {
            int ordinal = aVar.s0().ordinal();
            if (ordinal == 0) {
                f.h.f.m mVar = new f.h.f.m();
                aVar.a();
                while (aVar.F()) {
                    mVar.f6238f.add(a(aVar));
                }
                aVar.p();
                return mVar;
            } else if (ordinal == 2) {
                f.h.f.r rVar = new f.h.f.r();
                aVar.f();
                while (aVar.F()) {
                    rVar.a.put(aVar.d0(), a(aVar));
                }
                aVar.q();
                return rVar;
            } else if (ordinal != 5) {
                if (ordinal != 6) {
                    if (ordinal != 7) {
                        if (ordinal == 8) {
                            aVar.i0();
                            return f.h.f.q.a;
                        }
                        throw new IllegalArgumentException();
                    }
                    return new f.h.f.s(Boolean.valueOf(aVar.O()));
                }
                return new f.h.f.s(new f.h.f.z.r(aVar.q0()));
            } else {
                return new f.h.f.s(aVar.q0());
            }
        }

        @Override // f.h.f.w
        /* renamed from: d */
        public void b(f.h.f.b0.b bVar, f.h.f.p pVar) {
            if (pVar != null && !(pVar instanceof f.h.f.q)) {
                if (pVar instanceof f.h.f.s) {
                    f.h.f.s b = pVar.b();
                    Object obj = b.a;
                    if (obj instanceof Number) {
                        bVar.d0(b.e());
                        return;
                    } else if (obj instanceof Boolean) {
                        bVar.i0(b.d());
                        return;
                    } else {
                        bVar.g0(b.c());
                        return;
                    }
                }
                boolean z = pVar instanceof f.h.f.m;
                if (z) {
                    bVar.f();
                    if (z) {
                        Iterator<f.h.f.p> it = ((f.h.f.m) pVar).iterator();
                        while (it.hasNext()) {
                            b(bVar, it.next());
                        }
                        bVar.p();
                        return;
                    }
                    throw new IllegalStateException("Not a JSON Array: " + pVar);
                } else if (pVar instanceof f.h.f.r) {
                    bVar.g();
                    f.h.f.z.s sVar = f.h.f.z.s.this;
                    s.e eVar = sVar.f6258j.f6270i;
                    int i2 = sVar.f6257i;
                    while (true) {
                        s.e eVar2 = sVar.f6258j;
                        if (!(eVar != eVar2)) {
                            bVar.q();
                            return;
                        } else if (eVar != eVar2) {
                            if (sVar.f6257i == i2) {
                                s.e eVar3 = eVar.f6270i;
                                bVar.v((String) eVar.f6272k);
                                b(bVar, (f.h.f.p) eVar.f6273l);
                                eVar = eVar3;
                            } else {
                                throw new ConcurrentModificationException();
                            }
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                } else {
                    StringBuilder A = f.a.b.a.a.A("Couldn't write ");
                    A.append(pVar.getClass());
                    throw new IllegalArgumentException(A.toString());
                }
            } else {
                bVar.F();
            }
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class v extends f.h.f.w<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
            if (r6.W() != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
            if (java.lang.Integer.parseInt(r1) != 0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
            r1 = false;
         */
        @Override // f.h.f.w
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet a(f.h.f.b0.a r6) {
            /*
                r5 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r6.a()
                com.google.gson.stream.JsonToken r1 = r6.s0()
                r2 = 0
            Ld:
                com.google.gson.stream.JsonToken r3 = com.google.gson.stream.JsonToken.END_ARRAY
                if (r1 == r3) goto L66
                int r3 = r1.ordinal()
                r4 = 5
                if (r3 == r4) goto L41
                r4 = 6
                if (r3 == r4) goto L3a
                r4 = 7
                if (r3 != r4) goto L23
                boolean r1 = r6.O()
                goto L4e
            L23:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L3a:
                int r1 = r6.W()
                if (r1 == 0) goto L4d
                goto L4b
            L41:
                java.lang.String r1 = r6.q0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L5a
                if (r1 == 0) goto L4d
            L4b:
                r1 = 1
                goto L4e
            L4d:
                r1 = 0
            L4e:
                if (r1 == 0) goto L53
                r0.set(r2)
            L53:
                int r2 = r2 + 1
                com.google.gson.stream.JsonToken r1 = r6.s0()
                goto Ld
            L5a:
                com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = f.a.b.a.a.p(r0, r1)
                r6.<init>(r0)
                throw r6
            L66:
                r6.p()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f.h.f.z.z.o.v.a(f.h.f.b0.a):java.lang.Object");
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, BitSet bitSet) {
            BitSet bitSet2 = bitSet;
            bVar.f();
            int length = bitSet2.length();
            for (int i2 = 0; i2 < length; i2++) {
                bVar.W(bitSet2.get(i2) ? 1L : 0L);
            }
            bVar.p();
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class w implements f.h.f.x {
        @Override // f.h.f.x
        public <T> f.h.f.w<T> a(f.h.f.j jVar, f.h.f.a0.a<T> aVar) {
            Class<? super T> cls = aVar.a;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            if (!cls.isEnum()) {
                cls = cls.getSuperclass();
            }
            return new e0(cls);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class x extends f.h.f.w<Boolean> {
        @Override // f.h.f.w
        public Boolean a(f.h.f.b0.a aVar) {
            JsonToken s0 = aVar.s0();
            if (s0 == JsonToken.NULL) {
                aVar.i0();
                return null;
            } else if (s0 == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.q0()));
            } else {
                return Boolean.valueOf(aVar.O());
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Boolean bool) {
            bVar.X(bool);
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class y extends f.h.f.w<Boolean> {
        @Override // f.h.f.w
        public Boolean a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            return Boolean.valueOf(aVar.q0());
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Boolean bool) {
            Boolean bool2 = bool;
            bVar.g0(bool2 == null ? "null" : bool2.toString());
        }
    }

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes2.dex */
    public class z extends f.h.f.w<Number> {
        @Override // f.h.f.w
        public Number a(f.h.f.b0.a aVar) {
            if (aVar.s0() == JsonToken.NULL) {
                aVar.i0();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.W());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // f.h.f.w
        public void b(f.h.f.b0.b bVar, Number number) {
            bVar.d0(number);
        }
    }

    static {
        f.h.f.v vVar = new f.h.f.v(new k());
        a = vVar;
        b = new f.h.f.z.z.q(Class.class, vVar);
        f.h.f.v vVar2 = new f.h.f.v(new v());
        c = vVar2;
        f6300d = new f.h.f.z.z.q(BitSet.class, vVar2);
        x xVar = new x();
        f6301e = xVar;
        f6302f = new y();
        f6303g = new f.h.f.z.z.r(Boolean.TYPE, Boolean.class, xVar);
        z zVar = new z();
        f6304h = zVar;
        f6305i = new f.h.f.z.z.r(Byte.TYPE, Byte.class, zVar);
        a0 a0Var = new a0();
        f6306j = a0Var;
        f6307k = new f.h.f.z.z.r(Short.TYPE, Short.class, a0Var);
        b0 b0Var = new b0();
        f6308l = b0Var;
        f6309m = new f.h.f.z.z.r(Integer.TYPE, Integer.class, b0Var);
        f.h.f.v vVar3 = new f.h.f.v(new c0());
        n = vVar3;
        o = new f.h.f.z.z.q(AtomicInteger.class, vVar3);
        f.h.f.v vVar4 = new f.h.f.v(new d0());
        p = vVar4;
        q = new f.h.f.z.z.q(AtomicBoolean.class, vVar4);
        f.h.f.v vVar5 = new f.h.f.v(new a());
        r = vVar5;
        s = new f.h.f.z.z.q(AtomicIntegerArray.class, vVar5);
        t = new b();
        u = new c();
        v = new d();
        e eVar = new e();
        w = eVar;
        x = new f.h.f.z.z.q(Number.class, eVar);
        f fVar = new f();
        y = fVar;
        z = new f.h.f.z.z.r(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = new f.h.f.z.z.q(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = new f.h.f.z.z.q(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = new f.h.f.z.z.q(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = new f.h.f.z.z.q(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = new f.h.f.z.z.q(URI.class, nVar);
        C0145o c0145o = new C0145o();
        M = c0145o;
        N = new f.h.f.z.z.t(InetAddress.class, c0145o);
        p pVar = new p();
        O = pVar;
        P = new f.h.f.z.z.q(UUID.class, pVar);
        f.h.f.v vVar6 = new f.h.f.v(new q());
        Q = vVar6;
        R = new f.h.f.z.z.q(Currency.class, vVar6);
        S = new r();
        s sVar = new s();
        T = sVar;
        U = new f.h.f.z.z.s(Calendar.class, GregorianCalendar.class, sVar);
        t tVar = new t();
        V = tVar;
        W = new f.h.f.z.z.q(Locale.class, tVar);
        u uVar = new u();
        X = uVar;
        Y = new f.h.f.z.z.t(f.h.f.p.class, uVar);
        Z = new w();
    }
}

package g.a.v0;

import g.a.v0.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/* compiled from: JndiResourceResolverFactory.java */
/* loaded from: classes2.dex */
public final class g1 implements h0.g {
    public static final Throwable a;

    /* compiled from: JndiResourceResolverFactory.java */
    /* loaded from: classes2.dex */
    public static final class a implements c {
        public static void a(NamingEnumeration<?> namingEnumeration, NamingException namingException) {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        public static void b(DirContext dirContext, NamingException namingException) {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        public List<String> c(String str, String str2) {
            Throwable th = g1.a;
            if (th == null) {
                String[] strArr = {str};
                ArrayList arrayList = new ArrayList();
                Hashtable hashtable = new Hashtable();
                hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
                hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
                InitialDirContext initialDirContext = new InitialDirContext(hashtable);
                try {
                    NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                    while (all.hasMore()) {
                        try {
                            NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                            while (all2.hasMore()) {
                                try {
                                    arrayList.add(String.valueOf(all2.next()));
                                } catch (NamingException e2) {
                                    a(all2, e2);
                                    throw null;
                                }
                            }
                            all2.close();
                        } catch (NamingException e3) {
                            a(all, e3);
                            throw null;
                        }
                    }
                    all.close();
                    initialDirContext.close();
                    return arrayList;
                } catch (NamingException e4) {
                    b(initialDirContext, e4);
                    throw null;
                }
            }
            throw new UnsupportedOperationException("JNDI is not currently available", th);
        }
    }

    /* compiled from: JndiResourceResolverFactory.java */
    /* loaded from: classes2.dex */
    public static final class b implements h0.f {
        public static final Logger b = Logger.getLogger(b.class.getName());
        public final c a;

        static {
            Pattern.compile("\\s+");
        }

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // g.a.v0.h0.f
        public List<String> a(String str) {
            Logger logger = b;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                logger.log(level, "About to query TXT records for {0}", new Object[]{str});
            }
            List<String> c = ((a) this.a).c("TXT", f.a.b.a.a.p("dns:///", str));
            if (logger.isLoggable(level)) {
                logger.log(level, "Found {0} TXT records", new Object[]{Integer.valueOf(((ArrayList) c).size())});
            }
            ArrayList arrayList = (ArrayList) c;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                StringBuilder sb = new StringBuilder(str2.length());
                int i2 = 0;
                boolean z = false;
                while (i2 < str2.length()) {
                    char charAt = str2.charAt(i2);
                    if (z) {
                        if (charAt == '\"') {
                            z = false;
                        } else {
                            if (charAt == '\\') {
                                i2++;
                                charAt = str2.charAt(i2);
                            }
                            sb.append(charAt);
                        }
                    } else if (charAt != ' ') {
                        if (charAt == '\"') {
                            z = true;
                        }
                        sb.append(charAt);
                    }
                    i2++;
                }
                arrayList2.add(sb.toString());
            }
            return Collections.unmodifiableList(arrayList2);
        }
    }

    /* compiled from: JndiResourceResolverFactory.java */
    /* loaded from: classes2.dex */
    public interface c {
    }

    static {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            e = null;
        } catch (ClassNotFoundException e2) {
            e = e2;
        } catch (Error e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
        a = e;
    }

    @Override // g.a.v0.h0.g
    public h0.f a() {
        if (a != null) {
            return null;
        }
        return new b(new a());
    }

    @Override // g.a.v0.h0.g
    public Throwable b() {
        return a;
    }
}

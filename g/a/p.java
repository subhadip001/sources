package g.a;

import g.a.i;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: DecompressorRegistry.java */
/* loaded from: classes2.dex */
public final class p {
    public static final f.h.c.a.g c = new f.h.c.a.g(String.valueOf(','));

    /* renamed from: d  reason: collision with root package name */
    public static final p f7557d = new p(i.b.a, false, new p(new i.a(), true, new p()));
    public final Map<String, a> a;
    public final byte[] b;

    /* compiled from: DecompressorRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a {
        public final o a;
        public final boolean b;

        public a(o oVar, boolean z) {
            f.h.b.c.a.x(oVar, "decompressor");
            this.a = oVar;
            this.b = z;
        }
    }

    public p(o oVar, boolean z, p pVar) {
        String a2 = oVar.a();
        f.h.b.c.a.m(!a2.contains(","), "Comma is currently not allowed in message encoding");
        int size = pVar.a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(pVar.a.containsKey(oVar.a()) ? size : size + 1);
        for (a aVar : pVar.a.values()) {
            String a3 = aVar.a.a();
            if (!a3.equals(a2)) {
                linkedHashMap.put(a3, new a(aVar.a, aVar.b));
            }
        }
        linkedHashMap.put(a2, new a(oVar, z));
        Map<String, a> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.a = unmodifiableMap;
        f.h.c.a.g gVar = c;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry<String, a> entry : unmodifiableMap.entrySet()) {
            if (entry.getValue().b) {
                hashSet.add(entry.getKey());
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        Objects.requireNonNull(gVar);
        Iterator it = unmodifiableSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(gVar.a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) gVar.a);
                    sb.append(gVar.a(it.next()));
                }
            }
            this.b = sb.toString().getBytes(Charset.forName("US-ASCII"));
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public p() {
        this.a = new LinkedHashMap(0);
        this.b = new byte[0];
    }
}

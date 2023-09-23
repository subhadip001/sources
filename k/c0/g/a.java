package k.c0.g;

import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;
import k.j;
import k.k;
import k.q;
import k.s;
import k.v;
import k.w;
import k.x;
import k.y;
import l.m;
import l.o;
import l.t;

/* compiled from: BridgeInterceptor.java */
/* loaded from: classes2.dex */
public final class a implements s {
    public final k a;

    public a(k kVar) {
        this.a = kVar;
    }

    @Override // k.s
    public y a(s.a aVar) {
        boolean z;
        f fVar = (f) aVar;
        v vVar = fVar.f8940f;
        v.a aVar2 = new v.a(vVar);
        x xVar = vVar.f9175d;
        if (xVar != null) {
            long j2 = ((w) xVar).a;
            if (j2 != -1) {
                aVar2.b("Content-Length", Long.toString(j2));
                aVar2.c.e("Transfer-Encoding");
            } else {
                q.a aVar3 = aVar2.c;
                aVar3.c("Transfer-Encoding", "chunked");
                aVar3.e("Transfer-Encoding");
                aVar3.a.add("Transfer-Encoding");
                aVar3.a.add("chunked");
                aVar2.c.e("Content-Length");
            }
        }
        if (vVar.c.a("Host") == null) {
            aVar2.b("Host", k.c0.c.m(vVar.a, false));
        }
        if (vVar.c.a("Connection") == null) {
            q.a aVar4 = aVar2.c;
            aVar4.c("Connection", "Keep-Alive");
            aVar4.e("Connection");
            aVar4.a.add("Connection");
            aVar4.a.add("Keep-Alive");
        }
        if (vVar.c.a("Accept-Encoding") == null && vVar.c.a("Range") == null) {
            q.a aVar5 = aVar2.c;
            aVar5.c("Accept-Encoding", "gzip");
            aVar5.e("Accept-Encoding");
            aVar5.a.add("Accept-Encoding");
            aVar5.a.add("gzip");
            z = true;
        } else {
            z = false;
        }
        Objects.requireNonNull((k.a) this.a);
        List emptyList = Collections.emptyList();
        if (!emptyList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = emptyList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                j jVar = (j) emptyList.get(i2);
                sb.append(jVar.a);
                sb.append('=');
                sb.append(jVar.b);
            }
            aVar2.b("Cookie", sb.toString());
        }
        if (vVar.c.a(DefaultSettingsSpiCall.HEADER_USER_AGENT) == null) {
            q.a aVar6 = aVar2.c;
            aVar6.c(DefaultSettingsSpiCall.HEADER_USER_AGENT, "okhttp/3.10.0");
            aVar6.e(DefaultSettingsSpiCall.HEADER_USER_AGENT);
            aVar6.a.add(DefaultSettingsSpiCall.HEADER_USER_AGENT);
            aVar6.a.add("okhttp/3.10.0");
        }
        y b = fVar.b(aVar2.a(), fVar.b, fVar.c, fVar.f8938d);
        e.d(this.a, vVar.a, b.f9185k);
        y.a aVar7 = new y.a(b);
        aVar7.a = vVar;
        if (z) {
            String a = b.f9185k.a("Content-Encoding");
            if (a == null) {
                a = null;
            }
            if ("gzip".equalsIgnoreCase(a) && e.b(b)) {
                m mVar = new m(b.f9186l.f());
                q.a c = b.f9185k.c();
                c.e("Content-Encoding");
                c.e("Content-Length");
                List<String> list = c.a;
                q.a aVar8 = new q.a();
                Collections.addAll(aVar8.a, (String[]) list.toArray(new String[list.size()]));
                aVar7.f9190f = aVar8;
                String a2 = b.f9185k.a("Content-Type");
                String str = a2 != null ? a2 : null;
                Logger logger = o.a;
                aVar7.f9191g = new g(str, -1L, new t(mVar));
            }
        }
        return aVar7.a();
    }
}

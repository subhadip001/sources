package f.h.c.a;

import com.google.android.gms.common.api.Api;
import f.h.c.a.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: Splitter.java */
/* loaded from: classes.dex */
public final class n {
    public final f.h.c.a.b a;
    public final boolean b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5845d;

    /* compiled from: Splitter.java */
    /* loaded from: classes.dex */
    public static abstract class a extends f.h.c.a.a<String> {

        /* renamed from: h  reason: collision with root package name */
        public final CharSequence f5846h;

        /* renamed from: i  reason: collision with root package name */
        public final f.h.c.a.b f5847i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f5848j;

        /* renamed from: k  reason: collision with root package name */
        public int f5849k = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f5850l;

        public a(n nVar, CharSequence charSequence) {
            this.f5847i = nVar.a;
            this.f5848j = nVar.b;
            this.f5850l = nVar.f5845d;
            this.f5846h = charSequence;
        }
    }

    /* compiled from: Splitter.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public n(b bVar) {
        b.e eVar = b.e.b;
        this.c = bVar;
        this.b = false;
        this.a = eVar;
        this.f5845d = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static n a(char c) {
        return new n(new m(new b.c(c)));
    }

    public List<String> b(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        m mVar = (m) this.c;
        Objects.requireNonNull(mVar);
        l lVar = new l(mVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (lVar.hasNext()) {
            arrayList.add(lVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}

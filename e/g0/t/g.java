package e.g0.t;

import androidx.work.ExistingWorkPolicy;
import e.g0.q;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: WorkContinuationImpl.java */
/* loaded from: classes.dex */
public class g extends e.g0.o {

    /* renamed from: j  reason: collision with root package name */
    public static final String f2214j = e.g0.k.e("WorkContinuationImpl");
    public final l a;
    public final String b;
    public final ExistingWorkPolicy c;

    /* renamed from: d  reason: collision with root package name */
    public final List<? extends q> f2215d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f2216e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f2217f;

    /* renamed from: g  reason: collision with root package name */
    public final List<g> f2218g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2219h;

    /* renamed from: i  reason: collision with root package name */
    public e.g0.m f2220i;

    public g(l lVar, List<? extends q> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
        this.a = lVar;
        this.b = null;
        this.c = existingWorkPolicy;
        this.f2215d = list;
        this.f2218g = null;
        this.f2216e = new ArrayList(list.size());
        this.f2217f = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a = list.get(i2).a();
            this.f2216e.add(a);
            this.f2217f.add(a);
        }
    }

    public static boolean a(g gVar, Set<String> set) {
        set.addAll(gVar.f2216e);
        Set<String> b = b(gVar);
        for (String str : set) {
            if (((HashSet) b).contains(str)) {
                return true;
            }
        }
        List<g> list = gVar.f2218g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                if (a(gVar2, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f2216e);
        return false;
    }

    public static Set<String> b(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.f2218g;
        if (list != null && !list.isEmpty()) {
            for (g gVar2 : list) {
                hashSet.addAll(gVar2.f2216e);
            }
        }
        return hashSet;
    }
}

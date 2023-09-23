package m.a.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PendingPost.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final List<i> f9287d = new ArrayList();
    public Object a;
    public p b;
    public i c;

    public i(Object obj, p pVar) {
        this.a = obj;
        this.b = pVar;
    }

    public static i a(p pVar, Object obj) {
        List<i> list = f9287d;
        synchronized (list) {
            int size = list.size();
            if (size > 0) {
                i remove = list.remove(size - 1);
                remove.a = obj;
                remove.b = pVar;
                remove.c = null;
                return remove;
            }
            return new i(obj, pVar);
        }
    }
}

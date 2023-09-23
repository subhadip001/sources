package e.i.g;

import e.i.g.j;
import java.util.ArrayList;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public class i implements e.i.i.a<j.a> {
    public final /* synthetic */ String a;

    public i(String str) {
        this.a = str;
    }

    @Override // e.i.i.a
    /* renamed from: a */
    public void accept(j.a aVar) {
        synchronized (j.c) {
            e.f.h<String, ArrayList<e.i.i.a<j.a>>> hVar = j.f2488d;
            ArrayList<e.i.i.a<j.a>> arrayList = hVar.get(this.a);
            if (arrayList == null) {
                return;
            }
            hVar.remove(this.a);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).accept(aVar);
            }
        }
    }
}

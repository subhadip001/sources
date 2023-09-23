package f.h.h;

import f.h.h.u;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: SmallSortedMap.java */
/* loaded from: classes2.dex */
public final class d1<FieldDescriptorType> extends e1<FieldDescriptorType, Object> {
    public d1(int i2) {
        super(i2, null);
    }

    @Override // f.h.h.e1
    public void g() {
        if (!this.f6335i) {
            for (int i2 = 0; i2 < d(); i2++) {
                Map.Entry<FieldDescriptorType, Object> c = c(i2);
                if (((u.a) c.getKey()).b()) {
                    c.setValue(Collections.unmodifiableList((List) c.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : e()) {
                if (((u.a) entry.getKey()).b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.g();
    }

    @Override // f.h.h.e1, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((u.a) obj, obj2);
    }
}

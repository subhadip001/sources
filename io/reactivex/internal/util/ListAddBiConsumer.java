package io.reactivex.internal.util;

import g.c.v.b;
import java.util.List;

/* loaded from: classes2.dex */
public enum ListAddBiConsumer implements b<List, Object, List> {
    INSTANCE;

    public static <T> b<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // g.c.v.b
    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}

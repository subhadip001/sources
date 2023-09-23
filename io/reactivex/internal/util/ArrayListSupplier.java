package io.reactivex.internal.util;

import g.c.v.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, d<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> asCallable() {
        return INSTANCE;
    }

    public static <T, O> d<O, List<T>> asFunction() {
        return INSTANCE;
    }

    @Override // g.c.v.d
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() {
        return new ArrayList();
    }
}

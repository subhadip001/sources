package com.google.firebase.inappmessaging.dagger.internal;

import h.a.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, a<V>> contributingMap;

    /* loaded from: classes2.dex */
    public static abstract class Builder<K, V, V2> {
        public final LinkedHashMap<K, a<V>> map;

        public Builder(int i2) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder<K, V, V2> put(K k2, a<V> aVar) {
            this.map.put(Preconditions.checkNotNull(k2, "key"), Preconditions.checkNotNull(aVar, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(a<Map<K, V2>> aVar) {
            if (!(aVar instanceof DelegateFactory)) {
                this.map.putAll(((AbstractMapFactory) aVar).contributingMap);
                return this;
            }
            return putAll(((DelegateFactory) aVar).getDelegate());
        }
    }

    public AbstractMapFactory(Map<K, a<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, a<V>> contributingMap() {
        return this.contributingMap;
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, h.a.a
    public abstract /* synthetic */ T get();
}

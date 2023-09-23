package com.google.firebase.inappmessaging.display.dagger.internal;

import com.google.firebase.inappmessaging.display.dagger.Lazy;
import com.google.firebase.inappmessaging.display.dagger.internal.AbstractMapFactory;
import h.a.a;
import java.util.Map;

/* loaded from: classes2.dex */
public final class MapProviderFactory<K, V> extends AbstractMapFactory<K, V, a<V>> implements Lazy<Map<K, a<V>>> {

    /* loaded from: classes2.dex */
    public static final class Builder<K, V> extends AbstractMapFactory.Builder<K, V, a<V>> {
        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.firebase.inappmessaging.display.dagger.internal.AbstractMapFactory.Builder
        public /* bridge */ /* synthetic */ AbstractMapFactory.Builder put(Object obj, a aVar) {
            return put((Builder<K, V>) obj, aVar);
        }

        private Builder(int i2) {
            super(i2);
        }

        @Override // com.google.firebase.inappmessaging.display.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> put(K k2, a<V> aVar) {
            super.put((Builder<K, V>) k2, (a) aVar);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.firebase.inappmessaging.display.dagger.internal.AbstractMapFactory.Builder
        public Builder<K, V> putAll(a<Map<K, a<V>>> aVar) {
            super.putAll((a) aVar);
            return this;
        }
    }

    public static <K, V> Builder<K, V> builder(int i2) {
        return new Builder<>(i2);
    }

    private MapProviderFactory(Map<K, a<V>> map) {
        super(map);
    }

    @Override // com.google.firebase.inappmessaging.display.dagger.internal.AbstractMapFactory, com.google.firebase.inappmessaging.display.dagger.internal.Factory, h.a.a
    public Map<K, a<V>> get() {
        return contributingMap();
    }
}

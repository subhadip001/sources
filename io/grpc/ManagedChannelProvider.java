package io.grpc;

import g.a.g0;

/* loaded from: classes2.dex */
public abstract class ManagedChannelProvider {

    /* loaded from: classes2.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
        public ProviderNotFoundException(String str) {
            super(str);
        }
    }

    public abstract g0<?> a(String str);

    public abstract boolean b();

    public abstract int c();
}

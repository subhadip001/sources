package io.grpc;

import g.a.h0;
import g.a.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class ManagedChannelRegistry {
    public static final Logger c = Logger.getLogger(ManagedChannelRegistry.class.getName());

    /* renamed from: d  reason: collision with root package name */
    public static ManagedChannelRegistry f8676d;
    public final LinkedHashSet<ManagedChannelProvider> a = new LinkedHashSet<>();
    public List<ManagedChannelProvider> b = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class ProviderNotFoundException extends RuntimeException {
    }

    /* loaded from: classes2.dex */
    public static final class a implements r0<ManagedChannelProvider> {
        public a(h0 h0Var) {
        }

        @Override // g.a.r0
        public boolean a(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.b();
        }

        @Override // g.a.r0
        public int b(ManagedChannelProvider managedChannelProvider) {
            return managedChannelProvider.c();
        }
    }

    public static List<Class<?>> a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("g.a.w0.e"));
        } catch (ClassNotFoundException e2) {
            c.log(Level.FINE, "Unable to find OkHttpChannelProvider", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e3) {
            c.log(Level.FINE, "Unable to find NettyChannelProvider", (Throwable) e3);
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.UdsNettyChannelProvider"));
        } catch (ClassNotFoundException e4) {
            c.log(Level.FINE, "Unable to find UdsNettyChannelProvider", (Throwable) e4);
        }
        return Collections.unmodifiableList(arrayList);
    }
}

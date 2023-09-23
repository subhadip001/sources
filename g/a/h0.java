package g.a;

import io.grpc.ManagedChannelProvider;
import io.grpc.ManagedChannelRegistry;
import java.util.Comparator;

/* compiled from: ManagedChannelRegistry.java */
/* loaded from: classes2.dex */
public class h0 implements Comparator<ManagedChannelProvider> {
    public h0(ManagedChannelRegistry managedChannelRegistry) {
    }

    @Override // java.util.Comparator
    public int compare(ManagedChannelProvider managedChannelProvider, ManagedChannelProvider managedChannelProvider2) {
        return managedChannelProvider.c() - managedChannelProvider2.c();
    }
}

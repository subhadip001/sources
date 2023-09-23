package e.n.a;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class f extends e {
    @Override // e.n.a.e
    public ProviderInfo a(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }

    @Override // e.n.a.e
    public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i2) {
        return packageManager.queryIntentContentProviders(intent, i2);
    }
}

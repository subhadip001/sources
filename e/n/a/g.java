package e.n.a;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* compiled from: DefaultEmojiCompatConfig.java */
/* loaded from: classes.dex */
public class g extends f {
    @Override // e.n.a.e
    public Signature[] b(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}

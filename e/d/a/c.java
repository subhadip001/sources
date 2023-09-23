package e.d.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class c {
    public final Intent a;

    public c(Intent intent, Bundle bundle) {
        this.a = intent;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        e.i.c.a.startActivity(context, this.a, null);
    }
}

package e.a.e.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e.a.e.d.a;

/* compiled from: ActivityResultContracts.java */
/* loaded from: classes.dex */
public class b extends a<String[], Uri> {
    @Override // e.a.e.d.a
    public Intent a(Context context, String[] strArr) {
        return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
    }

    @Override // e.a.e.d.a
    public /* bridge */ /* synthetic */ a.C0018a<Uri> b(Context context, String[] strArr) {
        return null;
    }

    @Override // e.a.e.d.a
    public Uri c(int i2, Intent intent) {
        if (intent == null || i2 != -1) {
            return null;
        }
        return intent.getData();
    }
}

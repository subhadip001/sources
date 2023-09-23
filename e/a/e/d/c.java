package e.a.e.d;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import e.a.e.d.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: ActivityResultContracts.java */
/* loaded from: classes.dex */
public class c extends a<String[], List<Uri>> {
    @Override // e.a.e.d.a
    public Intent a(Context context, String[] strArr) {
        return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
    }

    @Override // e.a.e.d.a
    public /* bridge */ /* synthetic */ a.C0018a<List<Uri>> b(Context context, String[] strArr) {
        return null;
    }

    @Override // e.a.e.d.a
    public List<Uri> c(int i2, Intent intent) {
        if (i2 == -1 && intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (intent.getData() != null) {
                linkedHashSet.add(intent.getData());
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                return Collections.emptyList();
            }
            if (clipData != null) {
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    Uri uri = clipData.getItemAt(i3).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            return new ArrayList(linkedHashSet);
        }
        return Collections.emptyList();
    }
}

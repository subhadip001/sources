package e.i.j.i0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import e.i.j.e;
import e.i.j.z;

/* compiled from: InputConnectionCompat.java */
/* loaded from: classes.dex */
public class d implements e {
    public final /* synthetic */ View a;

    public d(View view) {
        this.a = view;
    }

    public boolean a(f fVar, int i2, Bundle bundle) {
        e.b cVar;
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                fVar.a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.a.getDescription(), new ClipData.Item(fVar.a.a()));
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new e.a(clipData, 2);
        } else {
            cVar = new e.c(clipData, 2);
        }
        cVar.a(fVar.a.c());
        cVar.setExtras(bundle);
        return z.r(this.a, cVar.build()) == null;
    }
}

package e.a.e.d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;

/* compiled from: ActivityResultContracts.java */
/* loaded from: classes.dex */
public final class e extends a<Intent, ActivityResult> {
    @Override // e.a.e.d.a
    public Intent a(Context context, Intent intent) {
        return intent;
    }

    @Override // e.a.e.d.a
    public ActivityResult c(int i2, Intent intent) {
        return new ActivityResult(i2, intent);
    }
}

package e.g0.t.p.c;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import e.g0.k;

/* compiled from: SystemJobInfoConverter.java */
/* loaded from: classes.dex */
public class a {
    public static final String b = k.e("SystemJobInfoConverter");
    public final ComponentName a;

    public a(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}

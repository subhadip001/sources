package f.a.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class x extends BroadcastReceiver {
    public final f.j.b.a.b a;
    public boolean b;
    public final /* synthetic */ y c;

    public /* synthetic */ x(y yVar, f.j.b.a.b bVar) {
        this.c = yVar;
        this.a = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(zzb.zzh(intent, "BillingBroadcastManager"), zzb.zzl(intent.getExtras()));
    }
}

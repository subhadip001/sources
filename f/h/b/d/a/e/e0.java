package f.h.b.d.a.e;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.play.core.install.InstallException;
import java.io.File;
import java.util.Objects;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class e0 extends z implements f0 {
    public e0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    @Override // f.h.b.d.a.e.z
    public final boolean p(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            if (i2 != 3) {
                return false;
            }
            Bundle bundle = (Bundle) a0.a(parcel, Bundle.CREATOR);
            f.h.b.d.a.a.n nVar = (f.h.b.d.a.a.n) this;
            nVar.f5552h.a.c(nVar.f5551g);
            nVar.f5550f.d("onCompleteUpdate", new Object[0]);
            return true;
        }
        Bundle bundle2 = (Bundle) a0.a(parcel, Bundle.CREATOR);
        f.h.b.d.a.a.n nVar2 = (f.h.b.d.a.a.n) this;
        nVar2.f5552h.a.c(nVar2.f5551g);
        nVar2.f5550f.d("onRequestInfo", new Object[0]);
        if (bundle2.getInt("error.code", -2) != 0) {
            nVar2.f5551g.a(new InstallException(bundle2.getInt("error.code", -2)));
            return true;
        }
        f.h.b.d.a.i.m mVar = nVar2.f5551g;
        f.h.b.d.a.a.o oVar = nVar2.f5554j;
        String str = nVar2.f5553i;
        int i4 = bundle2.getInt("version.code", -1);
        int i5 = bundle2.getInt("update.availability");
        int i6 = bundle2.getInt("install.status", 0);
        Integer valueOf = bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness"));
        int i7 = bundle2.getInt("in.app.update.priority", 0);
        long j2 = bundle2.getLong("bytes.downloaded");
        long j3 = bundle2.getLong("total.bytes.to.download");
        long j4 = bundle2.getLong("additional.size.required");
        f.h.b.d.a.a.q qVar = oVar.f5557d;
        Objects.requireNonNull(qVar);
        mVar.b(new f.h.b.d.a.a.a(str, i4, i5, i6, valueOf, i7, j2, j3, j4, f.h.b.d.a.a.q.a(new File(qVar.a.getFilesDir(), "assetpacks")), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent")));
        return true;
    }
}

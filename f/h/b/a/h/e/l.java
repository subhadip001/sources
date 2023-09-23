package f.h.b.a.h.e;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* compiled from: LogRequest.java */
/* loaded from: classes.dex */
public abstract class l {
    public abstract ClientInfo a();

    @Encodable.Field(name = "logEvent")
    public abstract List<k> b();

    public abstract Integer c();

    public abstract String d();

    public abstract QosTier e();

    public abstract long f();

    public abstract long g();
}

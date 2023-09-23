package f.h.b.a.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import f.c.a.a.i;
import f.h.b.a.h.e.e;
import f.h.b.a.h.e.f;
import f.h.b.a.h.e.j;
import f.h.b.a.i.g;
import f.h.b.a.i.h;
import f.h.b.a.i.s.f;
import f.h.b.a.i.s.l;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class d implements l {
    public final ConnectivityManager b;
    public final Context c;

    /* renamed from: e  reason: collision with root package name */
    public final f.h.b.a.i.y.a f3648e;

    /* renamed from: f  reason: collision with root package name */
    public final f.h.b.a.i.y.a f3649f;
    public final DataEncoder a = new JsonDataEncoderBuilder().configureWith(f.h.b.a.h.e.b.a).ignoreNullValues(true).build();

    /* renamed from: d  reason: collision with root package name */
    public final URL f3647d = c(c.c);

    /* renamed from: g  reason: collision with root package name */
    public final int f3650g = 130000;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final URL a;
        public final j b;
        public final String c;

        public a(URL url, j jVar, String str) {
            this.a = url;
            this.b = jVar;
            this.c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i2, URL url, long j2) {
            this.a = i2;
            this.b = url;
            this.c = j2;
        }
    }

    public d(Context context, f.h.b.a.i.y.a aVar, f.h.b.a.i.y.a aVar2) {
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f3648e = aVar2;
        this.f3649f = aVar;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(f.a.b.a.a.p("Invalid url: ", str), e2);
        }
    }

    @Override // f.h.b.a.i.s.l
    public BackendResponse a(f fVar) {
        Integer num;
        String str;
        f.h.b.a.i.s.a aVar;
        f.b bVar;
        HashMap hashMap = new HashMap();
        f.h.b.a.i.s.a aVar2 = (f.h.b.a.i.s.a) fVar;
        for (h hVar : aVar2.a) {
            String h2 = hVar.h();
            if (!hashMap.containsKey(h2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(h2, arrayList);
            } else {
                ((List) hashMap.get(h2)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                h hVar2 = (h) ((List) entry.getValue()).get(0);
                QosTier qosTier = QosTier.DEFAULT;
                Long valueOf = Long.valueOf(this.f3649f.getTime());
                Long valueOf2 = Long.valueOf(this.f3648e.getTime());
                e eVar = new e(ClientInfo.ClientType.ANDROID_FIREBASE, new f.h.b.a.h.e.c(Integer.valueOf(hVar2.g("sdk-version")), hVar2.b("model"), hVar2.b("hardware"), hVar2.b("device"), hVar2.b("product"), hVar2.b("os-uild"), hVar2.b("manufacturer"), hVar2.b("fingerprint"), hVar2.b("locale"), hVar2.b("country"), hVar2.b("mcc_mnc"), hVar2.b("application_build"), null), null);
                try {
                    str = null;
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                } catch (NumberFormatException unused) {
                    num = null;
                    str = (String) entry.getKey();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    h hVar3 = (h) it2.next();
                    g e2 = hVar3.e();
                    Iterator it3 = it;
                    f.h.b.a.b bVar2 = e2.a;
                    Iterator it4 = it2;
                    if (bVar2.equals(new f.h.b.a.b("proto"))) {
                        byte[] bArr = e2.b;
                        bVar = new f.b();
                        bVar.f3684d = bArr;
                    } else if (bVar2.equals(new f.h.b.a.b("json"))) {
                        String str2 = new String(e2.b, Charset.forName("UTF-8"));
                        bVar = new f.b();
                        bVar.f3685e = str2;
                    } else {
                        aVar = aVar2;
                        String n = i.n("CctTransportBackend");
                        if (Log.isLoggable(n, 5)) {
                            Log.w(n, String.format("Received event of unsupported encoding %s. Skipping...", bVar2));
                        }
                        it2 = it4;
                        it = it3;
                        aVar2 = aVar;
                    }
                    bVar.a = Long.valueOf(hVar3.f());
                    bVar.c = Long.valueOf(hVar3.i());
                    String str3 = hVar3.c().get("tz-offset");
                    bVar.f3686f = Long.valueOf(str3 == null ? 0L : Long.valueOf(str3).longValue());
                    aVar = aVar2;
                    bVar.f3687g = new f.h.b.a.h.e.i(NetworkConnectionInfo.NetworkType.forNumber(hVar3.g("net-type")), NetworkConnectionInfo.MobileSubtype.forNumber(hVar3.g("mobile-subtype")), null);
                    if (hVar3.d() != null) {
                        bVar.b = hVar3.d();
                    }
                    String str4 = bVar.a == null ? " eventTimeMs" : "";
                    if (bVar.c == null) {
                        str4 = f.a.b.a.a.p(str4, " eventUptimeMs");
                    }
                    if (bVar.f3686f == null) {
                        str4 = f.a.b.a.a.p(str4, " timezoneOffsetSeconds");
                    }
                    if (str4.isEmpty()) {
                        arrayList3.add(new f.h.b.a.h.e.f(bVar.a.longValue(), bVar.b, bVar.c.longValue(), bVar.f3684d, bVar.f3685e, bVar.f3686f.longValue(), bVar.f3687g, null));
                        it2 = it4;
                        it = it3;
                        aVar2 = aVar;
                    } else {
                        throw new IllegalStateException(f.a.b.a.a.p("Missing required properties:", str4));
                    }
                }
                Iterator it5 = it;
                f.h.b.a.i.s.a aVar3 = aVar2;
                String str5 = valueOf == null ? " requestTimeMs" : "";
                if (valueOf2 == null) {
                    str5 = f.a.b.a.a.p(str5, " requestUptimeMs");
                }
                if (str5.isEmpty()) {
                    arrayList2.add(new f.h.b.a.h.e.g(valueOf.longValue(), valueOf2.longValue(), eVar, num, str, arrayList3, qosTier, null));
                    it = it5;
                    aVar2 = aVar3;
                } else {
                    throw new IllegalStateException(f.a.b.a.a.p("Missing required properties:", str5));
                }
            } else {
                f.h.b.a.i.s.a aVar4 = aVar2;
                f.h.b.a.h.e.d dVar = new f.h.b.a.h.e.d(arrayList2);
                URL url = this.f3647d;
                if (aVar4.b != null) {
                    try {
                        c a2 = c.a(((f.h.b.a.i.s.a) fVar).b);
                        String str6 = a2.b;
                        r6 = str6 != null ? str6 : null;
                        String str7 = a2.a;
                        if (str7 != null) {
                            url = c(str7);
                        }
                    } catch (IllegalArgumentException unused2) {
                        return BackendResponse.a();
                    }
                }
                try {
                    b bVar3 = (b) i.G(5, new a(url, dVar, r6), new f.h.b.a.h.b(this), new f.h.b.a.i.v.a() { // from class: f.h.b.a.h.a
                    });
                    int i2 = bVar3.a;
                    if (i2 == 200) {
                        return new f.h.b.a.i.s.b(BackendResponse.Status.OK, bVar3.c);
                    }
                    if (i2 < 500 && i2 != 404) {
                        if (i2 == 400) {
                            return new f.h.b.a.i.s.b(BackendResponse.Status.INVALID_PAYLOAD, -1L);
                        }
                        return BackendResponse.a();
                    }
                    return new f.h.b.a.i.s.b(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                } catch (IOException e3) {
                    i.k("CctTransportBackend", "Could not make request to the backend", e3);
                    return new f.h.b.a.i.s.b(BackendResponse.Status.TRANSIENT_ERROR, -1L);
                }
            }
        }
    }

    @Override // f.h.b.a.i.s.l
    public h b(h hVar) {
        int type;
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        h.a j2 = hVar.j();
        j2.c().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        j2.c().put("model", Build.MODEL);
        j2.c().put("hardware", Build.HARDWARE);
        j2.c().put("device", Build.DEVICE);
        j2.c().put("product", Build.PRODUCT);
        j2.c().put("os-uild", Build.ID);
        j2.c().put("manufacturer", Build.MANUFACTURER);
        j2.c().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        j2.c().put("tz-offset", String.valueOf(TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000));
        if (activeNetworkInfo == null) {
            type = NetworkConnectionInfo.NetworkType.NONE.getValue();
        } else {
            type = activeNetworkInfo.getType();
        }
        j2.c().put("net-type", String.valueOf(type));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        j2.c().put("mobile-subtype", String.valueOf(subtype));
        j2.c().put("country", Locale.getDefault().getCountry());
        j2.c().put("locale", Locale.getDefault().getLanguage());
        j2.c().put("mcc_mnc", ((TelephonyManager) this.c.getSystemService("phone")).getSimOperator());
        Context context = this.c;
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            i.k("CctTransportBackend", "Unable to find version code for package", e2);
        }
        j2.c().put("application_build", Integer.toString(i2));
        return j2.b();
    }
}

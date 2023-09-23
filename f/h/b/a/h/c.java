package f.h.b.a.h;

import f.c.a.a.i;
import f.h.b.a.i.f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination.java */
/* loaded from: classes.dex */
public final class c implements f {
    public static final String c = i.x("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");

    /* renamed from: d  reason: collision with root package name */
    public static final String f3643d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f3644e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<f.h.b.a.b> f3645f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f3646g;
    public final String a;
    public final String b;

    static {
        String x = i.x("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f3643d = x;
        String x2 = i.x("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f3644e = x2;
        f3645f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new f.h.b.a.b("proto"), new f.h.b.a.b("json"))));
        f3646g = new c(x, x2);
    }

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static c a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new c(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] b() {
        String str = this.b;
        if (str == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}

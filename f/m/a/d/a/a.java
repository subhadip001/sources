package f.m.a.d.a;

import com.squareup.okhttp.Protocol;
import java.net.ProtocolException;

/* compiled from: StatusLine.java */
/* loaded from: classes2.dex */
public final class a {
    public final Protocol a;
    public final int b;
    public final String c;

    public a(Protocol protocol, int i2, String str) {
        this.a = protocol;
        this.b = i2;
        this.c = str;
    }

    public static a a(String str) {
        Protocol protocol;
        String str2;
        int i2 = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException(f.a.b.a.a.p("Unexpected status line: ", str));
                }
            } else {
                throw new ProtocolException(f.a.b.a.a.p("Unexpected status line: ", str));
            }
        } else if (str.startsWith("ICY ")) {
            protocol = Protocol.HTTP_1_0;
            i2 = 4;
        } else {
            throw new ProtocolException(f.a.b.a.a.p("Unexpected status line: ", str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException(f.a.b.a.a.p("Unexpected status line: ", str));
                }
                return new a(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(f.a.b.a.a.p("Unexpected status line: ", str));
            }
        }
        throw new ProtocolException(f.a.b.a.a.p("Unexpected status line: ", str));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.b);
        if (this.c != null) {
            sb.append(' ');
            sb.append(this.c);
        }
        return sb.toString();
    }
}

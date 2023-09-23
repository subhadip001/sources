package f.h.b.b.f2;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.firebase.messaging.Constants;
import f.h.b.b.g2.b0;
import java.net.URLDecoder;

/* compiled from: DataSchemeDataSource.java */
/* loaded from: classes.dex */
public final class g extends e {

    /* renamed from: e  reason: collision with root package name */
    public j f4206e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f4207f;

    /* renamed from: g  reason: collision with root package name */
    public int f4208g;

    /* renamed from: h  reason: collision with root package name */
    public int f4209h;

    public g() {
        super(false);
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.f4208g - this.f4209h;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        byte[] bArr2 = this.f4207f;
        int i5 = b0.a;
        System.arraycopy(bArr2, this.f4209h, bArr, i2, min);
        this.f4209h += min;
        p(min);
        return min;
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        if (this.f4207f != null) {
            this.f4207f = null;
            q();
        }
        this.f4206e = null;
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        r(jVar);
        this.f4206e = jVar;
        this.f4209h = (int) jVar.f4211e;
        Uri uri = jVar.a;
        String scheme = uri.getScheme();
        if (!Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme)) {
            String valueOf = String.valueOf(scheme);
            throw new ParserException(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        }
        String[] G = b0.G(uri.getSchemeSpecificPart(), ",");
        if (G.length == 2) {
            String str = G[1];
            if (G[0].contains(";base64")) {
                try {
                    this.f4207f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    String valueOf2 = String.valueOf(str);
                    throw new ParserException(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e2);
                }
            } else {
                this.f4207f = b0.v(URLDecoder.decode(str, f.h.c.a.c.a.name()));
            }
            long j2 = jVar.f4212f;
            int length = j2 != -1 ? ((int) j2) + this.f4209h : this.f4207f.length;
            this.f4208g = length;
            if (length <= this.f4207f.length && this.f4209h <= length) {
                s(jVar);
                return this.f4208g - this.f4209h;
            }
            this.f4207f = null;
            throw new DataSourceException(0);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ParserException(sb.toString());
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        j jVar = this.f4206e;
        if (jVar != null) {
            return jVar.a;
        }
        return null;
    }
}

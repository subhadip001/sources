package f.h.b.b.f2;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.upstream.AssetDataSource;
import com.google.android.exoplayer2.upstream.ContentDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import f.h.b.b.g2.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes.dex */
public final class m implements i {
    public final Context a;
    public final List<t> b;
    public final i c;

    /* renamed from: d  reason: collision with root package name */
    public i f4229d;

    /* renamed from: e  reason: collision with root package name */
    public i f4230e;

    /* renamed from: f  reason: collision with root package name */
    public i f4231f;

    /* renamed from: g  reason: collision with root package name */
    public i f4232g;

    /* renamed from: h  reason: collision with root package name */
    public i f4233h;

    /* renamed from: i  reason: collision with root package name */
    public i f4234i;

    /* renamed from: j  reason: collision with root package name */
    public i f4235j;

    /* renamed from: k  reason: collision with root package name */
    public i f4236k;

    public m(Context context, i iVar) {
        this.a = context.getApplicationContext();
        Objects.requireNonNull(iVar);
        this.c = iVar;
        this.b = new ArrayList();
    }

    @Override // f.h.b.b.f2.f
    public int b(byte[] bArr, int i2, int i3) {
        i iVar = this.f4236k;
        Objects.requireNonNull(iVar);
        return iVar.b(bArr, i2, i3);
    }

    @Override // f.h.b.b.f2.i
    public void close() {
        i iVar = this.f4236k;
        if (iVar != null) {
            try {
                iVar.close();
            } finally {
                this.f4236k = null;
            }
        }
    }

    @Override // f.h.b.b.f2.i
    public void d(t tVar) {
        Objects.requireNonNull(tVar);
        this.c.d(tVar);
        this.b.add(tVar);
        i iVar = this.f4229d;
        if (iVar != null) {
            iVar.d(tVar);
        }
        i iVar2 = this.f4230e;
        if (iVar2 != null) {
            iVar2.d(tVar);
        }
        i iVar3 = this.f4231f;
        if (iVar3 != null) {
            iVar3.d(tVar);
        }
        i iVar4 = this.f4232g;
        if (iVar4 != null) {
            iVar4.d(tVar);
        }
        i iVar5 = this.f4233h;
        if (iVar5 != null) {
            iVar5.d(tVar);
        }
        i iVar6 = this.f4234i;
        if (iVar6 != null) {
            iVar6.d(tVar);
        }
        i iVar7 = this.f4235j;
        if (iVar7 != null) {
            iVar7.d(tVar);
        }
    }

    @Override // f.h.b.b.f2.i
    public long i(j jVar) {
        boolean z = true;
        f.h.b.b.e2.j.g(this.f4236k == null);
        String scheme = jVar.a.getScheme();
        Uri uri = jVar.a;
        int i2 = b0.a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = jVar.a.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f4230e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.a);
                    this.f4230e = assetDataSource;
                    p(assetDataSource);
                }
                this.f4236k = this.f4230e;
            } else {
                if (this.f4229d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f4229d = fileDataSource;
                    p(fileDataSource);
                }
                this.f4236k = this.f4229d;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f4230e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.a);
                this.f4230e = assetDataSource2;
                p(assetDataSource2);
            }
            this.f4236k = this.f4230e;
        } else if (FirebaseAnalytics.Param.CONTENT.equals(scheme)) {
            if (this.f4231f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.a);
                this.f4231f = contentDataSource;
                p(contentDataSource);
            }
            this.f4236k = this.f4231f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f4232g == null) {
                try {
                    i iVar = (i) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f4232g = iVar;
                    p(iVar);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.f4232g == null) {
                    this.f4232g = this.c;
                }
            }
            this.f4236k = this.f4232g;
        } else if ("udp".equals(scheme)) {
            if (this.f4233h == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.f4233h = udpDataSource;
                p(udpDataSource);
            }
            this.f4236k = this.f4233h;
        } else if (Constants.ScionAnalytics.MessageType.DATA_MESSAGE.equals(scheme)) {
            if (this.f4234i == null) {
                g gVar = new g();
                this.f4234i = gVar;
                p(gVar);
            }
            this.f4236k = this.f4234i;
        } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
            this.f4236k = this.c;
        } else {
            if (this.f4235j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.a);
                this.f4235j = rawResourceDataSource;
                p(rawResourceDataSource);
            }
            this.f4236k = this.f4235j;
        }
        return this.f4236k.i(jVar);
    }

    @Override // f.h.b.b.f2.i
    public Map<String, List<String>> k() {
        i iVar = this.f4236k;
        return iVar == null ? Collections.emptyMap() : iVar.k();
    }

    @Override // f.h.b.b.f2.i
    public Uri n() {
        i iVar = this.f4236k;
        if (iVar == null) {
            return null;
        }
        return iVar.n();
    }

    public final void p(i iVar) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            iVar.d(this.b.get(i2));
        }
    }
}

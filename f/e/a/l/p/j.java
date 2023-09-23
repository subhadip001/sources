package f.e.a.l.p;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import f.e.a.l.p.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public class j implements d<InputStream> {

    /* renamed from: k  reason: collision with root package name */
    public static final b f3250k = new a();

    /* renamed from: f  reason: collision with root package name */
    public final f.e.a.l.r.g f3251f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3252g;

    /* renamed from: h  reason: collision with root package name */
    public HttpURLConnection f3253h;

    /* renamed from: i  reason: collision with root package name */
    public InputStream f3254i;

    /* renamed from: j  reason: collision with root package name */
    public volatile boolean f3255j;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public static class a implements b {
    }

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public j(f.e.a.l.r.g gVar, int i2) {
        this.f3251f = gVar;
        this.f3252g = i2;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e2) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to get a response code", e2);
                return -1;
            }
            return -1;
        }
    }

    @Override // f.e.a.l.p.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // f.e.a.l.p.d
    public void b() {
        InputStream inputStream = this.f3254i;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3253h;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3253h = null;
    }

    @Override // f.e.a.l.p.d
    public void cancel() {
        this.f3255j = true;
    }

    @Override // f.e.a.l.p.d
    public DataSource d() {
        return DataSource.REMOTE;
    }

    @Override // f.e.a.l.p.d
    public void e(Priority priority, d.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i2 = f.e.a.r.h.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(f(this.f3251f.d(), 0, null, this.f3251f.b.a()));
            } catch (IOException e2) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e2);
                }
                aVar.c(e2);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
                sb = new StringBuilder();
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(f.e.a.r.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder A = f.a.b.a.a.A("Finished http url fetcher fetch in ");
                A.append(f.e.a.r.h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", A.toString());
            }
            throw th;
        }
    }

    public final InputStream f(URL url, int i2, URL url2, Map<String, String> map) {
        if (i2 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1, null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f3252g);
                httpURLConnection.setReadTimeout(this.f3252g);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f3253h = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f3254i = this.f3253h.getInputStream();
                    if (this.f3255j) {
                        return null;
                    }
                    int c = c(this.f3253h);
                    int i3 = c / 100;
                    if (i3 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f3253h;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f3254i = new f.e.a.r.c(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f3254i = httpURLConnection2.getInputStream();
                            }
                            return this.f3254i;
                        } catch (IOException e2) {
                            throw new HttpException("Failed to obtain InputStream", c(httpURLConnection2), e2);
                        }
                    }
                    if (!(i3 == 3)) {
                        if (c == -1) {
                            throw new HttpException("Http request failed", c, null);
                        }
                        try {
                            throw new HttpException(this.f3253h.getResponseMessage(), c, null);
                        } catch (IOException e3) {
                            throw new HttpException("Failed to get a response message", c, e3);
                        }
                    }
                    String headerField = this.f3253h.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            b();
                            return f(url3, i2 + 1, url, map);
                        } catch (MalformedURLException e4) {
                            throw new HttpException(f.a.b.a.a.p("Bad redirect url: ", headerField), c, e4);
                        }
                    }
                    throw new HttpException("Received empty or null redirect url", c, null);
                } catch (IOException e5) {
                    throw new HttpException("Failed to connect or obtain data", c(this.f3253h), e5);
                }
            } catch (IOException e6) {
                throw new HttpException("URL.openConnection threw", 0, e6);
            }
        }
        throw new HttpException("Too many (> 5) redirects!", -1, null);
    }
}

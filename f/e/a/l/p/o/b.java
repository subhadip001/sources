package f.e.a.l.p.o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import f.e.a.l.p.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public class b implements f.e.a.l.p.d<InputStream> {

    /* renamed from: f  reason: collision with root package name */
    public final Uri f3260f;

    /* renamed from: g  reason: collision with root package name */
    public final d f3261g;

    /* renamed from: h  reason: collision with root package name */
    public InputStream f3262h;

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    public static class a implements c {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // f.e.a.l.p.o.c
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: f.e.a.l.p.o.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0070b implements c {
        public static final String[] b = {"_data"};
        public final ContentResolver a;

        public C0070b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // f.e.a.l.p.o.c
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public b(Uri uri, d dVar) {
        this.f3260f = uri;
        this.f3261g = dVar;
    }

    public static b c(Context context, Uri uri, c cVar) {
        return new b(uri, new d(f.e.a.b.b(context).f3155h.a().e(), cVar, f.e.a.b.b(context).f3156i, context.getContentResolver()));
    }

    @Override // f.e.a.l.p.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // f.e.a.l.p.d
    public void b() {
        InputStream inputStream = this.f3262h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // f.e.a.l.p.d
    public void cancel() {
    }

    @Override // f.e.a.l.p.d
    public DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // f.e.a.l.p.d
    public void e(Priority priority, d.a<? super InputStream> aVar) {
        try {
            InputStream f2 = f();
            this.f3262h = f2;
            aVar.f(f2);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.c(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r6 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        r7 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0023 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Throwable, java.lang.NullPointerException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.e.a.l.p.o.b.f():java.io.InputStream");
    }
}

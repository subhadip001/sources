package f.l.a.e.a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Log;
import com.arthenica.ffmpegkit.MediaInformation;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.firebase.crashlytics.CrashlyticsAnalyticsListener;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import com.video_converter.video_compressor.R;
import e.l.a.c;
import f.l.a.d.c.a;
import f.l.a.d.d.e;
import f.l.a.d.d.f;
import f.l.a.d.d.g;
import i.l.b.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: OutputMediaRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class b implements f.l.a.b.a.b {
    public final Context a;
    public final boolean b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6712d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6713e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6714f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6715g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6716h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6717i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6718j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6719k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6720l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6721m;
    public final String[] n;

    public b(Context context) {
        i.e(context, "context");
        this.a = context;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 == 29;
        this.b = z;
        boolean z2 = i2 == 30;
        this.c = z2;
        this.f6712d = "_display_name";
        this.f6713e = "_display_name";
        this.f6714f = "_display_name";
        String str = "_data";
        this.f6715g = (z || z2) ? "relative_path" : "_data";
        this.f6716h = (z || z2) ? "relative_path" : "_data";
        str = (z || z2) ? "relative_path" : "relative_path";
        this.f6717i = str;
        String[] stringArray = context.getResources().getStringArray(R.array.supported_audio_formats);
        i.d(stringArray, "context.resources.getStr….supported_audio_formats)");
        this.f6718j = i.i.b.b(stringArray, "|", null, null, 0, null, null, 62);
        String[] stringArray2 = context.getResources().getStringArray(R.array.supported_image_formats);
        i.d(stringArray2, "context.resources.getStr….supported_image_formats)");
        this.f6719k = i.i.b.b(stringArray2, "|", null, null, 0, null, null, 62);
        String[] stringArray3 = context.getResources().getStringArray(R.array.supported_video_formats);
        i.d(stringArray3, "context.resources.getStr….supported_video_formats)");
        String b = i.i.b.b(stringArray3, "|", null, null, 0, null, null, 62);
        this.f6720l = b;
        StringBuilder F = f.a.b.a.a.F(str, " REGEXP '(?i).*%s[\\/]?[^\\/]*$' and ", "_display_name", " REGEXP '(?i).+\\.(", b);
        F.append(")'");
        this.f6721m = F.toString();
        this.n = new String[]{"_id", "_display_name", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT, "_size", str, MediaInformation.KEY_DURATION, "date_modified"};
    }

    @Override // f.l.a.b.a.b
    public f.l.a.d.c.a<List<e>> a(List<f> list) {
        i.e(list, "outputFoldersUris");
        try {
            ArrayList arrayList = new ArrayList();
            for (f fVar : list) {
                Log.d("LocalMediaDataSource", i.g("getAllVideos: query ", fVar.a()));
                if (fVar.a() != null) {
                    Uri parse = Uri.parse(fVar.a());
                    i.d(parse, "parse(it.documentUri)");
                    f.l.a.d.c.a<List<e>> b = b(parse);
                    if (b instanceof a.b) {
                        arrayList.addAll((Collection) ((a.b) b).a);
                    }
                }
                f.l.a.d.c.a<List<g>> c = c(fVar);
                if (c instanceof a.b) {
                    arrayList.addAll((Collection) ((a.b) c).a);
                }
                Log.d("LocalMediaDataSource", i.g("getAllVideos: ", c));
            }
            return new a.b(arrayList);
        } catch (Exception e2) {
            return new a.C0157a(e2, "Exception ");
        }
    }

    public final f.l.a.d.c.a<List<e>> b(Uri uri) {
        try {
            c cVar = new c(null, this.a, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
            ArrayList arrayList = new ArrayList();
            e.l.a.a[] g2 = cVar.g();
            i.d(g2, "documentFileDir.listFiles()");
            int i2 = 0;
            int length = g2.length;
            while (i2 < length) {
                e.l.a.a aVar = g2[i2];
                i2++;
                String c = aVar.c();
                if (c == null) {
                    c = "Unknown";
                }
                String uri2 = aVar.d().toString();
                i.d(uri2, "document.uri.toString()");
                arrayList.add(new e(c, uri2, aVar.e(), "ocument.", false));
            }
            return new a.b(i.i.b.h(arrayList));
        } catch (Exception e2) {
            return new a.C0157a(e2, null, 2);
        }
    }

    public final f.l.a.d.c.a<List<g>> c(f fVar) {
        ArrayList arrayList;
        Log.d("LocalMediaDataSource", "getAllVideos: ");
        Integer num = null;
        if (e.i.c.a.checkSelfPermission(this.a, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return new a.C0157a(new IllegalStateException("Permission not granted"), null, 2);
        }
        try {
            String a = fVar.a();
            Uri parse = a == null ? null : Uri.parse(a);
            if (parse == null) {
                parse = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            }
            Uri uri = parse;
            ContentResolver contentResolver = this.a.getContentResolver();
            String[] strArr = this.n;
            Locale locale = Locale.US;
            String str = this.f6721m;
            Object[] objArr = new Object[1];
            String c = fVar.c();
            if (c == null) {
                c = ".*";
            }
            objArr[0] = c;
            String format = String.format(locale, str, Arrays.copyOf(objArr, 1));
            i.d(format, "format(locale, format, *args)");
            SortMode d2 = fVar.d();
            if (d2 == null) {
                f.l.a.d.a aVar = f.l.a.d.a.a;
                d2 = f.l.a.d.a.b;
            }
            SortOrder e2 = fVar.e();
            if (e2 == null) {
                f.l.a.d.a aVar2 = f.l.a.d.a.a;
                e2 = f.l.a.d.a.c;
            }
            Cursor query = contentResolver.query(uri, strArr, format, null, d(d2, e2));
            if (query != null) {
                num = Integer.valueOf(query.getCount());
            }
            Log.d("LocalMediaDataSource", i.g("getAllVideoByFolder: ", num));
            Log.d("LocalMediaDataSource", "parseVideoCursor: ");
            arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext()) {
                    arrayList.add(f(query));
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e3) {
            Log.d("LocalMediaDataSource", i.g("getAllVideoByFolder:ex ", e3));
            arrayList = new ArrayList();
        }
        return new a.b(arrayList);
    }

    public final String d(SortMode sortMode, SortOrder sortOrder) {
        String str;
        String str2;
        int ordinal = sortMode.ordinal();
        if (ordinal == 0) {
            str = "title";
        } else if (ordinal == 1) {
            str = "_size";
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "date_modified";
        }
        int ordinal2 = sortOrder.ordinal();
        if (ordinal2 == 0) {
            str2 = " ASC";
        } else if (ordinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        } else {
            str2 = " DESC";
        }
        String g2 = i.g(str, str2);
        Log.d("LocalMediaDataSource", i.g("getSortOption: ", g2));
        return g2;
    }

    public f.l.a.d.c.a<g> e(f fVar) {
        i.e(fVar, CrashlyticsAnalyticsListener.EVENT_PARAMS_KEY);
        try {
            if (fVar.b() == null) {
                return new a.C0157a(new IllegalArgumentException("please provide file name"), null, 2);
            }
            String str = this.f6717i + " REGEXP '(?i)" + ((Object) fVar.c()) + "[\\/]?[^\\/]*$' and " + this.f6714f + " REGEXP '(?i)" + ((Object) fVar.b()) + '\'';
            Log.e("LocalMediaDataSource", i.g("getVideoDetails: ", str));
            Cursor query = this.a.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, this.n, str, null, null);
            if (query != null) {
                query.moveToFirst();
            }
            if (query != null) {
                g f2 = f(query);
                i.b(f2);
                return new a.b(f2);
            }
            throw new IllegalArgumentException("This uri data is not available at mediaStore");
        } catch (Exception e2) {
            return new a.C0157a(e2, null, 2);
        }
    }

    public final g f(Cursor cursor) {
        String str;
        Log.d("LocalMediaDataSource", "readVideoValueAtCursor: ");
        int i2 = cursor.getInt(0);
        String str2 = null;
        String string = cursor.isNull(1) ? null : cursor.getString(1);
        String string2 = cursor.isNull(2) ? null : cursor.getString(2);
        String string3 = cursor.isNull(3) ? null : cursor.getString(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        try {
            str = cursor.getString(5);
        } catch (Exception unused) {
            str = null;
        }
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i2);
        i.d(withAppendedId, "withAppendedId(\n        …    id.toLong()\n        )");
        i.b(string);
        String uri = withAppendedId.toString();
        long longValue = valueOf == null ? -1L : valueOf.longValue();
        long longValue2 = valueOf2 != null ? valueOf2.longValue() : -1L;
        if (string2 == null) {
            string2 = "-1";
        }
        if (string3 == null) {
            string3 = "-1";
        }
        if (this.b || this.c) {
            str2 = str;
        } else if (str != null) {
            str2 = str.substring(0, i.q.e.h(str, "/", 0, false, 6));
            i.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        i.d(uri, "toString()");
        return new g(string, uri, longValue, str2, string2, string3, Long.valueOf(longValue2));
    }
}

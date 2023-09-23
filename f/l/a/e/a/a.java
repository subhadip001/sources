package f.l.a.e.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.arthenica.ffmpegkit.MediaInformation;
import com.arthenica.ffmpegkit.StreamInformation;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import com.video_converter.video_compressor.R;
import f.l.a.d.c.a;
import f.l.a.d.d.c;
import f.l.a.d.d.d;
import f.l.a.d.d.e;
import f.l.a.d.d.g;
import i.l.b.i;
import i.q.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LocalMediaRepositoryImpl.kt */
/* loaded from: classes2.dex */
public final class a implements f.l.a.b.a.a {
    public final Context a;
    public final boolean b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6702d;

    /* renamed from: e  reason: collision with root package name */
    public final String f6703e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6704f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6705g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6706h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6707i;

    /* renamed from: j  reason: collision with root package name */
    public final String f6708j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6709k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6710l;

    /* renamed from: m  reason: collision with root package name */
    public final String f6711m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String[] s;
    public final String[] t;

    /* compiled from: LocalMediaRepositoryImpl.kt */
    /* renamed from: f.l.a.e.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0159a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            MediaType.values();
            a = new int[]{1, 2, 3};
            SortMode.values();
            b = new int[]{1, 2, 3};
            SortOrder.values();
            c = new int[]{1, 2};
        }
    }

    public a(Context context) {
        i.e(context, "context");
        this.a = context;
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 == 29;
        this.b = z;
        boolean z2 = i2 == 30;
        this.c = z2;
        this.f6702d = "_display_name";
        this.f6703e = "_display_name";
        this.f6704f = "_display_name";
        this.f6705g = "_display_name";
        String str = "_data";
        String str2 = (z || z2) ? "relative_path" : "_data";
        this.f6706h = str2;
        String str3 = (z || z2) ? "relative_path" : "_data";
        this.f6707i = str3;
        String str4 = (z || z2) ? "relative_path" : "_data";
        this.f6708j = str4;
        this.f6709k = (z || z2) ? "relative_path" : "relative_path";
        String[] stringArray = context.getResources().getStringArray(R.array.supported_audio_formats);
        i.d(stringArray, "context.resources.getStr….supported_audio_formats)");
        String b = i.i.b.b(stringArray, "|", null, null, 0, null, null, 62);
        this.f6710l = b;
        String[] stringArray2 = context.getResources().getStringArray(R.array.supported_image_formats);
        i.d(stringArray2, "context.resources.getStr….supported_image_formats)");
        String b2 = i.i.b.b(stringArray2, "|", null, null, 0, null, null, 62);
        this.f6711m = b2;
        String[] stringArray3 = context.getResources().getStringArray(R.array.supported_video_formats);
        i.d(stringArray3, "context.resources.getStr….supported_video_formats)");
        String b3 = i.i.b.b(stringArray3, "|", null, null, 0, null, null, 62);
        this.n = b3;
        String[] stringArray4 = context.getResources().getStringArray(R.array.supported_file_formats);
        i.d(stringArray4, "context.resources.getStr…y.supported_file_formats)");
        this.o = i.i.b.b(stringArray4, "|", null, null, 0, null, null, 62);
        StringBuilder F = f.a.b.a.a.F(str2, " REGEXP '(?i)%s[\\/]?[^\\/]*$' and ", "_display_name", " REGEXP '(?i).+\\.(", b);
        F.append(")'");
        this.p = F.toString();
        StringBuilder F2 = f.a.b.a.a.F(str3, " REGEXP '(?i)%s[\\/]?[^\\/]*$' and ", "_display_name", " REGEXP '(?i).+\\.(", b2);
        F2.append(")'");
        this.q = F2.toString();
        StringBuilder F3 = f.a.b.a.a.F(str4, " REGEXP '(?i)%s[\\/]?[^\\/]*$' and ", "_display_name", " REGEXP '(?i).+\\.(", b3);
        F3.append(")'");
        this.r = F3.toString();
        this.s = new String[]{"_id", "_display_name", "_size", MediaInformation.KEY_DURATION, str2, "date_modified"};
        this.t = new String[]{"_id", "_display_name", StreamInformation.KEY_WIDTH, StreamInformation.KEY_HEIGHT, "_size", str3, "date_modified"};
    }

    @Override // f.l.a.b.a.a
    public f.l.a.d.c.a<List<d>> a(f.l.a.d.d.b bVar) {
        Log.d("LocalMediaDataSource", "getAllImages: ");
        if (e.i.c.a.checkSelfPermission(this.a, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return new a.C0157a(new IllegalStateException("Permission not granted"), null, 2);
        }
        return i(bVar);
    }

    @Override // f.l.a.b.a.a
    public f.l.a.d.d.a b(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Log.d("LocalMediaDataSource", "getAudioDetails: ");
        Cursor query = this.a.getContentResolver().query(uri, this.s, null, null, null);
        if (query != null) {
            query.moveToNext();
        }
        if (query != null) {
            f.l.a.d.d.a l2 = l(query);
            i.b(l2);
            return l2;
        }
        throw new IllegalArgumentException("This uri data is not available at mediaStore");
    }

    @Override // f.l.a.b.a.a
    public f.l.a.d.c.a<List<g>> c(f.l.a.d.d.b bVar) {
        Log.d("LocalMediaDataSource", "getAllVideos: ");
        if (e.i.c.a.checkSelfPermission(this.a, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return new a.C0157a(new IllegalStateException("Permission not granted"), null, 2);
        }
        return j(bVar);
    }

    @Override // f.l.a.b.a.a
    public d d(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Log.d("LocalMediaDataSource", "getImageDetails: ");
        Cursor query = this.a.getContentResolver().query(uri, this.t, null, null, null);
        if (query != null) {
            query.moveToNext();
        }
        if (query != null) {
            d m2 = m(query);
            i.b(m2);
            return m2;
        }
        throw new IllegalArgumentException("This uri data is not available at mediaStore");
    }

    @Override // f.l.a.b.a.a
    public f.l.a.d.c.a<List<f.l.a.d.d.a>> e(f.l.a.d.d.b bVar) {
        Log.d("LocalMediaDataSource", "getAllAudios: ");
        if (e.i.c.a.checkSelfPermission(this.a, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            return new a.C0157a(new IllegalStateException("Permission not granted"), null, 2);
        }
        return h(bVar);
    }

    @Override // f.l.a.b.a.a
    public g f(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        Log.d("LocalMediaDataSource", i.g("getVideoDetails: ", this.f6708j));
        Cursor query = this.a.getContentResolver().query(uri, null, null, null, null);
        if (query != null) {
            query.moveToNext();
        }
        if (query != null) {
            g n = n(query);
            i.b(n);
            return n;
        }
        throw new IllegalArgumentException("This uri data is not available at mediaStore");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    @Override // f.l.a.b.a.a
    public f.l.a.d.c.a<List<c>> g(f.l.a.d.d.b bVar) {
        f.l.a.d.c.a<List<c>> h2;
        ArrayList arrayList;
        String str;
        Log.d("LocalMediaDataSource", i.g("getFolderNames: ", bVar == null ? null : bVar.b()));
        MediaType b = bVar == null ? null : bVar.b();
        int i2 = -1;
        int i3 = b == null ? -1 : C0159a.a[b.ordinal()];
        if (i3 == 1) {
            h2 = h(bVar);
        } else if (i3 == 2) {
            h2 = i(bVar);
        } else if (i3 != 3) {
            return new a.C0157a(new IllegalStateException("Unsupported media type."), i.g("Currently supported media types: AUDIO, IMAGE, VIDEO. Request for: ", bVar == null ? null : bVar.b()));
        } else {
            h2 = j(bVar);
        }
        if (h2 instanceof a.C0157a) {
            return h2;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((List) ((a.b) h2).a).iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            String a = eVar.a();
            if (a != null) {
                String a2 = eVar.a();
                Log.d("LocalMediaDataSource", i.g("getFolderName: ", a2));
                if (a2 == null) {
                    str = null;
                } else {
                    String[] strArr = {"/"};
                    i.e(a2, "<this>");
                    i.e(strArr, "delimiters");
                    String str2 = strArr[0];
                    if (!(str2.length() == 0)) {
                        i.q.e.j(0);
                        int c = i.q.e.c(a2, str2, 0, false);
                        if (c != i2) {
                            ArrayList arrayList3 = new ArrayList(10);
                            int i4 = 0;
                            while (true) {
                                arrayList3.add(a2.subSequence(i4, c).toString());
                                i4 = str2.length() + c;
                                c = i.q.e.c(a2, str2, i4, z);
                                if (c == -1) {
                                    break;
                                }
                                z = false;
                            }
                            arrayList3.add(a2.subSequence(i4, a2.length()).toString());
                            arrayList = arrayList3;
                        } else {
                            arrayList = f.n.a.n.i.F(a2.toString());
                        }
                    } else {
                        i.q.e.j(0);
                        i.q.a aVar = new i.q.a(a2, 0, 0, new f(f.n.a.n.i.e(strArr), false));
                        i.e(aVar, "<this>");
                        i.p.d dVar = new i.p.d(aVar);
                        ArrayList arrayList4 = new ArrayList(f.n.a.n.i.k(dVar, 10));
                        Iterator it2 = dVar.iterator();
                        while (it2.hasNext()) {
                            i.n.c cVar = (i.n.c) it2.next();
                            i.e(a2, "<this>");
                            i.e(cVar, "range");
                            arrayList4.add(a2.subSequence(Integer.valueOf(cVar.f8655f).intValue(), Integer.valueOf(cVar.f8656g).intValue() + 1).toString());
                        }
                        arrayList = arrayList4;
                    }
                    if (arrayList.size() >= 2) {
                        str = ((CharSequence) arrayList.get(arrayList.size() - 2)).length() == 0 ? "root" : (String) arrayList.get(arrayList.size() - 2);
                    } else {
                        str = null;
                    }
                }
                if (str != null) {
                    arrayList2.add(a);
                    hashMap5.put(a, str);
                    Long l2 = (Long) hashMap.get(a);
                    if (l2 == null) {
                        l2 = 0L;
                    }
                    hashMap.put(a, Long.valueOf(eVar.c() + l2.longValue()));
                    Integer num = (Integer) hashMap2.get(a);
                    if (num == null) {
                        num = 0;
                    }
                    hashMap2.put(a, Integer.valueOf(num.intValue() + 1));
                    String str3 = (String) hashMap3.get(a);
                    if (str3 == null) {
                        str3 = eVar.e();
                    }
                    i.d(str3, "thumbMap[relPath] ?: it.uri");
                    hashMap3.put(a, str3);
                    String str4 = (String) hashMap4.get(a);
                    if (str4 == null && (str4 = eVar.a()) == null) {
                        str4 = "";
                    }
                    hashMap4.put(a, str4);
                }
                i2 = -1;
            }
        }
        List<String> a3 = i.i.b.a(arrayList2);
        ArrayList arrayList5 = new ArrayList(f.n.a.n.i.k(a3, 10));
        for (String str5 : a3) {
            String str6 = (String) hashMap5.get(str5);
            if (str6 == null) {
                str6 = "-";
            }
            String str7 = str6;
            Long l3 = (Long) hashMap.get(str5);
            if (l3 == null) {
                l3 = 0L;
            }
            String str8 = (String) hashMap4.get(str5);
            String str9 = str8 == null ? "" : str8;
            String str10 = (String) hashMap3.get(str5);
            String str11 = str10 == null ? "" : str10;
            Integer num2 = (Integer) hashMap2.get(str5);
            if (num2 == null) {
                num2 = 0;
            }
            arrayList5.add(new c(str7, "", l3.longValue(), str9, str11, num2.intValue()));
        }
        return new a.b(i.i.b.h(arrayList5));
    }

    public final f.l.a.d.c.a<ArrayList<f.l.a.d.d.a>> h(f.l.a.d.d.b bVar) {
        try {
            Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            String str = ".*";
            if (bVar != null && bVar.a() != null) {
                String a = bVar.a();
                i.b(a);
                str = Pattern.quote(f.n.a.n.i.R(a, "'", "''", false, 4));
                i.d(str, "quote(filter)");
            }
            String format = String.format(Locale.US, this.p, Arrays.copyOf(new Object[]{str}, 1));
            i.d(format, "format(locale, format, *args)");
            Log.d("LocalMediaDataSource", i.g("getAllAudioByFolder: ", format));
            ContentResolver contentResolver = this.a.getContentResolver();
            String[] strArr = this.s;
            SortMode c = bVar == null ? null : bVar.c();
            if (c == null) {
                f.l.a.d.a aVar = f.l.a.d.a.a;
                c = f.l.a.d.a.b;
            }
            SortOrder d2 = bVar == null ? null : bVar.d();
            if (d2 == null) {
                f.l.a.d.a aVar2 = f.l.a.d.a.a;
                d2 = f.l.a.d.a.c;
            }
            Cursor query = contentResolver.query(uri, strArr, format, null, k(c, d2));
            Log.d("LocalMediaDataSource", i.g("getAllAudioByFolder: ", query == null ? null : Integer.valueOf(query.getCount())));
            Log.d("LocalMediaDataSource", "parseAudioCursor: ");
            ArrayList arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext()) {
                    arrayList.add(l(query));
                }
            }
            if (query != null) {
                query.close();
            }
            return new a.b(arrayList);
        } catch (Exception e2) {
            Log.d("LocalMediaDataSource", i.g("getAllAudioByFolder:ex ", e2));
            return new a.C0157a(e2, null, 2);
        }
    }

    public final f.l.a.d.c.a<ArrayList<d>> i(f.l.a.d.d.b bVar) {
        try {
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            String str = ".*";
            if (bVar != null && bVar.a() != null) {
                String a = bVar.a();
                i.b(a);
                str = Pattern.quote(f.n.a.n.i.R(a, "'", "''", false, 4));
                i.d(str, "quote(filter)");
            }
            String format = String.format(Locale.US, this.q, Arrays.copyOf(new Object[]{str}, 1));
            i.d(format, "format(locale, format, *args)");
            Log.d("LocalMediaDataSource", i.g("getAllImageByFolder: ", format));
            ContentResolver contentResolver = this.a.getContentResolver();
            String[] strArr = this.t;
            SortMode c = bVar == null ? null : bVar.c();
            if (c == null) {
                f.l.a.d.a aVar = f.l.a.d.a.a;
                c = f.l.a.d.a.b;
            }
            SortOrder d2 = bVar == null ? null : bVar.d();
            if (d2 == null) {
                f.l.a.d.a aVar2 = f.l.a.d.a.a;
                d2 = f.l.a.d.a.c;
            }
            Cursor query = contentResolver.query(uri, strArr, format, null, k(c, d2));
            Log.d("LocalMediaDataSource", i.g("getAllImageByFolder: ", query == null ? null : Integer.valueOf(query.getCount())));
            Log.d("LocalMediaDataSource", "parseImageCursor: ");
            ArrayList arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext()) {
                    arrayList.add(m(query));
                }
            }
            if (query != null) {
                query.close();
            }
            return new a.b(arrayList);
        } catch (Exception e2) {
            Log.d("LocalMediaDataSource", i.g("getAllImageByFolder:ex ", e2));
            return new a.C0157a(e2, null, 2);
        }
    }

    public final f.l.a.d.c.a<ArrayList<g>> j(f.l.a.d.d.b bVar) {
        try {
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            String str = ".*";
            if (bVar != null && bVar.a() != null) {
                String a = bVar.a();
                i.b(a);
                str = Pattern.quote(f.n.a.n.i.R(a, "'", "''", false, 4));
                i.d(str, "quote(filter)");
            }
            String format = String.format(Locale.US, this.r, Arrays.copyOf(new Object[]{str}, 1));
            i.d(format, "format(locale, format, *args)");
            Log.d("LocalMediaDataSource", i.g("getAllVideoByFolder: ", format));
            ContentResolver contentResolver = this.a.getContentResolver();
            SortMode c = bVar == null ? null : bVar.c();
            if (c == null) {
                f.l.a.d.a aVar = f.l.a.d.a.a;
                c = f.l.a.d.a.b;
            }
            SortOrder d2 = bVar == null ? null : bVar.d();
            if (d2 == null) {
                f.l.a.d.a aVar2 = f.l.a.d.a.a;
                d2 = f.l.a.d.a.c;
            }
            Cursor query = contentResolver.query(uri, null, format, null, k(c, d2));
            Log.d("LocalMediaDataSource", i.g("getAllVideoByFolder: ", query == null ? null : Integer.valueOf(query.getCount())));
            Log.d("LocalMediaDataSource", "parseVideoCursor: ");
            ArrayList arrayList = new ArrayList();
            if (query != null) {
                while (query.moveToNext()) {
                    arrayList.add(n(query));
                }
            }
            if (query != null) {
                query.close();
            }
            return new a.b(arrayList);
        } catch (Exception e2) {
            Log.d("LocalMediaDataSource", i.g("getAllVideoByFolder:ex ", e2));
            return new a.C0157a(e2, null, 2);
        }
    }

    public final String k(SortMode sortMode, SortOrder sortOrder) {
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f.l.a.d.d.a l(android.database.Cursor r14) {
        /*
            r13 = this;
            r0 = 0
            int r1 = r14.getInt(r0)
            r2 = 1
            boolean r3 = r14.isNull(r2)
            r4 = 0
            if (r3 == 0) goto Lf
            r6 = r4
            goto L14
        Lf:
            java.lang.String r3 = r14.getString(r2)
            r6 = r3
        L14:
            r3 = 2
            boolean r5 = r14.isNull(r3)
            if (r5 == 0) goto L1d
            r3 = r4
            goto L25
        L1d:
            long r7 = r14.getLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
        L25:
            r5 = 3
            boolean r7 = r14.isNull(r5)
            if (r7 == 0) goto L2e
            r5 = r4
            goto L36
        L2e:
            long r7 = r14.getLong(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
        L36:
            r7 = 4
            java.lang.String r14 = r14.getString(r7)     // Catch: java.lang.Exception -> L5b
            boolean r7 = r13.b     // Catch: java.lang.Exception -> L59
            if (r7 != 0) goto L59
            boolean r7 = r13.c     // Catch: java.lang.Exception -> L59
            if (r7 == 0) goto L44
            goto L59
        L44:
            if (r14 != 0) goto L47
            goto L5b
        L47:
            java.lang.String r4 = "/"
            r7 = 6
            int r4 = i.q.e.h(r14, r4, r0, r0, r7)     // Catch: java.lang.Exception -> L59
            int r4 = r4 + r2
            java.lang.String r4 = r14.substring(r0, r4)     // Catch: java.lang.Exception -> L59
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            i.l.b.i.d(r4, r0)     // Catch: java.lang.Exception -> L59
            goto L5b
        L59:
            r10 = r14
            goto L5c
        L5b:
            r10 = r4
        L5c:
            android.net.Uri r14 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
            long r0 = (long) r1
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r14, r0)
            java.lang.String r0 = "withAppendedId(\n        …    id.toLong()\n        )"
            i.l.b.i.d(r14, r0)
            i.l.b.i.b(r6)
            java.lang.String r7 = r14.toString()
            r0 = -1
            if (r3 != 0) goto L75
            r8 = r0
            goto L7a
        L75:
            long r2 = r3.longValue()
            r8 = r2
        L7a:
            if (r5 != 0) goto L7d
            goto L81
        L7d:
            long r0 = r5.longValue()
        L81:
            r11 = r0
            f.l.a.d.d.a r14 = new f.l.a.d.d.a
            java.lang.String r0 = "toString()"
            i.l.b.i.d(r7, r0)
            r5 = r14
            r5.<init>(r6, r7, r8, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.a.e.a.a.l(android.database.Cursor):f.l.a.d.d.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f.l.a.d.d.d m(android.database.Cursor r14) {
        /*
            r13 = this;
            r0 = 0
            int r1 = r14.getInt(r0)
            r2 = 1
            boolean r3 = r14.isNull(r2)
            r4 = 0
            if (r3 == 0) goto Lf
            r6 = r4
            goto L14
        Lf:
            java.lang.String r3 = r14.getString(r2)
            r6 = r3
        L14:
            r3 = 2
            boolean r5 = r14.isNull(r3)
            if (r5 == 0) goto L1d
            r3 = r4
            goto L21
        L1d:
            java.lang.String r3 = r14.getString(r3)
        L21:
            r5 = 3
            boolean r7 = r14.isNull(r5)
            if (r7 == 0) goto L2a
            r5 = r4
            goto L2e
        L2a:
            java.lang.String r5 = r14.getString(r5)
        L2e:
            r7 = 4
            boolean r8 = r14.isNull(r7)
            if (r8 == 0) goto L37
            r7 = r4
            goto L3f
        L37:
            long r7 = r14.getLong(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
        L3f:
            r8 = 5
            java.lang.String r14 = r14.getString(r8)     // Catch: java.lang.Exception -> L64
            boolean r8 = r13.b     // Catch: java.lang.Exception -> L62
            if (r8 != 0) goto L62
            boolean r8 = r13.c     // Catch: java.lang.Exception -> L62
            if (r8 == 0) goto L4d
            goto L62
        L4d:
            if (r14 != 0) goto L50
            goto L64
        L50:
            java.lang.String r4 = "/"
            r8 = 6
            int r4 = i.q.e.h(r14, r4, r0, r0, r8)     // Catch: java.lang.Exception -> L62
            int r4 = r4 + r2
            java.lang.String r4 = r14.substring(r0, r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            i.l.b.i.d(r4, r0)     // Catch: java.lang.Exception -> L62
            goto L64
        L62:
            r10 = r14
            goto L65
        L64:
            r10 = r4
        L65:
            android.net.Uri r14 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            long r0 = (long) r1
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r14, r0)
            java.lang.String r0 = "withAppendedId(\n        …    id.toLong()\n        )"
            i.l.b.i.d(r14, r0)
            i.l.b.i.b(r6)
            java.lang.String r14 = r14.toString()
            if (r7 != 0) goto L7d
            r0 = -1
            goto L81
        L7d:
            long r0 = r7.longValue()
        L81:
            r8 = r0
            java.lang.String r0 = "-1"
            if (r3 != 0) goto L88
            r11 = r0
            goto L89
        L88:
            r11 = r3
        L89:
            if (r5 != 0) goto L8d
            r12 = r0
            goto L8e
        L8d:
            r12 = r5
        L8e:
            f.l.a.d.d.d r0 = new f.l.a.d.d.d
            java.lang.String r1 = "toString()"
            i.l.b.i.d(r14, r1)
            r5 = r0
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.a.e.a.a.m(android.database.Cursor):f.l.a.d.d.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final f.l.a.d.d.g n(android.database.Cursor r14) {
        /*
            r13 = this;
            java.lang.String r0 = "<this>"
            i.l.b.i.e(r14, r0)
            java.lang.String r0 = "_id"
            java.lang.String r1 = "index"
            i.l.b.i.e(r0, r1)
            r1 = 0
            int r0 = r14.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L1a
            int r0 = r14.getInt(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L1a
            goto L1b
        L1a:
            r0 = r1
        L1b:
            java.lang.String r2 = "_display_name"
            java.lang.String r2 = f.l.a.a.b(r14, r2)
            if (r2 != 0) goto L25
            java.lang.String r2 = "undefined.undefined"
        L25:
            r4 = r2
            java.lang.String r2 = "width"
            java.lang.String r2 = f.l.a.a.b(r14, r2)
            java.lang.String r3 = "-1"
            if (r2 != 0) goto L32
            r9 = r3
            goto L33
        L32:
            r9 = r2
        L33:
            java.lang.String r2 = "height"
            java.lang.String r2 = f.l.a.a.b(r14, r2)
            if (r2 != 0) goto L3d
            r10 = r3
            goto L3e
        L3d:
            r10 = r2
        L3e:
            java.lang.String r2 = "_size"
            java.lang.Long r2 = f.l.a.a.a(r14, r2)
            r5 = 0
            if (r2 != 0) goto L4a
            r7 = r5
            goto L4f
        L4a:
            long r2 = r2.longValue()
            r7 = r2
        L4f:
            java.lang.String r2 = "duration"
            java.lang.Long r2 = f.l.a.a.a(r14, r2)
            if (r2 != 0) goto L59
            r2 = r5
            goto L5d
        L59:
            long r2 = r2.longValue()
        L5d:
            java.lang.String r11 = r13.f6709k     // Catch: java.lang.Exception -> L85
            java.lang.String r14 = f.l.a.a.b(r14, r11)     // Catch: java.lang.Exception -> L85
            boolean r11 = r13.b     // Catch: java.lang.Exception -> L83
            if (r11 != 0) goto L83
            boolean r11 = r13.c     // Catch: java.lang.Exception -> L83
            if (r11 == 0) goto L6c
            goto L83
        L6c:
            if (r14 != 0) goto L6f
            goto L86
        L6f:
            java.lang.String r1 = "/"
            r11 = 6
            r12 = 0
            int r1 = i.q.e.h(r14, r1, r12, r12, r11)     // Catch: java.lang.Exception -> L83
            int r1 = r1 + 1
            java.lang.String r1 = r14.substring(r12, r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r11 = "this as java.lang.String…ing(startIndex, endIndex)"
            i.l.b.i.d(r1, r11)     // Catch: java.lang.Exception -> L83
            goto L86
        L83:
            r1 = r14
            goto L86
        L85:
        L86:
            android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            if (r0 != 0) goto L8b
            goto L90
        L8b:
            int r0 = r0.intValue()
            long r5 = (long) r0
        L90:
            android.net.Uri r14 = android.content.ContentUris.withAppendedId(r14, r5)
            java.lang.String r0 = "withAppendedId(\n        …?.toLong() ?: 0\n        )"
            i.l.b.i.d(r14, r0)
            java.lang.String r5 = r14.toString()
            f.l.a.d.d.g r14 = new f.l.a.d.d.g
            java.lang.String r0 = "toString()"
            i.l.b.i.d(r5, r0)
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            r3 = r14
            r6 = r7
            r8 = r1
            r3.<init>(r4, r5, r6, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f.l.a.e.a.a.n(android.database.Cursor):f.l.a.d.d.g");
    }
}

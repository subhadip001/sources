package f.n.a.o;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.arthenica.ffmpegkit.MediaInformation;
import f.n.a.v.a.j;

/* compiled from: OutputFile.java */
/* loaded from: classes2.dex */
public class d {
    public String a;
    public String b;
    public Uri c;

    /* renamed from: d  reason: collision with root package name */
    public String f7053d;

    /* renamed from: e  reason: collision with root package name */
    public int f7054e;

    /* renamed from: f  reason: collision with root package name */
    public int f7055f;

    public d(Cursor cursor) {
        if (cursor != null) {
            this.a = cursor.getString(cursor.getColumnIndex("title"));
            this.b = cursor.getString(cursor.getColumnIndexOrThrow("_size"));
            this.c = ContentUris.withAppendedId(MediaStore.Files.getContentUri("external"), cursor.getInt(cursor.getColumnIndex("_id")));
            this.f7054e = cursor.getInt(cursor.getColumnIndex(MediaInformation.KEY_DURATION));
            this.f7055f = cursor.getInt(cursor.getColumnIndex("media_type"));
            this.f7053d = cursor.getString(cursor.getColumnIndex("_data"));
        }
    }

    public String toString() {
        String str;
        String str2 = this.f7053d;
        String substring = str2.substring(str2.lastIndexOf(47) + 1, this.f7053d.length());
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("File Name:  %s\n\n", substring));
        Object[] objArr = new Object[1];
        try {
            str = j.f(Long.parseLong(this.b));
        } catch (Exception unused) {
            str = "<unknown>";
        }
        objArr[0] = str;
        sb.append(String.format("Size:  %s\n\n", objArr));
        sb.append(String.format("File Path:  %s\n\n", String.format("%s%s/%s", "Internal Storage", "/VideoCompressor", substring)));
        return sb.toString().toString();
    }
}

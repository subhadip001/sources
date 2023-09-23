package f.l.a;

import android.database.Cursor;
import i.l.b.i;

/* loaded from: classes2.dex */
public final class a {
    public static final Long a(Cursor cursor, String str) {
        i.e(cursor, "<this>");
        i.e(str, "index");
        try {
            return Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final String b(Cursor cursor, String str) {
        i.e(cursor, "<this>");
        i.e(str, "index");
        try {
            return cursor.getString(cursor.getColumnIndexOrThrow(str));
        } catch (Throwable unused) {
            return null;
        }
    }
}

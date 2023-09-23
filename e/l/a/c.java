package e.l.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: TreeDocumentFile.java */
/* loaded from: classes.dex */
public class c extends a {
    public Context a;
    public Uri b;

    public c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.a = context;
        this.b = uri;
    }

    public static void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    @Override // e.l.a.a
    public boolean a() {
        return e.i.a.x(this.a, this.b);
    }

    @Override // e.l.a.a
    public String c() {
        return e.i.a.B(this.a, this.b);
    }

    @Override // e.l.a.a
    public Uri d() {
        return this.b;
    }

    @Override // e.l.a.a
    public long e() {
        return e.i.a.L(this.a, this.b);
    }

    public a[] g() {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = this.b;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.b, cursor.getString(0)));
                }
            } catch (Exception e2) {
                Log.w("DocumentFile", "Failed query: " + e2);
            }
            f(cursor);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i2 = 0; i2 < uriArr.length; i2++) {
                aVarArr[i2] = new c(this, this.a, uriArr[i2]);
            }
            return aVarArr;
        } catch (Throwable th) {
            f(cursor);
            throw th;
        }
    }
}

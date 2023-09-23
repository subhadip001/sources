package f.m.b;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: ContactsPhotoRequestHandler.java */
/* loaded from: classes2.dex */
public class f extends x {
    public static final UriMatcher b;
    public final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public f(Context context) {
        this.a = context;
    }

    @Override // f.m.b.x
    public boolean c(v vVar) {
        Uri uri = vVar.c;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(vVar.c) != -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // f.m.b.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f.m.b.x.a f(f.m.b.v r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.c
            android.content.UriMatcher r0 = f.m.b.f.b
            int r0 = r0.match(r5)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L2d
            r3 = 2
            if (r0 == r3) goto L28
            r3 = 3
            if (r0 == r3) goto L35
            r1 = 4
            if (r0 != r1) goto L1c
            goto L28
        L1c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid uri: "
            java.lang.String r5 = f.a.b.a.a.n(r0, r5)
            r6.<init>(r5)
            throw r6
        L28:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L39
        L2d:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L35
            r5 = r2
            goto L39
        L35:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r1)
        L39:
            if (r5 != 0) goto L3c
            return r2
        L3c:
            f.m.b.x$a r6 = new f.m.b.x$a
            l.y r5 = l.o.f(r5)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f.m.b.f.f(f.m.b.v, int):f.m.b.x$a");
    }
}

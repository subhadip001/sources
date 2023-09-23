package e.i.j.i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class f {
    public final c a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // e.i.j.i0.f.c
        public Uri a() {
            return this.a;
        }

        @Override // e.i.j.i0.f.c
        public void b() {
        }

        @Override // e.i.j.i0.f.c
        public Uri c() {
            return this.c;
        }

        @Override // e.i.j.i0.f.c
        public Object d() {
            return null;
        }

        @Override // e.i.j.i0.f.c
        public ClipDescription getDescription() {
            return this.b;
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // e.i.j.i0.f.c
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override // e.i.j.i0.f.c
        public void b() {
            this.a.requestPermission();
        }

        @Override // e.i.j.i0.f.c
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override // e.i.j.i0.f.c
        public Object d() {
            return this.a;
        }

        @Override // e.i.j.i0.f.c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.a = cVar;
    }
}

package e.i.j;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;

/* compiled from: ContentInfoCompat.java */
/* loaded from: classes.dex */
public final class e {
    public final InterfaceC0045e a;

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements b {
        public final ContentInfo.Builder a;

        public a(ClipData clipData, int i2) {
            this.a = new ContentInfo.Builder(clipData, i2);
        }

        @Override // e.i.j.e.b
        public void a(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // e.i.j.e.b
        public void b(int i2) {
            this.a.setFlags(i2);
        }

        @Override // e.i.j.e.b
        public e build() {
            return new e(new d(this.a.build()));
        }

        @Override // e.i.j.e.b
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i2);

        e build();

        void setExtras(Bundle bundle);
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class c implements b {
        public ClipData a;
        public int b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f2509d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f2510e;

        public c(ClipData clipData, int i2) {
            this.a = clipData;
            this.b = i2;
        }

        @Override // e.i.j.e.b
        public void a(Uri uri) {
            this.f2509d = uri;
        }

        @Override // e.i.j.e.b
        public void b(int i2) {
            this.c = i2;
        }

        @Override // e.i.j.e.b
        public e build() {
            return new e(new f(this));
        }

        @Override // e.i.j.e.b
        public void setExtras(Bundle bundle) {
            this.f2510e = bundle;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0045e {
        public final ContentInfo a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.a = contentInfo;
        }

        @Override // e.i.j.e.InterfaceC0045e
        public ClipData a() {
            return this.a.getClip();
        }

        @Override // e.i.j.e.InterfaceC0045e
        public int b() {
            return this.a.getFlags();
        }

        @Override // e.i.j.e.InterfaceC0045e
        public ContentInfo c() {
            return this.a;
        }

        @Override // e.i.j.e.InterfaceC0045e
        public int getSource() {
            return this.a.getSource();
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("ContentInfoCompat{");
            A.append(this.a);
            A.append("}");
            return A.toString();
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: e.i.j.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0045e {
        ClipData a();

        int b();

        ContentInfo c();

        int getSource();
    }

    /* compiled from: ContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC0045e {
        public final ClipData a;
        public final int b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f2511d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f2512e;

        public f(c cVar) {
            ClipData clipData = cVar.a;
            Objects.requireNonNull(clipData);
            this.a = clipData;
            int i2 = cVar.b;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i2 <= 5) {
                this.b = i2;
                int i3 = cVar.c;
                if ((i3 & 1) == i3) {
                    this.c = i3;
                    this.f2511d = cVar.f2509d;
                    this.f2512e = cVar.f2510e;
                    return;
                }
                StringBuilder A = f.a.b.a.a.A("Requested flags 0x");
                A.append(Integer.toHexString(i3));
                A.append(", but only 0x");
                A.append(Integer.toHexString(1));
                A.append(" are allowed");
                throw new IllegalArgumentException(A.toString());
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }

        @Override // e.i.j.e.InterfaceC0045e
        public ClipData a() {
            return this.a;
        }

        @Override // e.i.j.e.InterfaceC0045e
        public int b() {
            return this.c;
        }

        @Override // e.i.j.e.InterfaceC0045e
        public ContentInfo c() {
            return null;
        }

        @Override // e.i.j.e.InterfaceC0045e
        public int getSource() {
            return this.b;
        }

        public String toString() {
            String str;
            String sb;
            StringBuilder A = f.a.b.a.a.A("ContentInfoCompat{clip=");
            A.append(this.a.getDescription());
            A.append(", source=");
            int i2 = this.b;
            if (i2 == 0) {
                str = "SOURCE_APP";
            } else if (i2 == 1) {
                str = "SOURCE_CLIPBOARD";
            } else if (i2 == 2) {
                str = "SOURCE_INPUT_METHOD";
            } else if (i2 == 3) {
                str = "SOURCE_DRAG_AND_DROP";
            } else if (i2 != 4) {
                str = i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT";
            } else {
                str = "SOURCE_AUTOFILL";
            }
            A.append(str);
            A.append(", flags=");
            int i3 = this.c;
            A.append((i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3));
            if (this.f2511d == null) {
                sb = "";
            } else {
                StringBuilder A2 = f.a.b.a.a.A(", hasLinkUri(");
                A2.append(this.f2511d.toString().length());
                A2.append(")");
                sb = A2.toString();
            }
            A.append(sb);
            return f.a.b.a.a.u(A, this.f2512e != null ? ", hasExtras" : "", "}");
        }
    }

    public e(InterfaceC0045e interfaceC0045e) {
        this.a = interfaceC0045e;
    }

    public String toString() {
        return this.a.toString();
    }
}

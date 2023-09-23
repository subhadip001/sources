package f.h.b.b.e2;

import android.text.Html;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: SpannedToHtmlConverter.java */
/* loaded from: classes.dex */
public final class l {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static class b {
        public final String a;

        public b(String str, Map map, a aVar) {
            this.a = str;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final String c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4129d;

        public c(int i2, int i3, String str, String str2, a aVar) {
            this.a = i2;
            this.b = i3;
            this.c = str;
            this.f4129d = str2;
        }
    }

    /* compiled from: SpannedToHtmlConverter.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final List<c> a = new ArrayList();
        public final List<c> b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}

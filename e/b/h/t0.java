package e.b.h;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.video_converter.video_compressor.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public class t0 extends e.j.a.c implements View.OnClickListener {
    public static final /* synthetic */ int D = 0;
    public int A;
    public int B;
    public int C;
    public final SearchView q;
    public final SearchableInfo r;
    public final Context s;
    public final WeakHashMap<String, Drawable.ConstantState> t;
    public final int u;
    public int v;
    public ColorStateList w;
    public int x;
    public int y;
    public int z;

    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1843d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1844e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.f1843d = (ImageView) view.findViewById(16908296);
            this.f1844e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.v = 1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.q = searchView;
        this.r = searchableInfo;
        this.u = searchView.getSuggestionCommitIconResId();
        this.s = context;
        this.t = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    @Override // e.j.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.t0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // e.j.a.a
    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.x = cursor.getColumnIndex("suggest_text_1");
                this.y = cursor.getColumnIndex("suggest_text_2");
                this.z = cursor.getColumnIndex("suggest_text_2_url");
                this.A = cursor.getColumnIndex("suggest_icon_1");
                this.B = cursor.getColumnIndex("suggest_icon_2");
                this.C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // e.j.a.a
    public CharSequence c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        if (!this.r.shouldRewriteQueryFromData() || (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
            if (!this.r.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
            return h2;
        }
        return h3;
    }

    @Override // e.j.a.c, e.j.a.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.p.inflate(this.n, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.u);
        return inflate;
    }

    public Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.s.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(f.a.b.a.a.n("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(f.a.b.a.a.n("More than two path segments: ", uri));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(f.a.b.a.a.n("No resource found for: ", uri));
                }
                throw new FileNotFoundException(f.a.b.a.a.n("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(f.a.b.a.a.n("No package found for authority: ", uri));
            }
        }
        throw new FileNotFoundException(f.a.b.a.a.n("No authority: ", uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.h.t0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.s.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // e.j.a.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.p.inflate(this.o, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // e.j.a.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(this.s, this.f2578h, viewGroup);
            ((a) d2.getTag()).a.setText(e2.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final void i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        i(this.f2578h);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        i(this.f2578h);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.q.x((CharSequence) tag);
        }
    }
}

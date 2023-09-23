package e.j.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import e.j.a.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: f  reason: collision with root package name */
    public boolean f2576f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2577g;

    /* renamed from: h  reason: collision with root package name */
    public Cursor f2578h;

    /* renamed from: i  reason: collision with root package name */
    public Context f2579i;

    /* renamed from: j  reason: collision with root package name */
    public int f2580j;

    /* renamed from: k  reason: collision with root package name */
    public C0047a f2581k;

    /* renamed from: l  reason: collision with root package name */
    public DataSetObserver f2582l;

    /* renamed from: m  reason: collision with root package name */
    public e.j.a.b f2583m;

    /* compiled from: CursorAdapter.java */
    /* renamed from: e.j.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0047a extends ContentObserver {
        public C0047a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f2577g || (cursor = aVar.f2578h) == null || cursor.isClosed()) {
                return;
            }
            aVar.f2576f = aVar.f2578h.requery();
        }
    }

    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f2576f = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2576f = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        int i2 = z ? 1 : 2;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f2577g = true;
        } else {
            this.f2577g = false;
        }
        boolean z2 = cursor != null;
        this.f2578h = cursor;
        this.f2576f = z2;
        this.f2579i = context;
        this.f2580j = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f2581k = new C0047a();
            this.f2582l = new b();
        } else {
            this.f2581k = null;
            this.f2582l = null;
        }
        if (z2) {
            C0047a c0047a = this.f2581k;
            if (c0047a != null) {
                cursor.registerContentObserver(c0047a);
            }
            DataSetObserver dataSetObserver = this.f2582l;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f2578h;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0047a c0047a = this.f2581k;
                if (c0047a != null) {
                    cursor2.unregisterContentObserver(c0047a);
                }
                DataSetObserver dataSetObserver = this.f2582l;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2578h = cursor;
            if (cursor != null) {
                C0047a c0047a2 = this.f2581k;
                if (c0047a2 != null) {
                    cursor.registerContentObserver(c0047a2);
                }
                DataSetObserver dataSetObserver2 = this.f2582l;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2580j = cursor.getColumnIndexOrThrow("_id");
                this.f2576f = true;
                notifyDataSetChanged();
            } else {
                this.f2580j = -1;
                this.f2576f = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2576f || (cursor = this.f2578h) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (this.f2576f) {
            this.f2578h.moveToPosition(i2);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.p.inflate(cVar.o, viewGroup, false);
            }
            a(view, this.f2579i, this.f2578h);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2583m == null) {
            this.f2583m = new e.j.a.b(this);
        }
        return this.f2583m;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2576f || (cursor = this.f2578h) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2578h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f2576f && (cursor = this.f2578h) != null && cursor.moveToPosition(i2)) {
            return this.f2578h.getLong(this.f2580j);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (this.f2576f) {
            if (this.f2578h.moveToPosition(i2)) {
                if (view == null) {
                    view = d(this.f2579i, this.f2578h, viewGroup);
                }
                a(view, this.f2579i, this.f2578h);
                return view;
            }
            throw new IllegalStateException(f.a.b.a.a.i("couldn't move cursor to position ", i2));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}

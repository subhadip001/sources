package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import e.b.c.h;
import e.b.h.f0;
import e.b.h.f1;
import e.b.h.h0;
import e.b.h.j0;
import e.b.h.v0;
import e.i.j.z;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner {
    public static final int[] n = {16843505};

    /* renamed from: f  reason: collision with root package name */
    public final e.b.h.e f159f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f160g;

    /* renamed from: h  reason: collision with root package name */
    public h0 f161h;

    /* renamed from: i  reason: collision with root package name */
    public SpinnerAdapter f162i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f163j;

    /* renamed from: k  reason: collision with root package name */
    public e f164k;

    /* renamed from: l  reason: collision with root package name */
    public int f165l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f166m;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public boolean f167f;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f167f ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f167f = parcel.readByte() != 0;
        }
    }

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().a()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements e, DialogInterface.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public h f169f;

        /* renamed from: g  reason: collision with root package name */
        public ListAdapter f170g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f171h;

        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public boolean a() {
            h hVar = this.f169f;
            if (hVar != null) {
                return hVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public int b() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void d(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void dismiss() {
            h hVar = this.f169f;
            if (hVar != null) {
                hVar.dismiss();
                this.f169f = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public CharSequence e() {
            return this.f171h;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void i(CharSequence charSequence) {
            this.f171h = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void j(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void l(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void m(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void n(int i2, int i3) {
            if (this.f170g == null) {
                return;
            }
            h.a aVar = new h.a(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence = this.f171h;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.f170g;
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.a;
            bVar.n = listAdapter;
            bVar.o = this;
            bVar.r = selectedItemPosition;
            bVar.q = true;
            h create = aVar.create();
            this.f169f = create;
            ListView listView = create.f1479h.f89g;
            listView.setTextDirection(i2);
            listView.setTextAlignment(i3);
            this.f169f.show();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            AppCompatSpinner.this.setSelection(i2);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i2, this.f170g.getItemId(i2));
            }
            h hVar = this.f169f;
            if (hVar != null) {
                hVar.dismiss();
                this.f169f = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void p(ListAdapter listAdapter) {
            this.f170g = listAdapter;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: f  reason: collision with root package name */
        public SpinnerAdapter f173f;

        /* renamed from: g  reason: collision with root package name */
        public ListAdapter f174g;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f173f = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f174g = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof v0) {
                    v0 v0Var = (v0) spinnerAdapter;
                    if (v0Var.getDropDownViewTheme() == null) {
                        v0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f174g;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f173f;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f174g;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f173f;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends j0 implements e {
        public CharSequence I;
        public ListAdapter J;
        public final Rect K;
        public int L;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a(AppCompatSpinner appCompatSpinner) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                AppCompatSpinner.this.setSelection(i2);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    AppCompatSpinner.this.performItemClick(view, i2, dVar.J.getItemId(i2));
                }
                d.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
                Objects.requireNonNull(dVar);
                AtomicInteger atomicInteger = z.a;
                if (!(z.g.b(appCompatSpinner) && appCompatSpinner.getGlobalVisibleRect(dVar.K))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.h();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f177f;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f177f = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f177f);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.K = new Rect();
            this.u = AppCompatSpinner.this;
            s(true);
            this.s = 0;
            this.v = new a(AppCompatSpinner.this);
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public CharSequence e() {
            return this.I;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void i(CharSequence charSequence) {
            this.I = charSequence;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void m(int i2) {
            this.L = i2;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.e
        public void n(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            t();
            this.E.setInputMethodMode(2);
            h();
            f0 f0Var = this.f1799h;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i2);
            f0Var.setTextAlignment(i3);
            int selectedItemPosition = AppCompatSpinner.this.getSelectedItemPosition();
            f0 f0Var2 = this.f1799h;
            if (a() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (a2 || (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.E.setOnDismissListener(new c(bVar));
        }

        @Override // e.b.h.j0, androidx.appcompat.widget.AppCompatSpinner.e
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.J = listAdapter;
        }

        public void t() {
            int i2;
            Drawable g2 = g();
            int i3 = 0;
            if (g2 != null) {
                g2.getPadding(AppCompatSpinner.this.f166m);
                i3 = f1.b(AppCompatSpinner.this) ? AppCompatSpinner.this.f166m.right : -AppCompatSpinner.this.f166m.left;
            } else {
                Rect rect = AppCompatSpinner.this.f166m;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i4 = appCompatSpinner.f165l;
            if (i4 == -2) {
                int a2 = appCompatSpinner.a((SpinnerAdapter) this.J, g());
                int i5 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f166m;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a2 > i6) {
                    a2 = i6;
                }
                r(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i4);
            }
            if (f1.b(AppCompatSpinner.this)) {
                i2 = (((width - paddingRight) - this.f1801j) - this.L) + i3;
            } else {
                i2 = paddingLeft + this.L + i3;
            }
            this.f1802k = i2;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a();

        int b();

        void d(int i2);

        void dismiss();

        CharSequence e();

        Drawable g();

        void i(CharSequence charSequence);

        void j(Drawable drawable);

        void l(int i2);

        void m(int i2);

        void n(int i2, int i3);

        int o();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppCompatSpinner(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f166m = r0
            android.content.Context r0 = r9.getContext()
            e.b.h.u0.a(r9, r0)
            int[] r0 = e.b.b.w
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            e.b.h.e r2 = new e.b.h.e
            r2.<init>(r9)
            r9.f159f = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            e.b.g.c r3 = new e.b.g.c
            r3.<init>(r10, r2)
            r9.f160g = r3
            goto L30
        L2e:
            r9.f160g = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = androidx.appcompat.widget.AppCompatSpinner.n     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r2 = r4
            goto Ld0
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Ld0
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L97
            if (r3 == r5) goto L62
            goto La5
        L62:
            androidx.appcompat.widget.AppCompatSpinner$d r3 = new androidx.appcompat.widget.AppCompatSpinner$d
            android.content.Context r6 = r9.f160g
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f160g
            int[] r7 = e.b.b.w
            e.b.h.z0 r6 = e.b.h.z0.q(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.k(r7, r8)
            r9.f165l = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            android.widget.PopupWindow r8 = r3.E
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.I = r4
            android.content.res.TypedArray r4 = r6.b
            r4.recycle()
            r9.f164k = r3
            e.b.h.w r4 = new e.b.h.w
            r4.<init>(r9, r9, r3)
            r9.f161h = r4
            goto La5
        L97:
            androidx.appcompat.widget.AppCompatSpinner$b r3 = new androidx.appcompat.widget.AppCompatSpinner$b
            r3.<init>()
            r9.f164k = r3
            java.lang.String r4 = r0.getString(r4)
            r3.i(r4)
        La5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131558649(0x7f0d00f9, float:1.874262E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lbc:
            r0.recycle()
            r9.f163j = r5
            android.widget.SpinnerAdapter r10 = r9.f162i
            if (r10 == 0) goto Lca
            r9.setAdapter(r10)
            r9.f162i = r2
        Lca:
            e.b.h.e r10 = r9.f159f
            r10.d(r11, r12)
            return
        Ld0:
            if (r2 == 0) goto Ld5
            r2.recycle()
        Ld5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f166m);
            Rect rect = this.f166m;
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    public void b() {
        this.f164k.n(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        e eVar = this.f164k;
        if (eVar != null) {
            return eVar.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        e eVar = this.f164k;
        if (eVar != null) {
            return eVar.o();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f164k != null) {
            return this.f165l;
        }
        return super.getDropDownWidth();
    }

    public final e getInternalPopup() {
        return this.f164k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        e eVar = this.f164k;
        if (eVar != null) {
            return eVar.g();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f160g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        e eVar = this.f164k;
        return eVar != null ? eVar.e() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f164k;
        if (eVar == null || !eVar.a()) {
            return;
        }
        this.f164k.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f164k == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.f167f || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        e eVar = this.f164k;
        savedState.f167f = eVar != null && eVar.a();
        return savedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f161h;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        e eVar = this.f164k;
        if (eVar != null) {
            if (eVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        e eVar = this.f164k;
        if (eVar != null) {
            eVar.m(i2);
            this.f164k.d(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        e eVar = this.f164k;
        if (eVar != null) {
            eVar.l(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f164k != null) {
            this.f165l = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        e eVar = this.f164k;
        if (eVar != null) {
            eVar.j(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(e.b.a.b(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        e eVar = this.f164k;
        if (eVar != null) {
            eVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e.b.h.e eVar = this.f159f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f163j) {
            this.f162i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f164k != null) {
            Context context = this.f160g;
            if (context == null) {
                context = getContext();
            }
            this.f164k.p(new c(spinnerAdapter, context.getTheme()));
        }
    }
}

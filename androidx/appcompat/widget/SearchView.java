package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.modules.SearchManagerModule;
import e.b.h.f1;
import e.b.h.t0;
import e.b.h.z0;
import e.i.j.z;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements e.b.g.b {
    public static final n v0;
    public final ImageView A;
    public final ImageView B;
    public final View C;
    public o D;
    public Rect E;
    public Rect F;
    public int[] G;
    public int[] H;
    public final ImageView I;
    public final Drawable J;
    public final int K;
    public final int L;
    public final Intent M;
    public final Intent N;
    public final CharSequence O;
    public l P;
    public k Q;
    public View.OnFocusChangeListener R;
    public m S;
    public View.OnClickListener T;
    public boolean U;
    public boolean V;
    public e.j.a.a W;
    public boolean a0;
    public CharSequence b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public CharSequence g0;
    public CharSequence h0;
    public boolean i0;
    public int j0;
    public SearchableInfo k0;
    public Bundle l0;
    public final Runnable m0;
    public Runnable n0;
    public final WeakHashMap<String, Drawable.ConstantState> o0;
    public final View.OnClickListener p0;
    public View.OnKeyListener q0;
    public final TextView.OnEditorActionListener r0;
    public final AdapterView.OnItemClickListener s0;
    public final AdapterView.OnItemSelectedListener t0;
    public final SearchAutoComplete u;
    public TextWatcher u0;
    public final View v;
    public final View w;
    public final View x;
    public final ImageView y;
    public final ImageView z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public boolean f206h;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder A = f.a.b.a.a.A("SearchView.SavedState{");
            A.append(Integer.toHexString(System.identityHashCode(this)));
            A.append(" isIconified=");
            A.append(this.f206h);
            A.append("}");
            return A.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f348f, i2);
            parcel.writeValue(Boolean.valueOf(this.f206h));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f206h = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends e.b.h.d {

        /* renamed from: j  reason: collision with root package name */
        public int f207j;

        /* renamed from: k  reason: collision with root package name */
        public SearchView f208k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f209l;

        /* renamed from: m  reason: collision with root package name */
        public final Runnable f210m;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f209l) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f209l = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f210m = new a();
            this.f207j = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
                if (i2 < 600) {
                    return (i2 < 640 || i3 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.v0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f207j <= 0 || super.enoughToFilter();
        }

        @Override // e.b.h.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f209l) {
                removeCallbacks(this.f210m);
                post(this.f210m);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f208k;
            searchView.H(searchView.V);
            searchView.post(searchView.m0);
            if (searchView.u.hasFocus()) {
                searchView.s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f208k.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f208k.hasFocus() && getVisibility() == 0) {
                this.f209l = true;
                Context context = getContext();
                n nVar = SearchView.v0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f209l = false;
                removeCallbacks(this.f210m);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f209l = false;
                removeCallbacks(this.f210m);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f209l = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f208k = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f207j = i2;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.u.getText();
            searchView.h0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.G(z);
            searchView.I(!z);
            searchView.C();
            searchView.F();
            if (searchView.P != null && !TextUtils.equals(charSequence, searchView.g0)) {
                l lVar = searchView.P;
                String charSequence2 = charSequence.toString();
                SearchManagerModule.a aVar = (SearchManagerModule.a) lVar;
                Objects.requireNonNull(aVar);
                String str = "";
                for (int i5 = 0; i5 < charSequence2.length(); i5++) {
                    if ("'(){}[]*\\^$.|?+".contains(String.valueOf(charSequence2.charAt(i5)))) {
                        StringBuilder A = f.a.b.a.a.A(str);
                        A.append(String.format(Locale.US, charSequence2.charAt(i5) != '\'' ? "\\%s" : "'%s", String.valueOf(charSequence2.charAt(i5))));
                        str = A.toString();
                    } else {
                        StringBuilder A2 = f.a.b.a.a.A(str);
                        A2.append(charSequence2.charAt(i5));
                        str = A2.toString();
                    }
                }
                SearchManagerModule.this.S(str);
            }
            searchView.g0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.D();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.j.a.a aVar = SearchView.this.W;
            if (aVar instanceof t0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.R;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10;
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.C.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.w.getPaddingLeft();
                Rect rect = new Rect();
                boolean b = f1.b(searchView);
                if (searchView.U) {
                    i10 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i10 = 0;
                }
                searchView.u.getDropDownBackground().getPadding(rect);
                if (b) {
                    i11 = -rect.left;
                } else {
                    i11 = paddingLeft - (rect.left + i10);
                }
                searchView.u.setDropDownHorizontalOffset(i11);
                searchView.u.setDropDownWidth((((searchView.C.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.y) {
                searchView.y();
            } else if (view == searchView.A) {
                searchView.u();
            } else if (view == searchView.z) {
                searchView.z();
            } else if (view == searchView.B) {
                SearchableInfo searchableInfo = searchView.k0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        Intent intent = new Intent(searchView.M);
                        ComponentName searchActivity = searchableInfo.getSearchActivity();
                        intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                        searchView.getContext().startActivity(intent);
                    } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        searchView.getContext().startActivity(searchView.r(searchView.N, searchableInfo));
                    }
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            } else if (view == searchView.u) {
                searchView.s();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.k0 == null) {
                return false;
            }
            if (searchView.u.isPopupShowing() && SearchView.this.u.getListSelection() != -1) {
                return SearchView.this.A(i2, keyEvent);
            }
            if (!(TextUtils.getTrimmedLength(SearchView.this.u.getText()) == 0) && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.t(0, null, searchView2.u.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.z();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.v(i2);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.w(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean onClose();
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    /* loaded from: classes.dex */
    public static class n {
        public Method a;
        public Method b;
        public Method c;

        public n() {
            this.a = null;
            this.b = null;
            this.c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f220d;

        /* renamed from: e  reason: collision with root package name */
        public final int f221e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f222f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f221e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.f220d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.f220d.set(rect);
            Rect rect3 = this.f220d;
            int i2 = this.f221e;
            rect3.inset(-i2, -i2);
            this.c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f222f;
                    if (z2 && !this.f220d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f222f;
                        this.f222f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f222f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (z && !this.c.contains(x, y)) {
                    motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
                } else {
                    Rect rect = this.c;
                    motionEvent.setLocation(x - rect.left, y - rect.top);
                }
                return this.a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        v0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.u.setText(charSequence);
        this.u.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public boolean A(int i2, KeyEvent keyEvent) {
        if (this.k0 != null && this.W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return v(this.u.getListSelection());
            }
            if (i2 != 21 && i2 != 22) {
                if (i2 != 19 || this.u.getListSelection() == 0) {
                    return false;
                }
            } else {
                this.u.setSelection(i2 == 21 ? 0 : this.u.length());
                this.u.setListSelection(0);
                this.u.clearListSelection();
                this.u.a();
                return true;
            }
        }
        return false;
    }

    public void B(CharSequence charSequence, boolean z) {
        this.u.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.u;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.h0 = charSequence;
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        z();
    }

    public final void C() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.u.getText());
        if (!z2 && (!this.U || this.i0)) {
            z = false;
        }
        this.A.setVisibility(z ? 0 : 8);
        Drawable drawable = this.A.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void D() {
        int[] iArr = this.u.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.w.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.x.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void E() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.u;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.U && this.J != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.J.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.J), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void F() {
        int i2 = 0;
        if (!((this.a0 || this.f0) && !this.V) || (this.z.getVisibility() != 0 && this.B.getVisibility() != 0)) {
            i2 = 8;
        }
        this.x.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.f0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.a0
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.V
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.z
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.G(boolean):void");
    }

    public final void H(boolean z) {
        this.V = z;
        int i2 = 0;
        int i3 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.u.getText());
        this.y.setVisibility(i3);
        G(z2);
        this.v.setVisibility(z ? 8 : 0);
        this.I.setVisibility((this.I.getDrawable() == null || this.U) ? 8 : 8);
        C();
        I(!z2);
        F();
    }

    public final void I(boolean z) {
        int i2 = 8;
        if (this.f0 && !this.V && z) {
            this.z.setVisibility(8);
            i2 = 0;
        }
        this.B.setVisibility(i2);
    }

    @Override // e.b.g.b
    public void c() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        int imeOptions = this.u.getImeOptions();
        this.j0 = imeOptions;
        this.u.setImeOptions(imeOptions | 33554432);
        this.u.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.d0 = true;
        super.clearFocus();
        this.u.clearFocus();
        this.u.setImeVisibility(false);
        this.d0 = false;
    }

    @Override // e.b.g.b
    public void e() {
        B("", false);
        clearFocus();
        H(true);
        this.u.setImeOptions(this.j0);
        this.i0 = false;
    }

    public int getImeOptions() {
        return this.u.getImeOptions();
    }

    public int getInputType() {
        return this.u.getInputType();
    }

    public int getMaxWidth() {
        return this.e0;
    }

    public CharSequence getQuery() {
        return this.u.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.k0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.k0.getHintId());
        }
        return this.O;
    }

    public int getSuggestionCommitIconResId() {
        return this.L;
    }

    public int getSuggestionRowLayout() {
        return this.K;
    }

    public e.j.a.a getSuggestionsAdapter() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        post(this.n0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.u;
            Rect rect = this.E;
            searchAutoComplete.getLocationInWindow(this.G);
            getLocationInWindow(this.H);
            int[] iArr = this.G;
            int i6 = iArr[1];
            int[] iArr2 = this.H;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.F;
            Rect rect3 = this.E;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            o oVar = this.D;
            if (oVar == null) {
                o oVar2 = new o(this.F, this.E, this.u);
                this.D = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.F, this.E);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.V) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.e0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.e0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, CommonUtils.BYTES_IN_A_GIGABYTE), View.MeasureSpec.makeMeasureSpec(size2, CommonUtils.BYTES_IN_A_GIGABYTE));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f348f);
        H(savedState.f206h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f206h = this.V;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.m0);
    }

    public final Intent q(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.h0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.k0.getSearchActivity());
        return intent;
    }

    public final Intent r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.d0 && isFocusable()) {
            if (!this.V) {
                boolean requestFocus = this.u.requestFocus(i2, rect);
                if (requestFocus) {
                    H(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i2, rect);
        }
        return false;
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.u.refreshAutoCompleteResults();
            return;
        }
        n nVar = v0;
        SearchAutoComplete searchAutoComplete = this.u;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = v0;
        SearchAutoComplete searchAutoComplete2 = this.u;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            u();
        } else {
            y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        H(z);
        E();
    }

    public void setImeOptions(int i2) {
        this.u.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.u.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.e0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.Q = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.R = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.P = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.T = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.S = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.b0 = charSequence;
        E();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.c0 = z;
        e.j.a.a aVar = this.W;
        if (aVar instanceof t0) {
            ((t0) aVar).v = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, com.google.firebase.crashlytics.internal.metadata.LogFileManager.MAX_LOG_SIZE) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.k0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.1835E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.u
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.u
            android.app.SearchableInfo r3 = r6.k0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.k0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.k0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.u
            r3.setInputType(r7)
            e.j.a.a r7 = r6.W
            if (r7 == 0) goto L42
            r7.b(r2)
        L42:
            android.app.SearchableInfo r7 = r6.k0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            e.b.h.t0 r7 = new e.b.h.t0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.k0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.o0
            r7.<init>(r3, r6, r4, r5)
            r6.W = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.u
            r3.setAdapter(r7)
            e.j.a.a r7 = r6.W
            e.b.h.t0 r7 = (e.b.h.t0) r7
            boolean r3 = r6.c0
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.v = r3
        L6b:
            r6.E()
        L6e:
            android.app.SearchableInfo r7 = r6.k0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.k0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.M
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.k0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.N
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = 0
        La0:
            r6.f0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.u
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.V
            r6.H(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.a0 = z;
        H(this.V);
    }

    public void setSuggestionsAdapter(e.j.a.a aVar) {
        this.W = aVar;
        this.u.setAdapter(aVar);
    }

    public void t(int i2, String str, String str2) {
        getContext().startActivity(q("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    public void u() {
        if (TextUtils.isEmpty(this.u.getText())) {
            if (this.U) {
                k kVar = this.Q;
                if (kVar == null || !kVar.onClose()) {
                    clearFocus();
                    H(true);
                    return;
                }
                return;
            }
            return;
        }
        this.u.setText("");
        this.u.requestFocus();
        this.u.setImeVisibility(true);
    }

    public boolean v(int i2) {
        int i3;
        String h2;
        m mVar = this.S;
        if (mVar == null || !mVar.b(i2)) {
            Cursor cursor = this.W.f2578h;
            if (cursor != null && cursor.moveToPosition(i2)) {
                Intent intent = null;
                try {
                    int i4 = t0.D;
                    String h3 = t0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h3 == null) {
                        h3 = this.k0.getSuggestIntentAction();
                    }
                    if (h3 == null) {
                        h3 = "android.intent.action.SEARCH";
                    }
                    String str = h3;
                    String h4 = t0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h4 == null) {
                        h4 = this.k0.getSuggestIntentData();
                    }
                    if (h4 != null && (h2 = t0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h4 = h4 + "/" + Uri.encode(h2);
                    }
                    intent = q(str, h4 == null ? null : Uri.parse(h4), t0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), t0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException e2) {
                    try {
                        i3 = cursor.getPosition();
                    } catch (RuntimeException unused) {
                        i3 = -1;
                    }
                    Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException e3) {
                        Log.e("SearchView", "Failed launch activity: " + intent, e3);
                    }
                }
            }
            this.u.setImeVisibility(false);
            this.u.dismissDropDown();
            return true;
        }
        return false;
    }

    public boolean w(int i2) {
        m mVar = this.S;
        if (mVar == null || !mVar.a(i2)) {
            Editable text = this.u.getText();
            Cursor cursor = this.W.f2578h;
            if (cursor == null) {
                return true;
            }
            if (cursor.moveToPosition(i2)) {
                CharSequence c2 = this.W.c(cursor);
                if (c2 != null) {
                    setQuery(c2);
                    return true;
                }
                setQuery(text);
                return true;
            }
            setQuery(text);
            return true;
        }
        return false;
    }

    public void x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void y() {
        H(false);
        this.u.requestFocus();
        this.u.setImeVisibility(true);
        View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void z() {
        Editable text = this.u.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.P;
        if (lVar != null) {
            text.toString();
            SearchManagerModule.this.y.clearFocus();
            return;
        }
        if (this.k0 != null) {
            t(0, null, text.toString());
        }
        this.u.setImeVisibility(false);
        this.u.dismissDropDown();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new int[2];
        this.H = new int[2];
        this.m0 = new b();
        this.n0 = new c();
        this.o0 = new WeakHashMap<>();
        f fVar = new f();
        this.p0 = fVar;
        this.q0 = new g();
        h hVar = new h();
        this.r0 = hVar;
        i iVar = new i();
        this.s0 = iVar;
        j jVar = new j();
        this.t0 = jVar;
        this.u0 = new a();
        int[] iArr = e.b.b.v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        z0 z0Var = new z0(context, obtainStyledAttributes);
        z.v(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        LayoutInflater.from(context).inflate(z0Var.l(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.u = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.v = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.w = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.x = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.y = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.z = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.A = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.B = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.I = imageView5;
        z.d.q(findViewById, z0Var.g(10));
        z.d.q(findViewById2, z0Var.g(14));
        imageView.setImageDrawable(z0Var.g(13));
        imageView2.setImageDrawable(z0Var.g(7));
        imageView3.setImageDrawable(z0Var.g(4));
        imageView4.setImageDrawable(z0Var.g(16));
        imageView5.setImageDrawable(z0Var.g(13));
        this.J = z0Var.g(12);
        e.b.a.d(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.K = z0Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.L = z0Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.q0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(z0Var.a(8, true));
        int f2 = z0Var.f(1, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.O = z0Var.n(6);
        this.b0 = z0Var.n(11);
        int j2 = z0Var.j(3, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = z0Var.j(2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(z0Var.a(0, true));
        z0Var.b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.M = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.N = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.C = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        H(this.U);
        E();
    }
}

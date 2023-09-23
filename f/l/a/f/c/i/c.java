package f.l.a.f.c.i;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.presentation.fragments.FragmentTag;
import com.video_converter.video_compressor.R;
import e.p.c.n;
import f.l.a.c.f;
import i.l.a.q;
import i.l.b.h;
import i.l.b.i;
import j.a.l0;
import java.util.Objects;

/* compiled from: SearchFragment.kt */
/* loaded from: classes2.dex */
public final class c extends f.l.a.f.c.c<f> {
    public static final /* synthetic */ int n = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f6781h;

    /* renamed from: i  reason: collision with root package name */
    public String f6782i;

    /* renamed from: j  reason: collision with root package name */
    public f.l.a.f.c.j.a f6783j;

    /* renamed from: k  reason: collision with root package name */
    public f.l.a.d.e.b f6784k;

    /* renamed from: l  reason: collision with root package name */
    public final String f6785l;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f6786m;

    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends h implements q<LayoutInflater, ViewGroup, Boolean, f> {
        public static final a n = new a();

        public a() {
            super(3, f.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/nightcode/mediapicker/databinding/NcFragmentSearchBinding;", 0);
        }

        @Override // i.l.a.q
        public f f(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater layoutInflater2 = layoutInflater;
            ViewGroup viewGroup2 = viewGroup;
            boolean booleanValue = bool.booleanValue();
            i.e(layoutInflater2, "p0");
            View inflate = layoutInflater2.inflate(R.layout.nc_fragment_search, viewGroup2, false);
            if (booleanValue) {
                viewGroup2.addView(inflate);
            }
            int i2 = R.id.backBtn;
            ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.backBtn);
            if (imageButton != null) {
                i2 = R.id.fragmentContainer;
                FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.fragmentContainer);
                if (frameLayout != null) {
                    i2 = R.id.progressBar_cyclic;
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.progressBar_cyclic);
                    if (progressBar != null) {
                        i2 = R.id.searchField;
                        EditText editText = (EditText) inflate.findViewById(R.id.searchField);
                        if (editText != null) {
                            return new f((LinearLayout) inflate, imageButton, frameLayout, progressBar, editText);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }
    }

    /* compiled from: SearchFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            i.e(message, NotificationCompat.CATEGORY_MESSAGE);
            super.handleMessage(message);
            Log.d(c.this.f6785l, "adLoadHandler: ");
            c.this.i().f6621d.setVisibility(4);
            c cVar = c.this;
            f.l.a.f.c.j.a aVar = cVar.f6783j;
            if (aVar == null) {
                return;
            }
            String str = cVar.f6782i;
            f.l.a.d.g.a.b m2 = aVar.m();
            Objects.requireNonNull(m2);
            f.n.a.n.i.D(e.p.a.h(m2), l0.b, null, new f.l.a.d.g.a.c(str, m2, null), 2, null);
        }
    }

    /* compiled from: TextView.kt */
    /* renamed from: f.l.a.f.c.i.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0162c implements TextWatcher {
        public C0162c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Log.d(c.this.f6785l, "initView: ");
            c.this.f6786m.removeCallbacksAndMessages(null);
            c.this.f6782i = String.valueOf(editable);
            c.this.i().f6621d.setVisibility(0);
            c cVar = c.this;
            cVar.f6786m.sendEmptyMessageDelayed(0, cVar.f6781h);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public c() {
        super(a.n);
        this.f6781h = 1000;
        this.f6782i = "";
        this.f6785l = "SearchFragment";
        this.f6786m = new b(Looper.getMainLooper());
    }

    @Override // f.l.a.f.c.c
    public void k() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: f.l.a.f.c.i.b
            @Override // java.lang.Runnable
            public final void run() {
                MediaType g2;
                c cVar = c.this;
                int i2 = c.n;
                i.e(cVar, "this$0");
                f.l.a.f.c.j.a aVar = new f.l.a.f.c.j.a();
                Bundle bundle = new Bundle();
                bundle.putString("LAYOUT_MODE", LayoutMode.LIST.name());
                f.l.a.d.e.b bVar = cVar.f6784k;
                Object obj = null;
                bundle.putString("MEDIA_TYPE", (bVar == null || (g2 = bVar.g()) == null) ? null : g2.name());
                aVar.setArguments(bundle);
                cVar.f6783j = aVar;
                FrameLayout frameLayout = cVar.i().c;
                i.d(frameLayout, "binding.fragmentContainer");
                f.l.a.f.c.j.a aVar2 = cVar.f6783j;
                i.b(aVar2);
                f.l.a.f.c.c.l(cVar, frameLayout, aVar2, FragmentTag.SEARCH_FRAGMENT_TAG.name(), false, false, 0, 0, 0, 0, 244, null);
                try {
                    cVar.i().f6622e.requestFocus();
                    n activity = cVar.getActivity();
                    View currentFocus = activity == null ? null : activity.getCurrentFocus();
                    n activity2 = cVar.getActivity();
                    if (activity2 != null) {
                        obj = activity2.getSystemService("input_method");
                    }
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    }
                    InputMethodManager inputMethodManager = (InputMethodManager) obj;
                    if (currentFocus != null) {
                        inputMethodManager.showSoftInput(currentFocus, 1);
                    }
                } catch (Exception unused) {
                }
            }
        }, 150L);
        i().b.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.c.i.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object systemService;
                c cVar = c.this;
                int i2 = c.n;
                i.e(cVar, "this$0");
                try {
                    n activity = cVar.getActivity();
                    systemService = activity == null ? null : activity.getSystemService("input_method");
                } catch (Exception unused) {
                }
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(cVar.requireView().getWindowToken(), 0);
                    n activity2 = cVar.getActivity();
                    if (activity2 == null) {
                        return;
                    }
                    activity2.onBackPressed();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        });
        EditText editText = i().f6622e;
        i.d(editText, "binding.searchField");
        editText.addTextChangedListener(new C0162c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        i.e(context, "context");
        super.onAttach(context);
        if (getParentFragment() instanceof f.l.a.d.e.b) {
            Fragment parentFragment = getParentFragment();
            Objects.requireNonNull(parentFragment, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6784k = (f.l.a.d.e.b) parentFragment;
        }
        if (getActivity() instanceof f.l.a.d.e.b) {
            n activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.nightcode.mediapicker.domain.interfaces.MediaPickerInterface");
            this.f6784k = (f.l.a.d.e.b) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        i().f6622e.clearFocus();
        super.onPause();
    }
}

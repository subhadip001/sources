package f.h.b.c.b0;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes.dex */
public class a extends m {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f5161e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f5162f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f5163g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f5164h;

    /* renamed from: i  reason: collision with root package name */
    public AnimatorSet f5165i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f5166j;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: f.h.b.c.b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0116a implements TextWatcher {
        public C0116a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.f(a.e(aVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a aVar = a.this;
            aVar.f(a.e(aVar));
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.e(a.this));
            editText.setOnFocusChangeListener(a.this.f5162f);
            a aVar = a.this;
            aVar.c.setOnFocusChangeListener(aVar.f5162f);
            editText.removeTextChangedListener(a.this.f5161e);
            editText.addTextChangedListener(a.this.f5161e);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class d implements TextInputLayout.g {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: f.h.b.c.b0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0117a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ EditText f5168f;

            public RunnableC0117a(EditText editText) {
                this.f5168f = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5168f.removeTextChangedListener(a.this.f5161e);
                a.this.f(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 2) {
                return;
            }
            editText.post(new RunnableC0117a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f5162f) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = a.this.c.getOnFocusChangeListener();
            a aVar = a.this;
            if (onFocusChangeListener == aVar.f5162f) {
                aVar.c.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.a.o();
        }
    }

    public a(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f5161e = new C0116a();
        this.f5162f = new b();
        this.f5163g = new c();
        this.f5164h = new d();
    }

    public static boolean e(a aVar) {
        EditText editText = aVar.a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // f.h.b.c.b0.m
    public void a() {
        TextInputLayout textInputLayout = this.a;
        int i2 = this.f5190d;
        if (i2 == 0) {
            i2 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.a.setEndIconCheckable(false);
        this.a.setEndIconOnClickListener(new e());
        this.a.a(this.f5163g);
        this.a.k0.add(this.f5164h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(f.h.b.c.c.a.f5223d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new f.h.b.c.b0.e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = f.h.b.c.c.a.a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new f.h.b.c.b0.d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5165i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f5165i.addListener(new f.h.b.c.b0.b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new f.h.b.c.b0.d(this));
        this.f5166j = ofFloat3;
        ofFloat3.addListener(new f.h.b.c.b0.c(this));
    }

    @Override // f.h.b.c.b0.m
    public void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        f(z);
    }

    public final void f(boolean z) {
        boolean z2 = this.a.j() == z;
        if (z && !this.f5165i.isRunning()) {
            this.f5166j.cancel();
            this.f5165i.start();
            if (z2) {
                this.f5165i.end();
            }
        } else if (z) {
        } else {
            this.f5165i.cancel();
            this.f5166j.start();
            if (z2) {
                this.f5166j.end();
            }
        }
    }
}

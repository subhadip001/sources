package f.h.b.c.b0;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes.dex */
public class s extends m {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f5208e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f5209f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f5210g;

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class a extends f.h.b.c.s.q {
        public a() {
        }

        @Override // f.h.b.c.s.q, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            s sVar = s.this;
            sVar.c.setChecked(!s.e(sVar));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            s sVar = s.this;
            sVar.c.setChecked(!s.e(sVar));
            editText.removeTextChangedListener(s.this.f5208e);
            editText.addTextChangedListener(s.this.f5208e);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class c implements TextInputLayout.g {

        /* compiled from: PasswordToggleEndIconDelegate.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ EditText f5212f;

            public a(EditText editText) {
                this.f5212f = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5212f.removeTextChangedListener(s.this.f5208e);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = s.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (s.e(s.this)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            s.this.a.o();
        }
    }

    public s(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f5208e = new a();
        this.f5209f = new b();
        this.f5210g = new c();
    }

    public static boolean e(s sVar) {
        EditText editText = sVar.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // f.h.b.c.b0.m
    public void a() {
        TextInputLayout textInputLayout = this.a;
        int i2 = this.f5190d;
        if (i2 == 0) {
            i2 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z = true;
        this.a.setEndIconVisible(true);
        this.a.setEndIconCheckable(true);
        this.a.setEndIconOnClickListener(new d());
        this.a.a(this.f5209f);
        TextInputLayout textInputLayout3 = this.a;
        textInputLayout3.k0.add(this.f5210g);
        EditText editText = this.a.getEditText();
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            z = false;
        }
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}

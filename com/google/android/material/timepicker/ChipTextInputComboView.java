package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.video_converter.video_compressor.R;
import f.h.b.c.s.q;
import f.h.b.c.s.t;

/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: f  reason: collision with root package name */
    public final Chip f1239f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout f1240g;

    /* renamed from: h  reason: collision with root package name */
    public final EditText f1241h;

    /* renamed from: i  reason: collision with root package name */
    public TextWatcher f1242i;

    /* loaded from: classes.dex */
    public class b extends q {
        public b(a aVar) {
        }

        @Override // f.h.b.c.s.q, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f1239f.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f1239f.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f1239f = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f1240g = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f1241h = editText;
        editText.setVisibility(4);
        b bVar = new b(null);
        this.f1242i = bVar;
        editText.addTextChangedListener(bVar);
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1241h.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1239f.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.f1239f.setChecked(z);
        this.f1241h.setVisibility(z ? 0 : 4);
        this.f1239f.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            EditText editText = this.f1241h;
            editText.requestFocus();
            editText.post(new t(editText));
            if (TextUtils.isEmpty(this.f1241h.getText())) {
                return;
            }
            EditText editText2 = this.f1241h;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f1239f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.f1239f.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f1239f.toggle();
    }
}

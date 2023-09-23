package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import e.b.c.u;
import e.b.h.d;
import e.b.h.r;
import f.h.b.c.b0.q;
import f.h.b.c.k.a;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends u {
    @Override // e.b.c.u
    public d a(Context context, AttributeSet attributeSet) {
        return new q(context, attributeSet);
    }

    @Override // e.b.c.u
    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // e.b.c.u
    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // e.b.c.u
    public r d(Context context, AttributeSet attributeSet) {
        return new f.h.b.c.u.a(context, attributeSet);
    }

    @Override // e.b.c.u
    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}

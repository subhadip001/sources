package e.b.h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.video_converter.video_compressor.R;
import java.util.Objects;

/* compiled from: AppCompatAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class d extends AutoCompleteTextView {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f1744i = {16843126};

    /* renamed from: f  reason: collision with root package name */
    public final e f1745f;

    /* renamed from: g  reason: collision with root package name */
    public final y f1746g;

    /* renamed from: h  reason: collision with root package name */
    public final k f1747h;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1745f;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1746g;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return e.i.a.k0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1745f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1745f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        e.b.a.c(onCreateInputConnection, editorInfo, this);
        return this.f1747h.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1745f;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1745f;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(e.i.a.m0(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(e.b.a.b(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f1747h.b.a.c(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1747h.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1745f;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1745f;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1746g;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        w0.a(context);
        u0.a(this, getContext());
        z0 q = z0.q(getContext(), attributeSet, f1744i, i2, 0);
        if (q.o(0)) {
            setDropDownBackgroundDrawable(q.g(0));
        }
        q.b.recycle();
        e eVar = new e(this);
        this.f1745f = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f1746g = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
        k kVar = new k(this);
        this.f1747h = kVar;
        kVar.b(attributeSet, i2);
        KeyListener keyListener = getKeyListener();
        Objects.requireNonNull(kVar);
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a = kVar.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
        }
    }
}

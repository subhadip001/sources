package e.n.b;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.gms.common.api.Api;
import e.n.a.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher.java */
/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: f  reason: collision with root package name */
    public final EditText f2647f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2648g;

    /* renamed from: h  reason: collision with root package name */
    public h.e f2649h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2650i = true;

    /* compiled from: EmojiTextWatcher.java */
    /* loaded from: classes.dex */
    public static class a extends h.e {
        public final Reference<EditText> a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        @Override // e.n.a.h.e
        public void b() {
            g.a(this.a.get(), 1);
        }
    }

    public g(EditText editText, boolean z) {
        this.f2647f = editText;
        this.f2648g = z;
    }

    public static void a(EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            e.n.a.h.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (this.f2647f.isInEditMode()) {
            return;
        }
        if (!((this.f2650i && (this.f2648g || e.n.a.h.c())) ? false : true) && i3 <= i4 && (charSequence instanceof Spannable)) {
            int b = e.n.a.h.a().b();
            if (b != 0) {
                if (b == 1) {
                    e.n.a.h.a().i((Spannable) charSequence, i2, i2 + i4, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0);
                    return;
                } else if (b != 3) {
                    return;
                }
            }
            e.n.a.h a2 = e.n.a.h.a();
            if (this.f2649h == null) {
                this.f2649h = new a(this.f2647f);
            }
            a2.j(this.f2649h);
        }
    }
}

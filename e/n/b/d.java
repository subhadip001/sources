package e.n.b;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import e.n.a.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter.java */
/* loaded from: classes.dex */
public final class d implements InputFilter {
    public final TextView a;
    public h.e b;

    /* compiled from: EmojiInputFilter.java */
    /* loaded from: classes.dex */
    public static class a extends h.e {
        public final Reference<TextView> a;
        public final Reference<d> b;

        public a(TextView textView, d dVar) {
            this.a = new WeakReference(textView);
            this.b = new WeakReference(dVar);
        }

        @Override // e.n.a.h.e
        public void b() {
            InputFilter[] filters;
            TextView textView = this.a.get();
            d dVar = this.b.get();
            boolean z = false;
            if (dVar != null && textView != null && (filters = textView.getFilters()) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= filters.length) {
                        break;
                    } else if (filters[i2] == dVar) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z && textView.isAttachedToWindow()) {
                CharSequence h2 = e.n.a.h.a().h(textView.getText());
                int selectionStart = Selection.getSelectionStart(h2);
                int selectionEnd = Selection.getSelectionEnd(h2);
                textView.setText(h2);
                if (h2 instanceof Spannable) {
                    Spannable spannable = (Spannable) h2;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.a.isInEditMode()) {
            return charSequence;
        }
        int b = e.n.a.h.a().b();
        if (b != 0) {
            boolean z = true;
            if (b == 1) {
                if (i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.a.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i2 != 0 || i3 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                CharSequence charSequence2 = charSequence;
                return e.n.a.h.a().i(charSequence2, 0, charSequence2.length(), Api.BaseClientBuilder.API_PRIORITY_OTHER, 0);
            } else if (b != 3) {
                return charSequence;
            }
        }
        e.n.a.h a2 = e.n.a.h.a();
        if (this.b == null) {
            this.b = new a(this.a, this);
        }
        a2.j(this.b);
        return charSequence;
    }
}

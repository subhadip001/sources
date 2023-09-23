package f.n.a.v.e;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: FileNameInputBottomSheetView.java */
/* loaded from: classes2.dex */
public class k implements TextWatcher {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f7174f;

    public k(x xVar) {
        this.f7174f = xVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f7174f.o.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}

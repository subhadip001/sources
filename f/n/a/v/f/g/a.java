package f.n.a.v.f.g;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.model.MediaFile;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: FixedSizeListItemView.java */
/* loaded from: classes2.dex */
public class a extends f.n.a.v.c.d.a<c> {

    /* renamed from: h  reason: collision with root package name */
    public TextView f7196h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f7197i;

    /* renamed from: j  reason: collision with root package name */
    public EditText f7198j;

    /* renamed from: k  reason: collision with root package name */
    public MediaFile f7199k;

    /* compiled from: FixedSizeListItemView.java */
    /* renamed from: f.n.a.v.f.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0187a implements TextWatcher {
        public C0187a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            a aVar = a.this;
            Objects.requireNonNull(aVar);
            if (charSequence == null) {
                aVar.f7198j.setError(aVar.b().getResources().getString(R.string.value_cannot_be_null));
            }
            if (Pattern.compile("^([0-5]*[0-9]|60|0):([0-5]*[0-9]|60|0):([0-5]*[0-9]|60|0)$").matcher(charSequence.toString()).find()) {
                aVar.f7199k.f1371i = aVar.f7198j.getText().toString().trim();
                for (c cVar : aVar.c()) {
                    cVar.h(aVar.f7199k);
                }
                aVar.f7197i.setVisibility(8);
                return;
            }
            aVar.f7197i.setVisibility(0);
        }
    }

    public a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f7131f = layoutInflater.inflate(R.layout.layout_fixed_size_input_item, viewGroup, false);
        this.f7196h = (TextView) a(R.id.titleTv);
        TextView textView = (TextView) a(R.id.fileSizeTv);
        this.f7198j = (EditText) a(R.id.fileSizeFiled);
        this.f7197i = (TextView) a(R.id.errorTv);
        this.f7198j.addTextChangedListener(new C0187a());
    }
}

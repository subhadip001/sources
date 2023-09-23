package f.n.a.v.k;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import com.video_converter.video_compressor.R;
import f.m.b.w;
import java.util.Objects;

/* compiled from: OutputFileListAdapter.java */
/* loaded from: classes2.dex */
public class d extends RecyclerView.e<b> {
    public Cursor a;
    public SparseBooleanArray b = new SparseBooleanArray();
    public Context c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.o.d f7257d;

    /* renamed from: e  reason: collision with root package name */
    public a f7258e;

    /* compiled from: OutputFileListAdapter.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: OutputFileListAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.a0 {
        public ImageView a;
        public TextView b;
        public TextView c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f7259d;

        /* renamed from: e  reason: collision with root package name */
        public CheckBox f7260e;

        /* renamed from: f  reason: collision with root package name */
        public ImageButton f7261f;

        /* renamed from: g  reason: collision with root package name */
        public View f7262g;

        public b(View view) {
            super(view);
            this.f7262g = view;
            this.a = (ImageView) view.findViewById(R.id.imageView);
            this.b = (TextView) view.findViewById(R.id.audioNameTextView);
            this.c = (TextView) view.findViewById(R.id.audioDuration);
            this.f7259d = (TextView) view.findViewById(R.id.createdAt);
            this.f7260e = (CheckBox) view.findViewById(R.id.selector_checkbox);
            this.f7261f = (ImageButton) view.findViewById(R.id.more_btn);
            this.f7260e.setClickable(false);
        }
    }

    public d(Context context, int i2, a aVar) {
        this.c = context;
        this.f7258e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        try {
            Cursor cursor = this.a;
            if (cursor != null) {
                return cursor.getCount();
            }
            return 0;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public int n() {
        return this.b.size();
    }

    public SparseBooleanArray o() {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int itemCount = getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            sparseBooleanArray.put(i2, this.b.get(i2));
        }
        return sparseBooleanArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onBindViewHolder(b bVar, int i2) {
        String str;
        b bVar2 = bVar;
        String str2 = "<unknown>";
        Cursor cursor = this.a;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        this.a.moveToPosition(i2);
        f.n.a.o.d dVar = new f.n.a.o.d(this.a);
        this.f7257d = dVar;
        try {
            String e2 = f.n.a.v.a.e.e(this.c, dVar.c);
            bVar2.b.setText(e2.substring(e2.lastIndexOf(47) + 1, e2.length()));
        } catch (Exception unused) {
            bVar2.b.setText(this.f7257d.a);
        }
        TextView textView = bVar2.c;
        StringBuilder A = f.a.b.a.a.A("");
        f.n.a.o.d dVar2 = this.f7257d;
        Objects.requireNonNull(dVar2);
        try {
            str = f.n.a.v.a.j.e(dVar2.f7054e);
        } catch (Exception unused2) {
            str = "<unknown>";
        }
        A.append(str);
        textView.setText(A.toString());
        TextView textView2 = bVar2.f7259d;
        f.n.a.o.d dVar3 = this.f7257d;
        Objects.requireNonNull(dVar3);
        try {
            str2 = f.n.a.v.a.j.f(Long.parseLong(dVar3.b));
        } catch (Exception unused3) {
        }
        textView2.setText(str2);
        if (this.f7257d.f7055f == 3) {
            w e3 = Picasso.d().e(this.f7257d.c);
            e3.c = true;
            e3.a();
            e3.f(R.drawable.placeholder_video);
            e3.d(bVar2.a, null);
        }
        if (n() > 0) {
            bVar2.f7260e.setVisibility(0);
        } else {
            bVar2.f7260e.setVisibility(8);
        }
        if (this.b.get(i2)) {
            bVar2.f7260e.setChecked(true);
        } else {
            bVar2.f7260e.setChecked(false);
        }
        if (this.f7258e == null) {
            bVar2.f7261f.setVisibility(8);
            return;
        }
        bVar2.f7261f.setVisibility(0);
        bVar2.f7261f.setOnClickListener(new f.n.a.v.k.a(this, i2));
        bVar2.f7262g.setOnClickListener(new f.n.a.v.k.b(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new b(f.a.b.a.a.T(viewGroup, R.layout.output_file_single_item, viewGroup, false));
    }
}

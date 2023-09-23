package f.n.a.j;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.video_converter.video_compressor.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: AppChoiceAdapter.java */
/* loaded from: classes2.dex */
public class a extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public Context f6957f;

    /* renamed from: g  reason: collision with root package name */
    public List<ResolveInfo> f6958g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public Set<b> f6959h = new HashSet(1);

    /* renamed from: i  reason: collision with root package name */
    public PackageManager f6960i;

    /* compiled from: AppChoiceAdapter.java */
    /* renamed from: f.n.a.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnClickListenerC0172a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f6961f;

        public View$OnClickListenerC0172a(int i2) {
            this.f6961f = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (b bVar : a.this.f6959h) {
                a aVar = a.this;
                bVar.a(aVar.f6960i, aVar.f6958g.get(this.f6961f));
            }
        }
    }

    /* compiled from: AppChoiceAdapter.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a(PackageManager packageManager, ResolveInfo resolveInfo);
    }

    public a(Context context) {
        this.f6957f = context;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f6958g.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        String str;
        LayoutInflater layoutInflater = (LayoutInflater) this.f6957f.getSystemService("layout_inflater");
        if (view == null) {
            Drawable drawable = this.f6957f.getDrawable(R.drawable.app_icon);
            boolean z = false;
            try {
                try {
                    drawable = this.f6958g.get(i2).loadIcon(this.f6960i);
                } catch (Exception unused) {
                    drawable = this.f6957f.getDrawable(this.f6958g.get(i2).icon);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                z = true;
            }
            try {
                try {
                    str = String.valueOf(this.f6958g.get(i2).loadLabel(this.f6960i));
                } catch (Exception unused2) {
                    str = this.f6957f.getString(this.f6958g.get(i2).labelRes);
                }
            } catch (Exception e3) {
                e3.printStackTrace();
                str = "";
                z = true;
            }
            View inflate = layoutInflater.inflate(R.layout.grid_menu_item, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.app_name);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.app_icon);
            try {
                textView.setText(str);
                imageView.setImageDrawable(drawable);
            } catch (Exception unused3) {
            }
            if (z) {
                inflate.setVisibility(8);
            }
            view = inflate;
        }
        view.setOnClickListener(new View$OnClickListenerC0172a(i2));
        return view;
    }
}

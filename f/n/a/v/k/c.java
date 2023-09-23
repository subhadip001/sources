package f.n.a.v.k;

import android.app.AlertDialog;
import android.net.Uri;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import com.video_converter.video_compressor.R;
import e.b.h.o0;
import f.n.a.v.k.d;
import java.util.Objects;

/* compiled from: OutputFileListAdapter.java */
/* loaded from: classes2.dex */
public class c implements o0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public c(d dVar, int i2) {
        this.b = dVar;
        this.a = i2;
    }

    @Override // e.b.h.o0.a
    public boolean onMenuItemClick(MenuItem menuItem) {
        StringBuilder A = f.a.b.a.a.A("onMenuItemClick: ");
        A.append((Object) menuItem.getTitle());
        Log.d("OUTPUTS_LIST", A.toString());
        switch (menuItem.getItemId()) {
            case R.id.action_delete /* 2131361868 */:
                d.a aVar = this.b.f7258e;
                int i2 = this.a;
                f fVar = (f) aVar;
                Objects.requireNonNull(fVar);
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                sparseBooleanArray.put(i2, true);
                fVar.a.l(sparseBooleanArray);
                break;
            case R.id.action_info /* 2131361873 */:
                d.a aVar2 = this.b.f7258e;
                int i3 = this.a;
                h hVar = ((f) aVar2).a;
                hVar.f7263f.moveToPosition(i3);
                f.n.a.o.d dVar = new f.n.a.o.d(hVar.f7263f);
                AlertDialog.Builder builder = new AlertDialog.Builder(hVar.getContext(), R.style.MyDialogTheme);
                builder.setCancelable(true);
                builder.setTitle(hVar.getString(R.string.info));
                builder.setMessage(dVar.toString());
                builder.setPositiveButton(R.string.ok, new g(hVar));
                builder.create().show();
                break;
            case R.id.action_play /* 2131361880 */:
                d.a aVar3 = this.b.f7258e;
                h.k(((f) aVar3).a, this.a);
                break;
            case R.id.action_share /* 2131361885 */:
                d.a aVar4 = this.b.f7258e;
                int i4 = this.a;
                f fVar2 = (f) aVar4;
                Objects.requireNonNull(fVar2);
                try {
                    fVar2.a.f7263f.moveToPosition(i4);
                    f.n.a.v.a.j.o(fVar2.a.requireContext(), Uri.parse(new f.n.a.o.d(fVar2.a.f7263f).f7053d), false);
                    break;
                } catch (Exception unused) {
                    break;
                }
        }
        return false;
    }
}

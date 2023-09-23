package f.l.a.f.c.f;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import f.l.a.f.c.g.j;
import i.l.b.i;

/* compiled from: MediaPickerFragment.kt */
/* loaded from: classes2.dex */
public final class e extends FragmentStateAdapter {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ c f6758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.f6758i = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int getItemCount() {
        return 3;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment p(int i2) {
        MediaType g2;
        LayoutMode t;
        if (i2 != 0) {
            if (i2 != 1) {
                return new f.l.a.f.c.d.b();
            }
            c cVar = this.f6758i;
            f.l.a.f.c.e.b bVar = cVar.f6757k;
            if (bVar == null) {
                bVar = new f.l.a.f.c.e.b();
            }
            cVar.f6757k = bVar;
            f.l.a.f.c.e.b bVar2 = this.f6758i.f6757k;
            i.b(bVar2);
            return bVar2;
        }
        c cVar2 = this.f6758i;
        j jVar = cVar2.f6756j;
        if (jVar == null) {
            jVar = new j();
            c cVar3 = this.f6758i;
            Bundle bundle = new Bundle();
            f.l.a.d.e.b bVar3 = cVar3.f6754h;
            String str = null;
            bundle.putString("LAYOUT_MODE", (bVar3 == null || (t = bVar3.t()) == null) ? null : t.name());
            f.l.a.d.e.b bVar4 = cVar3.f6754h;
            if (bVar4 != null && (g2 = bVar4.g()) != null) {
                str = g2.name();
            }
            bundle.putString("MEDIA_TYPE", str);
            jVar.setArguments(bundle);
        }
        cVar2.f6756j = jVar;
        j jVar2 = this.f6758i.f6756j;
        i.b(jVar2);
        return jVar2;
    }
}

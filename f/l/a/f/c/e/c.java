package f.l.a.f.c.e;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.presentation.fragments.FragmentTag;
import com.nightcode.mediapicker.presentation.views.ClippedImageView;
import com.video_converter.video_compressor.R;
import f.l.a.c.h;
import f.l.a.d.b.f;
import f.l.a.f.c.g.j;
import i.l.b.i;

/* compiled from: FolderListFragment.kt */
/* loaded from: classes2.dex */
public final class c extends f<f.l.a.d.d.c, h> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f6751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d dVar) {
        super(dVar);
        this.f6751d = bVar;
    }

    @Override // f.l.a.d.b.f
    public void n(h hVar, f.l.a.d.d.c cVar) {
        h hVar2 = hVar;
        final f.l.a.d.d.c cVar2 = cVar;
        i.e(hVar2, "binding");
        i.e(cVar2, "item");
        ClippedImageView clippedImageView = hVar2.c;
        i.d(clippedImageView, "binding.thumb");
        String h2 = cVar2.h();
        i.e(clippedImageView, "<this>");
        i.e(h2, ImagesContract.URL);
        f.e.a.b.e(clippedImageView).a().z(h2).i(R.drawable.video_placeholder).y(clippedImageView);
        hVar2.f6623d.setText(cVar2.d());
        hVar2.b.setText(String.valueOf(cVar2.g()));
        hVar2.f6624e.setText(f.l.a.f.a.a(Long.valueOf(cVar2.c())));
        LinearLayout linearLayout = hVar2.a;
        final b bVar = this.f6751d;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: f.l.a.f.c.e.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaType g2;
                LayoutMode t;
                b bVar2 = b.this;
                f.l.a.d.d.c cVar3 = cVar2;
                i.e(bVar2, "this$0");
                i.e(cVar3, "$item");
                int i2 = b.f6740m;
                FrameLayout frameLayout = bVar2.i().b;
                i.d(frameLayout, "binding.fragmentContainer");
                j jVar = new j();
                Bundle bundle = new Bundle();
                bundle.putLong("INIT_DELAY", 200L);
                bundle.putString("FOLDER_NAME", cVar3.a());
                f.l.a.d.e.b bVar3 = bVar2.f6743j;
                String str = null;
                bundle.putString("LAYOUT_MODE", (bVar3 == null || (t = bVar3.t()) == null) ? null : t.name());
                f.l.a.d.e.b bVar4 = bVar2.f6743j;
                if (bVar4 != null && (g2 = bVar4.g()) != null) {
                    str = g2.name();
                }
                bundle.putString("MEDIA_TYPE", str);
                jVar.setArguments(bundle);
                f.l.a.f.c.c.l(bVar2, frameLayout, jVar, FragmentTag.FOLDER_FRAGMENT_TAG.name(), false, false, R.anim.slide_up, R.anim.slide_down, R.anim.slide_up, R.anim.slide_down, 12, null);
            }
        });
    }
}

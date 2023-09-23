package f.n.a.v.s;

import android.os.Bundle;
import android.os.Handler;
import com.video_converter.video_compressor.model.MediaFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: VidCompInputScreenController.java */
/* loaded from: classes2.dex */
public class m implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f7450f;

    public m(j jVar) {
        this.f7450f = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        new Handler().postDelayed(new Runnable() { // from class: f.n.a.v.s.c
            @Override // java.lang.Runnable
            public final void run() {
                m.this.f7450f.b.a();
            }
        }, 1000L);
        j jVar = this.f7450f;
        boolean z = jVar.f7435i;
        if (z) {
            if (z) {
                Objects.requireNonNull(jVar.b);
                jVar.b.b.u.setVisibility(8);
                jVar.b.b.v.setVisibility(4);
            }
            jVar.I();
            h hVar = jVar.b;
            ArrayList<MediaFile> arrayList = (ArrayList) jVar.n;
            Objects.requireNonNull(hVar);
            try {
                ((f.n.a.v.q.e) hVar.b.e(hVar.a)).f7395i.t(arrayList);
            } catch (Exception unused) {
                f.l.b.c.n(hVar.a);
            }
            jVar.H();
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        Iterator<f.n.a.m.c.a> it = this.f7450f.B.iterator();
        while (it.hasNext()) {
            if (it.next().t < 0) {
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        if (arrayList2.size() > 0) {
            j jVar2 = this.f7450f;
            Objects.requireNonNull(jVar2);
            try {
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(jVar2.n.get(((Integer) it2.next()).intValue()));
                }
                Bundle bundle = new Bundle();
                bundle.putSerializable("SELECTED_FILE", arrayList3);
                bundle.putString("TITLE", "Folowing files duration invalid\n please specify manually");
                Objects.requireNonNull(jVar2.f7434h);
                f.n.a.v.f.c cVar = new f.n.a.v.f.c();
                cVar.setArguments(bundle);
                cVar.f7189f = new k(jVar2);
                jVar2.f7433g.b(cVar, "dialogTag");
            } catch (NullPointerException unused2) {
            }
        }
    }
}

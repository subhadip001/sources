package f.n.a.x;

import android.net.Uri;
import com.video_converter.video_compressor.model.MediaFile;
import f.n.a.o.i;
import f.n.a.x.b;

/* compiled from: BatchProcessorTrackingTask.java */
/* loaded from: classes2.dex */
public class a implements b.a {
    public b a;
    public c b;
    public InterfaceC0192a c;

    /* compiled from: BatchProcessorTrackingTask.java */
    /* renamed from: f.n.a.x.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0192a {
        void c();

        void i(f.n.a.d.b bVar);
    }

    public a(b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
        cVar.a(MediaFile.class, new f.n.a.o.b());
        this.b.a(Uri.class, new i());
    }

    @Override // f.n.a.x.b.a
    public void a() {
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void b() {
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void c() {
        InterfaceC0192a interfaceC0192a = this.c;
        if (interfaceC0192a != null) {
            interfaceC0192a.c();
        }
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void d(String str) {
        try {
            f.n.a.d.b bVar = (f.n.a.d.b) this.b.a.a().c(str, f.n.a.d.b.class);
            InterfaceC0192a interfaceC0192a = this.c;
            if (interfaceC0192a != null) {
                interfaceC0192a.i(bVar);
            }
            this.a.f6940f.remove(this);
        } catch (Exception unused) {
            c();
        }
    }

    public void e(f.n.a.d.b bVar) {
        this.a.g(this.b.a.a().h(bVar), f.n.a.i.b.f6955e);
    }
}

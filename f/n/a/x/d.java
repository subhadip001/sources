package f.n.a.x;

import com.video_converter.video_compressor.model.ProcessingInfo;
import com.video_converter.video_compressor.services.FFService;
import f.n.a.v.m.j;
import f.n.a.x.b;
import java.util.Objects;

/* compiled from: ProcessTrackingTask.java */
/* loaded from: classes2.dex */
public class d implements b.a {
    public f.n.a.x.b a;
    public c b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    public a f7520d;

    /* compiled from: ProcessTrackingTask.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    /* compiled from: ProcessTrackingTask.java */
    /* loaded from: classes2.dex */
    public interface b {
    }

    public d(f.n.a.x.b bVar, c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    @Override // f.n.a.x.b.a
    public void a() {
        Objects.requireNonNull((FFService) this.c);
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void b() {
        Objects.requireNonNull((FFService) this.c);
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void c() {
        ((j) this.f7520d).q();
        this.a.f6940f.remove(this);
    }

    @Override // f.n.a.x.b.a
    public void d(String str) {
        try {
            ((j) this.f7520d).p((ProcessingInfo) this.b.a.a().c(str, ProcessingInfo.class));
            this.a.f6940f.remove(this);
        } catch (Exception unused) {
            ((j) this.f7520d).q();
            this.a.f6940f.remove(this);
        }
    }
}

package f.h.b.b.u1;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: BaseAudioProcessor.java */
/* loaded from: classes.dex */
public abstract class u implements AudioProcessor {
    public AudioProcessor.a b;
    public AudioProcessor.a c;

    /* renamed from: d  reason: collision with root package name */
    public AudioProcessor.a f4594d;

    /* renamed from: e  reason: collision with root package name */
    public AudioProcessor.a f4595e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f4596f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f4597g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4598h;

    public u() {
        ByteBuffer byteBuffer = AudioProcessor.a;
        this.f4596f = byteBuffer;
        this.f4597g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f725e;
        this.f4594d = aVar;
        this.f4595e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f4595e != AudioProcessor.a.f725e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean b() {
        return this.f4598h && this.f4597g == AudioProcessor.a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void d() {
        flush();
        this.f4596f = AudioProcessor.a;
        AudioProcessor.a aVar = AudioProcessor.a.f725e;
        this.f4594d = aVar;
        this.f4595e = aVar;
        this.b = aVar;
        this.c = aVar;
        j();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        this.f4594d = aVar;
        this.f4595e = g(aVar);
        return a() ? this.f4595e : AudioProcessor.a.f725e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void f() {
        this.f4598h = true;
        i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f4597g = AudioProcessor.a;
        this.f4598h = false;
        this.b = this.f4594d;
        this.c = this.f4595e;
        h();
    }

    public abstract AudioProcessor.a g(AudioProcessor.a aVar);

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f4597g;
        this.f4597g = AudioProcessor.a;
        return byteBuffer;
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }

    public final ByteBuffer k(int i2) {
        if (this.f4596f.capacity() < i2) {
            this.f4596f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f4596f.clear();
        }
        ByteBuffer byteBuffer = this.f4596f;
        this.f4597g = byteBuffer;
        return byteBuffer;
    }
}

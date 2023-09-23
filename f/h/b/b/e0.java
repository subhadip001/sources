package f.h.b.b;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import f.h.b.b.e0;
import f.h.b.b.o1;
import java.util.Objects;

/* compiled from: AudioFocusManager.java */
/* loaded from: classes.dex */
public final class e0 {
    public final AudioManager a;
    public final a b;
    public b c;

    /* renamed from: d  reason: collision with root package name */
    public f.h.b.b.u1.n f4103d;

    /* renamed from: e  reason: collision with root package name */
    public int f4104e;

    /* renamed from: f  reason: collision with root package name */
    public int f4105f;

    /* renamed from: g  reason: collision with root package name */
    public float f4106g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f4107h;

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes.dex */
    public class a implements AudioManager.OnAudioFocusChangeListener {
        public final Handler a;

        public a(Handler handler) {
            this.a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i2) {
            this.a.post(new Runnable() { // from class: f.h.b.b.b
                @Override // java.lang.Runnable
                public final void run() {
                    e0.a aVar = e0.a.this;
                    int i3 = i2;
                    e0 e0Var = e0.this;
                    Objects.requireNonNull(e0Var);
                    boolean z = true;
                    if (i3 == -3 || i3 == -2) {
                        if (i3 != -2) {
                            f.h.b.b.u1.n nVar = e0Var.f4103d;
                            if (!((nVar == null || nVar.a != 1) ? false : false)) {
                                e0Var.c(3);
                                return;
                            }
                        }
                        e0Var.b(0);
                        e0Var.c(2);
                    } else if (i3 == -1) {
                        e0Var.b(-1);
                        e0Var.a();
                    } else if (i3 != 1) {
                        f.a.b.a.a.G(38, "Unknown focus change type: ", i3, "AudioFocusManager");
                    } else {
                        e0Var.c(1);
                        e0Var.b(1);
                    }
                }
            });
        }
    }

    /* compiled from: AudioFocusManager.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public e0(Context context, Handler handler, b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        Objects.requireNonNull(audioManager);
        this.a = audioManager;
        this.c = bVar;
        this.b = new a(handler);
        this.f4104e = 0;
    }

    public final void a() {
        if (this.f4104e == 0) {
            return;
        }
        if (f.h.b.b.g2.b0.a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f4107h;
            if (audioFocusRequest != null) {
                this.a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.a.abandonAudioFocus(this.b);
        }
        c(0);
    }

    public final void b(int i2) {
        b bVar = this.c;
        if (bVar != null) {
            o1.c cVar = (o1.c) bVar;
            boolean h2 = o1.this.h();
            o1.this.Y(h2, i2, o1.N(h2, i2));
        }
    }

    public final void c(int i2) {
        if (this.f4104e == i2) {
            return;
        }
        this.f4104e = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f4106g == f2) {
            return;
        }
        this.f4106g = f2;
        b bVar = this.c;
        if (bVar != null) {
            o1 o1Var = o1.this;
            o1Var.Q(1, 2, Float.valueOf(o1Var.B * o1Var.f4428m.f4106g));
        }
    }

    public int d(boolean z, int i2) {
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        int i3 = 1;
        if (i2 == 1 || this.f4105f != 1) {
            a();
            return z ? 1 : -1;
        } else if (z) {
            if (this.f4104e != 1) {
                if (f.h.b.b.g2.b0.a >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f4107h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.f4105f);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.f4107h);
                        }
                        f.h.b.b.u1.n nVar = this.f4103d;
                        boolean z2 = nVar != null && nVar.a == 1;
                        Objects.requireNonNull(nVar);
                        this.f4107h = builder.setAudioAttributes(nVar.a()).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(this.b).build();
                    }
                    requestAudioFocus = this.a.requestAudioFocus(this.f4107h);
                } else {
                    AudioManager audioManager = this.a;
                    a aVar = this.b;
                    f.h.b.b.u1.n nVar2 = this.f4103d;
                    Objects.requireNonNull(nVar2);
                    requestAudioFocus = audioManager.requestAudioFocus(aVar, f.h.b.b.g2.b0.s(nVar2.c), this.f4105f);
                }
                if (requestAudioFocus == 1) {
                    c(1);
                } else {
                    c(0);
                    i3 = -1;
                }
            }
            return i3;
        } else {
            return -1;
        }
    }
}

package f.m.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Picasso;

/* compiled from: Stats.java */
/* loaded from: classes2.dex */
public class z {
    public final HandlerThread a;
    public final d b;
    public final Handler c;

    /* renamed from: d  reason: collision with root package name */
    public long f6898d;

    /* renamed from: e  reason: collision with root package name */
    public long f6899e;

    /* renamed from: f  reason: collision with root package name */
    public long f6900f;

    /* renamed from: g  reason: collision with root package name */
    public long f6901g;

    /* renamed from: h  reason: collision with root package name */
    public long f6902h;

    /* renamed from: i  reason: collision with root package name */
    public long f6903i;

    /* renamed from: j  reason: collision with root package name */
    public long f6904j;

    /* renamed from: k  reason: collision with root package name */
    public long f6905k;

    /* renamed from: l  reason: collision with root package name */
    public int f6906l;

    /* renamed from: m  reason: collision with root package name */
    public int f6907m;
    public int n;

    /* compiled from: Stats.java */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public final z a;

        /* compiled from: Stats.java */
        /* renamed from: f.m.b.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0169a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Message f6908f;

            public RunnableC0169a(a aVar, Message message) {
                this.f6908f = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                StringBuilder A = f.a.b.a.a.A("Unhandled stats message.");
                A.append(this.f6908f.what);
                throw new AssertionError(A.toString());
            }
        }

        public a(Looper looper, z zVar) {
            super(looper);
            this.a = zVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.a.f6898d++;
            } else if (i2 == 1) {
                this.a.f6899e++;
            } else if (i2 == 2) {
                z zVar = this.a;
                long j2 = message.arg1;
                int i3 = zVar.f6907m + 1;
                zVar.f6907m = i3;
                long j3 = zVar.f6901g + j2;
                zVar.f6901g = j3;
                zVar.f6904j = j3 / i3;
            } else if (i2 == 3) {
                z zVar2 = this.a;
                long j4 = message.arg1;
                zVar2.n++;
                long j5 = zVar2.f6902h + j4;
                zVar2.f6902h = j5;
                zVar2.f6905k = j5 / zVar2.f6907m;
            } else if (i2 != 4) {
                Picasso.o.post(new RunnableC0169a(this, message));
            } else {
                z zVar3 = this.a;
                zVar3.f6906l++;
                long longValue = ((Long) message.obj).longValue() + zVar3.f6900f;
                zVar3.f6900f = longValue;
                zVar3.f6903i = longValue / zVar3.f6906l;
            }
        }
    }

    public z(d dVar) {
        this.b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.a = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        StringBuilder sb = d0.a;
        c0 c0Var = new c0(looper);
        c0Var.sendMessageDelayed(c0Var.obtainMessage(), 1000L);
        this.c = new a(handlerThread.getLooper(), this);
    }

    public a0 a() {
        return new a0(this.b.b(), this.b.size(), this.f6898d, this.f6899e, this.f6900f, this.f6901g, this.f6902h, this.f6903i, this.f6904j, this.f6905k, this.f6906l, this.f6907m, this.n, System.currentTimeMillis());
    }
}

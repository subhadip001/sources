package f.h.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: AudioBecomingNoisyManager.java */
/* loaded from: classes.dex */
public final class d0 {
    public final Context a;
    public final a b;
    public boolean c;

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: classes.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        public final b f4088f;

        /* renamed from: g  reason: collision with root package name */
        public final Handler f4089g;

        public a(Handler handler, b bVar) {
            this.f4089g = handler;
            this.f4088f = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f4089g.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d0.this.c) {
                o1.this.Y(false, -1, 3);
            }
        }
    }

    /* compiled from: AudioBecomingNoisyManager.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public d0(Context context, Handler handler, b bVar) {
        this.a = context.getApplicationContext();
        this.b = new a(handler, bVar);
    }

    public void a(boolean z) {
        if (z && !this.c) {
            this.a.registerReceiver(this.b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.c = true;
        } else if (z || !this.c) {
        } else {
            this.a.unregisterReceiver(this.b);
            this.c = false;
        }
    }
}

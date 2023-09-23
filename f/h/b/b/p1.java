package f.h.b.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* compiled from: StreamVolumeManager.java */
/* loaded from: classes.dex */
public final class p1 {
    public final Context a;
    public final Handler b;
    public final b c;

    /* renamed from: d  reason: collision with root package name */
    public final AudioManager f4440d;

    /* renamed from: e  reason: collision with root package name */
    public c f4441e;

    /* renamed from: f  reason: collision with root package name */
    public int f4442f;

    /* renamed from: g  reason: collision with root package name */
    public int f4443g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4444h;

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: StreamVolumeManager.java */
    /* loaded from: classes.dex */
    public final class c extends BroadcastReceiver {
        public c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final p1 p1Var = p1.this;
            p1Var.b.post(new Runnable() { // from class: f.h.b.b.b0
                @Override // java.lang.Runnable
                public final void run() {
                    p1.this.c();
                }
            });
        }
    }

    public p1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = handler;
        this.c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        f.h.b.b.e2.j.i(audioManager);
        this.f4440d = audioManager;
        this.f4442f = 3;
        this.f4443g = b(audioManager, 3);
        this.f4444h = a(audioManager, this.f4442f);
        c cVar = new c(null);
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f4441e = cVar;
        } catch (RuntimeException e2) {
            f.h.b.b.g2.m.c("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    public static boolean a(AudioManager audioManager, int i2) {
        if (f.h.b.b.g2.b0.a >= 23) {
            return audioManager.isStreamMute(i2);
        }
        return b(audioManager, i2) == 0;
    }

    public static int b(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i2);
            f.h.b.b.g2.m.c("StreamVolumeManager", sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public final void c() {
        int b2 = b(this.f4440d, this.f4442f);
        boolean a2 = a(this.f4440d, this.f4442f);
        if (this.f4443g == b2 && this.f4444h == a2) {
            return;
        }
        this.f4443g = b2;
        this.f4444h = a2;
        Iterator<f.h.b.b.w1.b> it = o1.this.f4425j.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }
}

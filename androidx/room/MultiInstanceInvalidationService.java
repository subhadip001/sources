package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import e.v.c;
import e.v.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f  reason: collision with root package name */
    public int f552f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<Integer, String> f553g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    public final RemoteCallbackList<c> f554h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final d f555i = new b();

    /* loaded from: classes.dex */
    public class a extends RemoteCallbackList<c> {
        public a() {
        }

        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(c cVar, Object obj) {
            MultiInstanceInvalidationService.this.f553g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    /* loaded from: classes.dex */
    public class b extends d {
        public b() {
        }

        public void p(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f554h) {
                String str = MultiInstanceInvalidationService.this.f553g.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f554h.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    int intValue = ((Integer) MultiInstanceInvalidationService.this.f554h.getBroadcastCookie(i3)).intValue();
                    String str2 = MultiInstanceInvalidationService.this.f553g.get(Integer.valueOf(intValue));
                    if (i2 != intValue && str.equals(str2)) {
                        try {
                            MultiInstanceInvalidationService.this.f554h.getBroadcastItem(i3).c(strArr);
                        } catch (RemoteException e2) {
                            Log.w("ROOM", "Error invoking a remote callback", e2);
                        }
                    }
                }
                MultiInstanceInvalidationService.this.f554h.finishBroadcast();
            }
        }

        public int q(c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f554h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.f552f + 1;
                multiInstanceInvalidationService.f552f = i2;
                if (multiInstanceInvalidationService.f554h.register(cVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f553g.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f552f--;
                return 0;
            }
        }

        public void r(c cVar, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f554h) {
                MultiInstanceInvalidationService.this.f554h.unregister(cVar);
                MultiInstanceInvalidationService.this.f553g.remove(Integer.valueOf(i2));
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f555i;
    }
}

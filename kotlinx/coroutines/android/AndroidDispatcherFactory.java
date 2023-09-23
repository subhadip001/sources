package kotlinx.coroutines.android;

import android.os.Looper;
import j.a.j1;
import j.a.x1.a;
import j.a.x1.c;
import j.a.y1.m;
import java.util.List;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes2.dex */
public final class AndroidDispatcherFactory implements m {
    @Override // j.a.y1.m
    public j1 createDispatcher(List<? extends m> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new a(c.a(mainLooper, true), null, false);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // j.a.y1.m
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // j.a.y1.m
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}

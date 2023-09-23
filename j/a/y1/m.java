package j.a.y1;

import j.a.j1;
import java.util.List;

/* compiled from: MainDispatcherFactory.kt */
/* loaded from: classes2.dex */
public interface m {
    j1 createDispatcher(List<? extends m> list);

    int getLoadPriority();

    String hintOnError();
}

package com.google.firebase.database.core.view;

import com.google.firebase.database.core.Context;
import com.google.firebase.database.core.EventTarget;
import com.google.firebase.database.logging.LogWrapper;
import f.a.b.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class EventRaiser {
    private final EventTarget eventTarget;
    private final LogWrapper logger;

    public EventRaiser(Context context) {
        this.eventTarget = context.getEventTarget();
        this.logger = context.getLogger("EventRaiser");
    }

    public void raiseEvents(List<? extends Event> list) {
        if (this.logger.logsDebug()) {
            LogWrapper logWrapper = this.logger;
            StringBuilder A = a.A("Raising ");
            A.append(list.size());
            A.append(" event(s)");
            logWrapper.debug(A.toString(), new Object[0]);
        }
        final ArrayList arrayList = new ArrayList(list);
        this.eventTarget.postEvent(new Runnable() { // from class: com.google.firebase.database.core.view.EventRaiser.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Event event = (Event) it.next();
                    if (EventRaiser.this.logger.logsDebug()) {
                        LogWrapper logWrapper2 = EventRaiser.this.logger;
                        StringBuilder A2 = a.A("Raising ");
                        A2.append(event.toString());
                        logWrapper2.debug(A2.toString(), new Object[0]);
                    }
                    event.fire();
                }
            }
        });
    }
}

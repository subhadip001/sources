package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.RequestDeduplicator;
import e.f.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, Task<String>> getTokenRequests = new a();

    /* loaded from: classes2.dex */
    public interface GetTokenRequest {
        Task<String> start();
    }

    public RequestDeduplicator(Executor executor) {
        this.executor = executor;
    }

    public /* synthetic */ Task a(String str, Task task) {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> getOrStartGetTokenRequest(final String str, GetTokenRequest getTokenRequest) {
        Task<String> task = this.getTokenRequests.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new Continuation() { // from class: f.h.e.p.y
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                RequestDeduplicator.this.a(str, task2);
                return task2;
            }
        });
        this.getTokenRequests.put(str, continueWithTask);
        return continueWithTask;
    }
}

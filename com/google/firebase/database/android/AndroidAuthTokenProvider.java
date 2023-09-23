package com.google.firebase.database.android;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.internal.IdTokenListener;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.database.core.TokenProvider;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import com.google.firebase.internal.api.FirebaseNoSignedInUserException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class AndroidAuthTokenProvider implements TokenProvider {
    private final Deferred<InternalAuthProvider> deferredAuthProvider;
    private final AtomicReference<InternalAuthProvider> internalAuth = new AtomicReference<>();

    public AndroidAuthTokenProvider(Deferred<InternalAuthProvider> deferred) {
        this.deferredAuthProvider = deferred;
        deferred.whenAvailable(new Deferred.DeferredHandler() { // from class: f.h.e.j.b.g
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AndroidAuthTokenProvider.this.b(provider);
            }
        });
    }

    public static /* synthetic */ void a(TokenProvider.GetTokenCompletionListener getTokenCompletionListener, Exception exc) {
        if (isUnauthenticatedUsage(exc)) {
            getTokenCompletionListener.onSuccess(null);
        } else {
            getTokenCompletionListener.onError(exc.getMessage());
        }
    }

    private static boolean isUnauthenticatedUsage(Exception exc) {
        return (exc instanceof FirebaseApiNotAvailableException) || (exc instanceof FirebaseNoSignedInUserException);
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void addTokenChangeListener(final ExecutorService executorService, final TokenProvider.TokenChangeListener tokenChangeListener) {
        this.deferredAuthProvider.whenAvailable(new Deferred.DeferredHandler() { // from class: f.h.e.j.b.l
            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                final ExecutorService executorService2 = executorService;
                final TokenProvider.TokenChangeListener tokenChangeListener2 = tokenChangeListener;
                ((InternalAuthProvider) provider.get()).addIdTokenListener(new IdTokenListener() { // from class: f.h.e.j.b.j
                    @Override // com.google.firebase.auth.internal.IdTokenListener
                    public final void onIdTokenChanged(final InternalTokenResult internalTokenResult) {
                        ExecutorService executorService3 = executorService2;
                        final TokenProvider.TokenChangeListener tokenChangeListener3 = tokenChangeListener2;
                        executorService3.execute(new Runnable() { // from class: f.h.e.j.b.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                TokenProvider.TokenChangeListener.this.onTokenChange(internalTokenResult.getToken());
                            }
                        });
                    }
                });
            }
        });
    }

    public /* synthetic */ void b(Provider provider) {
        this.internalAuth.set((InternalAuthProvider) provider.get());
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void getToken(boolean z, final TokenProvider.GetTokenCompletionListener getTokenCompletionListener) {
        InternalAuthProvider internalAuthProvider = this.internalAuth.get();
        if (internalAuthProvider != null) {
            internalAuthProvider.getAccessToken(z).addOnSuccessListener(new OnSuccessListener() { // from class: f.h.e.j.b.h
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    TokenProvider.GetTokenCompletionListener.this.onSuccess(((GetTokenResult) obj).getToken());
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: f.h.e.j.b.k
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    AndroidAuthTokenProvider.a(TokenProvider.GetTokenCompletionListener.this, exc);
                }
            });
        } else {
            getTokenCompletionListener.onSuccess(null);
        }
    }

    @Override // com.google.firebase.database.core.TokenProvider
    public void removeTokenChangeListener(TokenProvider.TokenChangeListener tokenChangeListener) {
    }
}

package com.google.firebase.inappmessaging.display.internal;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplayCallbacks;
import com.google.firebase.inappmessaging.display.internal.injection.scopes.FirebaseAppScope;
import com.google.firebase.inappmessaging.model.InAppMessage;
import f.a.b.a.a;
import f.e.a.p.e;
import f.e.a.p.j.h;

@FirebaseAppScope
/* loaded from: classes2.dex */
public class GlideErrorListener implements e<Object> {
    private FirebaseInAppMessagingDisplayCallbacks displayCallbacks;
    private InAppMessage inAppMessage;

    @Override // f.e.a.p.e
    public boolean onLoadFailed(GlideException glideException, Object obj, h<Object> hVar, boolean z) {
        StringBuilder A = a.A("Image Downloading  Error : ");
        A.append(glideException.getMessage());
        A.append(":");
        A.append(glideException.getCause());
        Logging.logd(A.toString());
        if (this.inAppMessage == null || this.displayCallbacks == null) {
            return false;
        }
        if (glideException.getLocalizedMessage().contains("Failed to decode")) {
            this.displayCallbacks.displayErrorEncountered(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.IMAGE_UNSUPPORTED_FORMAT);
            return false;
        }
        this.displayCallbacks.displayErrorEncountered(FirebaseInAppMessagingDisplayCallbacks.InAppMessagingErrorReason.UNSPECIFIED_RENDER_ERROR);
        return false;
    }

    @Override // f.e.a.p.e
    public boolean onResourceReady(Object obj, Object obj2, h<Object> hVar, DataSource dataSource, boolean z) {
        Logging.logd("Image Downloading  Success : " + obj);
        return false;
    }

    public void setInAppMessage(InAppMessage inAppMessage, FirebaseInAppMessagingDisplayCallbacks firebaseInAppMessagingDisplayCallbacks) {
        this.inAppMessage = inAppMessage;
        this.displayCallbacks = firebaseInAppMessagingDisplayCallbacks;
    }
}

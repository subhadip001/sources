package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import f.a.b.a.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaz extends RemoteCreator<zam> {
    private static final zaz zaa = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context context, int i2, int i3) {
        zaz zazVar = zaa;
        try {
            zax zaxVar = new zax(1, i2, i3, null);
            return (View) ObjectWrapper.unwrap(zazVar.getRemoteCreatorInstance(context).zae(ObjectWrapper.wrap(context), zaxVar));
        } catch (Exception e2) {
            throw new RemoteCreator.RemoteCreatorException(a.e(64, "Could not get button with size ", i2, " and color ", i3), e2);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ zam getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }
}

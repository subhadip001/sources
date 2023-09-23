package f.h.b.d.a.e;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import f.h.b.d.a.b.w0;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class l0 extends z implements IInterface {
    public l0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    @Override // f.h.b.d.a.e.z
    public final boolean p(int i2, Parcel parcel, Parcel parcel2, int i3) {
        Notification.Builder priority;
        m0 m0Var = null;
        if (i2 == 2) {
            Bundle bundle = (Bundle) a0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                m0Var = queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m0(readStrongBinder);
            }
            f.h.b.d.a.b.v vVar = (f.h.b.d.a.b.v) this;
            synchronized (vVar) {
                vVar.f5734f.a("updateServiceState AIDL call", new Object[0]);
                if (r.b(vVar.f5735g) && r.a(vVar.f5735g)) {
                    int i4 = bundle.getInt("action_type");
                    w0 w0Var = vVar.f5738j;
                    synchronized (w0Var.f5747g) {
                        w0Var.f5747g.add(m0Var);
                    }
                    if (i4 == 1) {
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 26) {
                            String string = bundle.getString("notification_channel_name");
                            synchronized (vVar) {
                                if (string == null) {
                                    string = "File downloads by Play";
                                }
                                vVar.f5739k.createNotificationChannel(new NotificationChannel("playcore-assetpacks-service-notification-channel", string, 2));
                            }
                        }
                        vVar.f5737i.a(true);
                        w0 w0Var2 = vVar.f5738j;
                        String string2 = bundle.getString("notification_title");
                        String string3 = bundle.getString("notification_subtext");
                        long j2 = bundle.getLong("notification_timeout", 600000L);
                        Parcelable parcelable = bundle.getParcelable("notification_on_click_intent");
                        if (i5 >= 26) {
                            priority = new Notification.Builder(vVar.f5735g, "playcore-assetpacks-service-notification-channel").setTimeoutAfter(j2);
                        } else {
                            priority = new Notification.Builder(vVar.f5735g).setPriority(-2);
                        }
                        if (parcelable instanceof PendingIntent) {
                            priority.setContentIntent((PendingIntent) parcelable);
                        }
                        Notification.Builder ongoing = priority.setSmallIcon(17301633).setOngoing(false);
                        if (string2 == null) {
                            string2 = "Downloading additional file";
                        }
                        Notification.Builder contentTitle = ongoing.setContentTitle(string2);
                        if (string3 == null) {
                            string3 = "Transferring";
                        }
                        contentTitle.setSubText(string3);
                        int i6 = bundle.getInt("notification_color");
                        if (i6 != 0) {
                            priority.setColor(i6).setVisibility(-1);
                        }
                        w0Var2.f5750j = priority.build();
                        vVar.f5735g.bindService(new Intent(vVar.f5735g, ExtractionForegroundService.class), vVar.f5738j, 1);
                    } else if (i4 == 2) {
                        vVar.f5737i.a(false);
                        w0 w0Var3 = vVar.f5738j;
                        w0Var3.f5746f.a("Stopping foreground installation service.", new Object[0]);
                        w0Var3.f5748h.unbindService(w0Var3);
                        ExtractionForegroundService extractionForegroundService = w0Var3.f5749i;
                        if (extractionForegroundService != null) {
                            synchronized (extractionForegroundService) {
                                extractionForegroundService.stopForeground(true);
                                extractionForegroundService.stopSelf();
                            }
                        }
                        w0Var3.a();
                    } else {
                        vVar.f5734f.b("Unknown action type received: %d", Integer.valueOf(i4));
                        m0Var.zzd(new Bundle());
                    }
                }
                m0Var.zzd(new Bundle());
            }
        } else if (i2 != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) a0.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                m0Var = queryLocalInterface2 instanceof m0 ? (m0) queryLocalInterface2 : new m0(readStrongBinder2);
            }
            f.h.b.d.a.b.v vVar2 = (f.h.b.d.a.b.v) this;
            vVar2.f5734f.a("clearAssetPackStorage AIDL call", new Object[0]);
            if (r.b(vVar2.f5735g) && r.a(vVar2.f5735g)) {
                f.h.b.d.a.b.c0.j(vVar2.f5736h.g());
                Bundle bundle3 = new Bundle();
                Parcel p = m0Var.p();
                int i7 = a0.a;
                p.writeInt(1);
                bundle3.writeToParcel(p, 0);
                m0Var.q(4, p);
            } else {
                m0Var.zzd(new Bundle());
            }
        }
        return true;
    }
}

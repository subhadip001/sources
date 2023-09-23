package f.h.b.d.a.e;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public abstract class j0 extends z implements k0 {
    public j0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // f.h.b.d.a.e.z
    public final boolean p(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 2:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) a0.a(parcel, Bundle.CREATOR);
                f.h.b.d.a.b.j jVar = (f.h.b.d.a.b.j) this;
                jVar.f5645g.f5688d.c(jVar.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onStartDownload(%d)", Integer.valueOf(readInt));
                break;
            case 3:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) a0.a(parcel, Bundle.CREATOR);
                f.h.b.d.a.b.j jVar2 = (f.h.b.d.a.b.j) this;
                jVar2.f5645g.f5688d.c(jVar2.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onCancelDownload(%d)", Integer.valueOf(readInt2));
                break;
            case 4:
                int readInt3 = parcel.readInt();
                Bundle bundle3 = (Bundle) a0.a(parcel, Bundle.CREATOR);
                f.h.b.d.a.b.j jVar3 = (f.h.b.d.a.b.j) this;
                jVar3.f5645g.f5688d.c(jVar3.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onGetSession(%d)", Integer.valueOf(readInt3));
                break;
            case 5:
                b(parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) a0.a(parcel, creator);
                Bundle bundle5 = (Bundle) a0.a(parcel, creator);
                f.h.b.d.a.b.j jVar4 = (f.h.b.d.a.b.j) this;
                jVar4.f5645g.f5688d.c(jVar4.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle4.getString("module_name"), bundle4.getString("slice_id"), Integer.valueOf(bundle4.getInt("chunk_number")), Integer.valueOf(bundle4.getInt("session_id")));
                break;
            case 7:
                zzd((Bundle) a0.a(parcel, Bundle.CREATOR));
                break;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) a0.a(parcel, creator2);
                Bundle bundle7 = (Bundle) a0.a(parcel, creator2);
                f.h.b.d.a.b.j jVar5 = (f.h.b.d.a.b.j) this;
                jVar5.f5645g.f5688d.c(jVar5.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle6.getString("module_name"), Integer.valueOf(bundle6.getInt("session_id")));
                break;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) a0.a(parcel, creator3);
                f.h.b.d.a.b.j jVar6 = (f.h.b.d.a.b.j) this;
                jVar6.f5645g.f5688d.c(jVar6.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onNotifySessionFailed(%d)", Integer.valueOf(((Bundle) a0.a(parcel, creator3)).getInt("session_id")));
                break;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                m((Bundle) a0.a(parcel, creator4), (Bundle) a0.a(parcel, creator4));
                break;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                a((Bundle) a0.a(parcel, creator5), (Bundle) a0.a(parcel, creator5));
                break;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) a0.a(parcel, creator6);
                Bundle bundle10 = (Bundle) a0.a(parcel, creator6);
                f.h.b.d.a.b.j jVar7 = (f.h.b.d.a.b.j) this;
                jVar7.f5645g.f5688d.c(jVar7.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onRequestDownloadInfo()", new Object[0]);
                break;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) a0.a(parcel, creator7);
                Bundle bundle12 = (Bundle) a0.a(parcel, creator7);
                f.h.b.d.a.b.j jVar8 = (f.h.b.d.a.b.j) this;
                jVar8.f5645g.f5688d.c(jVar8.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onRemoveModule()", new Object[0]);
                break;
            case 15:
                Bundle bundle13 = (Bundle) a0.a(parcel, Bundle.CREATOR);
                f.h.b.d.a.b.j jVar9 = (f.h.b.d.a.b.j) this;
                jVar9.f5645g.f5688d.c(jVar9.f5644f);
                f.h.b.d.a.b.r.f5686g.d("onCancelDownloads()", new Object[0]);
                break;
        }
        return true;
    }
}

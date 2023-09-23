package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnn;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcli;
import com.google.android.gms.internal.ads.zzdcf;
import com.google.android.gms.internal.ads.zzdjf;
import com.google.android.gms.internal.ads.zzdwg;
import com.google.android.gms.internal.ads.zzeen;
import com.google.android.gms.internal.ads.zzfgo;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
@SafeParcelable.Class(creator = "AdOverlayInfoCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    @SafeParcelable.Field(id = 2)
    public final zzc zza;
    @SafeParcelable.Field(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final com.google.android.gms.ads.internal.client.zza zzb;
    @SafeParcelable.Field(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final zzo zzc;
    @SafeParcelable.Field(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final zzcli zzd;
    @SafeParcelable.Field(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final zzbnn zze;
    @SafeParcelable.Field(id = 7)
    public final String zzf;
    @SafeParcelable.Field(id = 8)
    public final boolean zzg;
    @SafeParcelable.Field(id = 9)
    public final String zzh;
    @SafeParcelable.Field(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final zzw zzi;
    @SafeParcelable.Field(id = 11)
    public final int zzj;
    @SafeParcelable.Field(id = 12)
    public final int zzk;
    @SafeParcelable.Field(id = 13)
    public final String zzl;
    @SafeParcelable.Field(id = 14)
    public final zzcfo zzm;
    @SafeParcelable.Field(id = 16)
    public final String zzn;
    @SafeParcelable.Field(id = 17)
    public final com.google.android.gms.ads.internal.zzj zzo;
    @SafeParcelable.Field(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final zzbnl zzp;
    @SafeParcelable.Field(id = 19)
    public final String zzq;
    @SafeParcelable.Field(getter = "getOfflineDatabaseManagerAsBinder", id = 20, type = "android.os.IBinder")
    public final zzeen zzr;
    @SafeParcelable.Field(getter = "getCsiReporterAsBinder", id = 21, type = "android.os.IBinder")
    public final zzdwg zzs;
    @SafeParcelable.Field(getter = "getLoggerAsBinder", id = 22, type = "android.os.IBinder")
    public final zzfgo zzt;
    @SafeParcelable.Field(getter = "getWorkManagerUtilAsBinder", id = 23, type = "android.os.IBinder")
    public final zzbr zzu;
    @SafeParcelable.Field(id = 24)
    public final String zzv;
    @SafeParcelable.Field(id = 25)
    public final String zzw;
    @SafeParcelable.Field(getter = "getAdFailedToShowEventEmitterAsBinder", id = 26, type = "android.os.IBinder")
    public final zzdcf zzx;
    @SafeParcelable.Field(getter = "getPhysicalClickListenerAsBinder", id = 27, type = "android.os.IBinder")
    public final zzdjf zzy;

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzbnl zzbnlVar, zzbnn zzbnnVar, zzw zzwVar, zzcli zzcliVar, boolean z, int i2, String str, zzcfo zzcfoVar, zzdjf zzdjfVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcliVar;
        this.zzp = zzbnlVar;
        this.zze = zzbnnVar;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzwVar;
        this.zzj = i2;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzcfoVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjfVar;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i2, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        SafeParcelWriter.writeInt(parcel, 12, this.zzk);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzm, i2, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzn, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i2, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzq, false);
        SafeParcelWriter.writeIBinder(parcel, 20, ObjectWrapper.wrap(this.zzr).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 21, ObjectWrapper.wrap(this.zzs).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 22, ObjectWrapper.wrap(this.zzt).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 23, ObjectWrapper.wrap(this.zzu).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzw, false);
        SafeParcelWriter.writeIBinder(parcel, 26, ObjectWrapper.wrap(this.zzx).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 27, ObjectWrapper.wrap(this.zzy).asBinder(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzbnl zzbnlVar, zzbnn zzbnnVar, zzw zzwVar, zzcli zzcliVar, boolean z, int i2, String str, String str2, zzcfo zzcfoVar, zzdjf zzdjfVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcliVar;
        this.zzp = zzbnlVar;
        this.zze = zzbnnVar;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzwVar;
        this.zzj = i2;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzcfoVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjfVar;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzw zzwVar, zzcli zzcliVar, int i2, zzcfo zzcfoVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, zzdcf zzdcfVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = zzcliVar;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzaC)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i2;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzcfoVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = zzdcfVar;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzw zzwVar, zzcli zzcliVar, boolean z, int i2, zzcfo zzcfoVar, zzdjf zzdjfVar) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcliVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzwVar;
        this.zzj = i2;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzcfoVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjfVar;
    }

    @SafeParcelable.Constructor
    public AdOverlayInfoParcel(@SafeParcelable.Param(id = 2) zzc zzcVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2, @SafeParcelable.Param(id = 5) IBinder iBinder3, @SafeParcelable.Param(id = 6) IBinder iBinder4, @SafeParcelable.Param(id = 7) String str, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) String str2, @SafeParcelable.Param(id = 10) IBinder iBinder5, @SafeParcelable.Param(id = 11) int i2, @SafeParcelable.Param(id = 12) int i3, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) zzcfo zzcfoVar, @SafeParcelable.Param(id = 16) String str4, @SafeParcelable.Param(id = 17) com.google.android.gms.ads.internal.zzj zzjVar, @SafeParcelable.Param(id = 18) IBinder iBinder6, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 20) IBinder iBinder7, @SafeParcelable.Param(id = 21) IBinder iBinder8, @SafeParcelable.Param(id = 22) IBinder iBinder9, @SafeParcelable.Param(id = 23) IBinder iBinder10, @SafeParcelable.Param(id = 24) String str6, @SafeParcelable.Param(id = 25) String str7, @SafeParcelable.Param(id = 26) IBinder iBinder11, @SafeParcelable.Param(id = 27) IBinder iBinder12) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzc = (zzo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzd = (zzcli) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzp = (zzbnl) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zze = (zzbnn) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzw) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.zzj = i2;
        this.zzk = i3;
        this.zzl = str3;
        this.zzm = zzcfoVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (zzeen) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzs = (zzdwg) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzt = (zzfgo) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzu = (zzbr) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder10));
        this.zzw = str7;
        this.zzx = (zzdcf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder11));
        this.zzy = (zzdjf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzw zzwVar, zzcfo zzcfoVar, zzcli zzcliVar, zzdjf zzdjfVar) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = zzcliVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzwVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzcfoVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = zzdjfVar;
    }

    public AdOverlayInfoParcel(zzo zzoVar, zzcli zzcliVar, int i2, zzcfo zzcfoVar) {
        this.zzc = zzoVar;
        this.zzd = zzcliVar;
        this.zzj = 1;
        this.zzm = zzcfoVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(zzcli zzcliVar, zzcfo zzcfoVar, zzbr zzbrVar, zzeen zzeenVar, zzdwg zzdwgVar, zzfgo zzfgoVar, String str, String str2, int i2) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzcliVar;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzcfoVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = zzeenVar;
        this.zzs = zzdwgVar;
        this.zzt = zzfgoVar;
        this.zzu = zzbrVar;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }
}

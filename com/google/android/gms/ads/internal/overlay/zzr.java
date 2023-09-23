package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzaa zzb;

    public zzr(Context context, zzq zzqVar, zzaa zzaaVar) {
        super(context);
        this.zzb = zzaaVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzaw.zzb();
        int zzv = zzcfb.zzv(context, zzqVar.zza);
        zzaw.zzb();
        int zzv2 = zzcfb.zzv(context, 0);
        zzaw.zzb();
        int zzv3 = zzcfb.zzv(context, zzqVar.zzb);
        zzaw.zzb();
        imageButton.setPadding(zzv, zzv2, zzv3, zzcfb.zzv(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzaw.zzb();
        int zzv4 = zzcfb.zzv(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzaw.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzv4, zzcfb.zzv(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzay.zzc().zzb(zzbhy.zzaW)).longValue();
        if (longValue <= 0) {
            return;
        }
        zzp zzpVar = ((Boolean) zzay.zzc().zzb(zzbhy.zzaX)).booleanValue() ? new zzp(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzpVar);
    }

    private final void zzc() {
        String str = (String) zzay.zzc().zzb(zzbhy.zzaV);
        if (PlatformVersion.isAtLeastLollipop() && !TextUtils.isEmpty(str) && !"default".equals(str)) {
            Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
            if (zzd != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = zzd.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = zzd.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    zzcfi.zze("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.zza.setImageResource(17301527);
                    return;
                }
                this.zza.setImageDrawable(drawable);
                this.zza.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.zza.setImageResource(17301527);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzaa zzaaVar = this.zzb;
        if (zzaaVar != null) {
            zzaaVar.zzbJ();
        }
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zza.setVisibility(8);
            if (((Long) zzay.zzc().zzb(zzbhy.zzaW)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}

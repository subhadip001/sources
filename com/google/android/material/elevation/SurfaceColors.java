package com.google.android.material.elevation;

import android.content.Context;
import com.video_converter.video_compressor.R;
import f.h.b.c.p.a;

/* loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(R.dimen.m3_sys_elevation_level0),
    SURFACE_1(R.dimen.m3_sys_elevation_level1),
    SURFACE_2(R.dimen.m3_sys_elevation_level2),
    SURFACE_3(R.dimen.m3_sys_elevation_level3),
    SURFACE_4(R.dimen.m3_sys_elevation_level4),
    SURFACE_5(R.dimen.m3_sys_elevation_level5);
    
    private final int elevationResId;

    SurfaceColors(int i2) {
        this.elevationResId = i2;
    }

    public static int getColorForElevation(Context context, float f2) {
        return new a(context).a(f.h.b.c.a.l0(context, R.attr.colorSurface, 0), f2);
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }
}

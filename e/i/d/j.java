package e.i.d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import com.google.logging.type.LogSeverity;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: TypefaceCompatApi29Impl.java */
/* loaded from: classes.dex */
public class j extends l {
    @Override // e.i.d.l
    public Typeface a(Context context, e.i.c.d.f fVar, Resources resources, int i2) {
        try {
            e.i.c.d.g[] gVarArr = fVar.a;
            int length = gVarArr.length;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                e.i.c.d.g gVar = gVarArr[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, gVar.f2436f).setWeight(gVar.b);
                    if (!gVar.c) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(gVar.f2435e).setFontVariationSettings(gVar.f2434d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? LogSeverity.ALERT_VALUE : LogSeverity.WARNING_VALUE, (i2 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // e.i.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.i.g.l[] lVarArr, int i2) {
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = lVarArr.length;
            FontFamily.Builder builder = null;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? LogSeverity.ALERT_VALUE : LogSeverity.WARNING_VALUE, (i2 & 2) != 0 ? 1 : 0)).build();
                }
                e.i.g.l lVar = lVarArr[i3];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(lVar.a, "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(lVar.c);
                        if (!lVar.f2489d) {
                            i4 = 0;
                        }
                        Font build = weight.setSlant(i4).setTtcIndex(lVar.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else {
                    i3 = openFileDescriptor == null ? i3 + 1 : 0;
                }
                openFileDescriptor.close();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // e.i.d.l
    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // e.i.d.l
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}

package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsSpiCall;
import f.a.b.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f330k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f331d;

    /* renamed from: e  reason: collision with root package name */
    public int f332e;

    /* renamed from: f  reason: collision with root package name */
    public int f333f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f334g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f335h;

    /* renamed from: i  reason: collision with root package name */
    public String f336i;

    /* renamed from: j  reason: collision with root package name */
    public String f337j;

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.f331d = null;
        this.f332e = 0;
        this.f333f = 0;
        this.f334g = null;
        this.f335h = f330k;
        this.f336i = null;
    }

    public static IconCompat a(Icon icon) {
        Objects.requireNonNull(icon);
        int j2 = j(icon);
        if (j2 != 2) {
            if (j2 == 4) {
                Uri l2 = l(icon);
                if (l2 != null) {
                    String uri = l2.toString();
                    if (uri != null) {
                        IconCompat iconCompat = new IconCompat(4);
                        iconCompat.b = uri;
                        return iconCompat;
                    }
                    throw new IllegalArgumentException("Uri must not be null.");
                }
                throw new IllegalArgumentException("Uri must not be null.");
            } else if (j2 != 6) {
                IconCompat iconCompat2 = new IconCompat(-1);
                iconCompat2.b = icon;
                return iconCompat2;
            } else {
                Uri l3 = l(icon);
                if (l3 != null) {
                    String uri2 = l3.toString();
                    if (uri2 != null) {
                        IconCompat iconCompat3 = new IconCompat(6);
                        iconCompat3.b = uri2;
                        return iconCompat3;
                    }
                    throw new IllegalArgumentException("Uri must not be null.");
                }
                throw new IllegalArgumentException("Uri must not be null.");
            }
        }
        return c(null, g(icon), e(icon));
    }

    public static Bitmap b(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat c(Resources resources, String str, int i2) {
        if (str != null) {
            if (i2 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f332e = i2;
                if (resources != null) {
                    try {
                        iconCompat.b = resources.getResourceName(i2);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.b = str;
                }
                iconCompat.f337j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    public static int e(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public static String g(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public static Resources h(Context context, String str) {
        if (DefaultSettingsSpiCall.ANDROID_CLIENT_TYPE.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e2);
            return null;
        }
    }

    public static int j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    public static Uri l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public int d() {
        int i2 = this.a;
        if (i2 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i2 == 2) {
                return this.f332e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return e((Icon) this.b);
    }

    public String f() {
        int i2 = this.a;
        if (i2 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i2 == 2) {
                if (TextUtils.isEmpty(this.f337j)) {
                    return ((String) this.b).split(":", -1)[0];
                }
                return this.f337j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return g((Icon) this.b);
    }

    public int i() {
        int i2 = this.a;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : j((Icon) this.b);
    }

    public Uri k() {
        int i2 = this.a;
        if (i2 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i2 != 4 && i2 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.b);
        }
        return l((Icon) this.b);
    }

    public InputStream m(Context context) {
        Uri k2 = k();
        String scheme = k2.getScheme();
        if (!FirebaseAnalytics.Param.CONTENT.equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + k2, e2);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(k2);
        } catch (Exception e3) {
            Log.w("IconCompat", "Unable to load image from URI: " + k2, e3);
            return null;
        }
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        Icon createWithBitmap;
        switch (this.a) {
            case -1:
                return (Icon) this.b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(f(), this.f332e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.b, this.f332e, this.f333f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(b((Bitmap) this.b, false));
                    break;
                }
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(k());
                    break;
                } else if (context != null) {
                    InputStream m2 = m(context);
                    if (m2 == null) {
                        StringBuilder A = a.A("Cannot load adaptive icon from uri: ");
                        A.append(k());
                        throw new IllegalStateException(A.toString());
                    } else if (i2 >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(m2));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(b(BitmapFactory.decodeStream(m2), false));
                        break;
                    }
                } else {
                    StringBuilder A2 = a.A("Context is required to resolve the file uri of the icon: ");
                    A2.append(k());
                    throw new IllegalArgumentException(A2.toString());
                }
        }
        ColorStateList colorStateList = this.f334g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f335h;
        if (mode != f330k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f337j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f332e);
                if (this.f333f != 0) {
                    sb.append(" off=");
                    sb.append(this.f333f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.f334g != null) {
            sb.append(" tint=");
            sb.append(this.f334g);
        }
        if (this.f335h != f330k) {
            sb.append(" mode=");
            sb.append(this.f335h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.a = -1;
        this.c = null;
        this.f331d = null;
        this.f332e = 0;
        this.f333f = 0;
        this.f334g = null;
        this.f335h = f330k;
        this.f336i = null;
        this.a = i2;
    }
}

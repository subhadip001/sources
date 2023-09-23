package f.j.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes2.dex */
public final class e {
    public static int a(float f2, float f3) {
        int round = Math.round(f2 * 1000000.0f);
        int round2 = Math.round(f3 * 1000000.0f);
        if (round > round2) {
            return 1;
        }
        return round < round2 ? -1 : 0;
    }

    public static int b(Context context, float f2) {
        if (context == null || a(0.0f, f2) == 0) {
            return 0;
        }
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static Bitmap c(int i2, int i3, Drawable drawable) {
        Bitmap bitmap;
        try {
            if ((drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.getHeight() > 0) {
                Matrix matrix = new Matrix();
                matrix.postScale((i2 * 1.0f) / bitmap.getWidth(), (i3 * 1.0f) / bitmap.getHeight());
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap d(Context context, int i2, int i3, int i4) {
        if (context == null || i2 <= 0 || i3 <= 0 || i4 == 0) {
            return null;
        }
        return c(i2, i3, context.getResources().getDrawable(i4, null));
    }

    public static Rect e(String str, float f2) {
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTextSize(f2);
        paint.getTextBounds(str, 0, str.length(), rect);
        paint.reset();
        return rect;
    }

    public static boolean f(Bitmap bitmap) {
        return bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0;
    }

    public static boolean g(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            try {
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
                try {
                    byte[] decode = Base64.decode(str3, 0);
                    try {
                        Signature signature = Signature.getInstance("SHA1withRSA");
                        signature.initVerify(generatePublic);
                        signature.update(str2.getBytes());
                        if (signature.verify(decode)) {
                            return true;
                        }
                        Log.i("IAB_Security", "Signature verification failed.");
                        return false;
                    } catch (InvalidKeyException unused) {
                        Log.i("IAB_Security", "Invalid key specification.");
                        return false;
                    } catch (NoSuchAlgorithmException e2) {
                        throw new RuntimeException(e2);
                    } catch (SignatureException unused2) {
                        Log.i("IAB_Security", "Signature exception.");
                        return false;
                    }
                } catch (IllegalArgumentException unused3) {
                    Log.i("IAB_Security", "Base64 decoding failed.");
                    return false;
                }
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(e3);
            } catch (InvalidKeySpecException e4) {
                String str4 = "Invalid key specification: " + e4;
                Log.i("IAB_Security", str4);
                throw new IOException(str4);
            }
        }
        Log.i("IAB_Security", "Purchase verification failed: missing data.");
        return false;
    }
}

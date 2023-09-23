package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    /* loaded from: classes.dex */
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static int checkOpNoThrow(AppOpsManager appOpsManager, String str, int i2, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i2, str2);
        }

        public static String getOpPackageName(Context context) {
            return context.getOpPackageName();
        }

        public static AppOpsManager getSystemService(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private AppOpsManagerCompat() {
    }

    public static int checkOrNoteProxyOp(Context context, int i2, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager systemService = Api29Impl.getSystemService(context);
            int checkOpNoThrow = Api29Impl.checkOpNoThrow(systemService, str, Binder.getCallingUid(), str2);
            return checkOpNoThrow != 0 ? checkOpNoThrow : Api29Impl.checkOpNoThrow(systemService, str, i2, Api29Impl.getOpPackageName(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    public static int noteOp(Context context, String str, int i2, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOp(str, i2, str2);
    }

    public static int noteOpNoThrow(Context context, String str, int i2, String str2) {
        return ((AppOpsManager) context.getSystemService("appops")).noteOpNoThrow(str, i2, str2);
    }

    public static int noteProxyOp(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
        }
        return 1;
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static String permissionToOp(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}

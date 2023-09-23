package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import e.i.i.b;

/* loaded from: classes.dex */
public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    /* loaded from: classes.dex */
    public static class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        public ActivityOptionsCompatImpl(ActivityOptions activityOptions) {
            this.mActivityOptions = activityOptions;
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Rect getLaunchBounds() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.mActivityOptions.getLaunchBounds();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void requestUsageTimeReport(PendingIntent pendingIntent) {
            if (Build.VERSION.SDK_INT >= 23) {
                this.mActivityOptions.requestUsageTimeReport(pendingIntent);
            }
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public ActivityOptionsCompat setLaunchBounds(Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new ActivityOptionsCompatImpl(this.mActivityOptions.setLaunchBounds(rect));
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        @Override // androidx.core.app.ActivityOptionsCompat
        public void update(ActivityOptionsCompat activityOptionsCompat) {
            if (activityOptionsCompat instanceof ActivityOptionsCompatImpl) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl) activityOptionsCompat).mActivityOptions);
            }
        }
    }

    public static ActivityOptionsCompat makeBasic() {
        if (Build.VERSION.SDK_INT >= 23) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeBasic());
        }
        return new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeClipRevealAnimation(view, i2, i3, i4, i5));
        }
        return new ActivityOptionsCompat();
    }

    public static ActivityOptionsCompat makeCustomAnimation(Context context, int i2, int i3) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i2, i3));
    }

    public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i2, int i3, int i4, int i5) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view, i2, i3, i4, i5));
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeTaskLaunchBehind());
    }

    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i2, int i3) {
        return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i2, i3));
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public ActivityOptionsCompat setLaunchBounds(Rect rect) {
        return this;
    }

    public Bundle toBundle() {
        return null;
    }

    public void update(ActivityOptionsCompat activityOptionsCompat) {
    }

    public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, b<View, String>... bVarArr) {
        Pair[] pairArr = null;
        if (bVarArr != null) {
            pairArr = new Pair[bVarArr.length];
            for (int i2 = 0; i2 < bVarArr.length; i2++) {
                pairArr[i2] = Pair.create(bVarArr[i2].a, bVarArr[i2].b);
            }
        }
        return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }
}

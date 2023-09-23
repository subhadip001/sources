package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import e.c0.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class RemoteActionCompat implements b {
    public PendingIntent mActionIntent;
    public CharSequence mContentDescription;
    public boolean mEnabled;
    public IconCompat mIcon;
    public boolean mShouldShowIcon;
    public CharSequence mTitle;

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        Objects.requireNonNull(iconCompat);
        this.mIcon = iconCompat;
        Objects.requireNonNull(charSequence);
        this.mTitle = charSequence;
        Objects.requireNonNull(charSequence2);
        this.mContentDescription = charSequence2;
        Objects.requireNonNull(pendingIntent);
        this.mActionIntent = pendingIntent;
        this.mEnabled = true;
        this.mShouldShowIcon = true;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction) {
        Objects.requireNonNull(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.a(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.setEnabled(remoteAction.isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(remoteAction.shouldShowIcon());
        }
        return remoteActionCompat;
    }

    public PendingIntent getActionIntent() {
        return this.mActionIntent;
    }

    public CharSequence getContentDescription() {
        return this.mContentDescription;
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setShouldShowIcon(boolean z) {
        this.mShouldShowIcon = z;
    }

    public boolean shouldShowIcon() {
        return this.mShouldShowIcon;
    }

    public RemoteAction toRemoteAction() {
        RemoteAction remoteAction = new RemoteAction(this.mIcon.n(), this.mTitle, this.mContentDescription, this.mActionIntent);
        remoteAction.setEnabled(isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            remoteAction.setShouldShowIcon(shouldShowIcon());
        }
        return remoteAction;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        Objects.requireNonNull(remoteActionCompat);
        this.mIcon = remoteActionCompat.mIcon;
        this.mTitle = remoteActionCompat.mTitle;
        this.mContentDescription = remoteActionCompat.mContentDescription;
        this.mActionIntent = remoteActionCompat.mActionIntent;
        this.mEnabled = remoteActionCompat.mEnabled;
        this.mShouldShowIcon = remoteActionCompat.mShouldShowIcon;
    }
}

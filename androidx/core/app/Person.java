package androidx.core.app;

import android.app.Person;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import f.a.b.a.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class Person {
    private static final String ICON_KEY = "icon";
    private static final String IS_BOT_KEY = "isBot";
    private static final String IS_IMPORTANT_KEY = "isImportant";
    private static final String KEY_KEY = "key";
    private static final String NAME_KEY = "name";
    private static final String URI_KEY = "uri";
    public IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;
    public String mKey;
    public CharSequence mName;
    public String mUri;

    /* loaded from: classes.dex */
    public static class Builder {
        public IconCompat mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;
        public String mKey;
        public CharSequence mName;
        public String mUri;

        public Builder() {
        }

        public Person build() {
            return new Person(this);
        }

        public Builder setBot(boolean z) {
            this.mIsBot = z;
            return this;
        }

        public Builder setIcon(IconCompat iconCompat) {
            this.mIcon = iconCompat;
            return this;
        }

        public Builder setImportant(boolean z) {
            this.mIsImportant = z;
            return this;
        }

        public Builder setKey(String str) {
            this.mKey = str;
            return this;
        }

        public Builder setName(CharSequence charSequence) {
            this.mName = charSequence;
            return this;
        }

        public Builder setUri(String str) {
            this.mUri = str;
            return this;
        }

        public Builder(Person person) {
            this.mName = person.mName;
            this.mIcon = person.mIcon;
            this.mUri = person.mUri;
            this.mKey = person.mKey;
            this.mIsBot = person.mIsBot;
            this.mIsImportant = person.mIsImportant;
        }
    }

    public Person(Builder builder) {
        this.mName = builder.mName;
        this.mIcon = builder.mIcon;
        this.mUri = builder.mUri;
        this.mKey = builder.mKey;
        this.mIsBot = builder.mIsBot;
        this.mIsImportant = builder.mIsImportant;
    }

    public static Person fromAndroidPerson(android.app.Person person) {
        return new Builder().setName(person.getName()).setIcon(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).setUri(person.getUri()).setKey(person.getKey()).setBot(person.isBot()).setImportant(person.isImportant()).build();
    }

    public static Person fromBundle(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(ICON_KEY);
        Builder name = new Builder().setName(bundle.getCharSequence("name"));
        IconCompat iconCompat = null;
        if (bundle2 != null) {
            PorterDuff.Mode mode = IconCompat.f330k;
            int i2 = bundle2.getInt(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE);
            IconCompat iconCompat2 = new IconCompat(i2);
            iconCompat2.f332e = bundle2.getInt("int1");
            iconCompat2.f333f = bundle2.getInt("int2");
            iconCompat2.f337j = bundle2.getString("string1");
            if (bundle2.containsKey("tint_list")) {
                iconCompat2.f334g = (ColorStateList) bundle2.getParcelable("tint_list");
            }
            if (bundle2.containsKey("tint_mode")) {
                iconCompat2.f335h = PorterDuff.Mode.valueOf(bundle2.getString("tint_mode"));
            }
            switch (i2) {
                case -1:
                case 1:
                case 5:
                    iconCompat2.b = bundle2.getParcelable("obj");
                    iconCompat = iconCompat2;
                    break;
                case 0:
                default:
                    a.O("Unknown type ", i2, "IconCompat");
                    break;
                case 2:
                case 4:
                case 6:
                    iconCompat2.b = bundle2.getString("obj");
                    iconCompat = iconCompat2;
                    break;
                case 3:
                    iconCompat2.b = bundle2.getByteArray("obj");
                    iconCompat = iconCompat2;
                    break;
            }
        }
        return name.setIcon(iconCompat).setUri(bundle.getString("uri")).setKey(bundle.getString(KEY_KEY)).setBot(bundle.getBoolean(IS_BOT_KEY)).setImportant(bundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public static Person fromPersistableBundle(PersistableBundle persistableBundle) {
        return new Builder().setName(persistableBundle.getString("name")).setUri(persistableBundle.getString("uri")).setKey(persistableBundle.getString(KEY_KEY)).setBot(persistableBundle.getBoolean(IS_BOT_KEY)).setImportant(persistableBundle.getBoolean(IS_IMPORTANT_KEY)).build();
    }

    public IconCompat getIcon() {
        return this.mIcon;
    }

    public String getKey() {
        return this.mKey;
    }

    public CharSequence getName() {
        return this.mName;
    }

    public String getUri() {
        return this.mUri;
    }

    public boolean isBot() {
        return this.mIsBot;
    }

    public boolean isImportant() {
        return this.mIsImportant;
    }

    public String resolveToLegacyUri() {
        String str = this.mUri;
        if (str != null) {
            return str;
        }
        if (this.mName != null) {
            StringBuilder A = a.A("name:");
            A.append((Object) this.mName);
            return A.toString();
        }
        return "";
    }

    public android.app.Person toAndroidPerson() {
        return new Person.Builder().setName(getName()).setIcon(getIcon() != null ? getIcon().n() : null).setUri(getUri()).setKey(getKey()).setBot(isBot()).setImportant(isImportant()).build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public Bundle toBundle() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.mName);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            Objects.requireNonNull(iconCompat);
            bundle = new Bundle();
            switch (iconCompat.a) {
                case -1:
                    bundle.putParcelable("obj", (Parcelable) iconCompat.b);
                    break;
                case 0:
                default:
                    throw new IllegalArgumentException("Invalid icon");
                case 1:
                case 5:
                    bundle.putParcelable("obj", (Bitmap) iconCompat.b);
                    break;
                case 2:
                case 4:
                case 6:
                    bundle.putString("obj", (String) iconCompat.b);
                    break;
                case 3:
                    bundle.putByteArray("obj", (byte[]) iconCompat.b);
                    break;
            }
            bundle.putInt(NotificationCompat.MessagingStyle.Message.KEY_DATA_MIME_TYPE, iconCompat.a);
            bundle.putInt("int1", iconCompat.f332e);
            bundle.putInt("int2", iconCompat.f333f);
            bundle.putString("string1", iconCompat.f337j);
            ColorStateList colorStateList = iconCompat.f334g;
            if (colorStateList != null) {
                bundle.putParcelable("tint_list", colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f335h;
            if (mode != IconCompat.f330k) {
                bundle.putString("tint_mode", mode.name());
            }
        } else {
            bundle = null;
        }
        bundle2.putBundle(ICON_KEY, bundle);
        bundle2.putString("uri", this.mUri);
        bundle2.putString(KEY_KEY, this.mKey);
        bundle2.putBoolean(IS_BOT_KEY, this.mIsBot);
        bundle2.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return bundle2;
    }

    public PersistableBundle toPersistableBundle() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.mName;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.mUri);
        persistableBundle.putString(KEY_KEY, this.mKey);
        persistableBundle.putBoolean(IS_BOT_KEY, this.mIsBot);
        persistableBundle.putBoolean(IS_IMPORTANT_KEY, this.mIsImportant);
        return persistableBundle;
    }
}

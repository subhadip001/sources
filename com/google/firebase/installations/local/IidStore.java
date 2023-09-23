package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import f.a.b.a.a;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    private final SharedPreferences iidPrefs;

    public IidStore(FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences("com.google.android.gms.appid", 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    private String createTokenKey(String str, String str2) {
        return a.r(STORE_KEY_TOKEN, str, STORE_KEY_SEPARATOR, str2);
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (applicationId.startsWith("1:") || applicationId.startsWith("2:")) {
            String[] split = applicationId.split(":");
            if (split.length != 4) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return applicationId;
    }

    private static String getIdFromPublicKey(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
            if (string == null) {
                return null;
            }
            PublicKey parseKey = parseKey(string);
            if (parseKey == null) {
                return null;
            }
            return getIdFromPublicKey(parseKey);
        }
    }

    public String readIid() {
        synchronized (this.iidPrefs) {
            String readInstanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
            if (readInstanceIdFromLocalStorage != null) {
                return readInstanceIdFromLocalStorage;
            }
            return readPublicKeyFromLocalStorageAndCalculateInstanceId();
        }
    }

    public String readToken() {
        synchronized (this.iidPrefs) {
            for (String str : ALLOWABLE_SCOPES) {
                String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(JSON_ENCODED_PREFIX)) {
                        string = parseIidTokenFromJson(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    public IidStore(SharedPreferences sharedPreferences, String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }
}

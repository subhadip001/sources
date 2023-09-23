package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;
import f.a.b.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class ImageDownload implements Closeable {
    private static final int MAX_IMAGE_SIZE_BYTES = 1048576;
    private volatile Future<?> future;
    private Task<Bitmap> task;
    private final URL url;

    private ImageDownload(URL url) {
        this.url = url;
    }

    private byte[] blockingDownloadBytes() {
        URLConnection openConnection = this.url.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] byteArray = ByteStreams.toByteArray(ByteStreams.limit(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder A = a.A("Downloaded ");
                    A.append(byteArray.length);
                    A.append(" bytes from ");
                    A.append(this.url);
                    Log.v("FirebaseMessaging", A.toString());
                }
                if (byteArray.length <= 1048576) {
                    return byteArray;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static ImageDownload create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    public Bitmap blockingDownload() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder A = a.A("Starting download of: ");
            A.append(this.url);
            Log.i("FirebaseMessaging", A.toString());
        }
        byte[] blockingDownloadBytes = blockingDownloadBytes();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blockingDownloadBytes, 0, blockingDownloadBytes.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder A2 = a.A("Successfully downloaded image: ");
                A2.append(this.url);
                Log.d("FirebaseMessaging", A2.toString());
            }
            return decodeByteArray;
        }
        StringBuilder A3 = a.A("Failed to decode image: ");
        A3.append(this.url);
        throw new IOException(A3.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.future.cancel(true);
    }

    public Task<Bitmap> getTask() {
        return (Task) Preconditions.checkNotNull(this.task);
    }

    public void start(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.future = executorService.submit(new Runnable() { // from class: f.h.e.p.v
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownload imageDownload = ImageDownload.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                Objects.requireNonNull(imageDownload);
                try {
                    taskCompletionSource2.setResult(imageDownload.blockingDownload());
                } catch (Exception e2) {
                    taskCompletionSource2.setException(e2);
                }
            }
        });
        this.task = taskCompletionSource.getTask();
    }
}

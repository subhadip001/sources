package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.RepoInfo;

/* loaded from: classes2.dex */
public final class ParsedUrl {
    public Path path;
    public RepoInfo repoInfo;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParsedUrl.class != obj.getClass()) {
            return false;
        }
        ParsedUrl parsedUrl = (ParsedUrl) obj;
        if (this.repoInfo.equals(parsedUrl.repoInfo)) {
            return this.path.equals(parsedUrl.path);
        }
        return false;
    }

    public int hashCode() {
        return this.path.hashCode() + (this.repoInfo.hashCode() * 31);
    }
}

package com.example;

import java.net.URI;

public class UploadDestination {
    public boolean supports(String location) {
        final URI uri = URI.create(location);
        final String scheme = uri.getScheme();
        return scheme.equals("http") || scheme.equals("s3") || scheme.equals("sftp");
    }
}

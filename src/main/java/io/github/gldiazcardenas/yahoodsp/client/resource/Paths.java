package io.github.gldiazcardenas.yahoodsp.client.resource;

public final class Paths {

    private Paths() {
        super();
    }

    public static String resourcesPath(String resourceName) {
        return resourceName + "/";
    }

    public static String resourcePath(String resourceName, String paramName) {
        return resourcesPath(resourceName) + "{" + paramName + "}";
    }

}

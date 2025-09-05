package com.bero.basic.config.common;

import java.util.List;

public final class SecurityConstants {
    private SecurityConstants() {}

    // 화이트리스트 - 정적 파일
    public static final String[] STATIC_RESOURCES = {
        "/css/**",
        "/js/**",
        "/images/**",
        "/favicon.ico",
    };

    // 화이트리스트 - API
    public static final String[] PUBLIC_PATHS = {
        "/",
        "/healthz",
        "/api/auth/**",
        "/v3/api-docs/**",
        "/swagger-ui/**",
        "/swagger-ui.html",
        "/basic/**", // 아직 JWT 토큰 정보를 붙이지 않아서 임시 허용
    };

    public static final String[] WHITE_LIST =
        java.util.stream.Stream
        .concat(
            java.util.Arrays.stream(STATIC_RESOURCES),
            java.util.Arrays.stream(PUBLIC_PATHS)
        ).toArray(String[]::new);
}

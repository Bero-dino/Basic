package com.bero.basic.security;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
abstract class JwtAuthFilter extends OncePerRequestFilter {

}

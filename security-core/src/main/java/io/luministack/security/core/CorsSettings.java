package io.luministack.security.core;

import java.util.List;

public record CorsSettings(
	List<String> allowedOrigins,
	List<String> allowedHeaders,
	List<String> allowedMethods,
	boolean allowCredentials
) {
	
	public CorsSettings {
		allowedOrigins = List.copyOf(allowedOrigins == null ? List.of() : allowedOrigins);
		allowedHeaders = List.copyOf(allowedHeaders == null
			? List.of("Authorization", "Content-Type")
			: allowedHeaders);
		allowedMethods = List.copyOf(allowedMethods == null
			? List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
			: allowedMethods);
	}
	public CorsSettings() {
		this(
			List.of(),
			List.of("Authorization", "Content-Type"),
			List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"),
			true
		);
	}
}
package br.com.jstack.security.core;

import java.util.Optional;

public interface TenantResolver {
	Optional<String> resolveFromRequest(Object request);
	
	Optional<String> resolveFromClaims(Object jwtClaims);
}
package io.luministack.security.core;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * Utility class for parsing PEM-encoded RSA public keys into {@link PublicKey}.
 */
public final class PemUtils {
	
	private PemUtils() {
		// Prevent instantiation
	}
	
	/**
	 * Reads an RSA public key from a PEM-encoded string.
	 *
	 * @param pem the PEM string containing the RSA public key.
	 * @return a {@link PublicKey} instance.
	 * @throws IllegalArgumentException if the key is invalid or cannot be parsed.
	 */
	public static PublicKey readRsaPublicKey(String pem) {
		if (pem == null || pem.isBlank()) {
			throw new IllegalArgumentException("PEM content cannot be null or blank");
		}
		
		// Remove header/footer and whitespace
		String normalized = pem
			.replace("-----BEGIN PUBLIC KEY-----", "")
			.replace("-----END PUBLIC KEY-----", "")
			.replaceAll("\\s+", "");
		
		try {
			byte[] der = Base64.getDecoder().decode(normalized);
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(der);
			return KeyFactory.getInstance("RSA").generatePublic(keySpec);
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid RSA public key format", e);
		}
	}
}
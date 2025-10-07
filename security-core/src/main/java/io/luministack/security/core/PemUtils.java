package io.luministack.security.core;


import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public final class PemUtils {
	private PemUtils() {
	}
	
	public static PublicKey readRsaPublicKey(String pem) {
		var normalized = pem.replace("-----BEGIN PUBLIC KEY-----", "")
			.replace("-----END PUBLIC KEY-----", "").replaceAll("\\s+", "");
		var der = Base64.getDecoder().decode(normalized);
		try {
			return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(der));
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid RSA public key", e);
		}
	}
}
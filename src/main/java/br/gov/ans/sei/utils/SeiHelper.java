package br.gov.ans.sei.utils;

import java.io.File;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

import br.gov.ans.commons.security.crypt.HashUtils;

public class SeiHelper {

	/**
	 * Calcula o hash utilizando o algoritimo SHA-256.
	 * 	
	 * @param conteudo entrada da qual será gerado o hash.
	 * 
	 * @return resultado do calculo do hash.
	 *         
	 * @throws NoSuchAlgorithmException
	 * 
	 */
	public static String calcularHash(String conteudo) throws NoSuchAlgorithmException{
		return HashUtils.toSHA256(conteudo, null);
	}
	
	/**
	 * Codifica entrada para Base64.
	 * 	
	 * @param bytes Array de bytes que será codificado.
	 * 
	 * @return resultado da conversão dos bytes.
	 *         
	 * @throws NoSuchAlgorithmException
	 * 
	 */
	public static String getBase64(byte[] bytes){
		return Base64.encodeBase64String(bytes);
	}
	
	/**
	 * Codifica entrada para Base64.
	 * 	
	 * @param arquivo File que será codificado.
	 * 
	 * @return resultado da conversão dos bytes do arquivo.
	 *         
	 * @throws NoSuchAlgorithmException
	 * 
	 */
	public static String getBase64(File arquivo) throws Exception{
	    byte[] bytes = new byte[(int) arquivo.length()];
	    
    	FileInputStream fileInputStream = new FileInputStream(arquivo);
		fileInputStream.read(bytes);
		fileInputStream.close();
		        
		return getBase64(bytes);
	}
}

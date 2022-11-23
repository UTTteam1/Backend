package com.proyect1.app.web.Controllers;


import java.util.Date;
import java.time.Instant;
import java.util.HashMap;

import javax.crypto.SecretKey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
public class JwtController {
	@GetMapping("/api/token")		
	@ResponseBody		
	public String GenerateToken() { 
		Date date = new Date();
		long ini = date.getTime() / 1000L;
		date.setMinutes(date.getMinutes()+5);
		long fin = date.getTime() / 1000L;
		
		try{
		//-------------------------------------------------------------------------------
									//HEADER
		//-------------------------------------------------------------------------------
		//The JWT signature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.ES256;
		SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
		//Creating the Header of 
		HashMap<String, Object> header = new HashMap<String,Object>();
		header.put("alg", signatureAlgorithm.toString()); //HS256
		header.put("typ","JWT");
		//-------------------------------------------------------------------------------
		//CREATING TOKEN + ADDING HEADER
		//-------------------------------------------------------------------------------
		//Generate tokenJWT + adding header
		JwtBuilder tokenJWT = Jwts
		.builder()
		.setHeader(header)
		.claim("usuario", "Alexis Garcia")
		.claim("roles", "admin")
		// date now
		.setIssuedAt(Date.from(Instant.ofEpochSecond(ini)))
		// 5 min later
		.setExpiration(Date.from(Instant.ofEpochSecond(fin))).signWith(key);
		//-------------------------------------------------------------------------------
		//CREATING TOKEN + ADDING HEADER
		//-------------------------------------------------------------------------------
		//Compact the tokenJWT + save the value in tokenJWTString
		String tokenJWTString = tokenJWT.compact();
		//Response to Request from Controller
		return tokenJWTString;
		}catch (Exception e) {
			System.out.println(e);
			return "Error creating the token JWT" + e;
		}
	}
}
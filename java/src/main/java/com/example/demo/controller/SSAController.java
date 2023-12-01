package com.example.demo.controller;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.StringReader;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.*;

@RestController
@RequestMapping("/cdr-register/v1/banking")
public class SSAController {

    private static String SECRET_KEY =
            "-----BEGIN PRIVATE KEY-----\n" +
            "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCdIE+ZRJ2j3jOW\n" +
            "FG2qofsLjjibxujHN1FI45GUWOsF2ga1ZDK0PwreyI5pmdqjo44/4QF10rcDyIWV\n" +
            "JD/59XQe/sfJOhGdSIRzA29abegtBPS7G0L0zSf4vn4HjLAjgIr/gybUDnB+Icat\n" +
            "yVQ4trpd/kiaCAI4Wtjr5qZveD1sK1xnObnE8+3PqzSEVnOFRFbhjatt0g3oAeUO\n" +
            "7TlLn8N6nFK1hhiLV9filyWD3ACpBgjnGIuC1U/LCvgWjZEM5j/5tuslRXrc7sIq\n" +
            "p7RYv39SNh5NnZQtuURBiPwriGYqtlEhd0L2XEp9Vkb+kFSP9Wxw32ukuf+Q/w8k\n" +
            "g0xwVxSHAgMBAAECggEAAad/bwur5TfHr0LTzMIb1IlQy0MS3FYWwv+yXq94+fzL\n" +
            "qUk+x2sKgEH4TeBSzvo/2yhRTZ5EUwPfdCyHh+gvqsvf6pxz5wYGbveQSpFxqlet\n" +
            "A/NLhyxJyXKn/QhcKmOGEx6cYAsu4AUXBGlkO5yg5bBxrz16WIGMWx94jR/k9aiS\n" +
            "+Vnk9BkD77JqhqEq957Mhaac6pOa/Qay1FO/SI9evzEuCWFSiXIEADdR/oyN9Xq/\n" +
            "sfcmuKXsRL3gRlMA/CxaMvvnvrxYI8LHFSnOi6igmv9NWy+DlVm59nP8F6dxdoN7\n" +
            "Ke5RZWHaFWeq57CLsz9zHgibzkAntNZckIQTk/yRsQKBgQDaie0AgHb12m9fS5RL\n" +
            "LYaY0W+ZfZsgSsS9M6QTD/WLxDgWIlNayik6nBwXNAkx+e9s80rwkaAosrxkEZjU\n" +
            "+5y1BAyLPhYBkG0gaeC+4pyLbZuYhGsMTiDYOAfktTETHE4ZGdIK/L+cDKeMRNPX\n" +
            "PIAj4lPrqLgfPrjyPVkjBHtdDQKBgQC4D298bJG7lt2DNedom1pB+i1xN/9v+hvR\n" +
            "ZpLBNACM1lN0wu0FclJv7PJxysvwzf2vuN5qyOYoVRmEXMh4Gy3zFwShtLG/ArSE\n" +
            "1fdMeidOj032ZLNbxeFlStKDMMM/CZrL6WobJau4XL10eKQ6nrfuOJI84g0Fy/EA\n" +
            "YVyVu/Fa4wKBgD1AxXYLi8xTIj5Cj9kWdJBmu3H5G77MViJ10/on0foP0GybyGM9\n" +
            "IJs14EW8pwsj87DE7G9LUem2V0lxCTZBI+Y0sVNh3ocntP6NzpmSKLCH00HHc72q\n" +
            "NFiGM+gtxQiHOXidnRrJRud1QIz3Sa0dXwkvybfWvWy8htgWy+IdwnoNAoGAUHjH\n" +
            "KGIbUSXDkTNHClAppQDpTz/JWT7DXMj4zqmat/iYokr678+sxSyWTzP3+D9Hc8Vi\n" +
            "0NMm9WlHb7xVFVXkwAxHRR/IOpfHLvCRX4lkmA9Fab1bQXuBcRTGdv8hzfS4DgDu\n" +
            "GBJfQoqhdkOsoch06B0pqp62TNt+cckffoOeITsCgYAGPIqggNiNfiKnMNy+knQ6\n" +
            "7XkradV7gstxAH1tjf49/92/puKDZwbPLtV0whN9e+D85dVnXN6xbsdVbfT9g9Ps\n" +
            "QFblIABQ2+J5RYSbbm/+61Hpeksp6MwiAeNNm1gCFRcZcaG/CF4lLtIsEACNhIWz\n" +
            "7X1yucBaN4+/Tet8wdfltg==\n" +
            "-----END PRIVATE KEY-----";

    private Long expiration = Long.valueOf(600);

    @GetMapping("/data-recipients/brands/{dataRecipientBrandId}/software-products/{softwareProductId}/ssa")
    public ResponseEntity<String> getSoftwareStatementAssertion(
            @PathVariable String dataRecipientBrandId,
            @PathVariable String softwareProductId,
            @RequestHeader("x-v") String xV,
            @RequestHeader("Authorization") String authorization
    ) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {

        Date createdDate = new Date();

        Claims claims = Jwts.claims();
        claims.put("iss", "cdr-register");
        claims.setIssuedAt(createdDate);
        claims.setExpiration(new Date(createdDate.getTime() + expiration * 1000));
        claims.setId(UUID.randomUUID().toString());
        claims.put("org_id", dataRecipientBrandId); // brand
        claims.put("org_name", "Testing - " + dataRecipientBrandId);
        claims.put("client_name", "Testing - " + softwareProductId);
        claims.put("client_description",
                "A mock software product for testing SSA - " + dataRecipientBrandId + " and " + softwareProductId);
        claims.put("client_uri", "https://www.mockcompany.com.au");
        claims.put("redirect_uris", Arrays.asList("https://www.mockcompany.com.au/redirects/redirect1", "https://www.mockcompany.com.au/redirects/redirect2"));
        claims.put("logo_uri", "https://www.mockcompany.com.au/logos/logo1.png");
        claims.put("jwks_uri", "http://localhost:8444/idp/.well-known/openid-configuration/adrjwks");
        claims.put("revocation_uri", "http://localhost:8444/idp/.well-known/openid-configuration/adrrevokedjwks");
        claims.put("recipient_base_uri", "https://www.mockcompany.com.au");
        claims.put("software_id", softwareProductId);
        claims.put("policy_uri","https://www.mockcompany.com.au");
        claims.put("tos_uri","https://www.mockcompany.com.au");
        claims.put("software_roles", "data-recipient-software-product");
        claims.put("scope", "bank:accounts.basic:read bank:accounts.detail:read bank:transactions:read " +
                "bank:payees:read common:customer.detail:read common:customer.basic:read bank:regular_payments:read cdr:registration openid");

        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(
                    new BouncyCastleProvider()
            );
        }

        PemReader pemReader = new PemReader(new StringReader(SECRET_KEY));
        PemObject pemObject;
        pemObject = pemReader.readPemObject();
        KeyFactory factory = KeyFactory.getInstance("RSA");
        byte[] content = pemObject.getContent();
        PKCS8EncodedKeySpec privKeySpec = new PKCS8EncodedKeySpec(content);
        RSAPrivateKey privateKey = (RSAPrivateKey) factory.generatePrivate(privKeySpec);

        Map<String, Object> map=new HashMap();
        map.put("kid","mockregisrtysigning");
        map.put("typ","JWT");

        String jwt =  Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.PS256, privateKey)
                .setHeader(map)
                .compact();

        return ResponseEntity.ok(jwt);
    }
}

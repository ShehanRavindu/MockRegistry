package com.example.demo.dto;

import java.util.List;

public class OpenIdConfigDto {

    private String issuer;
    private String jwksUri;
    private String tokenEndpoint;
    private List<String> claimsSupported;
    private List<String> idTokenSigningAlgValuesSupported;
    private List<String> subjectTypesSupported;
    private List<String> scopesSupported;
    private List<String> responseTypesSupported;
    private List<String> grantTypesSupported;
    private List<String> tokenEndpointAuthMethodsSupported;
    private boolean tlsClientCertificateBoundAccessTokens;
    private List<String> requestObjectSigningAlgValuesSupported;

    public OpenIdConfigDto() {
    }

    public OpenIdConfigDto(String issuer, String jwksUri, String tokenEndpoint, List<String> claimsSupported, List<String> idTokenSigningAlgValuesSupported, List<String> subjectTypesSupported, List<String> scopesSupported, List<String> responseTypesSupported, List<String> grantTypesSupported, List<String> tokenEndpointAuthMethodsSupported, boolean tlsClientCertificateBoundAccessTokens, List<String> requestObjectSigningAlgValuesSupported) {
        this.issuer = issuer;
        this.jwksUri = jwksUri;
        this.tokenEndpoint = tokenEndpoint;
        this.claimsSupported = claimsSupported;
        this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
        this.subjectTypesSupported = subjectTypesSupported;
        this.scopesSupported = scopesSupported;
        this.responseTypesSupported = responseTypesSupported;
        this.grantTypesSupported = grantTypesSupported;
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
        this.tlsClientCertificateBoundAccessTokens = tlsClientCertificateBoundAccessTokens;
        this.requestObjectSigningAlgValuesSupported = requestObjectSigningAlgValuesSupported;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getJwksUri() {
        return jwksUri;
    }

    public void setJwksUri(String jwksUri) {
        this.jwksUri = jwksUri;
    }

    public String getTokenEndpoint() {
        return tokenEndpoint;
    }

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    public List<String> getClaimsSupported() {
        return claimsSupported;
    }

    public void setClaimsSupported(List<String> claimsSupported) {
        this.claimsSupported = claimsSupported;
    }

    public List<String> getIdTokenSigningAlgValuesSupported() {
        return idTokenSigningAlgValuesSupported;
    }

    public void setIdTokenSigningAlgValuesSupported(List<String> idTokenSigningAlgValuesSupported) {
        this.idTokenSigningAlgValuesSupported = idTokenSigningAlgValuesSupported;
    }

    public List<String> getSubjectTypesSupported() {
        return subjectTypesSupported;
    }

    public void setSubjectTypesSupported(List<String> subjectTypesSupported) {
        this.subjectTypesSupported = subjectTypesSupported;
    }

    public List<String> getScopesSupported() {
        return scopesSupported;
    }

    public void setScopesSupported(List<String> scopesSupported) {
        this.scopesSupported = scopesSupported;
    }

    public List<String> getResponseTypesSupported() {
        return responseTypesSupported;
    }

    public void setResponseTypesSupported(List<String> responseTypesSupported) {
        this.responseTypesSupported = responseTypesSupported;
    }

    public List<String> getGrantTypesSupported() {
        return grantTypesSupported;
    }

    public void setGrantTypesSupported(List<String> grantTypesSupported) {
        this.grantTypesSupported = grantTypesSupported;
    }

    public List<String> getTokenEndpointAuthMethodsSupported() {
        return tokenEndpointAuthMethodsSupported;
    }

    public void setTokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    }

    public boolean isTlsClientCertificateBoundAccessTokens() {
        return tlsClientCertificateBoundAccessTokens;
    }

    public void setTlsClientCertificateBoundAccessTokens(boolean tlsClientCertificateBoundAccessTokens) {
        this.tlsClientCertificateBoundAccessTokens = tlsClientCertificateBoundAccessTokens;
    }

    public List<String> getRequestObjectSigningAlgValuesSupported() {
        return requestObjectSigningAlgValuesSupported;
    }

    public void setRequestObjectSigningAlgValuesSupported(List<String> requestObjectSigningAlgValuesSupported) {
        this.requestObjectSigningAlgValuesSupported = requestObjectSigningAlgValuesSupported;
    }
}

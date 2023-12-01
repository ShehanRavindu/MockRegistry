package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class JwkDto {

    private String kty;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String e;
    private String use;
    private String kid;
//    private String alg;
    private String n;
    private List<String> x5c;
    private String x5u;

//    public JwkDto() {
//    }

    public JwkDto(String kty, String e, String use, String kid, String n, List<String> x5c, String x5u) {
        this.kty = kty;
        this.e = e;
        this.use = use;
        this.kid = kid;
//        this.alg = alg;
        this.n = n;
        this.x5c = x5c;
        this.x5u = x5u;
    }

//    public JwkDto(String kty, String use, String kid, String alg, String n) {
//        this.kty = kty;
//        this.use = use;
//        this.kid = kid;
//        this.alg = alg;
//        this.n = n;
//    }

    public String getKty() {
        return kty;
    }

    public void setKty(String kty) {
        this.kty = kty;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getKid() {
        return kid;
    }

    public void setKid(String kid) {
        this.kid = kid;
    }

//    public String getAlg() {
//        return alg;
//    }
//
//    public void setAlg(String alg) {
//        this.alg = alg;
//    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public List<String> getx5c() {
        return x5c;
    }

    public void setx5c(List<String> x5c) {
        this.x5c = x5c;
    }

    public String getx5u() {
        return x5u;
    }

    public void setx5u(String x5u) {
        this.x5u = x5u;
    }
}

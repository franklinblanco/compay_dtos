package com.blancoinfante.compay_dtos.dtos;

public class Credential <T> {
    public enum CredType{
        PHONE_NUMBER,
        EMAIL,
        ID
    }
    T credential;
    CredType credentialType;

    public T getCredential() {
        return credential;
    }

    public void setCredential(T credential) {
        this.credential = credential;
    }

    public CredType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(CredType credentialType) {
        this.credentialType = credentialType;
    }

    public Credential(T credential, CredType credentialType) {
        this.credential = credential;
        this.credentialType = credentialType;
    }
}

package guru.springframework.springrestclientexamples.api.model;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.SignatureDSA.SHA256;
import sun.security.provider.MD5;
import sun.security.rsa.RSASignature.SHA1withRSA;

public class Login {

    private String username;
    private String password;
    private MD5 md5;
    private SHA1withRSA sha1;
    private SHA256 sha256;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MD5 getMd5() {
        return md5;
    }

    public void setMd5(MD5 md5) {
        this.md5 = md5;
    }

    public SHA1withRSA getSha1() {
        return sha1;
    }

    public void setSha1(SHA1withRSA sha1) {
        this.sha1 = sha1;
    }

    public SHA256 getSha256() {
        return sha256;
    }

    public void setSha256(SHA256 sha256) {
        this.sha256 = sha256;
    }
}

package tk.mybatis.springboot.model;

import java.io.Serializable;

/**
 * Created by NightDream on 2017/9/7.
 */
public class PosParam implements Serializable {
    private String p1_MerchantNo;
    private String p2_OrderNo;
    private String p3_Amount;
    private String p4_Cur;
    private String p5_ProductName;
    private String p6_ProductDesc;
    private String p7_ReturnUrl;
    private String p8_NotifyUrl;
    private String q1_FrpCode;
    private String q2_TerminalNo;
    private String hmac;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getP1_MerchantNo() {
        return p1_MerchantNo;
    }

    public void setP1_MerchantNo(String p1_MerchantNo) {
        this.p1_MerchantNo = p1_MerchantNo;
    }

    public String getP2_OrderNo() {
        return p2_OrderNo;
    }

    public void setP2_OrderNo(String p2_OrderNo) {
        this.p2_OrderNo = p2_OrderNo;
    }

    public String getP3_Amount() {
        return p3_Amount;
    }

    public void setP3_Amount(String p3_Amount) {
        this.p3_Amount = p3_Amount;
    }

    public String getP4_Cur() {
        return p4_Cur;
    }

    public void setP4_Cur(String p4_Cur) {
        this.p4_Cur = p4_Cur;
    }

    public String getP5_ProductName() {
        return p5_ProductName;
    }

    public void setP5_ProductName(String p5_ProductName) {
        this.p5_ProductName = p5_ProductName;
    }

    public String getP6_ProductDesc() {
        return p6_ProductDesc;
    }

    public void setP6_ProductDesc(String p6_ProductDesc) {
        this.p6_ProductDesc = p6_ProductDesc;
    }

    public String getP7_ReturnUrl() {
        return p7_ReturnUrl;
    }

    public void setP7_ReturnUrl(String p7_ReturnUrl) {
        this.p7_ReturnUrl = p7_ReturnUrl;
    }

    public String getP8_NotifyUrl() {
        return p8_NotifyUrl;
    }

    public void setP8_NotifyUrl(String p8_NotifyUrl) {
        this.p8_NotifyUrl = p8_NotifyUrl;
    }

    public String getQ1_FrpCode() {
        return q1_FrpCode;
    }

    public void setQ1_FrpCode(String q1_FrpCode) {
        this.q1_FrpCode = q1_FrpCode;
    }

    public String getQ2_TerminalNo() {
        return q2_TerminalNo;
    }

    public void setQ2_TerminalNo(String q2_TerminalNo) {
        this.q2_TerminalNo = q2_TerminalNo;
    }

    public String getHmac() {
        return hmac;
    }

    public void setHmac(String hmac) {
        this.hmac = hmac;
    }
}

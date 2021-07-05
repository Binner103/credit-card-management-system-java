package com.deepblue.memorydemo.bean;

/**
 * 信用卡实体
 * POJO
 */
public class Card {

    private int id;
    private  String cardnumber;   // 信用卡号
    private  String accbank;   // 开户行名称
    private  String repdate;   // 开户行名称

    public Card() {

    }

    public Card(String cardnumber, String accbank, String repdate) {
        this.cardnumber = cardnumber;
        this.accbank = accbank;
        this.repdate = repdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getAccbank() {
        return accbank;
    }

    public void setAccbank(String accbank) {
        this.accbank = accbank;
    }

    public String getRepdate() {
        return repdate;
    }

    public void setRepdate(String repdate) {
        this.repdate = repdate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardnumber='" + cardnumber + '\'' +
                ", accbank='" + accbank + '\'' +
                ", repdate='" + repdate + '\'' +
                '}';
    }

}


package com.kazanov.kazanovmonththreelessonthree.recycler;

public class State {

    private String country;
    private String capital;
    private Integer flag;

    public State(String country, String capital, Integer flag) {
        this.country = country;
        this.capital = capital;
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}

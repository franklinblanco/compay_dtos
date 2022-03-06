package com.blancoinfante.compay_dtos.objs;

import java.math.BigDecimal;

public class Currency {
    private int id;
    private String name;
    private String nick;
    private String logo_url;
    private long date_added;
    private BigDecimal price_usd;
    private String api_id;
    private String type;
    private long last_updated;

    public Currency() {
    }

    public Currency(int id, String name, String nick, String logo_url, long date_added, BigDecimal price_usd, String api_id, String type, long last_updated) {
        this.id = id;
        this.name = name;
        this.nick = nick;
        this.logo_url = logo_url;
        this.date_added = date_added;
        this.price_usd = price_usd;
        this.api_id = api_id;
        this.type = type;
        this.last_updated = last_updated;
    }
    public enum Type{
        CRYPTO,
        FIAT
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getLogo_url() {
        return logo_url;
    }

    public void setLogo_url(String logo_url) {
        this.logo_url = logo_url;
    }

    public long getDate_added() {
        return date_added;
    }

    public void setDate_added(long date_added) {
        this.date_added = date_added;
    }

    public BigDecimal getPrice_usd() {
        return price_usd;
    }

    public void setPrice_usd(BigDecimal price_usd) {
        this.price_usd = price_usd;
    }

    public String getApi_id() {
        return api_id;
    }

    public void setApi_id(String api_id) {
        this.api_id = api_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(long last_updated) {
        this.last_updated = last_updated;
    }
}

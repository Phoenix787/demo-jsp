package com.example.demojsp;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class Account {

    private Long id;

    @NotNull
    @Size(min = 1, max = 25)
    private String name;

    @NotNull
    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private BigDecimal balance = new BigDecimal("1.000");

    @NotNull
    @NumberFormat(style = NumberFormat.Style.PERCENT)
    private BigDecimal equitA = new BigDecimal(".60");

    @DateTimeFormat
    @Future
    private Date data = new Date(new Date().getTime() + 31256000000L);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getEquitA() {
        return equitA;
    }

    public void setEquitA(BigDecimal equitA) {
        this.equitA = equitA;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}

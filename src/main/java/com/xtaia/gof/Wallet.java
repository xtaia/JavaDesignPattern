package com.xtaia.gof;

import java.math.BigDecimal;

/**
 * 封装、隐藏具体的实现，函数
 * 抽象、关于业务的结果而不是具体实现
 * 继承、表示A  is a的问题，extends；单继承；关注共同的行为；
 * 多态、子类替换父类的实现
 * 1、属性通过private、public暴露属性的可访问性
 *
 */
public class Wallet {
    private String id;
    private long createTime; //
    private BigDecimal balance; //余额
    private long balanceLastModifiedTime; //上次变更时间
    // ...省略其他属性...

    public Wallet() {
        this.id = IdGenerator.getInstance().generate();
        this.createTime = System.currentTimeMillis();
        this.balance = BigDecimal.ZERO;
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    // 注意：下面对get方法做了代码折叠，是为了减少代码所占文章的篇幅
    public String getId() { return this.id; }
    public long getCreateTime() { return this.createTime; }
    public BigDecimal getBalance() { return this.balance; }
    public long getBalanceLastModifiedTime() { return this.balanceLastModifiedTime;  }

    public void increaseBalance(BigDecimal increasedAmount) {
        if (increasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("...");
        }
        this.balance.add(increasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }

    public void decreaseBalance(BigDecimal decreasedAmount) {
        if (decreasedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidAmountException("...");
        }
        if (decreasedAmount.compareTo(this.balance) > 0) {
            throw new InsufficientAmountException("...");
        }
        this.balance.subtract(decreasedAmount);
        this.balanceLastModifiedTime = System.currentTimeMillis();
    }
}
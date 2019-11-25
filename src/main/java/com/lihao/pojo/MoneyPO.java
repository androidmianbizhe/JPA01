package com.lihao.pojo;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "money")
public class MoneyPO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name="money")
    private Long money;

    @Column(name="is_deleted")
    private Byte isDelected;

    @Column(name="create_at")
    private Date createAt;

    @Column(name="update_at")
    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Byte getIsDelected() {
        return isDelected;
    }

    public void setIsDelected(Byte isDelected) {
        this.isDelected = isDelected;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MoneyPO{" +
                "id=" + id +
                ", money=" + money +
                ", isDelected=" + isDelected +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}


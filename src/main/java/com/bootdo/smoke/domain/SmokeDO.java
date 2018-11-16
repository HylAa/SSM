package com.bootdo.smoke.domain;

import java.io.Serializable;

public class SmokeDO implements Serializable {
    private static final long serialVersionUID = 1L;
    //主键
    private Long id;

    // 香烟烟名字
    private String smokename;

    //香烟的价钱
    private Integer smokemoney;

    // 香烟的产家
    private String smokefactory;

    // 他人的评价
    private String evaluation;


    //生成 getter setter 方法 idea快捷键 （ctrl+lnsert）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSmokename() {
        return smokename;
    }

    public void setSmokename(String smokename) {
        this.smokename = smokename;
    }

    public Integer getSmokemoney() {
        return smokemoney;
    }

    public void setSmokemoney(Integer smokemoney) {
        this.smokemoney = smokemoney;
    }

    public String getSmokefactory() {
        return smokefactory;
    }

    public void setSmokefactory(String smokefactory) {
        this.smokefactory = smokefactory;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }
    //生成toString方法 我也不知道有没有用 idea快捷键（同上）

    @Override
    public String toString() {
        return "dads{" +
                "id=" + id +
                ", smokename='" + smokename + '\'' +
                ", smokemoney=" + smokemoney +
                ", smokefactory='" + smokefactory + '\'' +
                ", evaluation='" + evaluation + '\'' +
                '}';
    }


    //实体编写完成OK！
}

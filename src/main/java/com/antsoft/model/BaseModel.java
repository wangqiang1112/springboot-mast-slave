package com.antsoft.model;

/**
 * Created by Administrator on 2018/8/1.
 */
public class BaseModel {

    private Integer rows = 20;
    private Integer page = 0;

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}

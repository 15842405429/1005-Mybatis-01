package com.ssm.domain;

import java.util.List;

/**
 * AlsdGo 2018年01月26日 上午10:53
 * 谁的韶华流过鬓发，谁噙一笑煮酒观花，谁能相忘湖边柳下，你我纵是静坐也繁华。
 */

/**
 * 封装miniui中分页显示的结果集
 */
public class BaseResult<T> {

    private int total;// 总记录数
    private List<T> data;// 当页数据集合

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}

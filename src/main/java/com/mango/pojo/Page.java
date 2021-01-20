package com.mango.pojo;

import lombok.Data;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author mango
 * @date 2021/1/20 10:21
 * @description:
 */
@Data
public class Page<T> {

    /**
     * 当前页
     */
    private Integer currentPage;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总条数
     */
    private Integer count;

    /**
     * 数据
     */
    private List<T> data;

    public Page() {

    }

    public Page(Integer currentPage, Integer count, List<T> data) {
        this.currentPage = currentPage;
        this.data = data;
        this.count = count;
        //数据量不大，定为每页1条
        this.totalPage = count / 1;
        if (CollectionUtils.isEmpty(data)) {
            this.currentPage = this.totalPage;
        }
    }
}

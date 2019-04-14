package study.mybatis.bean;


import lombok.Data;

import java.io.Serializable;
@Data
public class BaseBean implements Serializable {

    private static final long serialVersionUID = 387630498860089653L;

    /**
     * 关键字
     */
    private String search;

    private String tableIndex;

    /**
     * id列表
     */
    private String ids;

    private int limitStart = -1;

    private int limitEnd = -1;

    private String orderByClause;
    
    private String groupByClause;

    private String sortByClause;

    private String sts;

    private String sort;

    private String order;

    private String offset;

    private String limit;

}

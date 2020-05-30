package com.imooc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author ZhuHangYi
 * @create 2020-05-17 03:36
 */

@Entity //把数据库映射成对象的话,需要加这个注解
@DynamicUpdate //修改数据库后, 自动更新修改时间
@Data

//如果表名类名不一致
//表名为s_product_category
//@Table(name = "s_product_category")
public class ProductCategory { //数据库里的表名是product_category

    /** 类目 */
    @Id //主键
    //用于标注主键的生成策略，通过strategy属性指定。
    //默认情况下，JPA 自动选择一个最适合底层数据库的主键生成策略：MySQL 对应 auto increment
    @GeneratedValue //自增类型
    private Integer categoryId; //把下划线改成驼峰

    /** 类目名字 */
    private String categoryName;

    /** 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}

package com.imooc.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author ZhuHangYi
 * @create 2020-05-30 14:22
 */


@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //返回的具体内容
    private T data;
}

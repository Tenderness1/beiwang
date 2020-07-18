/**
 * @program elemnt_ui
 * @description:
 * @author: zhoubiao
 * @create: 2019/07/30 14:34
 */

package com.itjiayan.model;

import lombok.Data;

@Data
public class PageVO {
    private Integer start = 0;
    private Integer length = 10;
}

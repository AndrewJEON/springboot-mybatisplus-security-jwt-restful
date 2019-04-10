package com.github.missthee.db.dto.manage.usercontroller;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Data
public class UpdateOneReq extends InsertOneReq {
    @ApiModelProperty(value = "用户id")
    private Long id;
}
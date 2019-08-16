package com.springboot.cloud.sysadmin.organization.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.springboot.cloud.common.web.entity.po.BasePo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("users_roles_relation")
public class UserRole extends BasePo {
    private String userId;
    private String roleId;
}
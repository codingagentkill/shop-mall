package cn.lili.modules.connect.entity.vo;

import lombok.Data;

/**
 * ConnectConfigForm
 *
 * @version v1.0
 * 2020-11-25 19:01
 */
@Data
public class ConnectConfigForm {
    /**
     * 配置名称
     */
    private String name;
    /**
     * 配置key
     */
    private String key;
    /**
     * 配置表单
     */
    private String form;
}

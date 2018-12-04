package org.piaohao.fashionadmin.module.system.menu.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Menu {
    private String name;
    private String icon;
    private String path;
    private List<Menu> children;
    private String code;
    private String parentCode;
    private String component;
}

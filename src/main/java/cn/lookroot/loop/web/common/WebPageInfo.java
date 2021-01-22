package cn.lookroot.loop.web.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebPageInfo {
    private String title;
    private String desc;
    private String keywords;
}

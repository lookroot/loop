package cn.lookroot.loop.web.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName web_users
 */
@Data
public class WebUsers implements Serializable {
    /**
     * 
     *
     * @mbg.generated Tue Jan 19 22:45:06 CST 2021
     */
    private Integer id;

    /**
     * 
     *
     * @mbg.generated Tue Jan 19 22:45:06 CST 2021
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table web_users
     *
     * @mbg.generated Tue Jan 19 22:45:06 CST 2021
     */
    private static final long serialVersionUID = 1L;
}
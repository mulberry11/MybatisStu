package entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * smbms_address
 * @author 
 */
@Data
public class SmbmsAddress implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 联系人姓名
     */
    private String contact;

    /**
     * 收货地址明细
     */
    private String addressdesc;

    /**
     * 邮编
     */
    private String postcode;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 创建者
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 修改者
     */
    private Long modifyby;

    /**
     * 修改时间
     */
    private Date modifydate;

    /**
     * 用户ID
     */
    private Long userid;

    private static final long serialVersionUID = 1L;
}
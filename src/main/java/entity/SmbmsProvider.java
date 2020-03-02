package entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * smbms_provider
 * @author 
 */
@Data
public class SmbmsProvider implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 供应商编码
     */
    private String procode;

    /**
     * 供应商名称
     */
    private String proname;

    /**
     * 供应商详细描述
     */
    private String prodesc;

    /**
     * 供应商联系人
     */
    private String procontact;

    /**
     * 联系电话
     */
    private String prophone;

    /**
     * 地址
     */
    private String proaddress;

    /**
     * 传真
     */
    private String profax;

    /**
     * 创建者（userId）
     */
    private Long createdby;

    /**
     * 创建时间
     */
    private Date creationdate;

    /**
     * 更新时间
     */
    private Date modifydate;

    /**
     * 更新者（userId）
     */
    private Long modifyby;

    private static final long serialVersionUID = 1L;
}
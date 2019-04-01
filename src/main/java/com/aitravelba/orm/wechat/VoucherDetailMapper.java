package com.aitravelba.orm.wechat;

import org.apache.ibatis.annotations.Param;

import com.aitravelba.pojo.wechat.VoucherDetail;
import com.aitravelba.pojo.wechat.VoucherDetailEx;

public interface VoucherDetailMapper {

    int deleteByPrimaryKey(Long id);

    int insert(VoucherDetail record);

    int insertSelective(VoucherDetail record);

    VoucherDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VoucherDetail record);

    int updateByPrimaryKey(VoucherDetail record);
    
    VoucherDetailEx selectByVoucherId(@Param("voucherId") Long voucherId);
}
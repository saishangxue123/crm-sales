package org.xujin.crm.sales.domain.customer.convertor.extensionpoint;

import org.xujin.crm.sales.domain.customer.entity.CustomerE;
import org.xujin.crm.sales.dto.clientobject.CustomerCO;
import org.xujin.halo.convertor.ConvertorI;
import org.xujin.halo.extension.ExtensionPointI;

/**
 * CustomerConvertorExtPt
 *
 * @author xujin
 * @date 2018-01-07 2:37 AM
 */
public interface CustomerConvertorExtPt extends ConvertorI, ExtensionPointI {

    public CustomerE clientToEntity(CustomerCO customerCO);
}

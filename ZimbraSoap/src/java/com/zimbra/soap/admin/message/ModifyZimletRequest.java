/*
 * ***** BEGIN LICENSE BLOCK *****
 * Zimbra Collaboration Suite Server
 * Copyright (C) 2011 Zimbra, Inc.
 *
 * The contents of this file are subject to the Zimbra Public License
 * Version 1.3 ("License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 * http://www.zimbra.com/license.
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied.
 * ***** END LICENSE BLOCK *****
 */

package com.zimbra.soap.admin.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.zimbra.common.soap.AdminConstants;
import com.zimbra.soap.admin.type.ZimletAclStatusPri;

/**
 * @zm-api-command-auth-required true
 * @zm-api-command-admin-auth-required true
 * @zm-api-command-description Modify Zimlet
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name=AdminConstants.E_MODIFY_ZIMLET_REQUEST)
public class ModifyZimletRequest {

    /**
     * @zm-api-field-description New Zimlet information
     */
    @XmlElement(name=AdminConstants.E_ZIMLET, required=true)
    private final ZimletAclStatusPri zimlet;

    /**
     * no-argument constructor wanted by JAXB
     */
    @SuppressWarnings("unused")
    private ModifyZimletRequest() {
        this((ZimletAclStatusPri) null);
    }

    public ModifyZimletRequest(ZimletAclStatusPri zimlet) {
        this.zimlet = zimlet;
    }

    public ZimletAclStatusPri getZimlet() { return zimlet; }
}

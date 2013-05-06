/*******************************************************************************
 * Copyright (c) 2011-2014, OpenIoT
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it either under the terms of the GNU Lesser General Public
 *  License version 2.1 as published by the Free Software Foundation
 *  (the "LGPL"). If you do not alter this
 *  notice, a recipient may use your version of this file under the LGPL.
 *  
 *  You should have received a copy of the LGPL along with this library
 *  in the file COPYING-LGPL-2.1; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *  
 *  This software is distributed on an "AS IS" basis, WITHOUT WARRANTY
 *  OF ANY KIND, either express or implied. See the LGPL  for
 *  the specific language governing rights and limitations.
 *  
 *  Contact: OpenIoT mailto: info@openiot.eu
 ******************************************************************************/
package org.openiot.ui.requestdefinition.nodes.interfaces;

import org.openiot.ui.requestdefinition.nodes.enums.PropertyType;

/**
 *
 * @author aana
 */
public interface GraphNodeProperty {

    /**
     * The type of property
     */
    public PropertyType getType();

    public void setType(PropertyType type);

    /**
     * Property label
     */
    public String getName();

    public void setName(String name);

    /**
     * The property value type
     */
    public Class<?> getJavaType();

    public void setJavaType(Class<?> javaType);

    /**
     * Allowed values
     */
    public String[] getAllowedValues();

    public void setAllowedValues(String[] allowedValues);

    /**
     * Flag whether this field is required
     */
    public boolean isRequired();

    public void setRequired(boolean required);
    
    /**
     * Return a copy of the original property
     */
    public GraphNodeProperty getCopy();
}